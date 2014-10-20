package br.com.centralit.evm.citsmartevm.fornecedores;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * 
 * @author cristian.guedes
 * a CDI Producer Bean used to instantiate container resources (The Entity Manager)
 *
 */
public class GenericProducer {
	@SuppressWarnings("unused")
	@Produces
	@PersistenceContext
	private EntityManager em;
}
