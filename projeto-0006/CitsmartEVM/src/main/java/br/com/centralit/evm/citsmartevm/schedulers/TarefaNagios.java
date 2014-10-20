package br.com.centralit.evm.citsmartevm.schedulers;

import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;


//@Singleton
public class TarefaNagios {

	final String message = "0,tcp://10.2.1.21:6557,hosts,,name = CITGOPC959";
	
//	@Inject
	MessageProducerBean messageProducerBean;
	
//	@Dependent
//	ConnectionToNagiosConsumer connectionToNagiosConsumer;
	
//	@Schedule(second = "*/10", hour = "*", minute="*", persistent = false)
//	@Lock(LockType.READ)
	public void enviarConsultaNagios() {
		messageProducerBean.setMessage(message);
		messageProducerBean.send();
		
		
		
	}
	
}
