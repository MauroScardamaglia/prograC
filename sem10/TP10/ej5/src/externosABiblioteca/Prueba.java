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
		
		Libro libro6 = new Libro("Dune: Mesias"); // donado
		Libro libro7 = new Libro("El Arte de la Guerra"); // donado
		Libro libro8 = new Libro("El Arte de tener la razón"); // donado
		Libro libro9 = new Libro("Moby Dick"); // donado
		Libro libro10 = new Libro("Física Moderna"); // donado
		Libro libro11 = new Libro("Ein Reise durch Zeit"); // donado
		Libro libro12 = new Libro("IT"); // donado
		Libro libro13 = new Libro("Peter Pan"); // donado
		Libro libro14 = new Libro("El Antigüo Testamento"); // donado
		Libro libro15 = new Libro("El Corán"); // donado
		Libro libro16 = new Libro("El Toráh"); // donado
		
		
		try {
			biblioteca.donarLibro(libro4);
			biblioteca.donarLibro(libro1);
			biblioteca.donarLibro(libro5);
			biblioteca.donarLibro(libro2);
			biblioteca.donarLibro(libro3);

			biblioteca.donarLibro(libro6);
			biblioteca.donarLibro(libro9);
			biblioteca.donarLibro(libro12);
			biblioteca.donarLibro(libro13);
			biblioteca.donarLibro(libro10);
		}
		catch (InterruptedException e) {}
		
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

		ArrayList<Donador> donadores = new ArrayList<>();
			donadores.add(new Donador("Mauro Scardamaglia",biblioteca,libro11));
			donadores.add(new Donador("Nicolás Ramallo",biblioteca,libro16));
			donadores.add(new Donador("Sandra Cirimello",biblioteca,libro8));
			donadores.add(new Donador("Tsun Zu",biblioteca,libro7));
			donadores.add(new Donador("El Cuervo Francisco",biblioteca,libro14));
		
		for (Donador donador : donadores)
			hilos.add(new Thread(donador));
		
		for (Thread hilo : hilos) {
			hilo.start();
			try { Thread.sleep(500); } 
			catch (InterruptedException e) {}
		}
	}

}
