package bibliotecaLibRev;

public class IdInvalidoException extends Exception {
	
	public IdInvalidoException() {
		super("Se ingresó un id de libro inválido");
	}
}
