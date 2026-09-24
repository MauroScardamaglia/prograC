package paqTemplate;

public class CuentaUniversitaria extends CuentaBancaria {
	private double extraccDia;
	private static double maxDiario = 1000;
	
	public CuentaUniversitaria(String titular) {
		super(titular);
		extraccDia = 0;
	}
	
	@Override
	public boolean extraer(double monto) {
		if((extraccDia + monto <= maxDiario) && (saldo - monto >= 0)) {
			saldo -= monto;
			extraccDia += monto;
			return true;
		}
		else
			return false;
	}
	
	public void nuevoDia() {
		extraccDia = 0;
	}
	
	public double getExtraccDia() {
		return extraccDia;
	}
	
}
