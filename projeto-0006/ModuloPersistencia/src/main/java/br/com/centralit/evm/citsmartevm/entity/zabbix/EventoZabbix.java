package br.com.centralit.evm.citsmartevm.entity.zabbix;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.centralit.evm.citsmartevm.entity.EventoBasico;

@XmlRootElement(name="EventoZabbix")
@Entity
public class EventoZabbix extends EventoBasico {

	public EventoZabbix() {
		super();
	}

	
	

}
