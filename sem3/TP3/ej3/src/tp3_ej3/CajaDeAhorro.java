package tp3_ej3;

public class CajaDeAhorro extends CuentaBancaria{
	private static int cantMaxExtracc = 10;
	private int cantExtraccMens;
	
	public CajaDeAhorro(String titular) {
		super(titular);
		this.cantExtraccMens = 0;
	}
	
	@Override
	public boolean extraer(double monto) {
		if ((cantExtraccMens < cantMaxExtracc) && (saldo - monto >= 0)) {
			saldo -= monto;
			cantExtraccMens++;
			return true;
		}
		else
			return false;
	}
	
	public int getCantExtraccMens() {
		return cantExtraccMens;
	}
	
	public void nuevoMes() {
		this.cantExtraccMens = 0;
	}
}
