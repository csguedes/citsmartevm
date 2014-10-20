package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Servicegroups
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Servicegroups extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	An optional URL to custom notes or actions on the service group
	*/
	@NotNull
	@JsonProperty
	public String action_url = null;
	/**
	*	An alias of the service group
	*/
	@NotNull
	@JsonProperty
	public String alias = null;
	/**
	*	A list of all members of the service group as host/service pairs
	*/
	@NotNull
	@JsonProperty
	public String members = null;
	/**
	*	A list of all members of the service group with state and has_been_checked
	*/
	@NotNull
	@JsonProperty
	public String members_with_state = null;
	/**
	*	The name of the service group
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	/**
	*	Optional additional notes about the service group
	*/
	@NotNull
	@JsonProperty
	public String notes = null;
	/**
	*	An optional URL to further notes on the service group
	*/
	@NotNull
	@JsonProperty
	public String notes_url = null;
	/**
	*	The total number of services in the group
	*/
	@NotNull
	@JsonProperty
	public int num_services = 0;
	/**
	*	The number of services in the group that are CRIT
	*/
	@NotNull
	@JsonProperty
	public int num_services_crit = 0;
	/**
	*	The number of services in the group that are CRIT
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_crit = 0;
	/**
	*	The number of services in the group that are OK
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_ok = 0;
	/**
	*	The number of services in the group that are UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_unknown = 0;
	/**
	*	The number of services in the group that are WARN
	*/
	@NotNull
	@JsonProperty
	public int num_services_hard_warn = 0;
	/**
	*	The number of services in the group that are OK
	*/
	@NotNull
	@JsonProperty
	public int num_services_ok = 0;
	/**
	*	The number of services in the group that are PENDING
	*/
	@NotNull
	@JsonProperty
	public int num_services_pending = 0;
	/**
	*	The number of services in the group that are UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int num_services_unknown = 0;
	/**
	*	The number of services in the group that are WARN
	*/
	@NotNull
	@JsonProperty
	public int num_services_warn = 0;
	/**
	*	The worst soft state of all of the groups services (OK <= WARN <= UNKNOWN <= CRIT)
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
		"Worst_service_state = " + worst_service_state + "\n" +
"";

	}
}
