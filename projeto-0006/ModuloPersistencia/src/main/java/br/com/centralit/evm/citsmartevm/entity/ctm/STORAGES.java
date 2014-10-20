package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "STORAGES")
@Entity
public class STORAGES {
	private Long FREE;

	private String NAME;

	private String SERIALNUMBER;

	private String DESCRIPTION;

	private String FILESYSTEM;

	private String TYPE;

	private Long DISKSIZE;
	
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
		return "STORAGES [FREE=" + String.valueOf(FREE) + ", NAME=" + NAME + ", SERIALNUMBER="
				+ SERIALNUMBER + ", DESCRIPTION=" + DESCRIPTION
				+ ", FILESYSTEM=" + FILESYSTEM + ", TYPE=" + TYPE
				+ ", DISKSIZE=" + String.valueOf(DISKSIZE) + "]";
	}

	public Long getFREE() {
		return FREE;
	}

	@XmlElement
	public void setFREE(Long FREE) {
		this.FREE = FREE;
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getSERIALNUMBER() {
		return SERIALNUMBER;
	}

	@XmlElement
	public void setSERIALNUMBER(String SERIALNUMBER) {
		this.SERIALNUMBER = SERIALNUMBER;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	@XmlElement
	public void setDESCRIPTION(String DESCRIPTION) {
		this.DESCRIPTION = DESCRIPTION;
	}

	public String getFILESYSTEM() {
		return FILESYSTEM;
	}

	@XmlElement
	public void setFILESYSTEM(String FILESYSTEM) {
		this.FILESYSTEM = FILESYSTEM;
	}

	public String getTYPE() {
		return TYPE;
	}

	@XmlElement
	public void setTYPE(String TYPE) {
		this.TYPE = TYPE;
	}

	public Long getDISKSIZE() {
		return DISKSIZE;
	}

	@XmlElement
	public void setDISKSIZE(Long DISKSIZE) {
		this.DISKSIZE = DISKSIZE;
	}
}
