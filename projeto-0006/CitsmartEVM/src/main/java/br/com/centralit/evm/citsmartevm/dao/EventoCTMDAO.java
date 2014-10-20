package br.com.centralit.evm.citsmartevm.dao;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM;
import br.com.centralit.evm.classesutilitarias.TratamentoDeStrings;

/**
 * 
 * @author cristian.guedes
 * a Stateless EJB which will carry on transactional jobs (Inserts, Deletes)
 *
 */
@Stateless
public class EventoCTMDAO implements IEventoCTMDAO {

	@Inject
	private Event<EventoCTM> propEventSrc;

	@Inject
	private EntityManager em;

	public synchronized void salvar(EventoCTM p) {

        em.persist(p);  
		propEventSrc.fire(p);
	}
	
	public synchronized boolean findByNameAndIP(EventoCTM eventoCTM) {
		
		EventoCTM resultado = null;
		
		Query query = em
				.createQuery("from br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM where REQUEST.CONTENT.HARDWARE.NAME='"
						+ eventoCTM.getREQUEST().getCONTENT().getHARDWARE().getNAME() + "' and IPADDR='"+
						eventoCTM.getREQUEST().getCONTENT().getHARDWARE().getIPADDR()+"'");

		
		return query.getResultList().size()>0;
		
		
		
	}
	
	public synchronized void findByNameAndIPAndPersist(EventoCTM eventoCTM) {
		
		EventoCTM resultado = null;
		
		Query query = em
				.createQuery("from br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM where REQUEST.CONTENT.HARDWARE.NAME='"
						+ eventoCTM.getREQUEST().getCONTENT().getHARDWARE().getNAME() + "' and IPADDR='"+
						eventoCTM.getREQUEST().getCONTENT().getHARDWARE().getIPADDR()+"'");

		
		if (query.getResultList().size()==0) {
			salvar(eventoCTM);
		}
		
		
		
	}
	

	public void excluir(EventoCTM p) {

		Query query = em
				.createQuery("delete FROM br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM p where p.id='"
						+ String.valueOf(p.getId()) + "'");

		query.executeUpdate();
		propEventSrc.fire(p);

	}
}
