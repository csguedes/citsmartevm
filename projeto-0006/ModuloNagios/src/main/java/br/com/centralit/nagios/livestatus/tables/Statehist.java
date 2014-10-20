package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Statehist
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Statehist extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	Whether passive host checks are accepted (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_accept_passive_checks = 0;
	/**
	*	Whether the current host problem has been acknowledged (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_acknowledged = 0;
	/**
	*	Type of acknowledgement (0: none, 1: normal, 2: stick)
	*/
	@NotNull
	@JsonProperty
	public int current_host_acknowledgement_type = 0;
	/**
	*	An optional URL to custom actions or information about this host
	*/
	@NotNull
	@JsonProperty
	public String current_host_action_url = null;
	/**
	*	The same as action_url, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_host_action_url_expanded = null;
	/**
	*	Whether active checks are enabled for the host (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_active_checks_enabled = 0;
	/**
	*	IP address
	*/
	@NotNull
	@JsonProperty
	public String current_host_address = null;
	/**
	*	An alias name for the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_alias = null;
	/**
	*	Nagios command for active host check of this host
	*/
	@NotNull
	@JsonProperty
	public String current_host_check_command = null;
	/**
	*	Nagios command for active host check of this host with the macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_host_check_command_expanded = null;
	/**
	*	Whether to check to send a recovery notification when flapping stops (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_check_flapping_recovery_notification = 0;
	/**
	*	Whether freshness checks are activated (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_check_freshness = 0;
	/**
	*	Number of basic interval lengths between two scheduled checks of the host
	*/
	@NotNull
	@JsonProperty
	public Float current_host_check_interval = null;
	/**
	*	The current check option, forced, normal, freshness... (0-2)
	*/
	@NotNull
	@JsonProperty
	public int current_host_check_options = 0;
	/**
	*	Time period in which this host will be checked. If empty then the host will always be checked.
	*/
	@NotNull
	@JsonProperty
	public String current_host_check_period = null;
	/**
	*	Type of check (0: active, 1: passive)
	*/
	@NotNull
	@JsonProperty
	public int current_host_check_type = 0;
	/**
	*	Whether checks of the host are enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_checks_enabled = 0;
	/**
	*	A list of all direct childs of the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_childs = null;
	/**
	*	A list of the ids of all comments of this host
	*/
	@NotNull
	@JsonProperty
	public String current_host_comments = null;
	/**
	*	A list of all comments of the host with id, author, comment, entry type and entry time
	*/
	@NotNull
	@JsonProperty
	public String current_host_comments_with_extra_info = null;
	/**
	*	A list of all comments of the host with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String current_host_comments_with_info = null;
	/**
	*	A list of all contact groups this host is in
	*/
	@NotNull
	@JsonProperty
	public String current_host_contact_groups = null;
	/**
	*	A list of all contacts of this host, either direct or via a contact group
	*/
	@NotNull
	@JsonProperty
	public String current_host_contacts = null;
	/**
	*	Number of the current check attempts
	*/
	@NotNull
	@JsonProperty
	public int current_host_current_attempt = 0;
	/**
	*	Number of the current notification
	*/
	@NotNull
	@JsonProperty
	public int current_host_current_notification_number = 0;
	/**
	*	A list of the names of all custom variables
	*/
	@NotNull
	@JsonProperty
	public String current_host_custom_variable_names = null;
	/**
	*	A list of the values of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String current_host_custom_variable_values = null;
	/**
	*	A dictionary of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String current_host_custom_variables = null;
	/**
	*	Optional display name of the host - not used by Nagios' web interface
	*/
	@NotNull
	@JsonProperty
	public String current_host_display_name = null;
	/**
	*	A list of the ids of all scheduled downtimes of this host
	*/
	@NotNull
	@JsonProperty
	public String current_host_downtimes = null;
	/**
	*	A list of the all scheduled downtimes of the host with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String current_host_downtimes_with_info = null;
	/**
	*	Nagios command used as event handler
	*/
	@NotNull
	@JsonProperty
	public String current_host_event_handler = null;
	/**
	*	Whether event handling is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_event_handler_enabled = 0;
	/**
	*	Time the host check needed for execution
	*/
	@NotNull
	@JsonProperty
	public Float current_host_execution_time = null;
	/**
	*	The value of the custom variable FILENAME
	*/
	@NotNull
	@JsonProperty
	public String current_host_filename = null;
	/**
	*	Delay before the first notification
	*/
	@NotNull
	@JsonProperty
	public Float current_host_first_notification_delay = null;
	/**
	*	Whether flap detection is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_flap_detection_enabled = 0;
	/**
	*	A list of all host groups this host is in
	*/
	@NotNull
	@JsonProperty
	public String current_host_groups = null;
	/**
	*	The effective hard state of the host (eliminates a problem in hard_state)
	*/
	@NotNull
	@JsonProperty
	public int current_host_hard_state = 0;
	/**
	*	Whether the host has already been checked (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_has_been_checked = 0;
	/**
	*	High threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float current_host_high_flap_threshold = null;
	/**
	*	The name of an image file to be used in the web pages
	*/
	@NotNull
	@JsonProperty
	public String current_host_icon_image = null;
	/**
	*	Alternative text for the icon_image
	*/
	@NotNull
	@JsonProperty
	public String current_host_icon_image_alt = null;
	/**
	*	The same as icon_image, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_host_icon_image_expanded = null;
	/**
	*	Whether this host is currently in its check period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_in_check_period = 0;
	/**
	*	Whether this host is currently in its notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_in_notification_period = 0;
	/**
	*	Whether this host is currently in its service period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_in_service_period = 0;
	/**
	*	Initial host state
	*/
	@NotNull
	@JsonProperty
	public int current_host_initial_state = 0;
	/**
	*	is there a host check currently running... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_is_executing = 0;
	/**
	*	Whether the host state is flapping (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_is_flapping = 0;
	/**
	*	Time of the last check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_check = null;
	/**
	*	Last hard state
	*/
	@NotNull
	@JsonProperty
	public int current_host_last_hard_state = 0;
	/**
	*	Time of the last hard state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_hard_state_change = null;
	/**
	*	Time of the last notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_notification = null;
	/**
	*	State before last state change
	*/
	@NotNull
	@JsonProperty
	public int current_host_last_state = 0;
	/**
	*	Time of the last state change - soft or hard (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_state_change = null;
	/**
	*	The last time the host was DOWN (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_time_down = null;
	/**
	*	The last time the host was UNREACHABLE (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_time_unreachable = null;
	/**
	*	The last time the host was UP (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_last_time_up = null;
	/**
	*	Time difference between scheduled check time and actual check time
	*/
	@NotNull
	@JsonProperty
	public Float current_host_latency = null;
	/**
	*	Complete output from check plugin
	*/
	@NotNull
	@JsonProperty
	public String current_host_long_plugin_output = null;
	/**
	*	Low threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float current_host_low_flap_threshold = null;
	/**
	*	Max check attempts for active host checks
	*/
	@NotNull
	@JsonProperty
	public int current_host_max_check_attempts = 0;
	/**
	*	A bitmask specifying which attributes have been modified
	*/
	@NotNull
	@JsonProperty
	public int current_host_modified_attributes = 0;
	/**
	*	A list of all modified attributes
	*/
	@NotNull
	@JsonProperty
	public String current_host_modified_attributes_list = null;
	/**
	*	Host name
	*/
	@NotNull
	@JsonProperty
	public String current_host_name = null;
	/**
	*	Scheduled time for the next check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_next_check = null;
	/**
	*	Time of the next notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_host_next_notification = null;
	/**
	*	Whether to stop sending notifications (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_no_more_notifications = 0;
	/**
	*	Optional notes for this host
	*/
	@NotNull
	@JsonProperty
	public String current_host_notes = null;
	/**
	*	The same as notes, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_host_notes_expanded = null;
	/**
	*	An optional URL with further information about the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_notes_url = null;
	/**
	*	Same es notes_url, but with the most important macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_host_notes_url_expanded = null;
	/**
	*	Interval of periodic notification or 0 if its off
	*/
	@NotNull
	@JsonProperty
	public Float current_host_notification_interval = null;
	/**
	*	Time period in which problems of this host will be notified. If empty then notification will be always
	*/
	@NotNull
	@JsonProperty
	public String current_host_notification_period = null;
	/**
	*	Whether notifications of the host are enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_notifications_enabled = 0;
	/**
	*	The total number of services of the host
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services = 0;
	/**
	*	The number of the host's services with the soft state CRIT
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_crit = 0;
	/**
	*	The number of the host's services with the hard state CRIT
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_hard_crit = 0;
	/**
	*	The number of the host's services with the hard state OK
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_hard_ok = 0;
	/**
	*	The number of the host's services with the hard state UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_hard_unknown = 0;
	/**
	*	The number of the host's services with the hard state WARN
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_hard_warn = 0;
	/**
	*	The number of the host's services with the soft state OK
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_ok = 0;
	/**
	*	The number of the host's services which have not been checked yet (pending)
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_pending = 0;
	/**
	*	The number of the host's services with the soft state UNKNOWN
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_unknown = 0;
	/**
	*	The number of the host's services with the soft state WARN
	*/
	@NotNull
	@JsonProperty
	public int current_host_num_services_warn = 0;
	/**
	*	The current obsess_over_host setting... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_obsess_over_host = 0;
	/**
	*	A list of all direct parents of the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_parents = null;
	/**
	*	Whether a flex downtime is pending (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_pending_flex_downtime = 0;
	/**
	*	Percent state change
	*/
	@NotNull
	@JsonProperty
	public Float current_host_percent_state_change = null;
	/**
	*	Optional performance data of the last host check
	*/
	@NotNull
	@JsonProperty
	public String current_host_perf_data = null;
	/**
	*	Output of the last host check
	*/
	@NotNull
	@JsonProperty
	public String current_host_plugin_output = null;
	/**
	*	Whether there is a PNP4Nagios graph present for this host (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_pnpgraph_present = 0;
	/**
	*	Whether processing of performance data is enabled (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_host_process_performance_data = 0;
	/**
	*	Number of basic interval lengths between checks when retrying after a soft error
	*/
	@NotNull
	@JsonProperty
	public Float current_host_retry_interval = null;
	/**
	*	The number of downtimes this host is currently in
	*/
	@NotNull
	@JsonProperty
	public int current_host_scheduled_downtime_depth = 0;
	/**
	*	The name of the service period of the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_service_period = null;
	/**
	*	A list of all services of the host
	*/
	@NotNull
	@JsonProperty
	public String current_host_services = null;
	/**
	*	A list of all services including detailed information about each service
	*/
	@NotNull
	@JsonProperty
	public String current_host_services_with_info = null;
	/**
	*	A list of all services of the host together with state and has_been_checked
	*/
	@NotNull
	@JsonProperty
	public String current_host_services_with_state = null;
	/**
	*	Staleness indicator for this host
	*/
	@NotNull
	@JsonProperty
	public Float current_host_staleness = null;
	/**
	*	The current state of the host (0: up, 1: down, 2: unreachable)
	*/
	@NotNull
	@JsonProperty
	public int current_host_state = 0;
	/**
	*	Type of the current state (0: soft, 1: hard)
	*/
	@NotNull
	@JsonProperty
	public int current_host_state_type = 0;
	/**
	*	The name of in image file for the status map
	*/
	@NotNull
	@JsonProperty
	public String current_host_statusmap_image = null;
	/**
	*	The total number of services of the host
	*/
	@NotNull
	@JsonProperty
	public int current_host_total_services = 0;
	/**
	*	The worst hard state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int current_host_worst_service_hard_state = 0;
	/**
	*	The worst soft state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
	*/
	@NotNull
	@JsonProperty
	public int current_host_worst_service_state = 0;
	/**
	*	3D-Coordinates: X
	*/
	@NotNull
	@JsonProperty
	public Float current_host_x_3d = null;
	/**
	*	3D-Coordinates: Y
	*/
	@NotNull
	@JsonProperty
	public Float current_host_y_3d = null;
	/**
	*	3D-Coordinates: Z
	*/
	@NotNull
	@JsonProperty
	public Float current_host_z_3d = null;
	/**
	*	Whether the service accepts passive checks (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_accept_passive_checks = 0;
	/**
	*	Whether the current service problem has been acknowledged (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_acknowledged = 0;
	/**
	*	The type of the acknownledgement (0: none, 1: normal, 2: sticky)
	*/
	@NotNull
	@JsonProperty
	public int current_service_acknowledgement_type = 0;
	/**
	*	An optional URL for actions or custom information about the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_action_url = null;
	/**
	*	The action_url with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_service_action_url_expanded = null;
	/**
	*	Whether active checks are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_active_checks_enabled = 0;
	/**
	*	Nagios command used for active checks
	*/
	@NotNull
	@JsonProperty
	public String current_service_check_command = null;
	/**
	*	Nagios command used for active checks with the macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_service_check_command_expanded = null;
	/**
	*	Whether freshness checks are activated (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_check_freshness = 0;
	/**
	*	Number of basic interval lengths between two scheduled checks of the service
	*/
	@NotNull
	@JsonProperty
	public Float current_service_check_interval = null;
	/**
	*	The current check option, forced, normal, freshness... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_check_options = 0;
	/**
	*	The name of the check period of the service. It this is empty, the service is always checked.
	*/
	@NotNull
	@JsonProperty
	public String current_service_check_period = null;
	/**
	*	The type of the last check (0: active, 1: passive)
	*/
	@NotNull
	@JsonProperty
	public int current_service_check_type = 0;
	/**
	*	Whether active checks are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_checks_enabled = 0;
	/**
	*	A list of all comment ids of the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_comments = null;
	/**
	*	A list of all comments of the service with id, author, comment, entry type and entry time
	*/
	@NotNull
	@JsonProperty
	public String current_service_comments_with_extra_info = null;
	/**
	*	A list of all comments of the service with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String current_service_comments_with_info = null;
	/**
	*	A list of all contact groups this service is in
	*/
	@NotNull
	@JsonProperty
	public String current_service_contact_groups = null;
	/**
	*	A list of all contacts of the service, either direct or via a contact group
	*/
	@NotNull
	@JsonProperty
	public String current_service_contacts = null;
	/**
	*	The number of the current check attempt
	*/
	@NotNull
	@JsonProperty
	public int current_service_current_attempt = 0;
	/**
	*	The number of the current notification
	*/
	@NotNull
	@JsonProperty
	public int current_service_current_notification_number = 0;
	/**
	*	A list of the names of all custom variables of the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_custom_variable_names = null;
	/**
	*	A list of the values of all custom variable of the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_custom_variable_values = null;
	/**
	*	A dictionary of the custom variables
	*/
	@NotNull
	@JsonProperty
	public String current_service_custom_variables = null;
	/**
	*	Description of the service (also used as key)
	*/
	@NotNull
	@JsonProperty
	public String current_service_description = null;
	/**
	*	An optional display name (not used by Nagios standard web pages)
	*/
	@NotNull
	@JsonProperty
	public String current_service_display_name = null;
	/**
	*	A list of all downtime ids of the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_downtimes = null;
	/**
	*	A list of all downtimes of the service with id, author and comment
	*/
	@NotNull
	@JsonProperty
	public String current_service_downtimes_with_info = null;
	/**
	*	Nagios command used as event handler
	*/
	@NotNull
	@JsonProperty
	public String current_service_event_handler = null;
	/**
	*	Whether and event handler is activated for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_event_handler_enabled = 0;
	/**
	*	Time the service check needed for execution
	*/
	@NotNull
	@JsonProperty
	public Float current_service_execution_time = null;
	/**
	*	Delay before the first notification
	*/
	@NotNull
	@JsonProperty
	public Float current_service_first_notification_delay = null;
	/**
	*	Whether flap detection is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_flap_detection_enabled = 0;
	/**
	*	A list of all service groups the service is in
	*/
	@NotNull
	@JsonProperty
	public String current_service_groups = null;
	/**
	*	Whether the service already has been checked (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_has_been_checked = 0;
	/**
	*	High threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float current_service_high_flap_threshold = null;
	/**
	*	The name of an image to be used as icon in the web interface
	*/
	@NotNull
	@JsonProperty
	public String current_service_icon_image = null;
	/**
	*	An alternative text for the icon_image for browsers not displaying icons
	*/
	@NotNull
	@JsonProperty
	public String current_service_icon_image_alt = null;
	/**
	*	The icon_image with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_service_icon_image_expanded = null;
	/**
	*	Whether the service is currently in its check period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_in_check_period = 0;
	/**
	*	Whether the service is currently in its notification period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_in_notification_period = 0;
	/**
	*	Whether this service is currently in its service period (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_in_service_period = 0;
	/**
	*	The initial state of the service
	*/
	@NotNull
	@JsonProperty
	public int current_service_initial_state = 0;
	/**
	*	is there a service check currently running... (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_is_executing = 0;
	/**
	*	Whether the service is flapping (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_is_flapping = 0;
	/**
	*	The time of the last check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_check = null;
	/**
	*	The last hard state of the service
	*/
	@NotNull
	@JsonProperty
	public int current_service_last_hard_state = 0;
	/**
	*	The time of the last hard state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_hard_state_change = null;
	/**
	*	The time of the last notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_notification = null;
	/**
	*	The last state of the service
	*/
	@NotNull
	@JsonProperty
	public int current_service_last_state = 0;
	/**
	*	The time of the last state change (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_state_change = null;
	/**
	*	The last time the service was CRITICAL (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_time_critical = null;
	/**
	*	The last time the service was OK (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_time_ok = null;
	/**
	*	The last time the service was UNKNOWN (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_time_unknown = null;
	/**
	*	The last time the service was in WARNING state (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_last_time_warning = null;
	/**
	*	Time difference between scheduled check time and actual check time
	*/
	@NotNull
	@JsonProperty
	public Float current_service_latency = null;
	/**
	*	Unabbreviated output of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String current_service_long_plugin_output = null;
	/**
	*	Low threshold of flap detection
	*/
	@NotNull
	@JsonProperty
	public Float current_service_low_flap_threshold = null;
	/**
	*	The maximum number of check attempts
	*/
	@NotNull
	@JsonProperty
	public int current_service_max_check_attempts = 0;
	/**
	*	A bitmask specifying which attributes have been modified
	*/
	@NotNull
	@JsonProperty
	public int current_service_modified_attributes = 0;
	/**
	*	A list of all modified attributes
	*/
	@NotNull
	@JsonProperty
	public String current_service_modified_attributes_list = null;
	/**
	*	The scheduled time of the next check (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_next_check = null;
	/**
	*	The time of the next notification (Unix timestamp)
	*/
	@NotNull
	@JsonProperty
	public Timestamp current_service_next_notification = null;
	/**
	*	Whether to stop sending notifications (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_no_more_notifications = 0;
	/**
	*	Optional notes about the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_notes = null;
	/**
	*	The notes with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_service_notes_expanded = null;
	/**
	*	An optional URL for additional notes about the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_notes_url = null;
	/**
	*	The notes_url with (the most important) macros expanded
	*/
	@NotNull
	@JsonProperty
	public String current_service_notes_url_expanded = null;
	/**
	*	Interval of periodic notification or 0 if its off
	*/
	@NotNull
	@JsonProperty
	public Float current_service_notification_interval = null;
	/**
	*	The name of the notification period of the service. It this is empty, service problems are always notified.
	*/
	@NotNull
	@JsonProperty
	public String current_service_notification_period = null;
	/**
	*	Whether notifications are enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_notifications_enabled = 0;
	/**
	*	Whether 'obsess_over_service' is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_obsess_over_service = 0;
	/**
	*	Percent state change
	*/
	@NotNull
	@JsonProperty
	public Float current_service_percent_state_change = null;
	/**
	*	Performance data of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String current_service_perf_data = null;
	/**
	*	Output of the last check plugin
	*/
	@NotNull
	@JsonProperty
	public String current_service_plugin_output = null;
	/**
	*	Whether there is a PNP4Nagios graph present for this service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_pnpgraph_present = 0;
	/**
	*	Whether processing of performance data is enabled for the service (0/1)
	*/
	@NotNull
	@JsonProperty
	public int current_service_process_performance_data = 0;
	/**
	*	Number of basic interval lengths between checks when retrying after a soft error
	*/
	@NotNull
	@JsonProperty
	public Float current_service_retry_interval = null;
	/**
	*	The number of scheduled downtimes the service is currently in
	*/
	@NotNull
	@JsonProperty
	public int current_service_scheduled_downtime_depth = 0;
	/**
	*	The name of the service period of the service
	*/
	@NotNull
	@JsonProperty
	public String current_service_service_period = null;
	/**
	*	The staleness indicator for this service
	*/
	@NotNull
	@JsonProperty
	public Float current_service_staleness = null;
	/**
	*	The current state of the service (0: OK, 1: WARN, 2: CRITICAL, 3: UNKNOWN)
	*/
	@NotNull
	@JsonProperty
	public int current_service_state = 0;
	/**
	*	The type of the current state (0: soft, 1: hard)
	*/
	@NotNull
	@JsonProperty
	public int current_service_state_type = 0;
	/**
	*	Debug information
	*/
	@NotNull
	@JsonProperty
	public String debug_info = null;
	/**
	*	Duration of state (until - from)
	*/
	@NotNull
	@JsonProperty
	public int duration = 0;
	/**
	*	CRITICAL duration of state (until - from)
	*/
	@NotNull
	@JsonProperty
	public int duration_critical = 0;
	/**
	*	OK duration of state ( until - from )
	*/
	@NotNull
	@JsonProperty
	public int duration_ok = 0;
	/**
	*	Duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part = null;
	/**
	*	CRITICAL duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part_critical = null;
	/**
	*	OK duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part_ok = null;
	/**
	*	UNKNOWN duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part_unknown = null;
	/**
	*	UNMONITORED duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part_unmonitored = null;
	/**
	*	WARNING duration part in regard to the query timeframe
	*/
	@NotNull
	@JsonProperty
	public Float duration_part_warning = null;
	/**
	*	UNKNOWN duration of state (until - from)
	*/
	@NotNull
	@JsonProperty
	public int duration_unknown = 0;
	/**
	*	UNMONITORED duration of state (until - from)
	*/
	@NotNull
	@JsonProperty
	public int duration_unmonitored = 0;
	/**
	*	WARNING duration of state (until - from)
	*/
	@NotNull
	@JsonProperty
	public int duration_warning = 0;
	/**
	*	Start time of state (seconds since 1/1/1970)
	*/
	@NotNull
	@JsonProperty
	public Timestamp from = null;
	/**
	*	Shows if the host of this service is down
	*/
	@NotNull
	@JsonProperty
	public int host_down = 0;
	/**
	*	Host name
	*/
	@NotNull
	@JsonProperty
	public String host_name = null;
	/**
	*	Shows if the host or service is in downtime
	*/
	@NotNull
	@JsonProperty
	public int in_downtime = 0;
	/**
	*	Shows if the host of this service is in downtime
	*/
	@NotNull
	@JsonProperty
	public int in_host_downtime = 0;
	/**
	*	Shows if the host or service is within its notification period
	*/
	@NotNull
	@JsonProperty
	public int in_notification_period = 0;
	/**
	*	Shows if the host or service is within its service period
	*/
	@NotNull
	@JsonProperty
	public int in_service_period = 0;
	/**
	*	Shows if the host or service is flapping
	*/
	@NotNull
	@JsonProperty
	public int is_flapping = 0;
	/**
	*	The number of the line in the log file
	*/
	@NotNull
	@JsonProperty
	public int lineno = 0;
	/**
	*	Logfile output relevant for this state
	*/
	@NotNull
	@JsonProperty
	public String log_output = null;
	/**
	*	The notification period of the host or service in question
	*/
	@NotNull
	@JsonProperty
	public String notification_period = null;
	/**
	*	Description of the service
	*/
	@NotNull
	@JsonProperty
	public String service_description = null;
	/**
	*	The service period of the host or service in question
	*/
	@NotNull
	@JsonProperty
	public String service_period = null;
	/**
	*	The state of the host or service in question - OK(0) / WARNING(1) / CRITICAL(2) / UNKNOWN(3) / UNMONITORED(-1)
	*/
	@NotNull
	@JsonProperty
	public int state = 0;
	/**
	*	Time of the log event (seconds since 1/1/1970)
	*/
	@NotNull
	@JsonProperty
	public Timestamp time = null;
	/**
	*	End time of state (seconds since 1/1/1970)
	*/
	@NotNull
	@JsonProperty
	public Timestamp until = null;
	public String toString(){
		return 
		"Current_host_accept_passive_checks = " + current_host_accept_passive_checks + "\n" +
		"Current_host_acknowledged = " + current_host_acknowledged + "\n" +
		"Current_host_acknowledgement_type = " + current_host_acknowledgement_type + "\n" +
		"Current_host_action_url = " + current_host_action_url + "\n" +
		"Current_host_action_url_expanded = " + current_host_action_url_expanded + "\n" +
		"Current_host_active_checks_enabled = " + current_host_active_checks_enabled + "\n" +
		"Current_host_address = " + current_host_address + "\n" +
		"Current_host_alias = " + current_host_alias + "\n" +
		"Current_host_check_command = " + current_host_check_command + "\n" +
		"Current_host_check_command_expanded = " + current_host_check_command_expanded + "\n" +
		"Current_host_check_flapping_recovery_notification = " + current_host_check_flapping_recovery_notification + "\n" +
		"Current_host_check_freshness = " + current_host_check_freshness + "\n" +
		"Current_host_check_interval = " + current_host_check_interval + "\n" +
		"Current_host_check_options = " + current_host_check_options + "\n" +
		"Current_host_check_period = " + current_host_check_period + "\n" +
		"Current_host_check_type = " + current_host_check_type + "\n" +
		"Current_host_checks_enabled = " + current_host_checks_enabled + "\n" +
		"Current_host_childs = " + current_host_childs + "\n" +
		"Current_host_comments = " + current_host_comments + "\n" +
		"Current_host_comments_with_extra_info = " + current_host_comments_with_extra_info + "\n" +
		"Current_host_comments_with_info = " + current_host_comments_with_info + "\n" +
		"Current_host_contact_groups = " + current_host_contact_groups + "\n" +
		"Current_host_contacts = " + current_host_contacts + "\n" +
		"Current_host_current_attempt = " + current_host_current_attempt + "\n" +
		"Current_host_current_notification_number = " + current_host_current_notification_number + "\n" +
		"Current_host_custom_variable_names = " + current_host_custom_variable_names + "\n" +
		"Current_host_custom_variable_values = " + current_host_custom_variable_values + "\n" +
		"Current_host_custom_variables = " + current_host_custom_variables + "\n" +
		"Current_host_display_name = " + current_host_display_name + "\n" +
		"Current_host_downtimes = " + current_host_downtimes + "\n" +
		"Current_host_downtimes_with_info = " + current_host_downtimes_with_info + "\n" +
		"Current_host_event_handler = " + current_host_event_handler + "\n" +
		"Current_host_event_handler_enabled = " + current_host_event_handler_enabled + "\n" +
		"Current_host_execution_time = " + current_host_execution_time + "\n" +
		"Current_host_filename = " + current_host_filename + "\n" +
		"Current_host_first_notification_delay = " + current_host_first_notification_delay + "\n" +
		"Current_host_flap_detection_enabled = " + current_host_flap_detection_enabled + "\n" +
		"Current_host_groups = " + current_host_groups + "\n" +
		"Current_host_hard_state = " + current_host_hard_state + "\n" +
		"Current_host_has_been_checked = " + current_host_has_been_checked + "\n" +
		"Current_host_high_flap_threshold = " + current_host_high_flap_threshold + "\n" +
		"Current_host_icon_image = " + current_host_icon_image + "\n" +
		"Current_host_icon_image_alt = " + current_host_icon_image_alt + "\n" +
		"Current_host_icon_image_expanded = " + current_host_icon_image_expanded + "\n" +
		"Current_host_in_check_period = " + current_host_in_check_period + "\n" +
		"Current_host_in_notification_period = " + current_host_in_notification_period + "\n" +
		"Current_host_in_service_period = " + current_host_in_service_period + "\n" +
		"Current_host_initial_state = " + current_host_initial_state + "\n" +
		"Current_host_is_executing = " + current_host_is_executing + "\n" +
		"Current_host_is_flapping = " + current_host_is_flapping + "\n" +
		"Current_host_last_check = " + current_host_last_check + "\n" +
		"Current_host_last_hard_state = " + current_host_last_hard_state + "\n" +
		"Current_host_last_hard_state_change = " + current_host_last_hard_state_change + "\n" +
		"Current_host_last_notification = " + current_host_last_notification + "\n" +
		"Current_host_last_state = " + current_host_last_state + "\n" +
		"Current_host_last_state_change = " + current_host_last_state_change + "\n" +
		"Current_host_last_time_down = " + current_host_last_time_down + "\n" +
		"Current_host_last_time_unreachable = " + current_host_last_time_unreachable + "\n" +
		"Current_host_last_time_up = " + current_host_last_time_up + "\n" +
		"Current_host_latency = " + current_host_latency + "\n" +
		"Current_host_long_plugin_output = " + current_host_long_plugin_output + "\n" +
		"Current_host_low_flap_threshold = " + current_host_low_flap_threshold + "\n" +
		"Current_host_max_check_attempts = " + current_host_max_check_attempts + "\n" +
		"Current_host_modified_attributes = " + current_host_modified_attributes + "\n" +
		"Current_host_modified_attributes_list = " + current_host_modified_attributes_list + "\n" +
		"Current_host_name = " + current_host_name + "\n" +
		"Current_host_next_check = " + current_host_next_check + "\n" +
		"Current_host_next_notification = " + current_host_next_notification + "\n" +
		"Current_host_no_more_notifications = " + current_host_no_more_notifications + "\n" +
		"Current_host_notes = " + current_host_notes + "\n" +
		"Current_host_notes_expanded = " + current_host_notes_expanded + "\n" +
		"Current_host_notes_url = " + current_host_notes_url + "\n" +
		"Current_host_notes_url_expanded = " + current_host_notes_url_expanded + "\n" +
		"Current_host_notification_interval = " + current_host_notification_interval + "\n" +
		"Current_host_notification_period = " + current_host_notification_period + "\n" +
		"Current_host_notifications_enabled = " + current_host_notifications_enabled + "\n" +
		"Current_host_num_services = " + current_host_num_services + "\n" +
		"Current_host_num_services_crit = " + current_host_num_services_crit + "\n" +
		"Current_host_num_services_hard_crit = " + current_host_num_services_hard_crit + "\n" +
		"Current_host_num_services_hard_ok = " + current_host_num_services_hard_ok + "\n" +
		"Current_host_num_services_hard_unknown = " + current_host_num_services_hard_unknown + "\n" +
		"Current_host_num_services_hard_warn = " + current_host_num_services_hard_warn + "\n" +
		"Current_host_num_services_ok = " + current_host_num_services_ok + "\n" +
		"Current_host_num_services_pending = " + current_host_num_services_pending + "\n" +
		"Current_host_num_services_unknown = " + current_host_num_services_unknown + "\n" +
		"Current_host_num_services_warn = " + current_host_num_services_warn + "\n" +
		"Current_host_obsess_over_host = " + current_host_obsess_over_host + "\n" +
		"Current_host_parents = " + current_host_parents + "\n" +
		"Current_host_pending_flex_downtime = " + current_host_pending_flex_downtime + "\n" +
		"Current_host_percent_state_change = " + current_host_percent_state_change + "\n" +
		"Current_host_perf_data = " + current_host_perf_data + "\n" +
		"Current_host_plugin_output = " + current_host_plugin_output + "\n" +
		"Current_host_pnpgraph_present = " + current_host_pnpgraph_present + "\n" +
		"Current_host_process_performance_data = " + current_host_process_performance_data + "\n" +
		"Current_host_retry_interval = " + current_host_retry_interval + "\n" +
		"Current_host_scheduled_downtime_depth = " + current_host_scheduled_downtime_depth + "\n" +
		"Current_host_service_period = " + current_host_service_period + "\n" +
		"Current_host_services = " + current_host_services + "\n" +
		"Current_host_services_with_info = " + current_host_services_with_info + "\n" +
		"Current_host_services_with_state = " + current_host_services_with_state + "\n" +
		"Current_host_staleness = " + current_host_staleness + "\n" +
		"Current_host_state = " + current_host_state + "\n" +
		"Current_host_state_type = " + current_host_state_type + "\n" +
		"Current_host_statusmap_image = " + current_host_statusmap_image + "\n" +
		"Current_host_total_services = " + current_host_total_services + "\n" +
		"Current_host_worst_service_hard_state = " + current_host_worst_service_hard_state + "\n" +
		"Current_host_worst_service_state = " + current_host_worst_service_state + "\n" +
		"Current_host_x_3d = " + current_host_x_3d + "\n" +
		"Current_host_y_3d = " + current_host_y_3d + "\n" +
		"Current_host_z_3d = " + current_host_z_3d + "\n" +
		"Current_service_accept_passive_checks = " + current_service_accept_passive_checks + "\n" +
		"Current_service_acknowledged = " + current_service_acknowledged + "\n" +
		"Current_service_acknowledgement_type = " + current_service_acknowledgement_type + "\n" +
		"Current_service_action_url = " + current_service_action_url + "\n" +
		"Current_service_action_url_expanded = " + current_service_action_url_expanded + "\n" +
		"Current_service_active_checks_enabled = " + current_service_active_checks_enabled + "\n" +
		"Current_service_check_command = " + current_service_check_command + "\n" +
		"Current_service_check_command_expanded = " + current_service_check_command_expanded + "\n" +
		"Current_service_check_freshness = " + current_service_check_freshness + "\n" +
		"Current_service_check_interval = " + current_service_check_interval + "\n" +
		"Current_service_check_options = " + current_service_check_options + "\n" +
		"Current_service_check_period = " + current_service_check_period + "\n" +
		"Current_service_check_type = " + current_service_check_type + "\n" +
		"Current_service_checks_enabled = " + current_service_checks_enabled + "\n" +
		"Current_service_comments = " + current_service_comments + "\n" +
		"Current_service_comments_with_extra_info = " + current_service_comments_with_extra_info + "\n" +
		"Current_service_comments_with_info = " + current_service_comments_with_info + "\n" +
		"Current_service_contact_groups = " + current_service_contact_groups + "\n" +
		"Current_service_contacts = " + current_service_contacts + "\n" +
		"Current_service_current_attempt = " + current_service_current_attempt + "\n" +
		"Current_service_current_notification_number = " + current_service_current_notification_number + "\n" +
		"Current_service_custom_variable_names = " + current_service_custom_variable_names + "\n" +
		"Current_service_custom_variable_values = " + current_service_custom_variable_values + "\n" +
		"Current_service_custom_variables = " + current_service_custom_variables + "\n" +
		"Current_service_description = " + current_service_description + "\n" +
		"Current_service_display_name = " + current_service_display_name + "\n" +
		"Current_service_downtimes = " + current_service_downtimes + "\n" +
		"Current_service_downtimes_with_info = " + current_service_downtimes_with_info + "\n" +
		"Current_service_event_handler = " + current_service_event_handler + "\n" +
		"Current_service_event_handler_enabled = " + current_service_event_handler_enabled + "\n" +
		"Current_service_execution_time = " + current_service_execution_time + "\n" +
		"Current_service_first_notification_delay = " + current_service_first_notification_delay + "\n" +
		"Current_service_flap_detection_enabled = " + current_service_flap_detection_enabled + "\n" +
		"Current_service_groups = " + current_service_groups + "\n" +
		"Current_service_has_been_checked = " + current_service_has_been_checked + "\n" +
		"Current_service_high_flap_threshold = " + current_service_high_flap_threshold + "\n" +
		"Current_service_icon_image = " + current_service_icon_image + "\n" +
		"Current_service_icon_image_alt = " + current_service_icon_image_alt + "\n" +
		"Current_service_icon_image_expanded = " + current_service_icon_image_expanded + "\n" +
		"Current_service_in_check_period = " + current_service_in_check_period + "\n" +
		"Current_service_in_notification_period = " + current_service_in_notification_period + "\n" +
		"Current_service_in_service_period = " + current_service_in_service_period + "\n" +
		"Current_service_initial_state = " + current_service_initial_state + "\n" +
		"Current_service_is_executing = " + current_service_is_executing + "\n" +
		"Current_service_is_flapping = " + current_service_is_flapping + "\n" +
		"Current_service_last_check = " + current_service_last_check + "\n" +
		"Current_service_last_hard_state = " + current_service_last_hard_state + "\n" +
		"Current_service_last_hard_state_change = " + current_service_last_hard_state_change + "\n" +
		"Current_service_last_notification = " + current_service_last_notification + "\n" +
		"Current_service_last_state = " + current_service_last_state + "\n" +
		"Current_service_last_state_change = " + current_service_last_state_change + "\n" +
		"Current_service_last_time_critical = " + current_service_last_time_critical + "\n" +
		"Current_service_last_time_ok = " + current_service_last_time_ok + "\n" +
		"Current_service_last_time_unknown = " + current_service_last_time_unknown + "\n" +
		"Current_service_last_time_warning = " + current_service_last_time_warning + "\n" +
		"Current_service_latency = " + current_service_latency + "\n" +
		"Current_service_long_plugin_output = " + current_service_long_plugin_output + "\n" +
		"Current_service_low_flap_threshold = " + current_service_low_flap_threshold + "\n" +
		"Current_service_max_check_attempts = " + current_service_max_check_attempts + "\n" +
		"Current_service_modified_attributes = " + current_service_modified_attributes + "\n" +
		"Current_service_modified_attributes_list = " + current_service_modified_attributes_list + "\n" +
		"Current_service_next_check = " + current_service_next_check + "\n" +
		"Current_service_next_notification = " + current_service_next_notification + "\n" +
		"Current_service_no_more_notifications = " + current_service_no_more_notifications + "\n" +
		"Current_service_notes = " + current_service_notes + "\n" +
		"Current_service_notes_expanded = " + current_service_notes_expanded + "\n" +
		"Current_service_notes_url = " + current_service_notes_url + "\n" +
		"Current_service_notes_url_expanded = " + current_service_notes_url_expanded + "\n" +
		"Current_service_notification_interval = " + current_service_notification_interval + "\n" +
		"Current_service_notification_period = " + current_service_notification_period + "\n" +
		"Current_service_notifications_enabled = " + current_service_notifications_enabled + "\n" +
		"Current_service_obsess_over_service = " + current_service_obsess_over_service + "\n" +
		"Current_service_percent_state_change = " + current_service_percent_state_change + "\n" +
		"Current_service_perf_data = " + current_service_perf_data + "\n" +
		"Current_service_plugin_output = " + current_service_plugin_output + "\n" +
		"Current_service_pnpgraph_present = " + current_service_pnpgraph_present + "\n" +
		"Current_service_process_performance_data = " + current_service_process_performance_data + "\n" +
		"Current_service_retry_interval = " + current_service_retry_interval + "\n" +
		"Current_service_scheduled_downtime_depth = " + current_service_scheduled_downtime_depth + "\n" +
		"Current_service_service_period = " + current_service_service_period + "\n" +
		"Current_service_staleness = " + current_service_staleness + "\n" +
		"Current_service_state = " + current_service_state + "\n" +
		"Current_service_state_type = " + current_service_state_type + "\n" +
		"Debug_info = " + debug_info + "\n" +
		"Duration = " + duration + "\n" +
		"Duration_critical = " + duration_critical + "\n" +
		"Duration_ok = " + duration_ok + "\n" +
		"Duration_part = " + duration_part + "\n" +
		"Duration_part_critical = " + duration_part_critical + "\n" +
		"Duration_part_ok = " + duration_part_ok + "\n" +
		"Duration_part_unknown = " + duration_part_unknown + "\n" +
		"Duration_part_unmonitored = " + duration_part_unmonitored + "\n" +
		"Duration_part_warning = " + duration_part_warning + "\n" +
		"Duration_unknown = " + duration_unknown + "\n" +
		"Duration_unmonitored = " + duration_unmonitored + "\n" +
		"Duration_warning = " + duration_warning + "\n" +
		"From = " + from + "\n" +
		"Host_down = " + host_down + "\n" +
		"Host_name = " + host_name + "\n" +
		"In_downtime = " + in_downtime + "\n" +
		"In_host_downtime = " + in_host_downtime + "\n" +
		"In_notification_period = " + in_notification_period + "\n" +
		"In_service_period = " + in_service_period + "\n" +
		"Is_flapping = " + is_flapping + "\n" +
		"Lineno = " + lineno + "\n" +
		"Log_output = " + log_output + "\n" +
		"Notification_period = " + notification_period + "\n" +
		"Service_description = " + service_description + "\n" +
		"Service_period = " + service_period + "\n" +
		"State = " + state + "\n" +
		"Time = " + time + "\n" +
		"Until = " + until + "\n" +
"";

	}
}
