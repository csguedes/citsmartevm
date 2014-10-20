package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Servicesbyhostgroup
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Servicesbyhostgroup extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	Whether the service accepts passive checks (0/1)
	*/
	@NotNull
	@JsonProperty
	public int accept_passive_checks = 0;
	/**
	*	Whether the current service problem has been acknowledged (0/1)
	*/
	@NotNull
	@JsonProperty
	public int acknowledged = 0;
	/**
	*	The type of the acknownledgement (0: none, 1: normal, 2: sticky)
	*/
	@NotNull
	@JsonProperty
	public int acknowledgement_type = 0;
	/**
	*	An optional URL for actions or custom information about the service
	*/
	@NotNull
	@JsonProperty
	public String action_url = null;
	/**
	*	The action_url with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String action_url_expanded = null;
	/**
	*	Whether active checks are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int active_checks_enabled = 0;
	/**
	*	Nagios command used for active checks
	*/
	@NotNull
	@JsonProperty
	public String check_command = null;
	/**
	*	Nagios command used for active checks with the macros expanded
	*/
	@NotNull
	@JsonProperty
	public String check_command_expanded = null;
	/**
	*	Whether freshness checks are activated (0/1)
	*/
	@NotNull
	@JsonProperty
	public int check_freshness = 0;
	/**
	*	Number of basic interval lengths between two scheduled checks of the service
	*/
	@NotNull
	@JsonProperty
	public Float check_interval = null;
	/**
	*	The current check option, forced, normal, freshness... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int check_options = 0;
	/**
	*	The name of the check period of the service. It this is empty, the service is always checked.
	*/
	@NotNull
	@JsonProperty
	public String check_period = null;
	/**
	*	The type of the last check (0: active, 1: passive)
	*/
	@NotNull
	@JsonProperty
	public int check_type = 0;
	/**
	*	Whether active checks are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int checks_enabled = 0;
	/**
	*	A list of all comment ids of the service
	*/
	@NotNull
	@JsonProperty
	public String comments = null;
	/**
	*	A list of all comments of the service with id, author, comment, entry type and entry time
	*/
	@NotNull
	@JsonProperty
	public String comments_with_extra_info = null;
	/**
	*	A list of all comments of the service with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String comments_with_info = null;
	/**
	*	A list of all contact groups this service is in
	*/
	@NotNull
	@JsonProperty
	public String contact_groups = null;
	/**
	*	A list of all contacts of the service, either direct or via a contact group
	*/
	@NotNull
	@JsonProperty
	public String contacts = null;
	/**
	*	The number of the current check attempt
	*/
	@NotNull
	@JsonProperty
	public int current_attempt = 0;
	/**
	*	The number of the current notification
	*/
	@NotNull
	@JsonProperty
	public int current_notification_number = 0;
	/**
	*	A list of the names of all custom variables of the service
	*/
	@NotNull
	@JsonProperty
	public String custom_variable_names = null;
	/**
	*	A list of the values of all custom variable of the service
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
	*	Description of the service (also used as key)
	*/
	@NotNull
	@JsonProperty
	public String description = null;
	/**
	*	An optional display name (not used by Nagios standard web pages)
	*/
	@NotNull
	@JsonProperty
	public String display_name = null;
	/**
	*	A list of all downtime ids of the service
	*/
	@NotNull
	@JsonProperty
	public String downtimes = null;
	/**
	*	A list of all downtimes of the service with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String downtimes_with_info = null;
	/**
	*	Nagios command used as event handler
	*/
	@NotNull
	@JsonProperty
	public String event_handler = null;
	/**
	*	Whether and event handler is activated for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int event_handler_enabled = 0;
	/**
	*	Time the service check needed for execution
	*/
	@NotNull
	@JsonProperty
	public Float execution_time = null;
	/**
	*	Delay before the first notification
	*/
	@NotNull
	@JsonProperty
	public Float first_notification_delay = null;
	/**
	*	Whether flap detection is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int flap_detection_enabled = 0;
	/**
	*	A list of all service groups the service is in
	*/
	@NotNull
	@JsonProperty
	public String groups = null;
	/**
	*	Whether the service already has been checked (0/1)
	*/
	@NotNull
	@JsonProperty
	public int has_been_checked = 0;
	/**
	*	High threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float high_flap_threshold = null;
	/**
	*	Whether passive host checks are accepted (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_accept_passive_checks = 0;
	/**
	*	Whether the current host problem has been acknowledged (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_acknowledged = 0;
	/**
	*	Type of acknowledgement (0: none, 1: normal, 2: stick)
	*/
	@NotNull
	@JsonProperty
	public int host_acknowledgement_type = 0;
	/**
	*	An optional URL to custom actions or information about this host
	*/
	@NotNull
	@JsonProperty
	public String host_action_url = null;
	/**
	*	The same as action_url, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String host_action_url_expanded = null;
	/**
	*	Whether active checks are enabled for the host (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_active_checks_enabled = 0;
	/**
	*	IP address
	*/
	@NotNull
	@JsonProperty
	public String host_address = null;
	/**
	*	An alias name for the host
	*/
	@NotNull
	@JsonProperty
	public String host_alias = null;
	/**
	*	Nagios command for active host check of this host
	*/
	@NotNull
	@JsonProperty
	public String host_check_command = null;
	/**
	*	Nagios command for active host check of this host with the macros expanded
	*/
	@NotNull
	@JsonProperty
	public String host_check_command_expanded = null;
	/**
	*	Whether to check to send a recovery notification when flapping stops (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_check_flapping_recovery_notification = 0;
	/**
	*	Whether freshness checks are activated (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_check_freshness = 0;
	/**
	*	Number of basic interval lengths between two scheduled checks of the host
	*/
	@NotNull
	@JsonProperty
	public Float host_check_interval = null;
	/**
	*	The current check option, forced, normal, freshness... (0-2)
	*/
	@NotNull
	@JsonProperty
	public int host_check_options = 0;
	/**
	*	Time period in which this host will be checked. If empty then the host will always be checked.
	*/
	@NotNull
	@JsonProperty
	public String host_check_period = null;
	/**
	*	Type of check (0: active, 1: passive)
	*/
	@NotNull
	@JsonProperty
	public int host_check_type = 0;
	/**
	*	Whether checks of the host are enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_checks_enabled = 0;
	/**
	*	A list of all direct childs of the host
	*/
	@NotNull
	@JsonProperty
	public String host_childs = null;
	/**
	*	A list of the ids of all comments of this host
	*/
	@NotNull
	@JsonProperty
	public String host_comments = null;
	/**
	*	A list of all comments of the host with id, author, comment, entry type and entry time
	*/
	@NotNull
	@JsonProperty
	public String host_comments_with_extra_info = null;
	/**
	*	A list of all comments of the host with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String host_comments_with_info = null;
	/**
	*	A list of all contact groups this host is in
	*/
	@NotNull
	@JsonProperty
	public String host_contact_groups = null;
	/**
	*	A list of all contacts of this host, either direct or via a contact group
	*/
	@NotNull
	@JsonProperty
	public String host_contacts = null;
	/**
	*	Number of the current check attempts
	*/
	@NotNull
	@JsonProperty
	public int host_current_attempt = 0;
	/**
	*	Number of the current notification
	*/
	@NotNull
	@JsonProperty
	public int host_current_notification_number = 0;
	/**
	*	A list of the names of all custom variables
	*/
	@NotNull
	@JsonProperty
	public String host_custom_variable_names = null;
	/**
	*	A list of the values of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String host_custom_variable_values = null;
	/**
	*	A dictionary of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String host_custom_variables = null;
	/**
	*	Optional display name of the host - not used by Nagios' web interface
	*/
	@NotNull
	@JsonProperty
	public String host_display_name = null;
	/**
	*	A list of the ids of all scheduled downtimes of this host
	*/
	@NotNull
	@JsonProperty
	public String host_downtimes = null;
	/**
	*	A list of the all scheduled downtimes of the host with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String host_downtimes_with_info = null;
	/**
	*	Nagios command used as event handler
	*/
	@NotNull
	@JsonProperty
	public String host_event_handler = null;
	/**
	*	Whether event handling is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_event_handler_enabled = 0;
	/**
	*	Time the host check needed for execution
	*/
	@NotNull
	@JsonProperty
	public Float host_execution_time = null;
	/**
	*	The value of the custom variable FILENAME
	*/
	@NotNull
	@JsonProperty
	public String host_filename = null;
	/**
	*	Delay before the first notification
	*/
	@NotNull
	@JsonProperty
	public Float host_first_notification_delay = null;
	/**
	*	Whether flap detection is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_flap_detection_enabled = 0;
	/**
	*	A list of all host groups this host is in
	*/
	@NotNull
	@JsonProperty
	public String host_groups = null;
	/**
	*	The effective hard state of the host (eliminates a problem in hard_state)
	*/
	@NotNull
	@JsonProperty
	public int host_hard_state = 0;
	/**
	*	Whether the host has already been checked (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_has_been_checked = 0;
	/**
	*	High threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float host_high_flap_threshold = null;
	/**
	*	The name of an image file to be used in the web pages
	*/
	@NotNull
	@JsonProperty
	public String host_icon_image = null;
	/**
	*	Alternative text for the icon_image
	*/
	@NotNull
	@JsonProperty
	public String host_icon_image_alt = null;
	/**
	*	The same as icon_image, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String host_icon_image_expanded = null;
	/**
	*	Whether this host is currently in its check period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_in_check_period = 0;
	/**
	*	Whether this host is currently in its notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_in_notification_period = 0;
	/**
	*	Whether this host is currently in its service period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_in_service_period = 0;
	/**
	*	Initial host state
	*/
	@NotNull
	@JsonProperty
	public int host_initial_state = 0;
	/**
	*	is there a host check currently running... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_is_executing = 0;
	/**
	*	Whether the host state is flapping (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_is_flapping = 0;
	/**
	*	Time of the last check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_check = null;
	/**
	*	Last hard state
	*/
	@NotNull
	@JsonProperty
	public int host_last_hard_state = 0;
	/**
	*	Time of the last hard state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_hard_state_change = null;
	/**
	*	Time of the last notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_notification = null;
	/**
	*	State before last state change
	*/
	@NotNull
	@JsonProperty
	public int host_last_state = 0;
	/**
	*	Time of the last state change - soft or hard (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_state_change = null;
	/**
	*	The last time the host was DOWN (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_time_down = null;
	/**
	*	The last time the host was UNREACHABLE (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_time_unreachable = null;
	/**
	*	The last time the host was UP (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_last_time_up = null;
	/**
	*	Time difference between scheduled check time and actual check time
	*/
	@NotNull
	@JsonProperty
	public Float host_latency = null;
	/**
	*	Complete output from check plugin
	*/
	@NotNull
	@JsonProperty
	public String host_long_plugin_output = null;
	/**
	*	Low threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float host_low_flap_threshold = null;
	/**
	*	Max check attempts for active host checks
	*/
	@NotNull
	@JsonProperty
	public int host_max_check_attempts = 0;
	/**
	*	A bitmask specifying which attributes have been modified
	*/
	@NotNull
	@JsonProperty
	public int host_modified_attributes = 0;
	/**
	*	A list of all modified attributes
	*/
	@NotNull
	@JsonProperty
	public String host_modified_attributes_list = null;
	/**
	*	Host name
	*/
	@NotNull
	@JsonProperty
	public String host_name = null;
	/**
	*	Scheduled time for the next check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_next_check = null;
	/**
	*	Time of the next notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp host_next_notification = null;
	/**
	*	Whether to stop sending notifications (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_no_more_notifications = 0;
	/**
	*	Optional notes for this host
	*/
	@NotNull
	@JsonProperty
	public String host_notes = null;
	/**
	*	The same as notes, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String host_notes_expanded = null;
	/**
	*	An optional URL with further information about the host
	*/
	@NotNull
	@JsonProperty
	public String host_notes_url = null;
	/**
	*	Same es notes_url, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String host_notes_url_expanded = null;
	/**
	*	Interval of periodic notification or 0 if its off
	*/
	@NotNull
	@JsonProperty
	public Float host_notification_interval = null;
	/**
	*	Time period in which problems of this host will be notified. If empty then notification will be always
	*/
	@NotNull
	@JsonProperty
	public String host_notification_period = null;
	/**
	*	Whether notifications of the host are enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_notifications_enabled = 0;
	/**
	*	The total number of services of the host
	*/
	@NotNull
	@JsonProperty
	public int host_num_services = 0;
	/**
	*	The number of the host's services with the soft state CRIT
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_crit = 0;
	/**
	*	The number of the host's services with the hard state CRIT
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_hard_crit = 0;
	/**
	*	The number of the host's services with the hard state OK
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_hard_ok = 0;
	/**
	*	The number of the host's services with the hard state UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_hard_unknown = 0;
	/**
	*	The number of the host's services with the hard state WARN
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_hard_warn = 0;
	/**
	*	The number of the host's services with the soft state OK
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_ok = 0;
	/**
	*	The number of the host's services which have not been checked yet (pending)
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_pending = 0;
	/**
	*	The number of the host's services with the soft state UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_unknown = 0;
	/**
	*	The number of the host's services with the soft state WARN
	*/
	@NotNull
	@JsonProperty
	public int host_num_services_warn = 0;
	/**
	*	The current obsess_over_host setting... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_obsess_over_host = 0;
	/**
	*	A list of all direct parents of the host
	*/
	@NotNull
	@JsonProperty
	public String host_parents = null;
	/**
	*	Whether a flex downtime is pending (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_pending_flex_downtime = 0;
	/**
	*	Percent state change
	*/
	@NotNull
	@JsonProperty
	public Float host_percent_state_change = null;
	/**
	*	Optional performance data of the last host check
	*/
	@NotNull
	@JsonProperty
	public String host_perf_data = null;
	/**
	*	Output of the last host check
	*/
	@NotNull
	@JsonProperty
	public String host_plugin_output = null;
	/**
	*	Whether there is a PNP4Nagios graph present for this host (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_pnpgraph_present = 0;
	/**
	*	Whether processing of performance data is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int host_process_performance_data = 0;
	/**
	*	Number of basic interval lengths between checks when retrying after a soft error
	*/
	@NotNull
	@JsonProperty
	public Float host_retry_interval = null;
	/**
	*	The number of downtimes this host is currently in
	*/
	@NotNull
	@JsonProperty
	public int host_scheduled_downtime_depth = 0;
	/**
	*	The name of the service period of the host
	*/
	@NotNull
	@JsonProperty
	public String host_service_period = null;
	/**
	*	A list of all services of the host
	*/
	@NotNull
	@JsonProperty
	public String host_services = null;
	/**
	*	A list of all services including detailed information about each service
	*/
	@NotNull
	@JsonProperty
	public String host_services_with_info = null;
	/**
	*	A list of all services of the host together with state and has_been_checked
	*/
	@NotNull
	@JsonProperty
	public String host_services_with_state = null;
	/**
	*	Staleness indicator for this host
	*/
	@NotNull
	@JsonProperty
	public Float host_staleness = null;
	/**
	*	The current state of the host (0: up, 1: down, 2: unreachable)
	*/
	@NotNull
	@JsonProperty
	public int host_state = 0;
	/**
	*	Type of the current state (0: soft, 1: hard)
	*/
	@NotNull
	@JsonProperty
	public int host_state_type = 0;
	/**
	*	The name of in image file for the status map
	*/
	@NotNull
	@JsonProperty
	public String host_statusmap_image = null;
	/**
	*	The total number of services of the host
	*/
	@NotNull
	@JsonProperty
	public int host_total_services = 0;
	/**
	*	The worst hard state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int host_worst_service_hard_state = 0;
	/**
	*	The worst soft state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int host_worst_service_state = 0;
	/**
	*	3D-Coordinates: X
	*/
	@NotNull
	@JsonProperty
	public Float host_x_3d = null;
	/**
	*	3D-Coordinates: Y
	*/
	@NotNull
	@JsonProperty
	public Float host_y_3d = null;
	/**
	*	3D-Coordinates: Z
	*/
	@NotNull
	@JsonProperty
	public Float host_z_3d = null;
	/**
	*	An optional URL to custom actions or information about the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_action_url = null;
	/**
	*	An alias of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_alias = null;
	/**
	*	A list of all host names that are members of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_members = null;
	/**
	*	A list of all host names that are members of the hostgroup together with state and has_been_checked
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_members_with_state = null;
	/**
	*	Name of the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_name = null;
	/**
	*	Optional notes to the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_notes = null;
	/**
	*	An optional URL with further information about the hostgroup
	*/
	@NotNull
	@JsonProperty
	public String hostgroup_notes_url = null;
	/**
	*	The total number of hosts in the group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_hosts = 0;
	/**
	*	The number of hosts in the group that are down
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_hosts_down = 0;
	/**
	*	The number of hosts in the group that are pending
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_hosts_pending = 0;
	/**
	*	The number of hosts in the group that are unreachable
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_hosts_unreach = 0;
	/**
	*	The number of hosts in the group that are up
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_hosts_up = 0;
	/**
	*	The total number of services of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services = 0;
	/**
	*	The total number of services with the state CRIT of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_crit = 0;
	/**
	*	The total number of services with the state CRIT of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_hard_crit = 0;
	/**
	*	The total number of services with the state OK of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_hard_ok = 0;
	/**
	*	The total number of services with the state UNKNOWN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_hard_unknown = 0;
	/**
	*	The total number of services with the state WARN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_hard_warn = 0;
	/**
	*	The total number of services with the state OK of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_ok = 0;
	/**
	*	The total number of services with the state Pending of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_pending = 0;
	/**
	*	The total number of services with the state UNKNOWN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_unknown = 0;
	/**
	*	The total number of services with the state WARN of hosts in this group
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_num_services_warn = 0;
	/**
	*	The worst state of all of the groups' hosts (UP <= UNREACHABLE <= DOWN)
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_worst_host_state = 0;
	/**
	*	The worst state of all services that belong to a host of this group (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_worst_service_hard_state = 0;
	/**
	*	The worst state of all services that belong to a host of this group (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int hostgroup_worst_service_state = 0;
	/**
	*	The name of an image to be used as icon in the web interface
	*/
	@NotNull
	@JsonProperty
	public String icon_image = null;
	/**
	*	An alternative text for the icon_image for browsers not displaying icons
	*/
	@NotNull
	@JsonProperty
	public String icon_image_alt = null;
	/**
	*	The icon_image with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String icon_image_expanded = null;
	/**
	*	Whether the service is currently in its check period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int in_check_period = 0;
	/**
	*	Whether the service is currently in its notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int in_notification_period = 0;
	/**
	*	Whether this service is currently in its service period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int in_service_period = 0;
	/**
	*	The initial state of the service
	*/
	@NotNull
	@JsonProperty
	public int initial_state = 0;
	/**
	*	is there a service check currently running... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int is_executing = 0;
	/**
	*	Whether the service is flapping (0/1)
	*/
	@NotNull
	@JsonProperty
	public int is_flapping = 0;
	/**
	*	The time of the last check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_check = null;
	/**
	*	The last hard state of the service
	*/
	@NotNull
	@JsonProperty
	public int last_hard_state = 0;
	/**
	*	The time of the last hard state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_hard_state_change = null;
	/**
	*	The time of the last notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_notification = null;
	/**
	*	The last state of the service
	*/
	@NotNull
	@JsonProperty
	public int last_state = 0;
	/**
	*	The time of the last state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_state_change = null;
	/**
	*	The last time the service was CRITICAL (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_time_critical = null;
	/**
	*	The last time the service was OK (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_time_ok = null;
	/**
	*	The last time the service was UNKNOWN (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_time_unknown = null;
	/**
	*	The last time the service was in WARNING state (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_time_warning = null;
	/**
	*	Time difference between scheduled check time and actual check time
	*/
	@NotNull
	@JsonProperty
	public Float latency = null;
	/**
	*	Unabbreviated output of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String long_plugin_output = null;
	/**
	*	Low threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float low_flap_threshold = null;
	/**
	*	The maximum number of check attempts
	*/
	@NotNull
	@JsonProperty
	public int max_check_attempts = 0;
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
	*	The scheduled time of the next check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp next_check = null;
	/**
	*	The time of the next notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp next_notification = null;
	/**
	*	Whether to stop sending notifications (0/1)
	*/
	@NotNull
	@JsonProperty
	public int no_more_notifications = 0;
	/**
	*	Optional notes about the service
	*/
	@NotNull
	@JsonProperty
	public String notes = null;
	/**
	*	The notes with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String notes_expanded = null;
	/**
	*	An optional URL for additional notes about the service
	*/
	@NotNull
	@JsonProperty
	public String notes_url = null;
	/**
	*	The notes_url with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String notes_url_expanded = null;
	/**
	*	Interval of periodic notification or 0 if its off
	*/
	@NotNull
	@JsonProperty
	public Float notification_interval = null;
	/**
	*	The name of the notification period of the service. It this is empty, service problems are always notified.
	*/
	@NotNull
	@JsonProperty
	public String notification_period = null;
	/**
	*	Whether notifications are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int notifications_enabled = 0;
	/**
	*	Whether 'obsess_over_service' is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int obsess_over_service = 0;
	/**
	*	Percent state change
	*/
	@NotNull
	@JsonProperty
	public Float percent_state_change = null;
	/**
	*	Performance data of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String perf_data = null;
	/**
	*	Output of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String plugin_output = null;
	/**
	*	Whether there is a PNP4Nagios graph present for this service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int pnpgraph_present = 0;
	/**
	*	Whether processing of performance data is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int process_performance_data = 0;
	/**
	*	Number of basic interval lengths between checks when retrying after a soft error
	*/
	@NotNull
	@JsonProperty
	public Float retry_interval = null;
	/**
	*	The number of scheduled downtimes the service is currently in
	*/
	@NotNull
	@JsonProperty
	public int scheduled_downtime_depth = 0;
	/**
	*	The name of the service period of the service
	*/
	@NotNull
	@JsonProperty
	public String service_period = null;
	/**
	*	The staleness indicator for this service
	*/
	@NotNull
	@JsonProperty
	public Float staleness = null;
	/**
	*	The current state of the service (0: OK, 1: WARN, 2: CRITICAL, 3: UNKNOWN)
	*/
	@NotNull
	@JsonProperty
	public int state = 0;
	/**
	*	The type of the current state (0: soft, 1: hard)
	*/
	@NotNull
	@JsonProperty
	public int state_type = 0;
	public String toString(){
		return 
		"Accept_passive_checks = " + accept_passive_checks + "\n" +
		"Acknowledged = " + acknowledged + "\n" +
		"Acknowledgement_type = " + acknowledgement_type + "\n" +
		"Action_url = " + action_url + "\n" +
		"Action_url_expanded = " + action_url_expanded + "\n" +
		"Active_checks_enabled = " + active_checks_enabled + "\n" +
		"Check_command = " + check_command + "\n" +
		"Check_command_expanded = " + check_command_expanded + "\n" +
		"Check_freshness = " + check_freshness + "\n" +
		"Check_interval = " + check_interval + "\n" +
		"Check_options = " + check_options + "\n" +
		"Check_period = " + check_period + "\n" +
		"Check_type = " + check_type + "\n" +
		"Checks_enabled = " + checks_enabled + "\n" +
		"Comments = " + comments + "\n" +
		"Comments_with_extra_info = " + comments_with_extra_info + "\n" +
		"Comments_with_info = " + comments_with_info + "\n" +
		"Contact_groups = " + contact_groups + "\n" +
		"Contacts = " + contacts + "\n" +
		"Current_attempt = " + current_attempt + "\n" +
		"Current_notification_number = " + current_notification_number + "\n" +
		"Custom_variable_names = " + custom_variable_names + "\n" +
		"Custom_variable_values = " + custom_variable_values + "\n" +
		"Custom_variables = " + custom_variables + "\n" +
		"Description = " + description + "\n" +
		"Display_name = " + display_name + "\n" +
		"Downtimes = " + downtimes + "\n" +
		"Downtimes_with_info = " + downtimes_with_info + "\n" +
		"Event_handler = " + event_handler + "\n" +
		"Event_handler_enabled = " + event_handler_enabled + "\n" +
		"Execution_time = " + execution_time + "\n" +
		"First_notification_delay = " + first_notification_delay + "\n" +
		"Flap_detection_enabled = " + flap_detection_enabled + "\n" +
		"Groups = " + groups + "\n" +
		"Has_been_checked = " + has_been_checked + "\n" +
		"High_flap_threshold = " + high_flap_threshold + "\n" +
		"Host_accept_passive_checks = " + host_accept_passive_checks + "\n" +
		"Host_acknowledged = " + host_acknowledged + "\n" +
		"Host_acknowledgement_type = " + host_acknowledgement_type + "\n" +
		"Host_action_url = " + host_action_url + "\n" +
		"Host_action_url_expanded = " + host_action_url_expanded + "\n" +
		"Host_active_checks_enabled = " + host_active_checks_enabled + "\n" +
		"Host_address = " + host_address + "\n" +
		"Host_alias = " + host_alias + "\n" +
		"Host_check_command = " + host_check_command + "\n" +
		"Host_check_command_expanded = " + host_check_command_expanded + "\n" +
		"Host_check_flapping_recovery_notification = " + host_check_flapping_recovery_notification + "\n" +
		"Host_check_freshness = " + host_check_freshness + "\n" +
		"Host_check_interval = " + host_check_interval + "\n" +
		"Host_check_options = " + host_check_options + "\n" +
		"Host_check_period = " + host_check_period + "\n" +
		"Host_check_type = " + host_check_type + "\n" +
		"Host_checks_enabled = " + host_checks_enabled + "\n" +
		"Host_childs = " + host_childs + "\n" +
		"Host_comments = " + host_comments + "\n" +
		"Host_comments_with_extra_info = " + host_comments_with_extra_info + "\n" +
		"Host_comments_with_info = " + host_comments_with_info + "\n" +
		"Host_contact_groups = " + host_contact_groups + "\n" +
		"Host_contacts = " + host_contacts + "\n" +
		"Host_current_attempt = " + host_current_attempt + "\n" +
		"Host_current_notification_number = " + host_current_notification_number + "\n" +
		"Host_custom_variable_names = " + host_custom_variable_names + "\n" +
		"Host_custom_variable_values = " + host_custom_variable_values + "\n" +
		"Host_custom_variables = " + host_custom_variables + "\n" +
		"Host_display_name = " + host_display_name + "\n" +
		"Host_downtimes = " + host_downtimes + "\n" +
		"Host_downtimes_with_info = " + host_downtimes_with_info + "\n" +
		"Host_event_handler = " + host_event_handler + "\n" +
		"Host_event_handler_enabled = " + host_event_handler_enabled + "\n" +
		"Host_execution_time = " + host_execution_time + "\n" +
		"Host_filename = " + host_filename + "\n" +
		"Host_first_notification_delay = " + host_first_notification_delay + "\n" +
		"Host_flap_detection_enabled = " + host_flap_detection_enabled + "\n" +
		"Host_groups = " + host_groups + "\n" +
		"Host_hard_state = " + host_hard_state + "\n" +
		"Host_has_been_checked = " + host_has_been_checked + "\n" +
		"Host_high_flap_threshold = " + host_high_flap_threshold + "\n" +
		"Host_icon_image = " + host_icon_image + "\n" +
		"Host_icon_image_alt = " + host_icon_image_alt + "\n" +
		"Host_icon_image_expanded = " + host_icon_image_expanded + "\n" +
		"Host_in_check_period = " + host_in_check_period + "\n" +
		"Host_in_notification_period = " + host_in_notification_period + "\n" +
		"Host_in_service_period = " + host_in_service_period + "\n" +
		"Host_initial_state = " + host_initial_state + "\n" +
		"Host_is_executing = " + host_is_executing + "\n" +
		"Host_is_flapping = " + host_is_flapping + "\n" +
		"Host_last_check = " + host_last_check + "\n" +
		"Host_last_hard_state = " + host_last_hard_state + "\n" +
		"Host_last_hard_state_change = " + host_last_hard_state_change + "\n" +
		"Host_last_notification = " + host_last_notification + "\n" +
		"Host_last_state = " + host_last_state + "\n" +
		"Host_last_state_change = " + host_last_state_change + "\n" +
		"Host_last_time_down = " + host_last_time_down + "\n" +
		"Host_last_time_unreachable = " + host_last_time_unreachable + "\n" +
		"Host_last_time_up = " + host_last_time_up + "\n" +
		"Host_latency = " + host_latency + "\n" +
		"Host_long_plugin_output = " + host_long_plugin_output + "\n" +
		"Host_low_flap_threshold = " + host_low_flap_threshold + "\n" +
		"Host_max_check_attempts = " + host_max_check_attempts + "\n" +
		"Host_modified_attributes = " + host_modified_attributes + "\n" +
		"Host_modified_attributes_list = " + host_modified_attributes_list + "\n" +
		"Host_name = " + host_name + "\n" +
		"Host_next_check = " + host_next_check + "\n" +
		"Host_next_notification = " + host_next_notification + "\n" +
		"Host_no_more_notifications = " + host_no_more_notifications + "\n" +
		"Host_notes = " + host_notes + "\n" +
		"Host_notes_expanded = " + host_notes_expanded + "\n" +
		"Host_notes_url = " + host_notes_url + "\n" +
		"Host_notes_url_expanded = " + host_notes_url_expanded + "\n" +
		"Host_notification_interval = " + host_notification_interval + "\n" +
		"Host_notification_period = " + host_notification_period + "\n" +
		"Host_notifications_enabled = " + host_notifications_enabled + "\n" +
		"Host_num_services = " + host_num_services + "\n" +
		"Host_num_services_crit = " + host_num_services_crit + "\n" +
		"Host_num_services_hard_crit = " + host_num_services_hard_crit + "\n" +
		"Host_num_services_hard_ok = " + host_num_services_hard_ok + "\n" +
		"Host_num_services_hard_unknown = " + host_num_services_hard_unknown + "\n" +
		"Host_num_services_hard_warn = " + host_num_services_hard_warn + "\n" +
		"Host_num_services_ok = " + host_num_services_ok + "\n" +
		"Host_num_services_pending = " + host_num_services_pending + "\n" +
		"Host_num_services_unknown = " + host_num_services_unknown + "\n" +
		"Host_num_services_warn = " + host_num_services_warn + "\n" +
		"Host_obsess_over_host = " + host_obsess_over_host + "\n" +
		"Host_parents = " + host_parents + "\n" +
		"Host_pending_flex_downtime = " + host_pending_flex_downtime + "\n" +
		"Host_percent_state_change = " + host_percent_state_change + "\n" +
		"Host_perf_data = " + host_perf_data + "\n" +
		"Host_plugin_output = " + host_plugin_output + "\n" +
		"Host_pnpgraph_present = " + host_pnpgraph_present + "\n" +
		"Host_process_performance_data = " + host_process_performance_data + "\n" +
		"Host_retry_interval = " + host_retry_interval + "\n" +
		"Host_scheduled_downtime_depth = " + host_scheduled_downtime_depth + "\n" +
		"Host_service_period = " + host_service_period + "\n" +
		"Host_services = " + host_services + "\n" +
		"Host_services_with_info = " + host_services_with_info + "\n" +
		"Host_services_with_state = " + host_services_with_state + "\n" +
		"Host_staleness = " + host_staleness + "\n" +
		"Host_state = " + host_state + "\n" +
		"Host_state_type = " + host_state_type + "\n" +
		"Host_statusmap_image = " + host_statusmap_image + "\n" +
		"Host_total_services = " + host_total_services + "\n" +
		"Host_worst_service_hard_state = " + host_worst_service_hard_state + "\n" +
		"Host_worst_service_state = " + host_worst_service_state + "\n" +
		"Host_x_3d = " + host_x_3d + "\n" +
		"Host_y_3d = " + host_y_3d + "\n" +
		"Host_z_3d = " + host_z_3d + "\n" +
		"Hostgroup_action_url = " + hostgroup_action_url + "\n" +
		"Hostgroup_alias = " + hostgroup_alias + "\n" +
		"Hostgroup_members = " + hostgroup_members + "\n" +
		"Hostgroup_members_with_state = " + hostgroup_members_with_state + "\n" +
		"Hostgroup_name = " + hostgroup_name + "\n" +
		"Hostgroup_notes = " + hostgroup_notes + "\n" +
		"Hostgroup_notes_url = " + hostgroup_notes_url + "\n" +
		"Hostgroup_num_hosts = " + hostgroup_num_hosts + "\n" +
		"Hostgroup_num_hosts_down = " + hostgroup_num_hosts_down + "\n" +
		"Hostgroup_num_hosts_pending = " + hostgroup_num_hosts_pending + "\n" +
		"Hostgroup_num_hosts_unreach = " + hostgroup_num_hosts_unreach + "\n" +
		"Hostgroup_num_hosts_up = " + hostgroup_num_hosts_up + "\n" +
		"Hostgroup_num_services = " + hostgroup_num_services + "\n" +
		"Hostgroup_num_services_crit = " + hostgroup_num_services_crit + "\n" +
		"Hostgroup_num_services_hard_crit = " + hostgroup_num_services_hard_crit + "\n" +
		"Hostgroup_num_services_hard_ok = " + hostgroup_num_services_hard_ok + "\n" +
		"Hostgroup_num_services_hard_unknown = " + hostgroup_num_services_hard_unknown + "\n" +
		"Hostgroup_num_services_hard_warn = " + hostgroup_num_services_hard_warn + "\n" +
		"Hostgroup_num_services_ok = " + hostgroup_num_services_ok + "\n" +
		"Hostgroup_num_services_pending = " + hostgroup_num_services_pending + "\n" +
		"Hostgroup_num_services_unknown = " + hostgroup_num_services_unknown + "\n" +
		"Hostgroup_num_services_warn = " + hostgroup_num_services_warn + "\n" +
		"Hostgroup_worst_host_state = " + hostgroup_worst_host_state + "\n" +
		"Hostgroup_worst_service_hard_state = " + hostgroup_worst_service_hard_state + "\n" +
		"Hostgroup_worst_service_state = " + hostgroup_worst_service_state + "\n" +
		"Icon_image = " + icon_image + "\n" +
		"Icon_image_alt = " + icon_image_alt + "\n" +
		"Icon_image_expanded = " + icon_image_expanded + "\n" +
		"In_check_period = " + in_check_period + "\n" +
		"In_notification_period = " + in_notification_period + "\n" +
		"In_service_period = " + in_service_period + "\n" +
		"Initial_state = " + initial_state + "\n" +
		"Is_executing = " + is_executing + "\n" +
		"Is_flapping = " + is_flapping + "\n" +
		"Last_check = " + last_check + "\n" +
		"Last_hard_state = " + last_hard_state + "\n" +
		"Last_hard_state_change = " + last_hard_state_change + "\n" +
		"Last_notification = " + last_notification + "\n" +
		"Last_state = " + last_state + "\n" +
		"Last_state_change = " + last_state_change + "\n" +
		"Last_time_critical = " + last_time_critical + "\n" +
		"Last_time_ok = " + last_time_ok + "\n" +
		"Last_time_unknown = " + last_time_unknown + "\n" +
		"Last_time_warning = " + last_time_warning + "\n" +
		"Latency = " + latency + "\n" +
		"Long_plugin_output = " + long_plugin_output + "\n" +
		"Low_flap_threshold = " + low_flap_threshold + "\n" +
		"Max_check_attempts = " + max_check_attempts + "\n" +
		"Modified_attributes = " + modified_attributes + "\n" +
		"Modified_attributes_list = " + modified_attributes_list + "\n" +
		"Next_check = " + next_check + "\n" +
		"Next_notification = " + next_notification + "\n" +
		"No_more_notifications = " + no_more_notifications + "\n" +
		"Notes = " + notes + "\n" +
		"Notes_expanded = " + notes_expanded + "\n" +
		"Notes_url = " + notes_url + "\n" +
		"Notes_url_expanded = " + notes_url_expanded + "\n" +
		"Notification_interval = " + notification_interval + "\n" +
		"Notification_period = " + notification_period + "\n" +
		"Notifications_enabled = " + notifications_enabled + "\n" +
		"Obsess_over_service = " + obsess_over_service + "\n" +
		"Percent_state_change = " + percent_state_change + "\n" +
		"Perf_data = " + perf_data + "\n" +
		"Plugin_output = " + plugin_output + "\n" +
		"Pnpgraph_present = " + pnpgraph_present + "\n" +
		"Process_performance_data = " + process_performance_data + "\n" +
		"Retry_interval = " + retry_interval + "\n" +
		"Scheduled_downtime_depth = " + scheduled_downtime_depth + "\n" +
		"Service_period = " + service_period + "\n" +
		"Staleness = " + staleness + "\n" +
		"State = " + state + "\n" +
		"State_type = " + state_type + "\n" +
"";

	}
}
