package br.com.centralit.evm.citsmartevm.entity.nagios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Columns {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	private String column;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	
	
	
	
	
}
