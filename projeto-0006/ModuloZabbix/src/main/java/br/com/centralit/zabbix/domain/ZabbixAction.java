package br.com.centralit.zabbix.domain;

import com.fasterxml.jackson.annotation.JsonProperty;



public class ZabbixAction extends BaseEntity { 
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	private String actionid; // ID of the action.
	@JsonProperty
	private Integer esc_period; // Default operation step duration. Must be
								// greater than 60 seconds.
	@JsonProperty
	private Integer evaltype; // Action condition evaluation method.
	@JsonProperty
	private Integer eventsource; // Refer to the
	@JsonProperty
	private String name; // Name of the action.
	@JsonProperty
	private String def_longdata; // Problem message text.
	@JsonProperty
	private String def_shortdata; // Problem message subject.
	@JsonProperty
	private String r_longdata; // Recovery message text.
	@JsonProperty
	private String r_shortdata; // Recovery message subject.
	@JsonProperty
	private Integer recovery_msg; // Whether recovery messages are enabled.
	@JsonProperty
	private Integer status; // Whether the action is enabled or disabled.

	public void setActionid(String pActionid) { // ID of the action.
		this.actionid = pActionid;
	}

	public void setEsc_period(Integer pEsc_period) { // Default operation step
														// duration. Must be
														// greater than 60
														// seconds.
		this.esc_period = pEsc_period;
	}

	public void setEvaltype(Integer pEvaltype) { // Action condition evaluation
													// method.
		this.evaltype = pEvaltype;
	}

	public void setEventsource(Integer pEventsource) { // Refer to the
		this.eventsource = pEventsource;
	}

	public void setName(String pName) { // Name of the action.
		this.name = pName;
	}

	public void setDef_longdata(String pDef_longdata) { // Problem message text.
		this.def_longdata = pDef_longdata;
	}

	public void setDef_shortdata(String pDef_shortdata) { // Problem message
															// subject.
		this.def_shortdata = pDef_shortdata;
	}

	public void setR_longdata(String pR_longdata) { // Recovery message text.
		this.r_longdata = pR_longdata;
	}

	public void setR_shortdata(String pR_shortdata) { // Recovery message
														// subject.
		this.r_shortdata = pR_shortdata;
	}

	public void setRecovery_msg(Integer pRecovery_msg) { // Whether recovery
															// messages are
															// enabled.
		this.recovery_msg = pRecovery_msg;
	}

	public void setStatus(Integer pStatus) { // Whether the action is enabled or
												// disabled.
		this.status = pStatus;
	}

	public String getActionid() { // ID of the action.
		return actionid;
	}

	public Integer getEsc_period() { // Default operation step duration. Must be
										// greater than 60 seconds.
		return esc_period;
	}

	public Integer getEvaltype() { // Action condition evaluation method.
		return evaltype;
	}

	public Integer getEventsource() { // Refer to the
		return eventsource;
	}

	public String getName() { // Name of the action.
		return name;
	}

	public String getDef_longdata() { // Problem message text.
		return def_longdata;
	}

	public String getDef_shortdata() { // Problem message subject.
		return def_shortdata;
	}

	public String getR_longdata() { // Recovery message text.
		return r_longdata;
	}

	public String getR_shortdata() { // Recovery message subject.
		return r_shortdata;
	}

	public Integer getRecovery_msg() { // Whether recovery messages are enabled.
		return recovery_msg;
	}

	public Integer getStatus() { // Whether the action is enabled or disabled.
		return status;
	}
}
