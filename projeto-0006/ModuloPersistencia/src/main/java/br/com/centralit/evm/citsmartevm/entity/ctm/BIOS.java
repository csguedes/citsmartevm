package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BIOS")
@Entity
public class BIOS {
	private String SMODEL;

	private String SSN;

	private String SMANUFACTURER;

	private String TYPE;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	public Long getId() {
		return id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "BIOS [SMODEL=" + SMODEL + ", SSN=" + SSN + ", SMANUFACTURER="
				+ SMANUFACTURER + ", TYPE=" + TYPE + "]";
	}

	public String getSMODEL() {
		return SMODEL;
	}

	@XmlElement
	public void setSMODEL(String SMODEL) {
		this.SMODEL = SMODEL;
	}

	public String getSSN() {
		return SSN;
	}

	@XmlElement
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public String getSMANUFACTURER() {
		return SMANUFACTURER;
	}

	@XmlElement
	public void setSMANUFACTURER(String SMANUFACTURER) {
		this.SMANUFACTURER = SMANUFACTURER;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}
}
