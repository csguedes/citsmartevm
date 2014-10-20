package br.com.centralit.zabbix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;

/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a
 *         href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class ZabbixHost extends BaseEntity {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	public String hostid; // ID of the host.
	@JsonProperty
	private String host; // Technical name of the host.
	@JsonProperty
	private Integer available; // Availability of Zabbix agent.
	@JsonProperty
	private Timestamp disable_until; // The next polling time of an unavailable
										// Zabbix agent.
	@JsonProperty
	private String error; // Error text if Zabbix agent is unavailable.
	@JsonProperty
	private Timestamp errors_from; // Time when Zabbix agent became unavailable.
	@JsonProperty
	private Integer flags; // Origin of the host.
	@JsonProperty
	private Integer ipmi_authtype; // IPMI authentication algorithm.
	@JsonProperty
	private Integer ipmi_available; // Availability of IPMI agent.
	@JsonProperty
	private Timestamp ipmi_disable_until; // The next polling time of an
											// unavailable IPMI agent.
	@JsonProperty
	private String ipmi_error; // Error text if IPMI agent is unavailable.
	@JsonProperty
	private Timestamp ipmi_errors_from; // Time when IPMI agent became
										// unavailable.
	@JsonProperty
	private String ipmi_password; // IPMI password.
	@JsonProperty
	private Integer ipmi_privilege; // IPMI privilege level.
	@JsonProperty
	private String ipmi_username; // IPMI username.
	@JsonProperty
	private Integer jmx_available; // Availability of JMX agent.
	@JsonProperty
	private Timestamp jmx_disable_until; // The next polling time of an
											// unavailable JMX agent.
	@JsonProperty
	private String jmx_error; // Error text if JMX agent is unavailable.
	@JsonProperty
	private Timestamp jmx_errors_from; // Time when JMX agent became
										// unavailable.
	@JsonProperty
	private Timestamp maintenance_from; // Starting time of the effective
										// maintenance.
	@JsonProperty
	private Integer maintenance_status; // Effective maintenance status.
	@JsonProperty
	private Integer maintenance_type; // Effective maintenance type.
	@JsonProperty
	private String maintenanceid; // ID of the maintenance that is currently in
									// effect on the host.
	@JsonProperty
	private String name; // property value.
	@JsonProperty
	private String proxy_hostid; // ID of the proxy that is used to monitor the
									// host.
	@JsonProperty
	private Integer snmp_available; // Availability of SNMP agent.
	@JsonProperty
	private Timestamp snmp_disable_until; // The next polling time of an
											// unavailable SNMP agent.
	@JsonProperty
	private String snmp_error; // Error text if SNMP agent is unavailable.
	@JsonProperty
	private Timestamp snmp_errors_from; // Time when SNMP agent became
										// unavailable.
	@JsonProperty
	private Integer status; // Status and function of the host.

	public void setHostid(String pHostid) { // ID of the host.
		this.hostid = pHostid;
	}

	public void setHost(String pHost) { // Technical name of the host.
		this.host = pHost;
	}

	public void setAvailable(Integer pAvailable) { // Availability of Zabbix
													// agent.
		this.available = pAvailable;
	}

	public void setDisable_until(Timestamp pDisable_until) { // The next polling
																// time of an
																// unavailable
																// Zabbix agent.
		this.disable_until = pDisable_until;
	}

	public void setError(String pError) { // Error text if Zabbix agent is
											// unavailable.
		this.error = pError;
	}

	public void setErrors_from(Timestamp pErrors_from) { // Time when Zabbix
															// agent became
															// unavailable.
		this.errors_from = pErrors_from;
	}

	public void setFlags(Integer pFlags) { // Origin of the host.
		this.flags = pFlags;
	}

	public void setIpmi_authtype(Integer pIpmi_authtype) { // IPMI
															// authentication
															// algorithm.
		this.ipmi_authtype = pIpmi_authtype;
	}

	public void setIpmi_available(Integer pIpmi_available) { // Availability of
																// IPMI agent.
		this.ipmi_available = pIpmi_available;
	}

	public void setIpmi_disable_until(Timestamp pIpmi_disable_until) { // The
																		// next
																		// polling
																		// time
																		// of an
																		// unavailable
																		// IPMI
																		// agent.
		this.ipmi_disable_until = pIpmi_disable_until;
	}

	public void setIpmi_error(String pIpmi_error) { // Error text if IPMI agent
													// is unavailable.
		this.ipmi_error = pIpmi_error;
	}

	public void setIpmi_errors_from(Timestamp pIpmi_errors_from) { // Time when
																	// IPMI
																	// agent
																	// became
																	// unavailable.
		this.ipmi_errors_from = pIpmi_errors_from;
	}

	public void setIpmi_password(String pIpmi_password) { // IPMI password.
		this.ipmi_password = pIpmi_password;
	}

	public void setIpmi_privilege(Integer pIpmi_privilege) { // IPMI privilege
																// level.
		this.ipmi_privilege = pIpmi_privilege;
	}

	public void setIpmi_username(String pIpmi_username) { // IPMI username.
		this.ipmi_username = pIpmi_username;
	}

	public void setJmx_available(Integer pJmx_available) { // Availability of
															// JMX agent.
		this.jmx_available = pJmx_available;
	}

	public void setJmx_disable_until(Timestamp pJmx_disable_until) { // The next
																		// polling
																		// time
																		// of an
																		// unavailable
																		// JMX
																		// agent.
		this.jmx_disable_until = pJmx_disable_until;
	}

	public void setJmx_error(String pJmx_error) { // Error text if JMX agent is
													// unavailable.
		this.jmx_error = pJmx_error;
	}

	public void setJmx_errors_from(Timestamp pJmx_errors_from) { // Time when
																	// JMX agent
																	// became
																	// unavailable.
		this.jmx_errors_from = pJmx_errors_from;
	}

	public void setMaintenance_from(Timestamp pMaintenance_from) { // Starting
																	// time of
																	// the
																	// effective
																	// maintenance.
		this.maintenance_from = pMaintenance_from;
	}

	public void setMaintenance_status(Integer pMaintenance_status) { // Effective
																		// maintenance
																		// status.
		this.maintenance_status = pMaintenance_status;
	}

	public void setMaintenance_type(Integer pMaintenance_type) { // Effective
																	// maintenance
																	// type.
		this.maintenance_type = pMaintenance_type;
	}

	public void setMaintenanceid(String pMaintenanceid) { // ID of the
															// maintenance that
															// is currently in
															// effect on the
															// host.
		this.maintenanceid = pMaintenanceid;
	}

	public void setName(String pName) { // property value.
		this.name = pName;
	}

	public void setProxy_hostid(String pProxy_hostid) { // ID of the proxy that
														// is used to monitor
														// the host.
		this.proxy_hostid = pProxy_hostid;
	}

	public void setSnmp_available(Integer pSnmp_available) { // Availability of
																// SNMP agent.
		this.snmp_available = pSnmp_available;
	}

	public void setSnmp_disable_until(Timestamp pSnmp_disable_until) { // The
																		// next
																		// polling
																		// time
																		// of an
																		// unavailable
																		// SNMP
																		// agent.
		this.snmp_disable_until = pSnmp_disable_until;
	}

	public void setSnmp_error(String pSnmp_error) { // Error text if SNMP agent
													// is unavailable.
		this.snmp_error = pSnmp_error;
	}

	public void setSnmp_errors_from(Timestamp pSnmp_errors_from) { // Time when
																	// SNMP
																	// agent
																	// became
																	// unavailable.
		this.snmp_errors_from = pSnmp_errors_from;
	}

	public void setStatus(Integer pStatus) { // Status and function of the host.
		this.status = pStatus;
	}

	public String getHostid() { // ID of the host.
		return hostid;
	}

	public String getHost() { // Technical name of the host.
		return host;
	}

	public Integer getAvailable() { // Availability of Zabbix agent.
		return available;
	}

	public Timestamp getDisable_until() { // The next polling time of an
											// unavailable Zabbix agent.
		return disable_until;
	}

	public String getError() { // Error text if Zabbix agent is unavailable.
		return error;
	}

	public Timestamp getErrors_from() { // Time when Zabbix agent became
										// unavailable.
		return errors_from;
	}

	public Integer getFlags() { // Origin of the host.
		return flags;
	}

	public Integer getIpmi_authtype() { // IPMI authentication algorithm.
		return ipmi_authtype;
	}

	public Integer getIpmi_available() { // Availability of IPMI agent.
		return ipmi_available;
	}

	public Timestamp getIpmi_disable_until() { // The next polling time of an
												// unavailable IPMI agent.
		return ipmi_disable_until;
	}

	public String getIpmi_error() { // Error text if IPMI agent is unavailable.
		return ipmi_error;
	}

	public Timestamp getIpmi_errors_from() { // Time when IPMI agent became
												// unavailable.
		return ipmi_errors_from;
	}

	public String getIpmi_password() { // IPMI password.
		return ipmi_password;
	}

	public Integer getIpmi_privilege() { // IPMI privilege level.
		return ipmi_privilege;
	}

	public String getIpmi_username() { // IPMI username.
		return ipmi_username;
	}

	public Integer getJmx_available() { // Availability of JMX agent.
		return jmx_available;
	}

	public Timestamp getJmx_disable_until() { // The next polling time of an
												// unavailable JMX agent.
		return jmx_disable_until;
	}

	public String getJmx_error() { // Error text if JMX agent is unavailable.
		return jmx_error;
	}

	public Timestamp getJmx_errors_from() { // Time when JMX agent became
											// unavailable.
		return jmx_errors_from;
	}

	public Timestamp getMaintenance_from() { // Starting time of the effective
												// maintenance.
		return maintenance_from;
	}

	public Integer getMaintenance_status() { // Effective maintenance status.
		return maintenance_status;
	}

	public Integer getMaintenance_type() { // Effective maintenance type.
		return maintenance_type;
	}

	public String getMaintenanceid() { // ID of the maintenance that is
										// currently in effect on the host.
		return maintenanceid;
	}

	public String getName() { // property value.
		return name;
	}

	public String getProxy_hostid() { // ID of the proxy that is used to monitor
										// the host.
		return proxy_hostid;
	}

	public Integer getSnmp_available() { // Availability of SNMP agent.
		return snmp_available;
	}

	public Timestamp getSnmp_disable_until() { // The next polling time of an
												// unavailable SNMP agent.
		return snmp_disable_until;
	}

	public String getSnmp_error() { // Error text if SNMP agent is unavailable.
		return snmp_error;
	}

	public Timestamp getSnmp_errors_from() { // Time when SNMP agent became
												// unavailable.
		return snmp_errors_from;
	}

	public Integer getStatus() { // Status and function of the host.
		return status;
	}

	public String toString() {
		return "Hostid = " + hostid + "\n" + "Host = " + host + "\n"
				+ "Available = " + available + "\n" + "Disable_until = "
				+ disable_until + "\n" + "Error = " + error + "\n"
				+ "Errors_from = " + errors_from + "\n" + "Flags = " + flags
				+ "\n" + "Ipmi_authtype = " + ipmi_authtype + "\n"
				+ "Ipmi_available = " + ipmi_available + "\n"
				+ "Ipmi_disable_until = " + ipmi_disable_until + "\n"
				+ "Ipmi_error = " + ipmi_error + "\n" + "Ipmi_errors_from = "
				+ ipmi_errors_from + "\n" + "Ipmi_password = " + ipmi_password
				+ "\n" + "Ipmi_privilege = " + ipmi_privilege + "\n"
				+ "Ipmi_username = " + ipmi_username + "\n"
				+ "Jmx_available = " + jmx_available + "\n"
				+ "Jmx_disable_until = " + jmx_disable_until + "\n"
				+ "Jmx_error = " + jmx_error + "\n" + "Jmx_errors_from = "
				+ jmx_errors_from + "\n" + "Maintenance_from = "
				+ maintenance_from + "\n" + "Maintenance_status = "
				+ maintenance_status + "\n" + "Maintenance_type = "
				+ maintenance_type + "\n" + "Maintenanceid = " + maintenanceid
				+ "\n" + "Name = " + name + "\n" + "Proxy_hostid = "
				+ proxy_hostid + "\n" + "Snmp_available = " + snmp_available
				+ "\n" + "Snmp_disable_until = " + snmp_disable_until + "\n"
				+ "Snmp_error = " + snmp_error + "\n" + "Snmp_errors_from = "
				+ snmp_errors_from + "\n" + "Status = " + status + "\n";
	}
}
