package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Status
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Status extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	Whether passive host checks are accepted in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int accept_passive_host_checks = 0;
	/**
	*	Whether passive service checks are activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int accept_passive_service_checks = 0;
	/**
	*	The current number of log messages MK Livestatus keeps in memory
	*/
	@NotNull
	@JsonProperty
	public int cached_log_messages = 0;
	/**
	*	Whether Nagios checks for external commands at its command pipe (0/1)
	*/
	@NotNull
	@JsonProperty
	public int check_external_commands = 0;
	/**
	*	Whether host freshness checking is activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int check_host_freshness = 0;
	/**
	*	Whether service freshness checking is activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int check_service_freshness = 0;
	/**
	*	The number of client connections to Livestatus since program start
	*/
	@NotNull
	@JsonProperty
	public int connections = 0;
	/**
	*	The averaged number of new client connections to Livestatus per second
	*/
	@NotNull
	@JsonProperty
	public Float connections_rate = null;
	/**
	*	Whether event handlers are activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int enable_event_handlers = 0;
	/**
	*	Whether flap detection is activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int enable_flap_detection = 0;
	/**
	*	Whether notifications are enabled in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int enable_notifications = 0;
	/**
	*	Whether host checks are executed in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int execute_host_checks = 0;
	/**
	*	Whether active service checks are activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int execute_service_checks = 0;
	/**
	*	The maximum number of slots used in the external command buffer (placeholder)
	*/
	@NotNull
	@JsonProperty
	public int external_command_buffer_max = 0;
	/**
	*	The size of the buffer for the external commands (placeholder)
	*/
	@NotNull
	@JsonProperty
	public int external_command_buffer_slots = 0;
	/**
	*	The number of slots in use of the external command buffer (placeholder)
	*/
	@NotNull
	@JsonProperty
	public int external_command_buffer_usage = 0;
	/**
	*	The number of external commands since program start
	*/
	@NotNull
	@JsonProperty
	public int external_commands = 0;
	/**
	*	the averaged number of external commands per second
	*/
	@NotNull
	@JsonProperty
	public Float external_commands_rate = null;
	/**
	*	The number of process creations since program start
	*/
	@NotNull
	@JsonProperty
	public int forks = 0;
	/**
	*	the averaged number of forks checks per second
	*/
	@NotNull
	@JsonProperty
	public Float forks_rate = null;
	/**
	*	The number of host checks since program start
	*/
	@NotNull
	@JsonProperty
	public int host_checks = 0;
	/**
	*	the averaged number of host checks per second
	*/
	@NotNull
	@JsonProperty
	public Float host_checks_rate = null;
	/**
	*	The default interval length from nagios.cfg
	*/
	@NotNull
	@JsonProperty
	public int interval_length = 0;
	/**
	*	The time of the last check for a command as UNIX timestamp (placeholder)
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_command_check = null;
	/**
	*	Time time of the last log file rotation
	*/
	@NotNull
	@JsonProperty
	public Timestamp last_log_rotation = null;
	/**
	*	The number of times a check could not be executed because now livecheck helper was free
	*/
	@NotNull
	@JsonProperty
	public int livecheck_overflows = 0;
	/**
	*	The number of livecheck overflows per second
	*/
	@NotNull
	@JsonProperty
	public Float livecheck_overflows_rate = null;
	/**
	*	The number of checks executed via livecheck
	*/
	@NotNull
	@JsonProperty
	public int livechecks = 0;
	/**
	*	The averaged number of livechecks executes per second
	*/
	@NotNull
	@JsonProperty
	public Float livechecks_rate = null;
	/**
	*	The current number of active connections to MK Livestatus
	*/
	@NotNull
	@JsonProperty
	public int livestatus_active_connections = 0;
	/**
	*	The current number of queued connections to MK Livestatus (that wait for a free thread)
	*/
	@NotNull
	@JsonProperty
	public int livestatus_queued_connections = 0;
	/**
	*	The maximum number of connections to MK Livestatus that can be handled in parallel
	*/
	@NotNull
	@JsonProperty
	public int livestatus_threads = 0;
	/**
	*	The version of the MK Livestatus module
	*/
	@NotNull
	@JsonProperty
	public String livestatus_version = null;
	/**
	*	The number of new log messages since program start
	*/
	@NotNull
	@JsonProperty
	public int log_messages = 0;
	/**
	*	the averaged number of new log messages per second
	*/
	@NotNull
	@JsonProperty
	public Float log_messages_rate = null;
	/**
	*	The process ID of the Nagios main process
	*/
	@NotNull
	@JsonProperty
	public int nagios_pid = 0;
	/**
	*	The number of NEB call backs since program start
	*/
	@NotNull
	@JsonProperty
	public int neb_callbacks = 0;
	/**
	*	The averaged number of NEB call backs per second
	*/
	@NotNull
	@JsonProperty
	public Float neb_callbacks_rate = null;
	/**
	*	The total number of hosts
	*/
	@NotNull
	@JsonProperty
	public int num_hosts = 0;
	/**
	*	The total number of services
	*/
	@NotNull
	@JsonProperty
	public int num_services = 0;
	/**
	*	Whether Nagios will obsess over host checks (0/1)
	*/
	@NotNull
	@JsonProperty
	public int obsess_over_hosts = 0;
	/**
	*	Whether Nagios will obsess over service checks and run the ocsp_command (0/1)
	*/
	@NotNull
	@JsonProperty
	public int obsess_over_services = 0;
	/**
	*	Whether processing of performance data is activated in general (0/1)
	*/
	@NotNull
	@JsonProperty
	public int process_performance_data = 0;
	/**
	*	The time of the last program start as UNIX timestamp
	*/
	@NotNull
	@JsonProperty
	public Timestamp program_start = null;
	/**
	*	The version of the monitoring daemon
	*/
	@NotNull
	@JsonProperty
	public String program_version = null;
	/**
	*	The number of requests to Livestatus since program start
	*/
	@NotNull
	@JsonProperty
	public int requests = 0;
	/**
	*	The averaged number of request to Livestatus per second
	*/
	@NotNull
	@JsonProperty
	public Float requests_rate = null;
	/**
	*	The number of completed service checks since program start
	*/
	@NotNull
	@JsonProperty
	public int service_checks = 0;
	/**
	*	The averaged number of service checks per second
	*/
	@NotNull
	@JsonProperty
	public Float service_checks_rate = null;
	public String toString(){
		return 
		"Accept_passive_host_checks = " + accept_passive_host_checks + "\n" +
		"Accept_passive_service_checks = " + accept_passive_service_checks + "\n" +
		"Cached_log_messages = " + cached_log_messages + "\n" +
		"Check_external_commands = " + check_external_commands + "\n" +
		"Check_host_freshness = " + check_host_freshness + "\n" +
		"Check_service_freshness = " + check_service_freshness + "\n" +
		"Connections = " + connections + "\n" +
		"Connections_rate = " + connections_rate + "\n" +
		"Enable_event_handlers = " + enable_event_handlers + "\n" +
		"Enable_flap_detection = " + enable_flap_detection + "\n" +
		"Enable_notifications = " + enable_notifications + "\n" +
		"Execute_host_checks = " + execute_host_checks + "\n" +
		"Execute_service_checks = " + execute_service_checks + "\n" +
		"External_command_buffer_max = " + external_command_buffer_max + "\n" +
		"External_command_buffer_slots = " + external_command_buffer_slots + "\n" +
		"External_command_buffer_usage = " + external_command_buffer_usage + "\n" +
		"External_commands = " + external_commands + "\n" +
		"External_commands_rate = " + external_commands_rate + "\n" +
		"Forks = " + forks + "\n" +
		"Forks_rate = " + forks_rate + "\n" +
		"Host_checks = " + host_checks + "\n" +
		"Host_checks_rate = " + host_checks_rate + "\n" +
		"Interval_length = " + interval_length + "\n" +
		"Last_command_check = " + last_command_check + "\n" +
		"Last_log_rotation = " + last_log_rotation + "\n" +
		"Livecheck_overflows = " + livecheck_overflows + "\n" +
		"Livecheck_overflows_rate = " + livecheck_overflows_rate + "\n" +
		"Livechecks = " + livechecks + "\n" +
		"Livechecks_rate = " + livechecks_rate + "\n" +
		"Livestatus_active_connections = " + livestatus_active_connections + "\n" +
		"Livestatus_queued_connections = " + livestatus_queued_connections + "\n" +
		"Livestatus_threads = " + livestatus_threads + "\n" +
		"Livestatus_version = " + livestatus_version + "\n" +
		"Log_messages = " + log_messages + "\n" +
		"Log_messages_rate = " + log_messages_rate + "\n" +
		"Nagios_pid = " + nagios_pid + "\n" +
		"Neb_callbacks = " + neb_callbacks + "\n" +
		"Neb_callbacks_rate = " + neb_callbacks_rate + "\n" +
		"Num_hosts = " + num_hosts + "\n" +
		"Num_services = " + num_services + "\n" +
		"Obsess_over_hosts = " + obsess_over_hosts + "\n" +
		"Obsess_over_services = " + obsess_over_services + "\n" +
		"Process_performance_data = " + process_performance_data + "\n" +
		"Program_start = " + program_start + "\n" +
		"Program_version = " + program_version + "\n" +
		"Requests = " + requests + "\n" +
		"Requests_rate = " + requests_rate + "\n" +
		"Service_checks = " + service_checks + "\n" +
		"Service_checks_rate = " + service_checks_rate + "\n" +
"";

	}
}
