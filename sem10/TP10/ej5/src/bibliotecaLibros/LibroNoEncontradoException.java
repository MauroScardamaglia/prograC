package bibliotecaLibros;

public class LibroNoEncontradoException extends Exception {

	public LibroNoEncontradoException() {
		super("Se ingresó un id de libro inválido");
	}
}
