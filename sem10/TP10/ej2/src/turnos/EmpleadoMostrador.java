package turnos;

public class EmpleadoMostrador { // RECURSO COMPARTIDO
	private int cantClientes;
	private int siguienteCliente;
	
	public EmpleadoMostrador(int cantClientes) {
		this.cantClientes = cantClientes;
		this.siguienteCliente = 1;
	}
	
	public synchronized void atenderCliente(Cliente cliente) throws InterruptedException {
		while (siguienteCliente != cliente.getNroTicket()) {
			wait();
		}
	
		System.out.println("--> Se atiende a " + cliente  + "\n");
		siguienteCliente++;
		if (siguienteCliente == cantClientes + 1) {
			siguienteCliente = 1;
			System.out.println("--- ---- ---\n");
		}
		notifyAll();
	}
}
