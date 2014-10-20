package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Hostgroups
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Hostgroups extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	An optional URL to custom actions or information about the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String action_url = null;
	/**
	*	An alias of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String alias = null;
	/**
	*	A list of all host names that are members of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String members = null;
	/**
	*	A list of all host names that are members of the hostgroup together with state and has_been_checked
	*/
	@NotNull
	@JsonProperty
	public String members_with_state = null;
	/**
	*	Name of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	/**
	*	Optional notes to the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String notes = null;
	/**
	*	An optional URL with further information about the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String notes_url = null;
	/**
	*	The total number of hosts in the group
	*/
	@NotNull
	@JsonProperty
	public int num_hosts = 0;
	/**
	*	The number of hosts in the group that are down
	*/
	@NotNull
	@JsonProperty
	public int num_hosts_down = 0;
	/**
	*	The number of hosts in the group that are pending
	*/
	@NotNull
	@JsonProperty
	public int num_hosts_pending = 0;
	/**
	*	The number of hosts in the group that are unreachable
	*/
	@NotNull
	@JsonProperty
	public int num_hosts_unreach = 0;
	/**
	*	The number of hosts in the group that are up
	*/
	@NotNull
	@JsonProperty
	public int num_hosts_up = 0;
	/**
	*	The total number of services of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services = 0;
	/**
	*	The total number of services with the state CRIT of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_crit = 0;
	/**
	*	The total number of services with the state CRIT of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_crit = 0;
	/**
	*	The total number of services with the state OK of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_ok = 0;
	/**
	*	The total number of services with the state UNKNOWN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_unknown = 0;
	/**
	*	The total number of services with the state WARN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_warn = 0;
	/**
	*	The total number of services with the state OK of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_ok = 0;
	/**
	*	The total number of services with the state Pending of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_pending = 0;
	/**
	*	The total number of services with the state UNKNOWN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_unknown = 0;
	/**
	*	The total number of services with the state WARN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int num_services_warn = 0;
	/**
	*	The worst state of all of the groups' hosts (UP <= UNREACHABLE <= DOWN)
	*/
	@NotNull
	@JsonProperty
	public int worst_host_state = 0;
	/**
	*	The worst state of all services that belong to a host of this group (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int worst_service_hard_state = 0;
	/**
	*	The worst state of all services that belong to a host of this group (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int worst_service_state = 0;
	public String toString(){
		return 
		"Action_url = " + action_url + "\n" +
		"Alias = " + alias + "\n" +
		"Members = " + members + "\n" +
		"Members_with_state = " + members_with_state + "\n" +
		"Name = " + name + "\n" +
		"Notes = " + notes + "\n" +
		"Notes_url = " + notes_url + "\n" +
		"Num_hosts = " + num_hosts + "\n" +
		"Num_hosts_down = " + num_hosts_down + "\n" +
		"Num_hosts_pending = " + num_hosts_pending + "\n" +
		"Num_hosts_unreach = " + num_hosts_unreach + "\n" +
		"Num_hosts_up = " + num_hosts_up + "\n" +
		"Num_services = " + num_services + "\n" +
		"Num_services_crit = " + num_services_crit + "\n" +
		"Num_services_hard_crit = " + num_services_hard_crit + "\n" +
		"Num_services_hard_ok = " + num_services_hard_ok + "\n" +
		"Num_services_hard_unknown = " + num_services_hard_unknown + "\n" +
		"Num_services_hard_warn = " + num_services_hard_warn + "\n" +
		"Num_services_ok = " + num_services_ok + "\n" +
		"Num_services_pending = " + num_services_pending + "\n" +
		"Num_services_unknown = " + num_services_unknown + "\n" +
		"Num_services_warn = " + num_services_warn + "\n" +
		"Worst_host_state = " + worst_host_state + "\n" +
		"Worst_service_hard_state = " + worst_service_hard_state + "\n" +
		"Worst_service_state = " + worst_service_state + "\n" +
"";

	}
}
