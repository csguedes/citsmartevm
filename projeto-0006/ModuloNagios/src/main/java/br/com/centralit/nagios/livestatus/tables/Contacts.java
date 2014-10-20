package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Contacts
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Contacts extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	The additional field address1
	*/
	@NotNull
	@JsonProperty
	public String address1 = null;
	/**
	*	The additional field address2
	*/
	@NotNull
	@JsonProperty
	public String address2 = null;
	/**
	*	The additional field address3
	*/
	@NotNull
	@JsonProperty
	public String address3 = null;
	/**
	*	The additional field address4
	*/
	@NotNull
	@JsonProperty
	public String address4 = null;
	/**
	*	The additional field address5
	*/
	@NotNull
	@JsonProperty
	public String address5 = null;
	/**
	*	The additional field address6
	*/
	@NotNull
	@JsonProperty
	public String address6 = null;
	/**
	*	The full name of the contact
	*/
	@NotNull
	@JsonProperty
	public String alias = null;
	/**
	*	Wether the contact is allowed to submit commands (0/1)
	*/
	@NotNull
	@JsonProperty
	public int can_submit_commands = 0;
	/**
	*	A list of all custom variables of the contact
	*/
	@NotNull
	@JsonProperty
	public String custom_variable_names = null;
	/**
	*	A list of the values of all custom variables of the contact
	*/
	@NotNull
	@JsonProperty
	public String custom_variable_values = null;
	/**
	*	A dictionary of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String custom_variables = null;
	/**
	*	The email address of the contact
	*/
	@NotNull
	@JsonProperty
	public String email = null;
	/**
	*	The time period in which the contact will be notified about host problems
	*/
	@NotNull
	@JsonProperty
	public String host_notification_period = null;
	/**
	*	Wether the contact will be notified about host problems in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_notifications_enabled = 0;
	/**
	*	Wether the contact is currently in his/her host notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int in_host_notification_period = 0;
	/**
	*	Wether the contact is currently in his/her service notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int in_service_notification_period = 0;
	/**
	*	A bitmask specifying which attributes have been modified
	*/
	@NotNull
	@JsonProperty
	public int modified_attributes = 0;
	/**
	*	A list of all modified attributes
	*/
	@NotNull
	@JsonProperty
	public String modified_attributes_list = null;
	/**
	*	The login name of the contact person
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	/**
	*	The pager address of the contact
	*/
	@NotNull
	@JsonProperty
	public String pager = null;
	/**
	*	The time period in which the contact will be notified about service problems
	*/
	@NotNull
	@JsonProperty
	public String service_notification_period = null;
	/**
	*	Wether the contact will be notified about service problems in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int service_notifications_enabled = 0;
	public String toString(){
		return 
		"Address1 = " + address1 + "\n" +
		"Address2 = " + address2 + "\n" +
		"Address3 = " + address3 + "\n" +
		"Address4 = " + address4 + "\n" +
		"Address5 = " + address5 + "\n" +
		"Address6 = " + address6 + "\n" +
		"Alias = " + alias + "\n" +
		"Can_submit_commands = " + can_submit_commands + "\n" +
		"Custom_variable_names = " + custom_variable_names + "\n" +
		"Custom_variable_values = " + custom_variable_values + "\n" +
		"Custom_variables = " + custom_variables + "\n" +
		"Email = " + email + "\n" +
		"Host_notification_period = " + host_notification_period + "\n" +
		"Host_notifications_enabled = " + host_notifications_enabled + "\n" +
		"In_host_notification_period = " + in_host_notification_period + "\n" +
		"In_service_notification_period = " + in_service_notification_period + "\n" +
		"Modified_attributes = " + modified_attributes + "\n" +
		"Modified_attributes_list = " + modified_attributes_list + "\n" +
		"Name = " + name + "\n" +
		"Pager = " + pager + "\n" +
		"Service_notification_period = " + service_notification_period + "\n" +
		"Service_notifications_enabled = " + service_notifications_enabled + "\n" +
"";

	}
}
