package br.com.centralit.zabbix.request;

import br.com.centralit.zabbix.domain.BaseEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request padrão do Zabbix
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
@JsonInclude(Include.NON_NULL)
public class ZabbixRequest<T extends BaseEntity> {

	@JsonProperty
	private Long id;

	@JsonProperty
	private String method;

	@JsonProperty
	private String auth;

	@JsonProperty
	private T params;

	@JsonProperty(value = "jsonrpc")
	private String jsonrpcVersion = "2.0";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public T getParams() {
		return params;
	}

	public void setParams(T params) {
		this.params = params;
	}

	public String getJsonrpcVersion() {
		return jsonrpcVersion;
	}

	public void setJsonrpcVersion(String jsonrpcVersion) {
		this.jsonrpcVersion = jsonrpcVersion;
	}

}
