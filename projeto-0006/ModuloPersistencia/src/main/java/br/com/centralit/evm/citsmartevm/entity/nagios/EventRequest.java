package br.com.centralit.evm.citsmartevm.entity.nagios;

import br.com.centralit.evm.citsmartevm.entity.TarefaBasica;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@JsonInclude(Include.NON_NULL)
@Entity
public class EventRequest extends TarefaBasica {

    public EventRequest() {
        filters = new ArrayList<>();
        columns = new ArrayList<>();
    }

    @JsonProperty
    private Integer eventId;

    @JsonProperty
    private String target;

    @JsonProperty
    private String userName;

    @JsonProperty
    private String password;

    @JsonProperty
    private Long periodicity;
    
    @JsonProperty
    private Long lastCheck;
    
    @JsonProperty
    private String socketType;

    @JsonProperty
    private String hostAddress;

    @JsonProperty
    private int tcpPort;

    @JsonProperty
    private String targetObject;

    @JsonProperty
    private String targetMethod;

    @JsonProperty
	@OneToMany(cascade = CascadeType.ALL)
    private List<Filters> filters;

    @JsonProperty
	@OneToMany(cascade = CascadeType.ALL)
    private List<Columns> columns;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(String targetObject) {
        this.targetObject = targetObject;
    }

    public String getTargetMethod() {
        return targetMethod;
    }

    public void setTargetMethod(String targetMethod) {
        this.targetMethod = targetMethod;
    }
 
  
    public List<Filters> getFilters() {
		return filters;
	}

	public void setFilters(List<Filters> filters) {
		this.filters = filters;
	}

	public List<Columns> getColumns() {
		return columns;
	}

	public void setColumns(List<Columns> columns) {
		this.columns = columns;
	}

	public Long getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(Long periodicity) {
        this.periodicity = periodicity;
    }

    public Long getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(Long lastCheck) {
        this.lastCheck = lastCheck;
    }

 
    
    public String getSocketType() {
        return socketType;
    }

    public void setSocketType(String socketType) {
        this.socketType = socketType;
    }

    public String getHostAddress() {
        return hostAddress;
    }

    public void setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
    }

    public int getTcpPort() {
        return tcpPort;
    }

    public void setTcpPort(int tcpPort) {
        this.tcpPort = tcpPort;
    }

}
