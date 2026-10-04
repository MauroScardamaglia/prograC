package excepBanco;

public class DepositoInvalidoException extends Exception {
	private static String descrip = "Deposito Invalido";
	private String tipoError;
	private double cantidadInvalida;
	
	public DepositoInvalidoException(double cantidadInvalida,String tipoError) {
		super(descrip);
		this.cantidadInvalida = cantidadInvalida;
		this.tipoError = tipoError;
	}	
	public double getCantidadInvalida() {
		return cantidadInvalida;
	}
	public String getInf() {
		return descrip + ": " + tipoError;
	}
}
