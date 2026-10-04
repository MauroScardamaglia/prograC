package excepBanco;

public class CuentaBancaria {
	private double saldo;
	private String titular;
	
	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo = 0;
	}
	
	void depositar(double cantidad) throws DepositoInvalidoException {
		if (cantidad > 0)
			this.saldo += cantidad;
		else {
			throw new DepositoInvalidoException(cantidad,"Cantidad Negativa");
		}
	}
	public void extraer(double cantidad) throws ExtraccionInvalidaException {
		if (cantidad <0)
			throw new ExtraccionInvalidaException(new DatoExtraccionInvalida(saldo,cantidad),"La cantidad no es positiva");
		else
			if (saldo - cantidad >= 0)
				saldo -= cantidad;
			else
				throw new ExtraccionInvalidaException(new DatoExtraccionInvalida(saldo,cantidad),"La Cantidad supera el Saldo");
	}	
	public double getSaldo() {
		return saldo;
	}
	public String getTitular() {
		return titular;
	}
	@Override
	public String toString() {
		return "Titular: " + titular + "\nSaldo: " + saldo;
	}
}
