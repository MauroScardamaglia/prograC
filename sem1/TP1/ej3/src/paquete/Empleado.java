package paquete;

public class Empleado
{
	private String nombre;
	private int antiguedad, hsTrabajadas;
	private Categoria cat;

	public Empleado(String nombre, int antiguedad, int hsTrabajadas, Categoria cat) {
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.hsTrabajadas = hsTrabajadas;
		this.cat = cat;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public int getHstrabajadas() {
		return hsTrabajadas;
	}
	
	public void setHsTrabajadas(int hsTrabajadas) {
		this.hsTrabajadas = hsTrabajadas;
	}
	
	public Categoria getCat() {
		return cat;
	}
	
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	
	public double getSueldo() {
		double aux;
		aux = this.cat.getSueldoPorHora() * this.hsTrabajadas;
		if (this.antiguedad > 5) {
			if (this.antiguedad < 10)
				aux*= 1.25;
			else
				aux*= 1.35;
		}
		return aux;
	}
	
	
	String detalle() {
		String retorno =
				"Nombre: " + this.nombre + "\nAntiguedad: " + this.antiguedad + " años\nHoras trabajadas: " +
				this.hsTrabajadas + "\nTipo de categoria: " + this.cat.getNombreCategoria() + "\nSueldo por hora: " +
				this.cat.getSueldoPorHora() + "\nSueldo a cobrar: " + this.getSueldo() + "\n";
		return retorno; // juas juas
	}	
	
}