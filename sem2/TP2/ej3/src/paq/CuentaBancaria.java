package paq;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular) {
		this.titular = titular;
		this.saldo = 0;
	}
	
	public void depositar(double monto) {
		if (monto >= 0)
			saldo += monto;
	}
	
	public boolean extraer(double monto) {
		if (monto < 0)
			return false;
		else {
			if (saldo >= monto)
				saldo -= monto;
			return saldo >= monto;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
}
