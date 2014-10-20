package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ENVIRONMENTS")
@Entity
public class ENVIRONMENTS {
	private String NAME;

	private String DESCRIPTION;

	private String CAPTION;

	private String USERNAME;

	@Column(length=4000)
	private String VARIABLEVALUE;

	private String STATUS;

	private String SYSTEMVARIABLE;
	
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
		return "ENVIRONMENTS [NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION
				+ ", CAPTION=" + CAPTION + ", USERNAME=" + USERNAME
				+ ", VARIABLEVALUE=" + VARIABLEVALUE + ", STATUS=" + STATUS
				+ ", SYSTEMVARIABLE=" + SYSTEMVARIABLE + "]";
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	@XmlElement
	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	public String getCAPTION() {
		return CAPTION;
	}

	@XmlElement
	public void setCAPTION(String CAPTION) {
		this.CAPTION = CAPTION;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	@XmlElement
	public void setUSERNAME(String USERNAME) {
		this.USERNAME = USERNAME;
	}

	public String getVARIABLEVALUE() {
		return VARIABLEVALUE;
	}

	@XmlElement
	public void setVARIABLEVALUE(String VARIABLEVALUE) {
		this.VARIABLEVALUE = VARIABLEVALUE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	@XmlElement
	public void setSTATUS(String STATUS) {
		this.STATUS = STATUS;
	}

	public String getSYSTEMVARIABLE() {
		return SYSTEMVARIABLE;
	}

	@XmlElement
	public void setSYSTEMVARIABLE(String SYSTEMVARIABLE) {
		this.SYSTEMVARIABLE = SYSTEMVARIABLE;
	}
}
