package br.com.centralit.evm.correlacaoeventos.util;

import br.com.centralit.evm.citsmartevm.entity.EventoBasico;
import br.com.centralit.evm.citsmartevm.entity.ctm.EventoCTM;
import br.com.centralit.evm.citsmartevm.entity.legado.EventoLegado;
import br.com.centralit.evm.citsmartevm.entity.nagios.EventoNagios;
import br.com.centralit.evm.citsmartevm.entity.nagios.Hosts;



public class XMLJSONUtils {

	public static EventoBasico XMLToPojo(String xml) {
		EventoBasico resultado = null;
		
		if (xml.contains("REQUEST")) {
			
			try {
				JaxbUtils<EventoCTM> xmlToPojo = new JaxbUtils<EventoCTM>(EventoCTM.class); 
				EventoCTM eventoCTM = xmlToPojo.xmlToObject(xml);
				
				eventoCTM.setOrigem("Cistmart Monitor");
				eventoCTM.setMensagem("Mensagem padrão Cistmart Monitor");
				eventoCTM.setClassificacao("Information");
				eventoCTM.setTipo("Evento do Citsmart Monitor");
				resultado = eventoCTM;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if (xml.contains("EventoLegado")) {
			
			try {
				JaxbUtils<EventoLegado> xmlToPojo = new JaxbUtils<EventoLegado>(EventoLegado.class); 
				EventoLegado eventoLegado = xmlToPojo.xmlToObject(xml);
				resultado = eventoLegado;
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return resultado;
		
	}
	
	
	public static EventoBasico jsonToPOJO(String json) {
		EventoBasico resultado = null;
		
		Hosts hosts = JSONConverter.fromJson(json, Hosts.class);
		
		if (hosts!=null) {
			EventoNagios eventoNagios = new EventoNagios();
			eventoNagios.setOrigem("EventoNagios");
			eventoNagios.setHosts(hosts);
			resultado = eventoNagios;
			
		}
		
		return resultado;
		
	}
 	
	
}
