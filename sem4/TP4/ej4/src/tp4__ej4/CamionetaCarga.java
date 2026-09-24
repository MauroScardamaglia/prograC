package tp4__ej4;

public class CamionetaCarga extends Vehiculo {
	private double PMA;

	// precondición
	// PMA tiene que recibir un double >= 0
	public CamionetaCarga(String patente, int cantDias, double PMA) {
		super(patente,cantDias);
		this.PMA = PMA;
	}
	
	@Override
	public double calcularCosto() {
		return cantDias * costoDiario * (1 + 0.20 * PMA);
	}
	
	@Override
	public String toString() {
		return "Camioneta de Carga\n" + super.toString() + "\nPeso Máximo Autorizado: " + PMA + 
		" toneladas\nIncremento diario del " + 0.20 * PMA + "%";
	}
}
