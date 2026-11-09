package externosABiblioteca;

import java.util.ArrayList;
import bibliotecaLibros.Biblioteca;
import bibliotecaLibros.Libro;

public class Prueba {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El Problema de los 3 Cuerpos");
		Libro libro2 = new Libro("El Bosque Oscuro");
		Libro libro3 = new Libro("El Fin de la Muerte");
		Libro libro4 = new Libro("Mafalda");
		Libro libro5 = new Libro("Dune");

		Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarLibro(libro4);
		biblioteca.agregarLibro(libro1);
		biblioteca.agregarLibro(libro5);
		biblioteca.agregarLibro(libro2);
		biblioteca.agregarLibro(libro3);
		
		ArrayList<Socio> socios = new ArrayList<>();
		socios.add(new Socio("Mauro Scardamaglia",3,biblioteca));
		socios.add(new Socio("Nicolás Ramallo",5,biblioteca));
		socios.add(new Socio("Renzo Gijón",3,biblioteca));
		socios.add(new Socio("Martín Girau",7,biblioteca));
		socios.add(new Socio("Nazareno Lasso",1,biblioteca));
		
		socios.add(new Socio("Ianai Gribman",4,biblioteca));
		socios.add(new Socio("Gian Arrigoni",2,biblioteca));
		socios.add(new Socio("Lucas Del Piero",4,biblioteca));
		socios.add(new Socio("Santiago Sulca",2,biblioteca));
		socios.add(new Socio("Dua Lipa",5,biblioteca));

		ArrayList<Thread> hilos = new ArrayList<>();
		for (Socio socio : socios)
			hilos.add(new Thread(socio));
		
		for (Thread hilo : hilos) {
			hilo.start();
			try { Thread.sleep(500); } 
			catch (InterruptedException e) {}
		}
	}

}
