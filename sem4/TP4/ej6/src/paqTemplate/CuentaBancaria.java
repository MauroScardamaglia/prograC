package paqTemplate;

public class CuentaBancaria {
	private String titular;
	protected double saldo = 0;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
	}

	public boolean extraer(double monto) {
		if (saldo - monto >= 0) {
			saldo -= monto;
			return true;
		}
		else
			return false;
	}
	
	public void depositar(double monto) {
		saldo += monto;
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}

}
