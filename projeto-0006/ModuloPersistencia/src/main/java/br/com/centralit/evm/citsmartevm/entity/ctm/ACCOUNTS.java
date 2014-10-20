package br.com.centralit.evm.citsmartevm.entity.ctm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ACCOUNTS")
@Entity
public class ACCOUNTS
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	private String NAME;

	@Column(length=4000)
    private String DESCRIPTION;

    private String DOMAIN;

    private String STATUS;

    
    
 	public Long getId() {
		return id;
	}

	@XmlElement
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ACCOUNTS [NAME=" + NAME + ", DESCRIPTION=" + DESCRIPTION
				+ ", DOMAIN=" + DOMAIN + ", STATUS=" + STATUS + "]";
	}

	public String getNAME ()
    {
        return NAME;
    }

	@XmlElement
    public void setNAME (String NAME)
    {
        this.NAME = NAME;
    }

    public String getDESCRIPTION ()
    {
        return DESCRIPTION;
    }

	@XmlElement
    public void setDESCRIPTION (String DESCRIPTION)
    {
        this.DESCRIPTION = DESCRIPTION;
    }

    public String getDOMAIN ()
    {
        return DOMAIN;
    }

	@XmlElement
   public void setDOMAIN (String DOMAIN)
    {
        this.DOMAIN = DOMAIN;
    }

    public String getSTATUS ()
    {
        return STATUS;
    }

	@XmlElement
    public void setSTATUS (String STATUS)
    {
        this.STATUS = STATUS;
    }
	
	
}
	