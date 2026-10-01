package excepcUsuario;

public class ContraseñaInvalidaException extends Exception {
	private static String descrip = "Contraseña Inválida";
	private String tipoError;
	
	public ContraseñaInvalidaException(String tipoError) {
		super("Contraseña Invalida");
		this.tipoError = tipoError;
	}
	
	public String getTipoError() {
		return descrip + "\n" + tipoError;
	}
}
