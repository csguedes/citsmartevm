package br.com.centralit.evm.citsmartevm.schedulers;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import br.com.centralit.evm.citsmartevm.dao.IEventoCTMDAO;
import br.com.centralit.evm.citsmartevm.entity.EventoBasico;
import br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM;
import br.com.centralit.evm.citsmartevm.util.TipoRetorno;
import br.com.centralit.evm.correlacaoeventos.esper.EsperSingleton;

@MessageDriven(name = "executarTarefaConsumer", activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/esperQueue"),
		@ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })
public class ConsumidorDeMensagens implements MessageListener {

	private Logger logger = Logger.getLogger(ExecutarTarefa.class.getName());

	
	@Inject
	IEventoCTMDAO eventoCTMDAO;
	
	@Override
	public void onMessage(Message msg) {
//		System.out.println("Recebeu!");
		EsperSingleton.getInstance();

		if (msg instanceof TextMessage) {

			TextMessage tMsg = (TextMessage) msg;
			try {
				
				EventoBasico evento = EsperSingleton.processarComando(tMsg.getText(), TipoRetorno.XML);
				
				if (evento!=null) {
					
					if (evento.getOrigem().equalsIgnoreCase("Cistmart Monitor"))  {
						
						// Verifica duplicidade antes de inserir
//						if (eventoCTMDAO.findByNameAndIP((EventoCTM) evento)==false) {
//							
//							System.out.println(((EventoCTM) evento).getREQUEST().getCONTENT().getHARDWARE().getNAME());
//							System.out.println(((EventoCTM) evento).getREQUEST().getCONTENT().getHARDWARE().getIPADDR());
//							System.out.println("----------------------------------------------------");
//							
							eventoCTMDAO.salvar((EventoCTM) evento);
//							
//						}
						
//						eventoCTMDAO.findByNameAndIPAndPersist((EventoCTM) evento);
						
					}
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}

//		logger.info("Recebeu XML!!");
//		System.out.println("Recebeu XML!!");
	}

	

}
