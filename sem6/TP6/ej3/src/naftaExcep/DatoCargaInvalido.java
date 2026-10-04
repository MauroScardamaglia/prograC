package naftaExcep;

public class DatoCargaInvalido {
	private double cantidadDisponible, cantidadRequerida;
	private String combustible;
	
	public DatoCargaInvalido(double cantidadDisponible, double cantidadRequerida, String combustible) {
		super();
		this.cantidadDisponible = cantidadDisponible;
		this.cantidadRequerida = cantidadRequerida;
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "Combustible: " + combustible + "\nCantidad Disponible: " + cantidadDisponible +
				"\nCantidad Requerida: " + cantidadRequerida;
	}
	
	public double getCantidadDisponible() {
		return cantidadDisponible;
	}
	public double getCantidadRequerida() {
		return cantidadRequerida;
	}
	public String getCombustible() {
		return combustible;
	}	
}
