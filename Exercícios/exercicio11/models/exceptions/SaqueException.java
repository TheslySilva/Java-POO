package exercicio11.models.exceptions;

public class SaqueException extends Exception {
	
	public static final long serialVersionUID = 1L;
	
	public SaqueException(String msg){
		super(msg);
	}
}