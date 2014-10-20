package br.com.centralit.zabbix.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Entidade base de representação de objetos de domínio
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
@JsonInclude(Include.NON_NULL)
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = -5965197347419458590L;

	@JsonProperty
	private Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(final Integer id) {
		this.id = id;
	}

}
