package clonPackage;

public class ConjuntoNumeros implements Cloneable {
	private int[] celdas;
	private int largo;
	private String nombre;
	
	public ConjuntoNumeros(String nombre, int largo) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.celdas = new int[largo];
	}
	
	@Override
	public ConjuntoNumeros clone() throws CloneNotSupportedException {
		try {
			ConjuntoNumeros copia = (ConjuntoNumeros) super.clone();
			copia.setCeldas(this.celdas.clone());
			return copia;
		}
		catch (CloneNotSupportedException e){
			throw e;
		}
	}
	
	@Override
	public String toString() {
		String aux = nombre + "\nLargo: " + largo + "\n[";

		for (int x:celdas) {
			aux += x + "\t";
		}

		aux += "]";
		return aux;
	}
	
	public int[] getCeldas() {
		return celdas;
	}
	public int getLargo() {
		return largo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setCeldas(int[] celdas) {
		this.celdas = celdas;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
