package br.com.centralit.evm.citsmartevm.schedulers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.AccessTimeout;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.ScheduleExpression;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;
import javax.inject.Inject;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

import br.com.centralit.evm.citsmartevm.dao.ITarefasDAO;
import br.com.centralit.evm.citsmartevm.util.MapaMemoria;
import br.com.centralit.evm.classesutilitarias.CronExpression;


@Singleton
@Startup
public class ExecutarTarefa {
	private Logger logger = Logger.getLogger(ExecutarTarefa.class.getName());
	
	@Inject
	ProdutorDeMensagens produtorDeMensagens;
	
	@Inject
	ITarefasDAO tarefasAgendadas;
	
    @Resource
    TimerService timerService;
	
	
	public void enviarXMLCTM(String XML) {

		produtorDeMensagens.setMessage(XML);
		produtorDeMensagens.send();
	}
	
	
	/**
	 * Coloque aqui neste método tudo o que deve acontecer depois que acontecer a injeção de dependência
	 */
	@PostConstruct
	public void inicializarBean() {
		MapaMemoria.getInstance();
		sincronizarTarefasMemoriaBanco();

	}
	
	@Schedule(second = "*/1", hour = "*", minute="*", persistent = false)
	@Lock(LockType.READ)
	public void processarTarefasAgendadas() {
		
		DateTime novaData = new DateTime(); 
		for (int i = 0; i < MapaMemoria.tarefasAgendadas.size(); i++) {
			
			
			// Verifica se esta na hora de executar a tarefa
			if (
					
					novaData.get(DateTimeFieldType.yearOfCentury())==MapaMemoria.tarefasAgendadas.get(i).getProximaHora().get(DateTimeFieldType.yearOfCentury())
					&&
					novaData.get(DateTimeFieldType.dayOfMonth())==MapaMemoria.tarefasAgendadas.get(i).getProximaHora().get(DateTimeFieldType.dayOfMonth())
					&&
					novaData.get(DateTimeFieldType.hourOfDay())==MapaMemoria.tarefasAgendadas.get(i).getProximaHora().get(DateTimeFieldType.hourOfDay())
					&&
					novaData.get(DateTimeFieldType.minuteOfHour())==MapaMemoria.tarefasAgendadas.get(i).getProximaHora().get(DateTimeFieldType.minuteOfHour())
					&&
					novaData.get(DateTimeFieldType.secondOfMinute())==MapaMemoria.tarefasAgendadas.get(i).getProximaHora().get(DateTimeFieldType.secondOfMinute())
					
					)
					
					
					 {
				

				// Marca a tarefa como executada
				MapaMemoria.tarefasAgendadas.get(i).setFired(true);
					
			} else {
				logger.info( MapaMemoria.tarefasAgendadas.get(i).getDescricao() + " - Proxima execucao: " +  MapaMemoria.tarefasAgendadas.get(i).getProximaHora()
						
						+ " - Executou? " +  (MapaMemoria.tarefasAgendadas.get(i).isFired() ? "Sim" : "Nao"));

				
			}
			
			
			
		}
	
		
		logger.info(new DateTime() + "*************************************************************************************************************************");
	
		
		
	}
	
	private void sincronizarTarefasMemoriaBanco() {
		MapaMemoria.atualizarTarefasAgendadas(tarefasAgendadas.listAll());
		
		String[] expressoesCron;
		
		
		for (int i = 0; i < MapaMemoria.tarefasAgendadas.size(); i++) {
			
			expressoesCron = MapaMemoria.tarefasAgendadas.get(i).getCron().split(" ");
			
			// Atualiza a proxima hora de execucao
			CronExpression expressaoCron = new CronExpression( MapaMemoria.tarefasAgendadas.get(i).getCron());
			MapaMemoria.tarefasAgendadas.get(i).setProximaHora(expressaoCron.nextTimeAfter(new DateTime()));
			
			logger.info( MapaMemoria.tarefasAgendadas.get(i).getDescricao() + " - Proxima execucao: " +  MapaMemoria.tarefasAgendadas.get(i).getProximaHora());
		}
		
		
		logger.info("Atualizou o mapa de memória com os dados do banco!!");
		
		
		
		ScheduleExpression expression = new ScheduleExpression();
        expression.second("*/2").minute("*").hour("*");
        timerService.createCalendarTimer(expression);
        
      
		
		
	}
	
	
	/**
	 * A cada minuto, reagenda as tarefas que ja foram executadas
	 * 
	 */
	@Schedule(hour = "*", minute="*/1", persistent = false)
	@Lock(LockType.READ)
	public void reagendarTarefas() {
		// Atualiza a proxima hora de execucao
		for (int i = 0; i < MapaMemoria.tarefasAgendadas.size(); i++) {
			if (MapaMemoria.tarefasAgendadas.get(i).isFired()) {
				CronExpression expressaoCron = new CronExpression( MapaMemoria.tarefasAgendadas.get(i).getCron());
				MapaMemoria.tarefasAgendadas.get(i).setProximaHora(expressaoCron.nextTimeAfter( new DateTime()));
				MapaMemoria.tarefasAgendadas.get(i).setFired(false);
				
			}
		}
	}
	
	
	@Schedule(hour = "*", minute="*/30", persistent = false)
	@Lock(LockType.READ)
	public void agendadorSecundario() {
		sincronizarTarefasMemoriaBanco();
	}
	
	
//	@Schedule(hour = "*", minute="*/1", persistent = false)
//	@Lock(LockType.READ)
	public String taskEnviarXMLsCTM() {

		String resultado = "";
		try {

			// Início

			String target_dir = "C:\\cristian\\inventários";
			File dir = new File(target_dir);
			File[] files = dir.listFiles();

			for (File f : files) {
				if (f.isFile()) {
					BufferedReader inputStream = null;

					try {
						inputStream = new BufferedReader(new FileReader(f));
						String line;

						while ((line = inputStream.readLine()) != null) {
							resultado += line;
						}
					} finally {
						if (inputStream != null) {
							inputStream.close();
						}
					}
				}

				resultado = resultado
						.replace("<?xml version=\"1.0\" encoding=\"utf-8\"?>",
								"<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><EventoCTM>");
				resultado = resultado + "</EventoCTM>";

				// Remover caracteres "inválidos"
				resultado = resultado.replaceAll("\0", "_");

				enviarXMLCTM(resultado);

				resultado = "";

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultado;
	}
	
	@Timeout
	@AccessTimeout(value = 20, unit = TimeUnit.MINUTES)
	private void generateReport(Timer timer) {

	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("*****************t i m e o u t ! ! !********************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");
	    logger.info("********************************************************");

	 

	}	
	

	
	
}
