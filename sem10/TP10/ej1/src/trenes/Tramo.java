package trenes;

public class Tramo { // recurso compartido
	private boolean disponible;
	private String nombre;

	public Tramo(String nombre) {
		this.disponible = true;
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return nombre;
	}
	
	public synchronized void pasaTren()
}
