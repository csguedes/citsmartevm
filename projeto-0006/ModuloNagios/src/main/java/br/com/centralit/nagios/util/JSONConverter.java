package br.com.centralit.nagios.util;

import java.io.IOException;

import br.com.centralit.nagios.livestatus.actions.LS_TablesBase;
import br.com.centralit.nagios.livestatus.tables.Contacts;
import br.com.centralit.nagios.livestatus.tables.Hosts;
import br.com.centralit.nagios.livestatus.tables.Services;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Converter JSON utilizando Jackson
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public final class JSONConverter {

	private JSONConverter() {
	}

	private static final ObjectMapper objectMapper = new ObjectMapper();

	static {
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.setSerializationInclusion(Include.NON_EMPTY);
		objectMapper.setSerializationInclusion(Include.NON_DEFAULT);	
	}

	public static <T> T fromJson(final String json, final Class<T> clazz) {
		try {
			return objectMapper.readValue(json, clazz);
		} catch (final IOException e) {
			throw new IllegalArgumentException("Erro ao fazer o parse do json " + json, e);
		}
	}

	public static String toJson(final Object object) {
		try {
//			return objectMapper.
			return objectMapper.writeValueAsString(object);
 
		} catch (final IOException e) {
			throw new IllegalArgumentException("Erro ao fazer o parse do objeto" + object, e);
		}
	}
	
    public static LS_TablesBase getObjects(String object){
    	switch (object)
    	{
    		case "hosts": return new Hosts();
    		case "services": return new Services();
    		case "contacts": return new Contacts();
    	}
    	
    	return null;	    
    }
}
