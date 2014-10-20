package br.com.centralit.zabbix.domain;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.sql.Timestamp;
/**
 * ##commentClass
 *
 * @created ##dateCreate
 * @author Adenir Ribeiro Gomes - <a href="mailto:adenir.gomes@gmail.com">adenir.gomes@gmail.com</a>
 */
public class ZabbixUser extends BaseEntity {
	private static final long serialVersionUID = -6911459280290420652L;
	@JsonProperty
	private String userid;  //ID of the user.
	@JsonProperty
	private String alias;  //User alias.
	@JsonProperty
	private Timestamp attempt_clock;  //Time of the last unsuccessful login attempt.
	@JsonProperty
	private Integer attempt_failed;  //Recent failed login attempt count.
	@JsonProperty
	private String attempt_ip;  //IP address from where the last unsuccessful login attempt came from.
	@JsonProperty
	private Integer autologin;  //Whether to enable auto-login.
	@JsonProperty
	private Integer autologout;  //Default: 900.
	@JsonProperty
	private String lang;  //.
	@JsonProperty
	private String name;  //Name of the user.
	@JsonProperty
	private Integer refresh;  //Default: 30.
	@JsonProperty
	private Integer rows_per_page;  //Default: 50.
	@JsonProperty
	private String surname;  //Surname of the user.
	@JsonProperty
	private String theme;  //- Dark orange.
	@JsonProperty
	private Integer type;  //Type of the user.
	@JsonProperty
	private String url;  //of the page to redirect the user to after logging in.
	public void setUserid(String pUserid){  //ID of the user.
		this.userid = pUserid;
	}

	public void setAlias(String pAlias){  //User alias.
		this.alias = pAlias;
	}

	public void setAttempt_clock(Timestamp pAttempt_clock){  //Time of the last unsuccessful login attempt.
		this.attempt_clock = pAttempt_clock;
	}

	public void setAttempt_failed(Integer pAttempt_failed){  //Recent failed login attempt count.
		this.attempt_failed = pAttempt_failed;
	}

	public void setAttempt_ip(String pAttempt_ip){  //IP address from where the last unsuccessful login attempt came from.
		this.attempt_ip = pAttempt_ip;
	}

	public void setAutologin(Integer pAutologin){  //Whether to enable auto-login.
		this.autologin = pAutologin;
	}

	public void setAutologout(Integer pAutologout){  //Default: 900.
		this.autologout = pAutologout;
	}

	public void setLang(String pLang){  //.
		this.lang = pLang;
	}

	public void setName(String pName){  //Name of the user.
		this.name = pName;
	}

	public void setRefresh(Integer pRefresh){  //Default: 30.
		this.refresh = pRefresh;
	}

	public void setRows_per_page(Integer pRows_per_page){  //Default: 50.
		this.rows_per_page = pRows_per_page;
	}

	public void setSurname(String pSurname){  //Surname of the user.
		this.surname = pSurname;
	}

	public void setTheme(String pTheme){  //- Dark orange.
		this.theme = pTheme;
	}

	public void setType(Integer pType){  //Type of the user.
		this.type = pType;
	}

	public void setUrl(String pUrl){  //of the page to redirect the user to after logging in.
		this.url = pUrl;
	}

	public String getUserid(){  //ID of the user.
		return userid;
	}

	public String getAlias(){  //User alias.
		return alias;
	}

	public Timestamp getAttempt_clock(){  //Time of the last unsuccessful login attempt.
		return attempt_clock;
	}

	public Integer getAttempt_failed(){  //Recent failed login attempt count.
		return attempt_failed;
	}

	public String getAttempt_ip(){  //IP address from where the last unsuccessful login attempt came from.
		return attempt_ip;
	}

	public Integer getAutologin(){  //Whether to enable auto-login.
		return autologin;
	}

	public Integer getAutologout(){  //Default: 900.
		return autologout;
	}

	public String getLang(){  //.
		return lang;
	}

	public String getName(){  //Name of the user.
		return name;
	}

	public Integer getRefresh(){  //Default: 30.
		return refresh;
	}

	public Integer getRows_per_page(){  //Default: 50.
		return rows_per_page;
	}

	public String getSurname(){  //Surname of the user.
		return surname;
	}

	public String getTheme(){  //- Dark orange.
		return theme;
	}

	public Integer getType(){  //Type of the user.
		return type;
	}

	public String getUrl(){  //of the page to redirect the user to after logging in.
		return url;
	}

	public String toString(){
		return 
		"Userid = " + userid + "\n" +
		"Alias = " + alias + "\n" +
		"Attempt_clock = " + attempt_clock + "\n" +
		"Attempt_failed = " + attempt_failed + "\n" +
		"Attempt_ip = " + attempt_ip + "\n" +
		"Autologin = " + autologin + "\n" +
		"Autologout = " + autologout + "\n" +
		"Lang = " + lang + "\n" +
		"Name = " + name + "\n" +
		"Refresh = " + refresh + "\n" +
		"Rows_per_page = " + rows_per_page + "\n" +
		"Surname = " + surname + "\n" +
		"Theme = " + theme + "\n" +
		"Type = " + type + "\n" +
		"Url = " + url + "\n" +
"";

	}
}
