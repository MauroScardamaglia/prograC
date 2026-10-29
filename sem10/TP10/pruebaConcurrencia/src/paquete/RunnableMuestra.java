package paquete;

public class RunnableMuestra implements Runnable {
	int numerito;
	
	public RunnableMuestra(int num) {
		this.numerito = num;
	}
	
	@Override
	public void run() {
		while (true) {
			System.out.println(numerito);				
		}
	}
}