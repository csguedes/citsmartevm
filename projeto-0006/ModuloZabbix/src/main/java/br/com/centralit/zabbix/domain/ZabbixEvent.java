package br.com.centralit.zabbix.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class ZabbixEvent extends BaseEntity {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	private String eventid;  //ID of the event.
	@JsonProperty
	private Integer acknowledged;  //Whether the event has been acknowledged.
	@JsonProperty
	private Timestamp clock;  //Time when the event was created.
	@JsonProperty
	private Integer ns;  //Nanoseconds when the event was created.
	@JsonProperty
	private Integer object;  //Type of object that is related to the event.
	@JsonProperty
	private String objectid;  //ID of the related object.
	@JsonProperty
	private Integer source;  //Type of the event.
	@JsonProperty
	private Integer value;  //State of the related object.
	@JsonProperty
	private Integer value_changed;  //Whether the state of the related object has changed since the previous event.
	public void setEventid(String pEventid){  //ID of the event.
		this.eventid = pEventid;
	}

	public void setAcknowledged(Integer pAcknowledged){  //Whether the event has been acknowledged.
		this.acknowledged = pAcknowledged;
	}

	public void setClock(Timestamp pClock){  //Time when the event was created.
		this.clock = pClock;
	}

	public void setNs(Integer pNs){  //Nanoseconds when the event was created.
		this.ns = pNs;
	}

	public void setObject(Integer pObject){  //Type of object that is related to the event.
		this.object = pObject;
	}

	public void setObjectid(String pObjectid){  //ID of the related object.
		this.objectid = pObjectid;
	}

	public void setSource(Integer pSource){  //Type of the event.
		this.source = pSource;
	}

	public void setValue(Integer pValue){  //State of the related object.
		this.value = pValue;
	}

	public void setValue_changed(Integer pValue_changed){  //Whether the state of the related object has changed since the previous event.
		this.value_changed = pValue_changed;
	}

	public String getEventid(){  //ID of the event.
		return eventid;
	}

	public Integer getAcknowledged(){  //Whether the event has been acknowledged.
		return acknowledged;
	}

	public Timestamp getClock(){  //Time when the event was created.
		return clock;
	}

	public Integer getNs(){  //Nanoseconds when the event was created.
		return ns;
	}

	public Integer getObject(){  //Type of object that is related to the event.
		return object;
	}

	public String getObjectid(){  //ID of the related object.
		return objectid;
	}

	public Integer getSource(){  //Type of the event.
		return source;
	}

	public Integer getValue(){  //State of the related object.
		return value;
	}

	public Integer getValue_changed(){  //Whether the state of the related object has changed since the previous event.
		return value_changed;
	}

	public String toString(){
		return 
		"Eventid = " + eventid + "\n" +
		"Acknowledged = " + acknowledged + "\n" +
		"Clock = " + clock + "\n" +
		"Ns = " + ns + "\n" +
		"Object = " + object + "\n" +
		"Objectid = " + objectid + "\n" +
		"Source = " + source + "\n" +
		"Value = " + value + "\n" +
		"Value_changed = " + value_changed;
	}
}
