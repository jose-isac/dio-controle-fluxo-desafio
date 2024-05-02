package exceptions;

/** 
 * Esta exceção deve ser lançada em casos onde os argumentos
 * de uma função são invalidos.
 * 
 * @author isac
 * @since 2024-05-02
 * 
 * */

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public ParametrosInvalidosException(String message) {
		super(message);
	}

}
