package bibliotecaLibRev;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros;
	private ArrayList<Revista> revistas;
	private Object monitorLibro;
	private Object monitorRevista;
	
	public Biblioteca() {
		this.libros = new ArrayList<>();
		this.revistas = new ArrayList<>();
	}
	
	public void agregarLibro(Libro libro) { synchronized(monitorLibro) { libros.add(libro); }}
	public int getCantLibros() { synchronized(monitorLibro) { return libros.size();	}}
	public void agregarRevista(Revista revista) { synchronized(monitorRevista) { revistas.add(revista); }}
	public int getCantRevistas() { synchronized(monitorRevista) { return revistas.size();	}}
	
	/**
	 * @param idLibro id del libro a retirar
	 */
	public Libro retirarLibroConId(int idLibro) throws InterruptedException, IdInvalidoException {
		synchronized (monitorLibro) {
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
	}
	
	public Revista retirarRevistaConId(int idRevista) throws InterruptedException, IdInvalidoException {
		synchronized (monitorRevista) {
			if (idRevista > getCantRevistas())
				throw new IdInvalidoException();
			
			// encontrar la revista
			int i=0;
			while (revistas.get(i).getId() != idRevista)
				i++;
			
			// fijarme si está disponible
			while (!revistas.get(i).isDisponible())
				wait();
			
			// ahora sí está disponible
			return revistas.get(i).retirarRevista();
		}
	}
	
	public void devolverLibro(Libro libro) { // es responsabilidad del socio de una vez devuelto el libro no mantener una referencia a este, sino no sé como diseñar
		synchronized(monitorLibro) {
			libro.devolverLibro();
			notifyAll(); // no lo había puesto antes y algunos se quedaban sin libro ):
		}
	}
	
	public void devolverRevista(Revista revista) { // es responsabilidad del socio de una vez devuelto el libro no mantener una referencia a este, sino no sé como diseñar
		synchronized(monitorRevista) {
			revista.devolverRevista();
			notifyAll(); // no lo había puesto antes y algunos se quedaban sin libro ):
		}
	}

}
