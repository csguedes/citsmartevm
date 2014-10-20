package br.com.centralit.evm.citsmartevm.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.centralit.evm.citsmartevm.entity.SimpleProperty;

/**
 * 
 * @author cristian.guedes
 * a CDI Bean used to perform queries and populate SimpleProperty objects
 *
 */
public class RepositoryManager {

	@Inject
	private EntityManager em;

	public List<SimpleProperty> queryCache() {
		Query query = em
				.createQuery("FROM com.csg.model.SimpleProperty");

		List<SimpleProperty> list = query.getResultList();
		return list;
	}
}
