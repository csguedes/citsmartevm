package br.com.centralit.evm.citsmartevm.util;

import java.util.ArrayList;
import java.util.List;

import br.com.centralit.evm.citsmartevm.entity.Tarefas;


public class MapaMemoria {
	private static MapaMemoria instance = null;
	public static String resultado = null;
	public static List<Tarefas> tarefasAgendadas;
	
	protected MapaMemoria() {
		// Apenas para evitar a instanciacao
	}

	public static MapaMemoria getInstance() {
		if (instance == null) {
			instance = new MapaMemoria();
			tarefasAgendadas = new ArrayList<Tarefas>();
			

		}
		return instance;
	}
	
	
	public static void atualizarTarefasAgendadas(List<Tarefas> tarefas) {
		tarefasAgendadas = tarefas;
	}
	
	

	
	

	
	
	
	
}