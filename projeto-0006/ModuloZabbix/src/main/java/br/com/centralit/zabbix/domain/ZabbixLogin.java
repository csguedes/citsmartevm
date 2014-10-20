package br.com.centralit.zabbix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entidade que representa atributos de uma entidade de login, a ser enviada ao Zabbix
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public class ZabbixLogin extends BaseEntity {

	private static final long serialVersionUID = -6911459280290420652L;

	@JsonProperty
	private String user;

	@JsonProperty
	private String password;

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

}
