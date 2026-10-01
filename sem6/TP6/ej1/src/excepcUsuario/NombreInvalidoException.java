package excepcUsuario;

public class NombreInvalidoException extends Exception {
	// private ___ dato; // si quiero agregar un dato
	private static String descrip = "Nombre Inválido";
	private String tipoError;
	
	public NombreInvalidoException(String tipoError) {
		super("Nombre Inválido");
		this.tipoError = tipoError;
	}
	
	public String getTipoError() {
		return descrip + "\n" + tipoError;
	}
	
}
