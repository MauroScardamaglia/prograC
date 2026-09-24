package tp4__ej4;

public class Combi extends Vehiculo {
	
	public Combi(String patente,int cantDias){
		super(patente,cantDias);
	}
	
	@Override
	public double calcularCosto() {
		return cantDias * costoDiario + 0.02 * costoDiario;
	}
	
	@Override
	public String toString() {
		return "Combi\n" + super.toString() + "\nIncremento fijo del 2.0%";
	}
}
