package trenes;

public class Tren implements Runnable { 
	// TAREA (runnable)
	private String nombre;
	private Tramo tramo;
	
	public Tren(String nombre, Tramo tramo) {
		this.nombre = nombre;
		this.tramo = tramo;
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
		for (int i=0;i<10;i++) {
			System.out.println(this + "\nIteración n°" + i);
			pasarPorTramo(tramo);
		}

	}
	
	@Override
	public String toString() {
		return "Tren \"" + nombre + "\"";
	}
}
