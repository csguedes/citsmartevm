package br.com.centralit.evm.citsmartevm.dao;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.centralit.evm.citsmartevm.entity.SimpleProperty;

/**
 * 
 * @author cristian.guedes
 * a Stateless EJB which will carry on transactional jobs (Inserts, Deletes)
 *
 */
@Stateless
public class SimplePropertyDAO implements ISimplePropertyDAO {

	@Inject
	private Event<SimpleProperty> propEventSrc;

	@Inject
	private EntityManager em;

	public void salvar(SimpleProperty p) {

		em.persist(p);
		propEventSrc.fire(p);
	}

	public void excluir(SimpleProperty p) {

		Query query = em
				.createQuery("delete FROM br.com.centralit.evm.citsmartevm.entity.SimpleProperty p where p.key='"
						+ p.getKey() + "'");

		query.executeUpdate();
		propEventSrc.fire(p);

	}
}
