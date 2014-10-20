package br.com.centralit.zabbix.response;

import br.com.centralit.zabbix.domain.ZabbixLogin;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public class ZabbixLoginResponse extends ZabbixResponse<ZabbixLogin> {

	@JsonProperty(value = "result")
	private String auth;

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

}
