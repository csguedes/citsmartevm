package br.com.centralit.evm.citsmartevm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.centralit.evm.citsmartevm.entity.Tarefas;
import br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM;
import br.com.centralit.evm.classesutilitarias.TratamentoDeStrings;

/**
 * 
 * @author cristian.guedes
 * a Stateless EJB which will carry on transactional jobs (Inserts, Deletes)
 *
 */
@Stateless
public class TarefasDAO implements ITarefasDAO {

	@Inject
	private Event<EventoCTM> propEventSrc;

	@Inject
	private EntityManager em;

	public synchronized void salvar(EventoCTM p) {

        em.persist(p);  
		propEventSrc.fire(p);
	}
	
	public List<Tarefas> listAll() {
		
		EventoCTM resultado = null;
		
		Query query = em
				.createQuery("from br.com.centralit.evm.citsmartevm.entity.Tarefas ");

		if (query.getResultList().size()>0) {
			return new ArrayList<Tarefas>(query.getResultList());
			
		} else {
			return new ArrayList<Tarefas>();
		}
		
		
		
		
	}
	

}
