package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "SOFTWARES")
@Entity
public class SOFTWARES {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	private String NAME;

	private String GUID;

	private String VERSION;

	@Column(length=4000)
	private String PUBLISHER;

	@Column(length=4000)
	private String FOLDER;

	private String VENDOR;
	
	

	@Override
	public String toString() {
		return "SOFTWARES [NAME=" + NAME + ", GUID=" + GUID + ", VERSION="
				+ VERSION + ", PUBLISHER=" + PUBLISHER + ", FOLDER=" + FOLDER
				+ ", VENDOR=" + VENDOR + "]";
	}
	
	
	public Long getId() {
		return id;
	}


	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

	public String getNAME() {
		return NAME;
	}

	@XmlElement
	public void setNAME(String NAME) {
		this.NAME = NAME;
	}

	public String getGUID() {
		return GUID;
	}

	@XmlElement
	public void setGUID(String GUID) {
		this.GUID = GUID;
	}

	public String getVERSION() {
		return VERSION;
	}

	@XmlElement
	public void setVERSION(String VERSION) {
		this.VERSION = VERSION;
	}

	public String getPUBLISHER() {
		return PUBLISHER;
	}

	@XmlElement
	public void setPUBLISHER(String PUBLISHER) {
		this.PUBLISHER = PUBLISHER;
	}

	public String getFOLDER() {
		return FOLDER;
	}

	@XmlElement
	public void setFOLDER(String FOLDER) {
		this.FOLDER = FOLDER;
	}

	public String getVENDOR() {
		return VENDOR;
	}

	@XmlElement
	public void setVENDOR(String VENDOR) {
		this.VENDOR = VENDOR;
	}
}
