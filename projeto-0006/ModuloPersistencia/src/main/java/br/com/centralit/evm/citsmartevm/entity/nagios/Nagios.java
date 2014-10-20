package br.com.centralit.evm.citsmartevm.entity.nagios;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.centralit.evm.citsmartevm.entity.EventoBasico;

@XmlRootElement(name="Nagios")
public class Nagios extends EventoBasico
{

	
	private Object host;

	public Object getHost() {
		return host;
	}

	@XmlElement
	public void setHost(Object host) {
		this.host = host;
	}

	

    
}
    
