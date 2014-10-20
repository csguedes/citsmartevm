/*****************************************************************************
 * Services.java - 
 *
 * Copyright (c) 2014 Projeto citsmart (Contact: adenir.gomes@centralit.com.br)
 *
 * License:
 *****************************************************************************/
package br.com.centralit.nagios.livestatus.tables;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class Services is the main class for obtain all columns of table "services"
 * from a Livestatus TCP-socket/file status.dat.
 *
 * @author Adenir Ribeiro Gomes
 */

public class EventWithInfo {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	 * Constructor of table Services
	 *
	 */
	public EventWithInfo() {
	}

	/**
	 * An optional display name (not used by Nagios standard web pages)
	 * 
	 * @return returns the value of the "display_name" column as string
	 */
	@JsonProperty
	public String display_name;
	/**
	 * Whether the service already has been checked (0/1)
	 * 
	 * @return returns the value of the "has_been_checked" column as int
	 */
	@JsonProperty
	public int has_been_checked;
	/**
	 * Optional notes about the service
	 * 
	 * @return returns the value of the "notes" column as string
	 */
	@JsonProperty
	public String notes;
	/**
	 * The current state of the service (0: OK, 1: WARN, 2: CRITICAL, 3:
	 * UNKNOWN)
	 * 
	 * @return returns the value of the "state" column as int
	 */
	@JsonProperty
	public int state;
}
