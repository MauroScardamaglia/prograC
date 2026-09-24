package tp4__ej4;

public class Vehiculo {
	protected String patente;
	protected double costoDiario = 500;
	protected int cantDias;

	// precondición
	// patente no nula ni vacia
	// cantDias >= 0
	public Vehiculo(String patente,int cantDias) {
		this.patente = patente;
		this.cantDias = cantDias;
	}
	
	@Override
	public String toString() {
		return "Patente: " + patente + "\nCosto Diario = $" + costoDiario +
		"\nCantidad de Días: " + cantDias;
	}
	
	// postcondición
	// tiene que devolver un double >= 0
	public double calcularCosto() {
		return cantDias * costoDiario;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCostoDiario() {
		return costoDiario;
	}

	public void setCostoDiario(double costoDiario) {
		this.costoDiario = costoDiario;
	}
	
}
