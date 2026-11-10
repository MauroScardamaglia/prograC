package externosABiblioteca;
import bibliotecaLibros.IdInvalidoException;
import bibliotecaLibros.Libro;
import bibliotecaLibros.Biblioteca;

/*
	Ejercicio 5
	Complicar un poco la cosa y agregar la siguiente complejidad:

	a) Crear una clase Donador (Thread o Runnable) que agregar nuevos libros a la biblioteca.
	La dificultad está en que la biblioteca puede almacenar hasta 10 libros (puede tener más
	que 10, pero solamente 10 en sus estantes). O sea que cuando el donador quiera agregar
	un nuevo libro, deberá esperar hasta que alguien retire alguno, si es que no queda lugar en
	la biblioteca.
	
	b) Aumentar el número de Socios para generar un escenario estable.
 */

public class Donador implements Runnable { // el Donador es PRODUCTOR
	private Libro libro;
	private String nombre;
	private Biblioteca biblioteca;
	
	public Donador(String nombre, Biblioteca biblioteca, Libro libro) {
		this.nombre = nombre;
		this.libro = libro;
		this.biblioteca = biblioteca;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Yo, " + this + " quiero donar el libro " + libro + "\n");
			biblioteca.donarLibro(libro);
			System.out.println("Yo, " + this + " <<pude>> donar el libro " + libro + "\n");
		}
		catch (InterruptedException e) { System.out.println("Algo falló manito"); }
	}
	
	@Override
	public String toString() {
		return nombre;
	}
}
