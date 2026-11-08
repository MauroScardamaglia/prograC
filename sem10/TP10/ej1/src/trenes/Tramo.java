package trenes;

public class Tramo { 
	// RECURSO COMPARTIDO
	private boolean sePuedePasar;
	private String nombre;
	// monitor implícito único para toda la instancia

	public Tramo(String nombre) {
		this.sePuedePasar = true;
		this.nombre = nombre;
	}
	

	public synchronized void pasaTren(Tren tren) throws InterruptedException {
		while (!sePuedePasar) {
			wait();
		}
		sePuedePasar = false; // la estoy ocupando yo ahora flaco
		// es necesaria la línea de arriba?
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- \n" + tren + " pasa por " + this + "\n--- --- --- --- --- --- --- --- --- --- --- --- --- \n");
		sePuedePasar = true; // bueno, ya está, ya la usé
		notifyAll();
	}
	
	
	@Override
	public String toString() {
		return "Tramo <" + nombre + ">";
	}
}
