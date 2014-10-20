package br.com.centralit.evm.citsmartevm.entity.nagios;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Filters {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;
	
	private String filter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}
	
	
	
	
	
}
