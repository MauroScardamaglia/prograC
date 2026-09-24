package paqTemplate;

public class CuentaCorriente extends Template {
	// hereda de CuentaBancaria los atributos titular y saldo
	private double tope;
	
	public CuentaCorriente(String titular, double tope) {
		super(titular);
		this.tope = tope;
	}
	
	@Override
	public boolean extraer(double monto) {
		if (saldo - monto >= -tope) {
			saldo -= monto;
			return true;
		}
		else
			return false;
	}
	
	public double getTope() {
		return tope;
	}
	
	public void setTope(double tope) {
		this.tope = tope;
	}
}
