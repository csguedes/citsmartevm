package br.com.centralit.nagios.connectios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from livestatus nagios
 *
 * @param <T>
 * @created 09/10/2014
 * @author Adenir Ribeiro Gomes -
 * <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
@JsonInclude(Include.NON_NULL)
public class EventResponse<T extends BaseEntity> {

    private static final long serialVersionUID = -6911459280290420652L;

    public EventResponse() {

    }

    @JsonProperty
    private Integer eventId;

    @JsonProperty
    private int returnCode;

    @JsonProperty
    private String target;

    @JsonProperty
    private int errorCode;

    @JsonProperty
    private String errorMessage;

    @JsonProperty
    private T params;
    
      
    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public T getParams() {
        return params;
    }

    public void setParams(T params) {
        this.params = params;
    }

}
