package br.com.centralit.evm.citsmartevm.dao;

import br.com.centralit.evm.citsmartevm.entity.SimpleProperty;

public interface ISimplePropertyDAO {

	void excluir(SimpleProperty p);

	void salvar(SimpleProperty p);

}
