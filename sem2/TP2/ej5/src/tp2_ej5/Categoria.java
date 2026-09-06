package tp2_ej5;

public class Categoria {
	private String nombreCategoria;
	private double sueldo;
	
	public Categoria(String nombreCategoria, double sueldo) {
		super();
		this.nombreCategoria = nombreCategoria;
		this.sueldo = sueldo;
	}
	
	@Override
	public String toString() {
		return "Categoría: " + nombreCategoria + "\nSueldo: $" + sueldo;
	}

	public String getNombreCategoria() {
		return nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
}
