package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "REQUEST")
@Entity
public class REQUEST {

	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private CONTENT CONTENT;

	public CONTENT getCONTENT() {
		return CONTENT;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@XmlElement
	public void setCONTENT(CONTENT CONTENT) {
		this.CONTENT = CONTENT;
	}

	@Override
	public String toString() {
		return "REQUEST [CONTENT=" + CONTENT + ", getCONTENT()="
				+ getCONTENT().toString() + "]";
	}

	public Long getId() {
		return id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

}
