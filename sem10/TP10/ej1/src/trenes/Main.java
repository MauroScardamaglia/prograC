package trenes;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		Tramo tramo = new Tramo("Mentón & Bariloche");
		Tren trenA = new Tren("La Carloneta",tramo,true);
		Tren trenB = new Tren("La Máquina Furiosa",tramo,false);
		Tren trenC = new Tren("La Tucumana",tramo,true);
		Tren trenD = new Tren("La escandalosa",tramo,true);
		Tren trenE = new Tren("Fructífero",tramo,false);
		Tren trenF = new Tren("Schwarze Hole",tramo,true);

		Thread hilo1 = new Thread(trenA);
		Thread hilo2 = new Thread(trenB);
		Thread hilo3 = new Thread(trenC);
		Thread hilo4 = new Thread(trenD);
		Thread hilo5 = new Thread(trenE);
		Thread hilo6 = new Thread(trenF);
		
		ArrayList<Thread> hilos = new ArrayList<>();
		hilos.add(hilo1);
		hilos.add(hilo2);
		hilos.add(hilo3);
		hilos.add(hilo4);
		hilos.add(hilo5);
		hilos.add(hilo6);
		
		
		for (Thread hilo : hilos) {
			hilo.start();
		}

	
	}
}
