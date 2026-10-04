package excepBanco;

public class ExtraccionInvalidaException extends Exception {
	private static String descrip = "Extracción Invalida";
	private String tipoError;
	private DatoExtraccionInvalida dato;
	
	public ExtraccionInvalidaException(DatoExtraccionInvalida dato,String tipoError) {
		super(descrip);
		this.dato = dato;
		this.tipoError = tipoError;
	}
	
	public DatoExtraccionInvalida getDato() {
		return dato;
	}
	
	public String getInf() {
		return descrip + ": " + tipoError + "\n" + dato;
	}
}
