package br.com.centralit.evm.classesutilitarias;

public class TratamentoDeStrings {

	/**
	 * Utiliza regex para retirar espaços no início e no final da String
	 * @param input
	 * @return
	 */
	public static String retirarEspacosEmBranco(String input) {
		if (input==null) {return "";}
		return input.replaceAll("^\\s+", "").replaceAll("\\s+$", "");		
		
	}
	
}
