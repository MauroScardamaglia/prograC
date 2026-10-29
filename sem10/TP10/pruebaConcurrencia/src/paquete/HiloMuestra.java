package paquete;

public class HiloMuestra extends Thread {
	int numerito;
	
	public HiloMuestra(int num) {
		this.numerito = num;
	}
	
	@Override
	public void run() { //throws InterruptedException { // no le tengo que dar mucha bola a las excepciones (me dijo LDL)
		while (true) {
			System.out.println(numerito);
			try {
				Thread.sleep(500); // el sleep cede el procesamiento a otro hilo, pero mantiene el "agarre" sobre un recurso compartido
				this.wait(); // el wait cede completamente, tanto el procesamiento como el "agarre" sobre un recurso compartido
			}
			catch(InterruptedException e) {
				
			}
		}
	} // el sleep se hace desde el Thread (es estático)
	  // el wait se hace desde la referencia actual (this.wait() <-> wait() )
}