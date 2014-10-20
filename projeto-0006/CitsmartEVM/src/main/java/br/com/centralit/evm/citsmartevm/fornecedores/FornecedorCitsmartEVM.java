package br.com.centralit.evm.citsmartevm.fornecedores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.event.Reception;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.centralit.evm.citsmartevm.entity.SimpleProperty;
import br.com.centralit.evm.citsmartevm.repository.RepositoryManager;

/**
 * 
 * @author cristian.guedes
 * Um fornecedor é um atributo ou um método de um bean que, como o próprio nome indica, fornece um
 * objeto que é necessário para o funcionamento de outro bean
 * São os beans que contem um método com a anotação @Produces
 */
@RequestScoped
public class FornecedorCitsmartEVM implements IFornecedorCitsmartEVM{
	@Inject
	RepositoryManager db;

	private List<SimpleProperty> propertyList;

	public void onMemberListChanged(
			@Observes(notifyObserver = Reception.IF_EXISTS) final SimpleProperty member) {
		retrieveAllSeatsOrderedByName();
	}

	@Produces
	@Named
	public List<SimpleProperty> getPropertyList() {
		return propertyList;
	}

	public void setProperty(List<SimpleProperty> property) {
		this.propertyList = propertyList;
	}

	@PostConstruct
	public void retrieveAllSeatsOrderedByName() {

		propertyList = db.queryCache();

	}

}