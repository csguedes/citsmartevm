package br.com.centralit.evm.citsmartevm.entity.ctm;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "CONTENT")
@Entity
public class CONTENT {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Collection<ACCOUNTS> ACCOUNTS;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<SOFTWARES> SOFTWARES;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<STORAGES> STORAGES;

	@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	private HARDWARE HARDWARE;

	@ManyToOne(cascade = CascadeType.ALL)
	private INPUTS INPUTS;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<SERVICES> SERVICES;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<MEMORIES> MEMORIES;

	@ManyToOne(cascade = CascadeType.ALL)
	private BIOS BIOS;

	@ManyToOne(cascade = CascadeType.ALL)
	private OFFICEPACK OFFICEPACK;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<ENVIRONMENTS> ENVIRONMENTS;

	@OneToMany(cascade = CascadeType.ALL)
	private Collection<NETWORKS> NETWORKS;

	
	

	public Long getId() {
		return id;
	}



	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "CONTENT [ACCOUNTS=" + ACCOUNTS.toString()
				+ ", SOFTWARES=" + SOFTWARES.toString() + ", STORAGES="
				+ STORAGES.toString() + ", HARDWARE=" + HARDWARE
				+ ", INPUTS=" + INPUTS + ", SERVICES="
				+ SERVICES.toString() + ", MEMORIES="
//				+ Arrays.toString(MEMORIES) + ", BIOS=" + BIOS
				+ ", OFFICEPACK=" + OFFICEPACK + ", ENVIRONMENTS="
				+ ENVIRONMENTS.toString() + ", NETWORKS="
				+ NETWORKS.toString() + "]";
	}



	public Collection<ACCOUNTS> getACCOUNTS() {
		return ACCOUNTS;
	}



	@XmlElement
	public void setACCOUNTS(Collection<ACCOUNTS> aCCOUNTS) {
		ACCOUNTS = aCCOUNTS;
	}



	public Collection<SOFTWARES> getSOFTWARES() {
		return SOFTWARES;
	}



	@XmlElement
	public void setSOFTWARES(Collection<SOFTWARES> sOFTWARES) {
		SOFTWARES = sOFTWARES;
	}



	public Collection<STORAGES> getSTORAGES() {
		return STORAGES;
	}



	@XmlElement
	public void setSTORAGES(Collection<STORAGES> sTORAGES) {
		STORAGES = sTORAGES;
	}



	public HARDWARE getHARDWARE() {
		return HARDWARE;
	}



	@XmlElement
	public void setHARDWARE(HARDWARE hARDWARE) {
		HARDWARE = hARDWARE;
	}



	public INPUTS getINPUTS() {
		return INPUTS;
	}



	@XmlElement
	public void setINPUTS(INPUTS iNPUTS) {
		INPUTS = iNPUTS;
	}



	public Collection<SERVICES> getSERVICES() {
		return SERVICES;
	}



	@XmlElement
	public void setSERVICES(Collection<SERVICES> sERVICES) {
		SERVICES = sERVICES;
	}



	public Collection<MEMORIES> getMEMORIES() {
		return MEMORIES;
	}



	@XmlElement
	public void setMEMORIES(Collection<MEMORIES> mEMORIES) {
		MEMORIES = mEMORIES;
	}



	public BIOS getBIOS() {
		return BIOS;
	}



	@XmlElement
	public void setBIOS(BIOS bIOS) {
		BIOS = bIOS;
	}



	public OFFICEPACK getOFFICEPACK() {
		return OFFICEPACK;
	}



	@XmlElement
	public void setOFFICEPACK(OFFICEPACK oFFICEPACK) {
		OFFICEPACK = oFFICEPACK;
	}



	public Collection<ENVIRONMENTS> getENVIRONMENTS() {
		return ENVIRONMENTS;
	}



	@XmlElement
	public void setENVIRONMENTS(Collection<ENVIRONMENTS> eNVIRONMENTS) {
		ENVIRONMENTS = eNVIRONMENTS;
	}



	public Collection<NETWORKS> getNETWORKS() {
		return NETWORKS;
	}



	@XmlElement
	public void setNETWORKS(Collection<NETWORKS> nETWORKS) {
		NETWORKS = nETWORKS;
	}





}
