package br.com.centralit.nagios.livestatus.tables;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
import br.com.centralit.nagios.livestatus.query.LivestatusSeparator;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Transient;

/**
 * class Hosts
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
 public class Hosts extends LS_TablesBase implements Serializable {
       //public static final long serialVersionUID = -6911459280290420652L;
        public static final long serialVersionUID = 1L;

       /**
       *   Whether passive host checks are accepted (0/1)
       */
       //@JsonProperty
       public int accept_passive_checks = 0;
       /**
       *   Whether the current host problem has been acknowledged (0/1)
       */
      // @JsonProperty
       public int acknowledged = 0;
       /**
       *   Type of acknowledgement (0: none, 1: normal, 2: stick)
       */
       @JsonProperty
       public int acknowledgement_type = 0;
       /**
       *   An optional URL to custom actions or information about this host
       */
       @JsonProperty
       public String action_url = null;
       /**
       *   The same as action_url, but with the most important macros expanded
       */
       @JsonProperty
       public String action_url_expanded = null;
       /**
       *   Whether active checks are enabled for the host (0/1)
       */
       @JsonProperty
       public int active_checks_enabled = 0;
       /**
       *   IP address
       */
       @JsonProperty
       public String address = null;
       /**
       *   An alias name for the host
       */
       @JsonProperty
       public String alias = null;
       /**
       *   Nagios command for active host check of this host
       */
       @JsonProperty
       public String check_command = null;
       /**
       *   Nagios command for active host check of this host with the macros expanded
       */
       @JsonProperty
       public String check_command_expanded = null;
       /**
       *   Whether to check to send a recovery notification when flapping stops (0/1)
       */
       @JsonProperty
       public int check_flapping_recovery_notification = 0;
       /**
       *   Whether freshness checks are activated (0/1)
       */
       @JsonProperty
       public int check_freshness = 0;
       /**
       *   Number of basic interval lengths between two scheduled checks of the host
       */
       @JsonProperty
       public Float check_interval = null;
       /**
       *   The current check option, forced, normal, freshness... (0-2)
       */
       @JsonProperty
       public int check_options = 0;
       /**
       *   Time period in which this host will be checked. If empty then the host will always be checked.
       */
       @JsonProperty
       public String check_period = null;
       /**
       *   Type of check (0: active, 1: passive)
       */
       @JsonProperty
       public int check_type = 0;
       /**
       *   Whether checks of the host are enabled (0/1)
       */
       @JsonProperty
       public int checks_enabled = 0;
       /**
       *   A list of all direct childs of the host
       */
       @JsonProperty
       public String childs = null;
       /**
       *   A list of the ids of all comments of this host
       */
       @JsonProperty
       public String comments = null;
       /**
       *   A list of all comments of the host with id, author, comment, entry type and entry time
       */
       @JsonProperty
       public String comments_with_extra_info = null;
       /**
       *   A list of all comments of the host with id, author and comment
       */
       @JsonProperty
       public String comments_with_info = null;
       /**
       *   A list of all contact groups this host is in
       */
       @JsonProperty
       public String contact_groups = null;
       /**
       *   A list of all contacts of this host, either direct or via a contact group
       */
       @JsonProperty
       public String contacts = null;
       /**
       *   Number of the current check attempts
       */
       @JsonProperty
       public int current_attempt = 0;
       /**
       *   Number of the current notification
       */
       @JsonProperty
       public int current_notification_number = 0;
       /**
       *   A list of the names of all custom variables
       */
       @JsonProperty
       public String custom_variable_names = null;
       /**
       *   A list of the values of the custom variables
       */
       @JsonProperty
       public String custom_variable_values = null;
       /**
       *   A dictionary of the custom variables
       */
       @JsonProperty
       public String custom_variables = null;
       /**
       *   Optional display name of the host - not used by Nagios' web interface
       */
       @JsonProperty
       public String display_name = null;
       /**
       *   A list of the ids of all scheduled downtimes of this host
       */
       @JsonProperty
       public String downtimes = null;
       /**
       *   A list of the all scheduled downtimes of the host with id, author and comment
       */
       @JsonProperty
       public String downtimes_with_info = null;
       /**
       *   Nagios command used as event handler
       */
       @JsonProperty
       public String event_handler = null;
       /**
       *   Whether event handling is enabled (0/1)
       */
       @JsonProperty
       public int event_handler_enabled = 0;
       /**
       *   Time the host check needed for execution
       */
       @JsonProperty
       public Float execution_time = null;
       /**
       *   The value of the custom variable FILENAME
       */
       @JsonProperty
       public String filename = null;
       /**
       *   Delay before the first notification
       */
       @JsonProperty
       public Float first_notification_delay = null;
       /**
       *   Whether flap detection is enabled (0/1)
       */
       @JsonProperty
       public int flap_detection_enabled = 0;
       /**
       *   A list of all host groups this host is in
       */
       @JsonProperty
       public String groups = null;
       /**
       *   The effective hard state of the host (eliminates a problem in hard_state)
       */
       @JsonProperty
       public int hard_state = 0;
       /**
       *   Whether the host has already been checked (0/1)
       */
       @JsonProperty
       public int has_been_checked = 0;
       /**
       *   High threshold of flap detection
       */
       @JsonProperty
       public Float high_flap_threshold = null;
       /**
       *   The name of an image file to be used in the web pages
       */
       @JsonProperty
       public String icon_image = null;
       /**
       *   Alternative text for the icon_image
       */
       @JsonProperty
       public String icon_image_alt = null;
       /**
       *   The same as icon_image, but with the most important macros expanded
       */
       @JsonProperty
       public String icon_image_expanded = null;
       /**
       *   Whether this host is currently in its check period (0/1)
       */
       @JsonProperty
       public int in_check_period = 0;
       /**
       *   Whether this host is currently in its notification period (0/1)
       */
       @JsonProperty
       public int in_notification_period = 0;
       /**
       *   Whether this host is currently in its service period (0/1)
       */
       @JsonProperty
       public int in_service_period = 0;
       /**
       *   Initial host state
       */
       @JsonProperty
       public int initial_state = 0;
       /**
       *   is there a host check currently running... (0/1)
       */
       @JsonProperty
       public int is_executing = 0;
       /**
       *   Whether the host state is flapping (0/1)
       */
       @JsonProperty
       public int is_flapping = 0;
       /**
       *   Time of the last check (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_check = null;
       /**
       *   Last hard state
       */
       @JsonProperty
       public int last_hard_state = 0;
       /**
       *   Time of the last hard state change (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_hard_state_change = null;
       /**
       *   Time of the last notification (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_notification = null;
       /**
       *   State before last state change
       */
       @JsonProperty
       public int last_state = 0;
       /**
       *   Time of the last state change - soft or hard (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_state_change = null;
       /**
       *   The last time the host was DOWN (Unix timestamp)
              <module>modulozabbix</module>*/
       @JsonProperty
       public Timestamp last_time_down = null;
       /**
       *   The last time the host was UNREACHABLE (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_time_unreachable = null;
       /**
       *   The last time the host was UP (Unix timestamp)
       */
       @JsonProperty
       public Timestamp last_time_up = null;
       /**
       *   Time difference between scheduled check time and actual check time
       */
       @JsonProperty
       public Float latency = null;
       /**
       *   Complete output from check plugin
       */
       @JsonProperty
       public String long_plugin_output = null;
       /**
       *   Low threshold of flap detection
       */
       @JsonProperty
       public Float low_flap_threshold = null;
       /**
       *   Max check attempts for active host checks
       */
       @JsonProperty
       public int max_check_attempts = 0;
       /**
       *   A bitmask specifying which attributes have been modified
       */
       @JsonProperty
       public int modified_attributes = 0;
       /**
       *   A list of all modified attributes
       */
       @JsonProperty
       public String modified_attributes_list = null;
       /**
       *   Host name
       */
       @JsonProperty
       public String name = null;
       /**
       *   Scheduled time for the next check (Unix timestamp)
       */
       @JsonProperty
       public Timestamp next_check = null;
       /**
       *   Time of the next notification (Unix timestamp)
       */
       @JsonProperty
       public Timestamp next_notification = null;
       /**
       *   Whether to stop sending notifications (0/1)
       */
       @JsonProperty
       public int no_more_notifications = 0;
       /**
       *   Optional notes for this host
       */
       @JsonProperty
       public String notes = null;
       /**
       *   The same as notes, but with the most important macros expanded
       */
       @JsonProperty
       public String notes_expanded = null;
       /**
       *   An optional URL with further information about the host
       */
       @JsonProperty
       public String notes_url = null;
       /**
       *   Same es notes_url, but with the most important macros expanded
       */
       @JsonProperty
       public String notes_url_expanded = null;
       /**
       *   Interval of periodic notification or 0 if its off
       */
       @JsonProperty
       public Float notification_interval = null;
       /**
       *   Time period in which problems of this host will be notified. If empty then notification will be always
       */
       @JsonProperty
       public String notification_period = null;
       /**
       *   Whether notifications of the host are enabled (0/1)
       */
       @JsonProperty
       public int notifications_enabled = 0;
       /**
       *   The total number of services of the host
       */
       @JsonProperty
       public int num_services = 0;
       /**
       *   The number of the host's services with the soft state CRIT
       */
       @JsonProperty
       public int num_services_crit = 0;
       /**
       *   The number of the host's services with the hard state CRIT
       */
       @JsonProperty
       public int num_services_hard_crit = 0;
       /**
       *   The number of the host's services with the hard state OK
       */
       @JsonProperty
       public int num_services_hard_ok = 0;
       /**
       *   The number of the host's services with the hard state UNKNOWN
       */
       @JsonProperty
       public int num_services_hard_unknown = 0;
       /**
       *   The number of the host's services with the hard state WARN
       */
       @JsonProperty
       public int num_services_hard_warn = 0;
       /**
       *   The number of the host's services with the soft state OK
       */
       @JsonProperty
       public int num_services_ok = 0;
       /**
       *   The number of the host's services which have not been checked yet (pending)
       */
       @JsonProperty
       public int num_services_pending = 0;
       /**
       *   The number of the host's services with the soft state UNKNOWN
       */
       @JsonProperty
       public int num_services_unknown = 0;
       /**
       *   The number of the host's services with the soft state WARN
       */
       @JsonProperty
       public int num_services_warn = 0;
       /**
       *   The current obsess_over_host setting... (0/1)
       */
       @JsonProperty
       public int obsess_over_host = 0;
       /**
       *   A list of all direct parents of the host
       */
       @JsonProperty
       public String parents = null;
       /**
       *   Whether a flex downtime is pending (0/1)
       */
       @JsonProperty
       public int pending_flex_downtime = 0;
       /**
       *   Percent state change
       */
       @JsonProperty
       public Float percent_state_change = null;
       /**
       *   Optional performance data of the last host check
       */
       @JsonProperty
       public String perf_data = null;
       /**
       *   Output of the last host check
       */
       @JsonProperty
       public String plugin_output = null;
       /**
       *   Whether there is a PNP4Nagios graph present for this host (0/1)
       */
       @JsonProperty
       public int pnpgraph_present = 0;
       /**
       *   Whether processing of performance data is enabled (0/1)
       */
       @JsonProperty
       public int process_performance_data = 0;
       /**
       *   Number of basic interval lengths between checks when retrying after a soft error
       */
       @JsonProperty
       public Float retry_interval = null;
       /**
       *   The number of downtimes this host is currently in
       */
       @JsonProperty
       public int scheduled_downtime_depth = 0;
       /**
       *   The name of the service period of the host
       */
       @JsonProperty
       public String service_period = null;
       /**
       *   A list of all services of the host
       */
       @JsonProperty
       public String services = null;
       /**
       *   A list of all services including detailed information about each service
       */
       @JsonProperty
       public String services_with_info = null;
       /**
       *   A list of all services of the host together with state and has_been_checked
       */
       @JsonProperty
       public String services_with_state = null;
       /**
       *   Staleness indicator for this host
       */
       @JsonProperty
       public Float staleness = null;
       /**
       *   The current state of the host (0: up, 1: down, 2: unreachable)
       */
       @JsonProperty
       public int state = 0;
       /**
       *   Type of the current state (0: soft, 1: hard)
       */
       @JsonProperty
       public int state_type = 0;
       /**
       *   The name of in image file for the status map
       */
       @JsonProperty
       public String statusmap_image = null;
       /**
       *   The total number of services of the host
       */
       @JsonProperty
       public int total_services = 0;
       /**
       *   The worst hard state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
       */
       @JsonProperty
       public int worst_service_hard_state = 0;
       /**
       *   The worst soft state of all of the host's services (OK <= WARN <= UNKNOWN <= CRIT)
       */
       @JsonProperty
       public int worst_service_state = 0;
       /**
       *   3D-Coordinates: X
       */
       @JsonProperty
       public Float x_3d = null;
       /**
       *   3D-Coordinates: Y
       */
       @JsonProperty
       public Float y_3d = null;
       /**
       *   3D-Coordinates: Z
       */
       @JsonProperty
       public Float z_3d = null;

       /**
       *   Events with info contains all events of host with
        *       display_name, state, has_been_checked and notes attributes
       */
       @Transient
       @JsonProperty
       public List<EventWithInfo> events = new ArrayList<>();

       /**
       *   listOfservices contains all events of host with all attributes
       */
       @JsonProperty
       public List<Service> listOfservices = new ArrayList<>();

       @Override
       public  void createObjects(){
           for (String str_evt : services_with_info.split(LivestatusSeparator.SEP3()))
           {
              EventWithInfo evt = new EventWithInfo();
              String[] str_col_evt =  str_evt.split(LivestatusSeparator.SEP4());
              evt.display_name = str_col_evt[0];
              evt.state = getAsInt(str_col_evt[1]);
              evt.has_been_checked = getAsInt(str_col_evt[2]);
              evt.notes = str_col_evt[3];
              events.add(evt);
           }

           services = null;  //A list of all services of the host
           services_with_info = null;  //A list of all services including detailed information about each service
           services_with_state = null;  //A list of all services of the host together with state and has_been_checked

       }

       public String toString(){
           return
           "Accept_passive_checks = " + accept_passive_checks + "\n" +
           "Acknowledged = " + acknowledged + "\n" +
           "Acknowledgement_type = " + acknowledgement_type + "\n" +
           "Action_url = " + action_url + "\n" +
           "Action_url_expanded = " + action_url_expanded + "\n" +
           "Active_checks_enabled = " + active_checks_enabled + "\n" +
           "Address = " + address + "\n" +
           "Alias = " + alias + "\n" +
           "Check_command = " + check_command + "\n" +
           "Check_command_expanded = " + check_command_expanded + "\n" +
           "Check_flapping_recovery_notification = " + check_flapping_recovery_notification + "\n" +
           "Check_freshness = " + check_freshness + "\n" +
           "Check_interval = " + check_interval + "\n" +
           "Check_options = " + check_options + "\n" +
           "Check_period = " + check_period + "\n" +
           "Check_type = " + check_type + "\n" +
           "Checks_enabled = " + checks_enabled + "\n" +
           "Childs = " + childs + "\n" +
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
           "Display_name = " + display_name + "\n" +
           "Downtimes = " + downtimes + "\n" +
           "Downtimes_with_info = " + downtimes_with_info + "\n" +
           "Event_handler = " + event_handler + "\n" +
           "Event_handler_enabled = " + event_handler_enabled + "\n" +
           "Execution_time = " + execution_time + "\n" +
           "Filename = " + filename + "\n" +
           "First_notification_delay = " + first_notification_delay + "\n" +
           "Flap_detection_enabled = " + flap_detection_enabled + "\n" +
           "Groups = " + groups + "\n" +
           "Hard_state = " + hard_state + "\n" +
           "Has_been_checked = " + has_been_checked + "\n" +
           "High_flap_threshold = " + high_flap_threshold + "\n" +
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
           "Last_time_down = " + last_time_down + "\n" +
           "Last_time_unreachable = " + last_time_unreachable + "\n" +
           "Last_time_up = " + last_time_up + "\n" +
           "Latency = " + latency + "\n" +
           "Long_plugin_output = " + long_plugin_output + "\n" +
           "Low_flap_threshold = " + low_flap_threshold + "\n" +
           "Max_check_attempts = " + max_check_attempts + "\n" +
           "Modified_attributes = " + modified_attributes + "\n" +
           "Modified_attributes_list = " + modified_attributes_list + "\n" +
           "Name = " + name + "\n" +
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
           "Obsess_over_host = " + obsess_over_host + "\n" +
           "Parents = " + parents + "\n" +
           "Pending_flex_downtime = " + pending_flex_downtime + "\n" +
           "Percent_state_change = " + percent_state_change + "\n" +
           "Perf_data = " + perf_data + "\n" +
           "Plugin_output = " + plugin_output + "\n" +
           "Pnpgraph_present = " + pnpgraph_present + "\n" +
           "Process_performance_data = " + process_performance_data + "\n" +
           "Retry_interval = " + retry_interval + "\n" +
           "Scheduled_downtime_depth = " + scheduled_downtime_depth + "\n" +
           "Service_period = " + service_period + "\n" +
           "Services = " + services + "\n" +
           "Services_with_info = " + services_with_info + "\n" +
           "Services_with_state = " + services_with_state + "\n" +
           "Staleness = " + staleness + "\n" +
           "State = " + state + "\n" +
           "State_type = " + state_type + "\n" +
           "Statusmap_image = " + statusmap_image + "\n" +
           "Total_services = " + total_services + "\n" +
           "Worst_service_hard_state = " + worst_service_hard_state + "\n" +
           "Worst_service_state = " + worst_service_state + "\n" +
           "X_3d = " + x_3d + "\n" +
           "Y_3d = " + y_3d + "\n" +
           "Z_3d = " + z_3d + "\n";

       }

    public int getAccept_passive_checks() {
        return accept_passive_checks;
    }

    public void setAccept_passive_checks(int accept_passive_checks) {
        this.accept_passive_checks = accept_passive_checks;
    }

    public int getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(int acknowledged) {
        this.acknowledged = acknowledged;
    }

    public int getAcknowledgement_type() {
        return acknowledgement_type;
    }

    public void setAcknowledgement_type(int acknowledgement_type) {
        this.acknowledgement_type = acknowledgement_type;
    }

    public String getAction_url() {
        return action_url;
    }

    public void setAction_url(String action_url) {
        this.action_url = action_url;
    }

    public String getAction_url_expanded() {
        return action_url_expanded;
    }

    public void setAction_url_expanded(String action_url_expanded) {
        this.action_url_expanded = action_url_expanded;
    }

    public int getActive_checks_enabled() {
        return active_checks_enabled;
    }

    public void setActive_checks_enabled(int active_checks_enabled) {
        this.active_checks_enabled = active_checks_enabled;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCheck_command() {
        return check_command;
    }

    public void setCheck_command(String check_command) {
        this.check_command = check_command;
    }

    public String getCheck_command_expanded() {
        return check_command_expanded;
    }

    public void setCheck_command_expanded(String check_command_expanded) {
        this.check_command_expanded = check_command_expanded;
    }

    public int getCheck_flapping_recovery_notification() {
        return check_flapping_recovery_notification;
    }

    public void setCheck_flapping_recovery_notification(int check_flapping_recovery_notification) {
        this.check_flapping_recovery_notification = check_flapping_recovery_notification;
    }

    public int getCheck_freshness() {
        return check_freshness;
    }

    public void setCheck_freshness(int check_freshness) {
        this.check_freshness = check_freshness;
    }

    public Float getCheck_interval() {
        return check_interval;
    }

    public void setCheck_interval(Float check_interval) {
        this.check_interval = check_interval;
    }

    public int getCheck_options() {
        return check_options;
    }

    public void setCheck_options(int check_options) {
        this.check_options = check_options;
    }

    public String getCheck_period() {
        return check_period;
    }

    public void setCheck_period(String check_period) {
        this.check_period = check_period;
    }

    public int getCheck_type() {
        return check_type;
    }

    public void setCheck_type(int check_type) {
        this.check_type = check_type;
    }

    public int getChecks_enabled() {
        return checks_enabled;
    }

    public void setChecks_enabled(int checks_enabled) {
        this.checks_enabled = checks_enabled;
    }

    public String getChilds() {
        return childs;
    }

    public void setChilds(String childs) {
        this.childs = childs;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments_with_extra_info() {
        return comments_with_extra_info;
    }

    public void setComments_with_extra_info(String comments_with_extra_info) {
        this.comments_with_extra_info = comments_with_extra_info;
    }

    public String getComments_with_info() {
        return comments_with_info;
    }

    public void setComments_with_info(String comments_with_info) {
        this.comments_with_info = comments_with_info;
    }

    public String getContact_groups() {
        return contact_groups;
    }

    public void setContact_groups(String contact_groups) {
        this.contact_groups = contact_groups;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public int getCurrent_attempt() {
        return current_attempt;
    }

    public void setCurrent_attempt(int current_attempt) {
        this.current_attempt = current_attempt;
    }

    public int getCurrent_notification_number() {
        return current_notification_number;
    }

    public void setCurrent_notification_number(int current_notification_number) {
        this.current_notification_number = current_notification_number;
    }

    public String getCustom_variable_names() {
        return custom_variable_names;
    }

    public void setCustom_variable_names(String custom_variable_names) {
        this.custom_variable_names = custom_variable_names;
    }

    public String getCustom_variable_values() {
        return custom_variable_values;
    }

    public void setCustom_variable_values(String custom_variable_values) {
        this.custom_variable_values = custom_variable_values;
    }

    public String getCustom_variables() {
        return custom_variables;
    }

    public void setCustom_variables(String custom_variables) {
        this.custom_variables = custom_variables;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDowntimes() {
        return downtimes;
    }

    public void setDowntimes(String downtimes) {
        this.downtimes = downtimes;
    }

    public String getDowntimes_with_info() {
        return downtimes_with_info;
    }

    public void setDowntimes_with_info(String downtimes_with_info) {
        this.downtimes_with_info = downtimes_with_info;
    }

    public String getEvent_handler() {
        return event_handler;
    }

    public void setEvent_handler(String event_handler) {
        this.event_handler = event_handler;
    }

    public int getEvent_handler_enabled() {
        return event_handler_enabled;
    }

    public void setEvent_handler_enabled(int event_handler_enabled) {
        this.event_handler_enabled = event_handler_enabled;
    }

    public Float getExecution_time() {
        return execution_time;
    }

    public void setExecution_time(Float execution_time) {
        this.execution_time = execution_time;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Float getFirst_notification_delay() {
        return first_notification_delay;
    }

    public void setFirst_notification_delay(Float first_notification_delay) {
        this.first_notification_delay = first_notification_delay;
    }

    public int getFlap_detection_enabled() {
        return flap_detection_enabled;
    }

    public void setFlap_detection_enabled(int flap_detection_enabled) {
        this.flap_detection_enabled = flap_detection_enabled;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public int getHard_state() {
        return hard_state;
    }

    public void setHard_state(int hard_state) {
        this.hard_state = hard_state;
    }

    public int getHas_been_checked() {
        return has_been_checked;
    }

    public void setHas_been_checked(int has_been_checked) {
        this.has_been_checked = has_been_checked;
    }

    public Float getHigh_flap_threshold() {
        return high_flap_threshold;
    }

    public void setHigh_flap_threshold(Float high_flap_threshold) {
        this.high_flap_threshold = high_flap_threshold;
    }

    public String getIcon_image() {
        return icon_image;
    }

    public void setIcon_image(String icon_image) {
        this.icon_image = icon_image;
    }

    public String getIcon_image_alt() {
        return icon_image_alt;
    }

    public void setIcon_image_alt(String icon_image_alt) {
        this.icon_image_alt = icon_image_alt;
    }

    public String getIcon_image_expanded() {
        return icon_image_expanded;
    }

    public void setIcon_image_expanded(String icon_image_expanded) {
        this.icon_image_expanded = icon_image_expanded;
    }

    public int getIn_check_period() {
        return in_check_period;
    }

    public void setIn_check_period(int in_check_period) {
        this.in_check_period = in_check_period;
    }

    public int getIn_notification_period() {
        return in_notification_period;
    }

    public void setIn_notification_period(int in_notification_period) {
        this.in_notification_period = in_notification_period;
    }

    public int getIn_service_period() {
        return in_service_period;
    }

    public void setIn_service_period(int in_service_period) {
        this.in_service_period = in_service_period;
    }

    public int getInitial_state() {
        return initial_state;
    }

    public void setInitial_state(int initial_state) {
        this.initial_state = initial_state;
    }

    public int getIs_executing() {
        return is_executing;
    }

    public void setIs_executing(int is_executing) {
        this.is_executing = is_executing;
    }

    public int getIs_flapping() {
        return is_flapping;
    }

    public void setIs_flapping(int is_flapping) {
        this.is_flapping = is_flapping;
    }

    public Timestamp getLast_check() {
        return last_check;
    }

    public void setLast_check(Timestamp last_check) {
        this.last_check = last_check;
    }

    public int getLast_hard_state() {
        return last_hard_state;
    }

    public void setLast_hard_state(int last_hard_state) {
        this.last_hard_state = last_hard_state;
    }

    public Timestamp getLast_hard_state_change() {
        return last_hard_state_change;
    }

    public void setLast_hard_state_change(Timestamp last_hard_state_change) {
        this.last_hard_state_change = last_hard_state_change;
    }

    public Timestamp getLast_notification() {
        return last_notification;
    }

    public void setLast_notification(Timestamp last_notification) {
        this.last_notification = last_notification;
    }

    public int getLast_state() {
        return last_state;
    }

    public void setLast_state(int last_state) {
        this.last_state = last_state;
    }

    public Timestamp getLast_state_change() {
        return last_state_change;
    }

    public void setLast_state_change(Timestamp last_state_change) {
        this.last_state_change = last_state_change;
    }

    public Timestamp getLast_time_down() {
        return last_time_down;
    }

    public void setLast_time_down(Timestamp last_time_down) {
        this.last_time_down = last_time_down;
    }

    public Timestamp getLast_time_unreachable() {
        return last_time_unreachable;
    }

    public void setLast_time_unreachable(Timestamp last_time_unreachable) {
        this.last_time_unreachable = last_time_unreachable;
    }

    public Timestamp getLast_time_up() {
        return last_time_up;
    }

    public void setLast_time_up(Timestamp last_time_up) {
        this.last_time_up = last_time_up;
    }

    public Float getLatency() {
        return latency;
    }

    public void setLatency(Float latency) {
        this.latency = latency;
    }

    public String getLong_plugin_output() {
        return long_plugin_output;
    }

    public void setLong_plugin_output(String long_plugin_output) {
        this.long_plugin_output = long_plugin_output;
    }

    public Float getLow_flap_threshold() {
        return low_flap_threshold;
    }

    public void setLow_flap_threshold(Float low_flap_threshold) {
        this.low_flap_threshold = low_flap_threshold;
    }

    public int getMax_check_attempts() {
        return max_check_attempts;
    }

    public void setMax_check_attempts(int max_check_attempts) {
        this.max_check_attempts = max_check_attempts;
    }

    public int getModified_attributes() {
        return modified_attributes;
    }

    public void setModified_attributes(int modified_attributes) {
        this.modified_attributes = modified_attributes;
    }

    public String getModified_attributes_list() {
        return modified_attributes_list;
    }

    public void setModified_attributes_list(String modified_attributes_list) {
        this.modified_attributes_list = modified_attributes_list;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getNext_check() {
        return next_check;
    }

    public void setNext_check(Timestamp next_check) {
        this.next_check = next_check;
    }

    public Timestamp getNext_notification() {
        return next_notification;
    }

    public void setNext_notification(Timestamp next_notification) {
        this.next_notification = next_notification;
    }

    public int getNo_more_notifications() {
        return no_more_notifications;
    }

    public void setNo_more_notifications(int no_more_notifications) {
        this.no_more_notifications = no_more_notifications;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getNotes_expanded() {
        return notes_expanded;
    }

    public void setNotes_expanded(String notes_expanded) {
        this.notes_expanded = notes_expanded;
    }

    public String getNotes_url() {
        return notes_url;
    }

    public void setNotes_url(String notes_url) {
        this.notes_url = notes_url;
    }

    public String getNotes_url_expanded() {
        return notes_url_expanded;
    }

    public void setNotes_url_expanded(String notes_url_expanded) {
        this.notes_url_expanded = notes_url_expanded;
    }

    public Float getNotification_interval() {
        return notification_interval;
    }

    public void setNotification_interval(Float notification_interval) {
        this.notification_interval = notification_interval;
    }

    public String getNotification_period() {
        return notification_period;
    }

    public void setNotification_period(String notification_period) {
        this.notification_period = notification_period;
    }

    public int getNotifications_enabled() {
        return notifications_enabled;
    }

    public void setNotifications_enabled(int notifications_enabled) {
        this.notifications_enabled = notifications_enabled;
    }

    public int getNum_services() {
        return num_services;
    }

    public void setNum_services(int num_services) {
        this.num_services = num_services;
    }

    public int getNum_services_crit() {
        return num_services_crit;
    }

    public void setNum_services_crit(int num_services_crit) {
        this.num_services_crit = num_services_crit;
    }

    public int getNum_services_hard_crit() {
        return num_services_hard_crit;
    }

    public void setNum_services_hard_crit(int num_services_hard_crit) {
        this.num_services_hard_crit = num_services_hard_crit;
    }

    public int getNum_services_hard_ok() {
        return num_services_hard_ok;
    }

    public void setNum_services_hard_ok(int num_services_hard_ok) {
        this.num_services_hard_ok = num_services_hard_ok;
    }

    public int getNum_services_hard_unknown() {
        return num_services_hard_unknown;
    }

    public void setNum_services_hard_unknown(int num_services_hard_unknown) {
        this.num_services_hard_unknown = num_services_hard_unknown;
    }

    public int getNum_services_hard_warn() {
        return num_services_hard_warn;
    }

    public void setNum_services_hard_warn(int num_services_hard_warn) {
        this.num_services_hard_warn = num_services_hard_warn;
    }

    public int getNum_services_ok() {
        return num_services_ok;
    }

    public void setNum_services_ok(int num_services_ok) {
        this.num_services_ok = num_services_ok;
    }

    public int getNum_services_pending() {
        return num_services_pending;
    }

    public void setNum_services_pending(int num_services_pending) {
        this.num_services_pending = num_services_pending;
    }

    public int getNum_services_unknown() {
        return num_services_unknown;
    }

    public void setNum_services_unknown(int num_services_unknown) {
        this.num_services_unknown = num_services_unknown;
    }

    public int getNum_services_warn() {
        return num_services_warn;
    }

    public void setNum_services_warn(int num_services_warn) {
        this.num_services_warn = num_services_warn;
    }

    public int getObsess_over_host() {
        return obsess_over_host;
    }

    public void setObsess_over_host(int obsess_over_host) {
        this.obsess_over_host = obsess_over_host;
    }

    public String getParents() {
        return parents;
    }

    public void setParents(String parents) {
        this.parents = parents;
    }

    public int getPending_flex_downtime() {
        return pending_flex_downtime;
    }

    public void setPending_flex_downtime(int pending_flex_downtime) {
        this.pending_flex_downtime = pending_flex_downtime;
    }

    public Float getPercent_state_change() {
        return percent_state_change;
    }

    public void setPercent_state_change(Float percent_state_change) {
        this.percent_state_change = percent_state_change;
    }

    public String getPerf_data() {
        return perf_data;
    }

    public void setPerf_data(String perf_data) {
        this.perf_data = perf_data;
    }

    public String getPlugin_output() {
        return plugin_output;
    }

    public void setPlugin_output(String plugin_output) {
        this.plugin_output = plugin_output;
    }

    public int getPnpgraph_present() {
        return pnpgraph_present;
    }

    public void setPnpgraph_present(int pnpgraph_present) {
        this.pnpgraph_present = pnpgraph_present;
    }

    public int getProcess_performance_data() {
        return process_performance_data;
    }

    public void setProcess_performance_data(int process_performance_data) {
        this.process_performance_data = process_performance_data;
    }

    public Float getRetry_interval() {
        return retry_interval;
    }

    public void setRetry_interval(Float retry_interval) {
        this.retry_interval = retry_interval;
    }

    public int getScheduled_downtime_depth() {
        return scheduled_downtime_depth;
    }

    public void setScheduled_downtime_depth(int scheduled_downtime_depth) {
        this.scheduled_downtime_depth = scheduled_downtime_depth;
    }

    public String getService_period() {
        return service_period;
    }

    public void setService_period(String service_period) {
        this.service_period = service_period;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getServices_with_info() {
        return services_with_info;
    }

    public void setServices_with_info(String services_with_info) {
        this.services_with_info = services_with_info;
    }

    public String getServices_with_state() {
        return services_with_state;
    }

    public void setServices_with_state(String services_with_state) {
        this.services_with_state = services_with_state;
    }

    public Float getStaleness() {
        return staleness;
    }

    public void setStaleness(Float staleness) {
        this.staleness = staleness;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState_type() {
        return state_type;
    }

    public void setState_type(int state_type) {
        this.state_type = state_type;
    }

    public String getStatusmap_image() {
        return statusmap_image;
    }

    public void setStatusmap_image(String statusmap_image) {
        this.statusmap_image = statusmap_image;
    }

    public int getTotal_services() {
        return total_services;
    }

    public void setTotal_services(int total_services) {
        this.total_services = total_services;
    }

    public int getWorst_service_hard_state() {
        return worst_service_hard_state;
    }

    public void setWorst_service_hard_state(int worst_service_hard_state) {
        this.worst_service_hard_state = worst_service_hard_state;
    }

    public int getWorst_service_state() {
        return worst_service_state;
    }

    public void setWorst_service_state(int worst_service_state) {
        this.worst_service_state = worst_service_state;
    }

    public Float getX_3d() {
        return x_3d;
    }

    public void setX_3d(Float x_3d) {
        this.x_3d = x_3d;
    }

    public Float getY_3d() {
        return y_3d;
    }

    public void setY_3d(Float y_3d) {
        this.y_3d = y_3d;
    }

    public Float getZ_3d() {
        return z_3d;
    }

    public void setZ_3d(Float z_3d) {
        this.z_3d = z_3d;
    }

    public List<EventWithInfo> getEvents() {
        return events;
    }

    public void setEvents(List<EventWithInfo> events) {
        this.events = events;
    }

    public List<Service> getListOfservices() {
        return listOfservices;
    }

    public void setListOfservices(List<Service> listOfservices) {
        this.listOfservices = listOfservices;
    }
}
