package turnos;

public class Cliente implements Runnable { // TAREA / quien quiere ACCEDER al recurso compartido
	private static final int CANT_VUELTAS = 3;
	private static int sigNroTicket = 1;
	private int nroTicket;
	private EmpleadoMostrador empleadoMostrador;
	private String nombre;
	
	public Cliente(String nombre, EmpleadoMostrador empleadoMostrador) {
		this.empleadoMostrador = empleadoMostrador;
		this.nroTicket = sigNroTicket;
		sigNroTicket++;
		this.nombre = nombre;
	}
	
	
	@Override
	public void run() {
		for (int i=1;i<=CANT_VUELTAS;i++) {
			try { 
				System.out.println("|-| Iteración " + i + " de " + this + "\n");
				empleadoMostrador.atenderCliente(this);
				Thread.sleep(2500); 
				System.out.println();
			}
			catch (InterruptedException e) { System.out.println("Falló algo mano"); }
		}
	}

	@Override
	public String toString() {
		return "\"" + nombre + "\" con ticket " + nroTicket;
	}
	
	public int getNroTicket() {
		return nroTicket;
	}

}