package br.com.centralit.nagios.connectios;

import java.util.HashMap;
import br.com.centralit.nagios.livestatus.actions.ConnectionToNagiosProducer;
import br.com.centralit.nagios.livestatus.actions.LS_Response;
import br.com.centralit.nagios.livestatus.actions.ParametersQueryNagios;
import br.com.centralit.nagios.livestatus.query.LS_Query;
import br.com.centralit.nagios.livestatus.tables.EventWithInfo;
import br.com.centralit.nagios.livestatus.tables.Hosts;
import br.com.centralit.nagios.livestatus.tables.Service;
import br.com.centralit.nagios.util.JSONConverter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.inject.Inject;
import org.apache.commons.lang3.StringUtils;

@Singleton
public class TarefaNagios {

    private int socketTimeout = -1;
    // private Logger logger = Logger.getLogger(ExecutarTarefa.class.getName());
    private final List<EventRequest> requests = new ArrayList<>();
    @Inject
    private ConnectionToNagiosProducer producer;

    private final Map<String, String> options = new HashMap<String, String>() {
    };

    public TarefaNagios() {
        System.out.println("Executando Construtor TarefaNagios");
        EventRequest event = new EventRequest();

        event.setEventId(22);
        event.setSocketType("tcp");
        event.setHostAddress("10.2.1.167");
        event.setTcpPort(6557);
        event.setUserName("nagiosadmin");
        event.setPassword("123mudar");
        event.setTargetObject("hosts");
        event.setTargetMethod("GET");
        event.getFilters().add("name = srv21");
        event.setPeriodicity(20000L);
        event.setLastCheck(0L);
        requests.add(event);

        event = new EventRequest();
        event.setEventId(23);
        event.setSocketType("tcp");
        event.setHostAddress("10.2.1.167");
        event.setTcpPort(6557);
        event.setUserName("nagiosadmin");
        event.setPassword("123mudar");
        event.setTargetObject("hosts");
        event.setTargetMethod("GET");        
        event.getFilters().add("name = srv176");
        event.setPeriodicity(10000L);
        event.setLastCheck(0L);

        requests.add(event);

        socketTimeout = -1;
    }

    @Resource
    TimerService timerService;

    /**
     * Executar o método abaixo a cada segundo.
     *
     * @return
     * @throws java.lang.Exception
     */
    @Schedule(second = "*/1", hour = "*", minute = "*", persistent = false)
    @Lock(LockType.READ)
    public String taskExecuteQuerieis() throws Exception {
      //  System.out.println("Fasendo loop de eventos, size resquests: " + requests.size());
        for (EventRequest request : requests) {
            java.util.Date date = new java.util.Date();
            Long now = date.getTime();
            Long gap = now - request.getLastCheck();
        //    System.out.println(String.format("Now = %d%n last check = %d%n dif = %d%n", now, request.getLastCheck(), gap));
            if (gap > request.getPeriodicity()) {
                request.setLastCheck(now);
                sendQueryToNagios(request);     
                System.out.println(String.format("Feito Filters: %s gap  %d%n", 
                        StringUtils.join(request.getFilters(), " "),
                        gap));
            }
        }

        return "";
    }

    @Timeout
    private void generateReport(Timer timer) {

//                logger.info("!!--timeout invoked here "+new Date());
//                System.out.println("!!--timeout invoked here "+new Date());
    }

    private void sendQueryToNagios(EventRequest request) throws Exception {
        try {
            ParametersQueryNagios parametersIncoming = new ParametersQueryNagios();
            parametersIncoming.requestToThis(request);
            LS_Query ls_query = new LS_Query(parametersIncoming);

            LS_Response ls_response = executeQuery(ls_query, parametersIncoming);
            Hosts host = getHost(ls_response, parametersIncoming);

            EventResponse eventResponse = new EventResponse();
            eventResponse.setErrorCode(0);
            eventResponse.setErrorMessage("");
            eventResponse.setEventId(request.getEventId());
            eventResponse.setParams(host);
            eventResponse.setReturnCode(0);
            eventResponse.setTarget("nagios");
            producer.setMessage(JSONConverter.toJson(eventResponse));
            producer.send();
        } catch (Exception e) {
            System.out.println("A mensagem falhou " + e.getMessage());
        }

    }

    /**
     * Realiza a conexao e executa a query.
     *
     * @param ls_query
     * @param parametersIncoming
     * @return LS_Response
     * @throws Exception Expected idEvent, socket_type, path_or_host, port,
     * string_query_to_nagios;
     */
    public LS_Response executeQuery(LS_Query ls_query, ParametersQueryNagios parametersIncoming) throws Exception {
        Socket socket = new Socket();

        if (parametersIncoming.getPath_or_host().isEmpty() || parametersIncoming.getPort() == -1) {
            throw new IllegalArgumentException("Server/host or/and port is invalid");
        }

        if (socketTimeout != -1) {
            socket.connect(new InetSocketAddress(parametersIncoming.getPath_or_host(), parametersIncoming.getPort()), socketTimeout);
            socket.setSoTimeout(socketTimeout);
        } else {
            socket.connect(new InetSocketAddress(parametersIncoming.getPath_or_host(), parametersIncoming.getPort()));
        }

        if (!socket.isConnected()) {
            throw new RequestException("Socket not connected");
        }

        LS_Response response = new LS_Response(ls_query);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String nagios_query = ls_query.to_s(options);
        // System.out.println("Send to nagios:\n" + ls_query.to_s(options));
        out.write(nagios_query, 0, nagios_query.length());
        out.flush();
        socket.shutdownOutput();

        String line = in.readLine();
        if (line == null) {
            System.out.println("No data returned from nagios livestatus");
            throw new RequestException("No data returned from nagios livestatus");
        }

        while (line != null) {
            //   System.out.println(line);
            response.add(line);
            line = in.readLine();
        }

        return response;
    }

    public Hosts getHost(LS_Response response, ParametersQueryNagios parametersIncoming) throws Exception {

        String jjson = response.getColumnsAndValueAsJson(JSONConverter.getObjects(parametersIncoming.getTable()));

        Hosts host = JSONConverter.fromJson(jjson, Hosts.class);

        for (EventWithInfo evt : host.getEvents()) {
            parametersIncoming.setTable("services");
            parametersIncoming.setFilters("display_name = " + evt.display_name);

            LS_Query ls_query = new LS_Query(parametersIncoming);
            response = executeQuery(ls_query, parametersIncoming);

            jjson = response.getColumnsAndValueAsJson(JSONConverter.getObjects(parametersIncoming.getTable()));

            Service service = JSONConverter.fromJson(jjson, Service.class);

            host.getListOfservices().add(service);

        }

        //jjson =  response.getColumnsAndValueAsJson(JSONConverter.getObjects(parm_query_nagios.table));
        return host;
    }

}
