package br.com.centralit.nagios.livestatus.tables;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotNull;
import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
/**
 * class Columns
 *
 * @created at Tuesday, September 30, 2014
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class Columns extends LS_TablesBase {
	private static final long serialVersionUID = -6911459280290420652L;
	/**
	*	A description of the column
	*/
	@NotNull
	@JsonProperty
	public String description = null;
	/**
	*	The name of the column within the table
	*/
	@NotNull
	@JsonProperty
	public String name = null;
	/**
	*	The name of the table
	*/
	@NotNull
	@JsonProperty
	public String table = null;
	/**
	*	The data type of the column (int, float, string, list)
	*/
	@NotNull
	@JsonProperty
	public String type = null;
	public String toString(){
		return 
		"Description = " + description + "\n" +
		"Name = " + name + "\n" +
		"Table = " + table + "\n" +
		"Type = " + type + "\n" +
"";

	}
}
