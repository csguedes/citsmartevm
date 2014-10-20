package br.com.centralit.nagios.livestatus.actions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Errors {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	public int error_code = 0;  //Codigo do erro ocorrido
	@JsonProperty
	public String error_message = "";  //Mensagem do erro ocorrido
	
	public Errors(int code, String msg)
	{
		error_code = code;
		error_message = msg;
	}
}
