package trenes;

public class Tren implements Runnable { 
	// TAREA (runnable)
	private String nombre;
	private Tramo tramo;
	private boolean direccionIzqDer; // true -> izq a der ; uso booleano por facilidad

	/**
	 * 
	 * @param nombre del tren
	 * @param tramo por el que va a pasar
	 * @param direccion (true -> izq a der ; uso booleano por facilidad)
	 */
	public Tren(String nombre, Tramo tramo, boolean direccion) {
		this.nombre = nombre;
		this.tramo = tramo;
		this.direccionIzqDer = direccion;
	}
	
	public void pasarPorTramo(Tramo tramo) {
		try {
			tramo.pasaTren(this);
		}
		catch (InterruptedException e) {
			System.out.println("Falló algo mano ");
		}		
	}
	
	@Override
	public void run() {
		pasarPorTramo(tramo);
		
/*		for (int i=0;i<10;i++) {
//			System.out.println(this + "\nIteración n°" + i);
			pasarPorTramo(tramo);
		} */

	}
	
	@Override
	public String toString() {
		String cadena = "Tren \"" + nombre + "\" que va de ";
		if (direccionIzqDer)
			cadena += "Izquierda a Derecha";
		else
			cadena += "Derecha a Izquierda";
		return cadena;
	}

	public String getNombre() {
		return nombre;
	}

	public Tramo getTramo() {
		return tramo;
	}

	public boolean isDireccionIzqDer() {
		return direccionIzqDer;
	}
	
}
