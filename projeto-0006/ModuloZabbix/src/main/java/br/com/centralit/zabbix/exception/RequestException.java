package br.com.centralit.zabbix.exception;

/**
 * Exceção lançada ao ocorrer algum problema na requisição HTTP
 * 
 * @created 23/07/2014
 * @author Bruno César Ribeiro e Silva - <a href="mailto:bruno@brunocesar.com">bruno@brunocesar.com</a>
 */
public class RequestException extends Exception {

	private static final long serialVersionUID = 6485754414874782103L;

	public RequestException(final String mensagem) {
		super(mensagem);
	}

	public RequestException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
