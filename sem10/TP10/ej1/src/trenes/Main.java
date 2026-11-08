package trenes;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		Tramo tramo = new Tramo("Mentón & Bariloche");
		Tren trenA = new Tren("La Carloneta",tramo);
		Tren trenB = new Tren("La Máquina Furiosa",tramo);

		Thread hilo1 = new Thread(trenA);
		Thread hilo2 = new Thread(trenB);
		
		hilo1.start();
		hilo2.start();

	
	}
}
