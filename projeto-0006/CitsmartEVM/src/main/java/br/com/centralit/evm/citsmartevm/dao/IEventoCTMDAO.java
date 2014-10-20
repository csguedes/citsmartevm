package br.com.centralit.evm.citsmartevm.dao;

import br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM;

public interface IEventoCTMDAO {

	void excluir(EventoCTM p);

	void salvar(EventoCTM p);

	boolean findByNameAndIP(EventoCTM eventoCTM);

	void findByNameAndIPAndPersist(EventoCTM eventoCTM);

}
