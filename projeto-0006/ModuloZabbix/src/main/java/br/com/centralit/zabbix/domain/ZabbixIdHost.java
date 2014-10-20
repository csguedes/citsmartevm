package br.com.centralit.zabbix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entidade que representa atributos de uma entidade de login, a ser enviada ao Zabbix
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public class ZabbixIdHost extends BaseEntity {

	private static final long serialVersionUID = -6911459280290420652L;
	//"params":{     "filter":{"host":"Zadenir"},"output":"extend"}   }
	@JsonProperty
	private String host;
	
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}

	
}
