package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Commands
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Commands extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	The shell command line
	*/
	@NotNull
	@JsonProperty
	public String line = null;
	/**
	*	The name of the command
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	public String toString(){
		return 
		"Line = " + line + "\n" +
		"Name = " + name + "\n" +
"";

	}
}
