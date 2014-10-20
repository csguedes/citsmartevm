package br.com.centralit.zabbix.domain;

import br.com.centralit.zabbix.domain.BaseEntity;
import br.com.centralit.zabbix.domain.ZabbixIdHost;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */

//"params":{     "filter":{"host":"Zadenir"},"output":"extend"}   }
public class ZabbixFilter extends BaseEntity {

	private static final long serialVersionUID = -6911459280290420652L;

	@JsonProperty
	private ZabbixIdHost filter;

	@JsonProperty
	private String output;

	 
	public ZabbixIdHost getFilter() {
		return filter;
	}

	public void setFilter(ZabbixIdHost filter) {
		this.filter = filter;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	
}
