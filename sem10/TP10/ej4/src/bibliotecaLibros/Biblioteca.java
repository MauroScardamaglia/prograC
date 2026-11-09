package bibliotecaLibros;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	
	public Biblioteca() {
		this.libros = new ArrayList<>();
	}
	
	public synchronized void agregarLibro(Libro libro) { libros.add(libro); }
	public synchronized int getCantLibros() { return libros.size();	}
	
	/**
	 * @param idLibro id del libro a retirar
	 */
	public synchronized Libro retirarLibroConId(int idLibro) throws InterruptedException, IdInvalidoException {
		if (idLibro > getCantLibros())
			throw new IdInvalidoException();
		
		// encontrar el libro
		int i=0;
		while (libros.get(i).getId() != idLibro)
			i++;
		
		// fijarme si está disponible
		while (!libros.get(i).isDisponible())
			wait();
		
		// ahora sí está disponible
		return libros.get(i).retirarLibro();
	}
	
	public synchronized void devolverLibro(Libro libro) { // es responsabilidad del socio de una vez devuelto el libro no mantener una referencia a este, sino no sé como diseñar
		libro.devolverLibro();
		notifyAll(); // no lo había puesto antes y algunos se quedaban sin libro ):
	}

}
