package br.com.centralit.evm.citsmartevm.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.centralit.evm.citsmartevm.dao.SimplePropertyDAO;
import br.com.centralit.evm.citsmartevm.dao.ISimplePropertyDAO;
import br.com.centralit.evm.citsmartevm.entity.SimpleProperty;
import br.com.centralit.evm.citsmartevm.fornecedores.FornecedorCitsmartEVM;


/**
 * 
 * @author cristian.guedes
 * O "Manager" é como se fosse o ajax forms no Citsmart
 * As páginas JSF interagem diretamente com os beans que estão anotados como @Model 
 */
@Model
public class CadastroConfiguracoes implements ICadastroConfiguracoes{

	@Inject
	ISimplePropertyDAO ejb;

	@Produces
	@Named
	SimpleProperty property;

	@Inject
	FornecedorCitsmartEVM producer;

	/**
	 * Coloque aqui neste método tudo o que deve acontecer depois que acontecer a injeção de dependência
	 */
	@PostConstruct
	public void inicializarCadastro() {
		property = new SimpleProperty();

		
		
		
		
	}

	public void salvar() {
		ejb.salvar(property);
		inicializarCadastro();
	}

	public void excluir(SimpleProperty property) {
		ejb.excluir(property);

	}
	
 

}
