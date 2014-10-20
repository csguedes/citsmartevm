package br.com.centralit.nagios.connectios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request padrão do Zabbix
 *
 * @param <T>
 * @created 23/07/2014
 * @author Adenir Ribeiro Gomes -
 * <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
@JsonInclude(Include.NON_NULL)
public class NagiosRequest<T extends BaseEntity> {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String eventId;

    @JsonProperty
    private String target;

    @JsonProperty
    private String method;

    @JsonProperty
    private String user;

    @JsonProperty
    private String password;

    @JsonProperty
    private T params;

    @JsonProperty
    private String jsonrpc = "2.0";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

    public String getJsonrpc() {
        return jsonrpc;
    }

    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

}
