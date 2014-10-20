package br.com.centralit.evm.citsmartevm.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

import org.joda.time.DateTime;

@MappedSuperclass
public abstract class TarefaBasica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;

	
	private String descricao;
	
	private String cron;
	
	@Transient
	private DateTime proximaHora;
	
	@Transient
	private boolean fired;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCron() {
		return cron;
	}

	public void setCron(String cron) {
		this.cron = cron;
	}

	public DateTime getProximaHora() {
		return proximaHora;
	}

	public void setProximaHora(DateTime proximaHora) {
		this.proximaHora = proximaHora;
	}

	public boolean isFired() {
		return fired;
	}

	public void setFired(boolean fired) {
		this.fired = fired;
	}    
	public TarefaBasica() {
		
	}

 
    
    
    
}
