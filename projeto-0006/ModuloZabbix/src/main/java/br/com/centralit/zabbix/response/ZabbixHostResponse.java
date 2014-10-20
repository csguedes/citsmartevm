package br.com.centralit.zabbix.response;

import java.util.List;

import br.com.centralit.zabbix.domain.ZabbixHost;

public class ZabbixHostResponse {

	public Long id;
	public String jsonrpc;
	public List<ZabbixHost> result;

}
