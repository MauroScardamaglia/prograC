package tp4__ej4;

public class Auto extends Vehiculo{
	
	public Auto(String patente,int cantDias) {
		super(patente,cantDias);
//		setCostoDiario( getCostoDiario() * (1 + 0.015) );
	}
	
	@Override
	public double calcularCosto() {
		return cantDias * costoDiario * (1 + 0.015);
	}
	
	@Override
	public String toString() {
		return "Auto\n" + super.toString() + "\nIncremento diario del 1.5%";
	}
}
