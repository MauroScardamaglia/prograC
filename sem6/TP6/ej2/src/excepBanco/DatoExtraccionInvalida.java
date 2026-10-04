package excepBanco;

public class DatoExtraccionInvalida extends Exception {
	private double saldo, extraccionSolicitada;
	
	public DatoExtraccionInvalida(double saldo, double extraccionSolicitada) {
		super();
		this.saldo = saldo;
		this.extraccionSolicitada = extraccionSolicitada;
	}
	public double getSaldo() {
		return saldo;
	}
	public double getExtraccionSolicitada() {
		return extraccionSolicitada;
	}
	@Override
	public String toString() {
		return "Saldo: " + saldo + "\nExtracción Solicitada: " + extraccionSolicitada;
	}
}
