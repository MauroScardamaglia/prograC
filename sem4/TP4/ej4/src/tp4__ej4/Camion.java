package tp4__ej4;

public class Camion extends Vehiculo {
	
	public Camion(String patente, int cantDias) {
		super(patente,cantDias);
	}
	
	@Override 
	public double calcularCosto(){
		return cantDias * costoDiario + costoDiario * (1 + 0.40);
	}
	
	@Override
	public String toString() {
		return "Camion\n" + super.toString() + "\nIncremento fijo del 4.0%";
	}
}
