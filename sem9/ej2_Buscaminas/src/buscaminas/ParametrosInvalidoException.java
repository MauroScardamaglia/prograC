package buscaminas;

public class ParametrosInvalidoException extends Exception {
	private String dato;
	public ParametrosInvalidoException(String dato) {
		super("Parametros del Constructor Parametros Inválidos " + dato);
		this.dato = dato;
	}
	public String getInfo() {
		return dato;
	}
}
