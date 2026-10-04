package clonPackage;

public class ConjuntoNumeros implements Cloneable {
	Numero[] numeros;
	private int largo;
	private String nombre;
	
	public ConjuntoNumeros(String nombre, int largo) {
		super();
		this.nombre = nombre;
		this.largo = largo;
		this.numeros = new Numero[largo];
	}
	
	@Override
	public ConjuntoNumeros clone() throws CloneNotSupportedException {
		try {
			ConjuntoNumeros copia = (ConjuntoNumeros) super.clone();
			copia.setNumeros(this.numeros.clone());
			return copia;
		}
		catch (CloneNotSupportedException e){
			throw e;
		}
	}
	
	@Override
	public String toString() {
		String aux = nombre + "\nLargo: " + largo + "\n[";

		for (Numero x:numeros) {
			aux += x + "\t";
		}

		aux += "]";
		return aux;
	}
	
	public Numero[] getNumeros() {
		return numeros;
	}
	public int getLargo() {
		return largo;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNumeros(Numero[] numeros) {
		this.numeros = numeros;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
