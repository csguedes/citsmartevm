package br.com.centralit.zabbix.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */

/*
{"jsonrpc":"2.0",
"result":[{"maintenances":[],"hostid":"10084","proxy_hostid":"0","host":"Zabbix server","status":"0","disable_until":"0","error":"",
"available":"1","errors_from":"0","lastaccess":"0","ipmi_authtype":"-1","ipmi_privilege":"2","ipmi_username":"","ipmi_password":"","ipmi_disable_until":"0",
"ipmi_available":"0","snmp_disable_until":"0","snmp_available":"0","maintenanceid":"0","maintenance_status":"0","maintenance_type":"0","maintenance_from":"0",
"ipmi_errors_from":"0","snmp_errors_from":"0","ipmi_error":"","snmp_error":"","jmx_disable_until":"0","jmx_available":"0","jmx_errors_from":"0","jmx_error":"",
"name":"Zabbix server","flags":"0","templateid":"0"}],"id":1}
*/

public class ZabbixResponse<T> {

	@JsonProperty
	private Long id;

	@JsonProperty
	private T result;

	@JsonProperty(value = "jsonrpc")
	private String jsonrpc = "2.0";

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String getJsonrpc() {
		return jsonrpc;
	}

	public void setJsonrpcVersion(String jsonrpc) {
		this.jsonrpc = jsonrpc;
	}

}