package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.com.centralit.evm.citsmartevm.entity.EventoBasico;

@XmlRootElement(name = "EventoCTM")
@Entity
public class EventoCTM extends EventoBasico {

	public EventoCTM() {
		super();
	}

	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private REQUEST REQUEST;

	public REQUEST getREQUEST() {
		return REQUEST;
	}

	@XmlElement
	public void setREQUEST(REQUEST REQUEST) {
		this.REQUEST = REQUEST;
	}

	@Override
	public String toString() {
		return "EventoCTM [REQUEST=" + REQUEST + ", getREQUEST()="
				+ getREQUEST().toString() + "]";
	}

	
	
	
	
	
	
}
