package br.com.centralit.nagios.connectios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Request padrão do Zabbix
 *
 * @param <T>
 * @created 09/10/2014
 * @author Adenir Ribeiro Gomes -
 * <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
@JsonInclude(Include.NON_NULL)
public class EventRequest {

    private static final long serialVersionUID = -6911459280290420652L;

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
    private List<String> filters;

    @JsonProperty
    private List<String> columns;

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
 
    public List<String> getFilters() {
        return filters;
    }

    public void setFilters(List<String> filters) {
        this.filters = filters;
    }

    public List<String> getColumns() {
        return columns;
    }

    public void setColumns(List<String> columns) {
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
