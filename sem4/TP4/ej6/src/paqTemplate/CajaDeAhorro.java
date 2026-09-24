package paqTemplate;

public class CajaDeAhorro extends Template {
	private final static int cantMaxExtracc = 10;
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
