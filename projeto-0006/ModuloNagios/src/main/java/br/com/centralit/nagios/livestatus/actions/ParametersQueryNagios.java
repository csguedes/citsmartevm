package br.com.centralit.nagios.livestatus.actions;

import br.com.centralit.nagios.connectios.EventRequest;
import org.apache.commons.lang3.StringUtils;
import br.com.centralit.nagios.util.JSONConverter;

public class ParametersQueryNagios {
    public ParametersQueryNagios() {
    }
    //public String str_parm_ok = parm + StringUtils.repeat(" " + sep, how_many_parms_arrived);
    //String[] arrayParm = str_parm_ok.split(sep);
    private int id_event_incoming;
    private String socket_type;


    private String path_or_host;
    private String str_port;
    private String table;
    private String columns;
    private String filters;
    private String stats;
    private int port;
    private Errors errors = null;
    private boolean replyTreatQuery = false;

    /**
     *
     * @param messageIncoming 1) - index Event(incoming) # 0, 2) - path to host
     * # tcp://10.2.1.104:6557, 3) - table of nagios #hosts, 4) - columns of
     * table on nagios #col1 col2, 5) - filters on search # name = srv104, 6) -
     * stats on searche # stats = 00x
     */
    public ParametersQueryNagios(String messageIncoming) {
        QueryType queryType = QueryType.QueryInTextPlain;

        switch (queryType) {
            case QueryInTextPlain:
                replyTreatQuery = textPlainToThis(messageIncoming);
                break;
            case QueryInJson:
                replyTreatQuery = jsonToThis(messageIncoming);
                break;
            case QueryInXml:
                replyTreatQuery = xmlToThis(messageIncoming);
                break;
            case QuerySqlSelect:
                replyTreatQuery = sqlSelectToThis(messageIncoming);
                break;

        }

    }
//0,tcp://10.2.1.121:6557,hosts,,name = srv104

    private boolean textPlainToThis(String textPlainParmaters) {
        String sep = ",";
        int how_many_parms_expected = 7;
        int how_many_parms_arrived = textPlainParmaters.split(sep).length;

        //TODO acerte erros
        if (how_many_parms_arrived < 1) {
            errors = new Errors(2201, "Please report parameters corretamente");
            return false;
        }

        how_many_parms_arrived = how_many_parms_expected - how_many_parms_arrived;
        String str_parm_ok = textPlainParmaters + StringUtils.repeat(sep + " ", how_many_parms_arrived);
        String[] arrayParm = str_parm_ok.split(sep);

        id_event_incoming = Integer.parseInt(arrayParm[0].trim());
        String[] socket_address_splited = arrayParm[1].trim().split(":");
        table = arrayParm[2].trim();
        columns = arrayParm[3].trim();
        filters = arrayParm[4].trim();
        stats = arrayParm[5].trim();

        socket_type = socket_address_splited[0];
        path_or_host = socket_address_splited[1].replace("/", "");
        str_port = socket_address_splited[2];
        port = Integer.parseInt(str_port);
        return true;
    }

    public boolean requestToThis(EventRequest request) {

        id_event_incoming = request.getEventId();

        table = request.getTargetObject();

        columns = "";
        for (String cols : request.getColumns()) {
            columns += cols + " ";
        }
         
        filters = "";
        for (String filter : request.getFilters()) {
            filters += filter + " ";
        }
        
        stats = "";
        socket_type = request.getSocketType();
        path_or_host = request.getHostAddress();
        port = request.getTcpPort();
        str_port = String.format("%d", port);
        
        return true;
    }

    private boolean jsonToThis(String textPlainParmaters) {
        return true;
    }

    private boolean xmlToThis(String textPlainParmaters) {
        return true;
    }

    private boolean sqlSelectToThis(String textPlainParmaters) {
        return true;
    }

    public String getPathNagios() {
        if (isSocketTypeTcp()) {
            System.out.println("Nagios Modulo: tcp string = " + socket_type + "://" + path_or_host + ":" + str_port);
            return socket_type + "://" + path_or_host + ":" + str_port;
        } else {
            return socket_type + "://" + path_or_host;
        }
    }

    public boolean hasErrors() {
        return errors != null;
    }

    public String getJsonErrors() {
        return JSONConverter.toJson(errors);
    }

//	public Connection getConnection(){
//		return new Connection(getPathNagios());
//	}
    public void setTable(String table) {
        this.table = table;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public boolean isSocketTypeTcp() {
        return socket_type.startsWith("tcp");
    }

    public int getId_event_incoming() {
        return id_event_incoming;
    }

    public String getSocket_type() {
        return socket_type;
    }

    public String getPath_or_host() {
        return path_or_host;
    }

    public String getStr_port() {
        return str_port;
    }

    public String getTable() {
        return table;
    }

    public String getColumns() {
        return columns;
    }

    public String getFilters() {
        return filters;
    }

    public String getStats() {
        return stats;
    }

    public int getPort() {
        return port;
    }

    public Errors getErrors() {
        return errors;
    }

    public boolean isReplyTreatQuery() {
        return replyTreatQuery;
    }

}
