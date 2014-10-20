package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Contactgroups
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Contactgroups extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	The alias of the contactgroup
	*/
	@NotNull
	@JsonProperty
	public String alias = null;
	/**
	*	A list of all members of this contactgroup
	*/
	@NotNull
	@JsonProperty
	public String members = null;
	/**
	*	The name of the contactgroup
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	public String toString(){
		return 
		"Alias = " + alias + "\n" +
		"Members = " + members + "\n" +
		"Name = " + name + "\n" +
"";

	}
}
