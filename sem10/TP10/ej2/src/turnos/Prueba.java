package turnos;
import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		final int cantClientes = 10;
		
		EmpleadoMostrador empleado = new EmpleadoMostrador(cantClientes);
		ArrayList<Thread> hilos = new ArrayList<>();
		
		Cliente pj1 = new Cliente("Ye Wenjie",empleado);
		Cliente pj2 = new Cliente("Ding Yi",empleado);
		Cliente pj3 = new Cliente("Wang Miao",empleado);
		Cliente pj4 = new Cliente("Da Shi",empleado);
		Cliente pj5 = new Cliente("Luo Ji",empleado);
		
		Cliente pj6 = new Cliente("Rey Diaz",empleado);
		Cliente pj7 = new Cliente("Yun Tianming",empleado);
		Cliente pj8 = new Cliente("Cheng Xin",empleado);
		Cliente pj9 = new Cliente("Ai AA",empleado);
		Cliente pj10 = new Cliente("Tomoko",empleado);
		
		hilos.add(new Thread(pj5));
		hilos.add(new Thread(pj8));
		hilos.add(new Thread(pj1));
		hilos.add(new Thread(pj4));
		hilos.add(new Thread(pj7));
		
		hilos.add(new Thread(pj9));
		hilos.add(new Thread(pj2));
		hilos.add(new Thread(pj10));
		hilos.add(new Thread(pj3));
		hilos.add(new Thread(pj6));
		
		for (Thread hilo : hilos)
			hilo.start();
		
	}

}
