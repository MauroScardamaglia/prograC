package paquete;

public class Main {

	public static void main(String[] args) {
		HiloMuestra hilo1 = new HiloMuestra(0);
		HiloMuestra hilo2 = new HiloMuestra(1);
		
 //		hilo1.start();
 //		hilo2.start();
		// equivalente a new HiloMuestra(0).start()
		
		new Thread(new RunnableMuestra(0)).start();
		new Thread(new RunnableMuestra(1)).start();
	}
}