package br.com.centralit.evm.citsmartevm.entity.nagios;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.centralit.evm.citsmartevm.entity.EventoBasico;

@XmlRootElement(name = "EventoNagios")
public class EventoNagios extends EventoBasico {

	Hosts hosts;

	public Hosts getHosts() {
		return hosts;
	}

	@XmlElement
	public void setHosts(Hosts hosts) {
		this.hosts = hosts;
	}

}
