package bibliotecaLibros;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros; // base de datos de los libros
	private ArrayList<Libro> estanteria; // libros físicos que están en disposición
	private final int CANT_LIBROS_ESTANTERIA = 10;
	
	public Biblioteca() {
		this.libros = new ArrayList<>(); 
		this.estanteria = new ArrayList<>(); 		
	}

	/*
	 * agregar solo si hay espacio (maáximo de 10 libros)
	 */
 	public synchronized void agregarLibroLista(Libro libro) { libros.add(libro); }
 	protected synchronized void agregarLibroEstanteria(Libro libro) { estanteria.add(libro); }
 	protected synchronized void quitarLibroEstanteria(Libro libro) { estanteria.remove(libro); }
	public synchronized int getCantLibrosLista() { return libros.size();	}
	public synchronized int getCantLibrosEstanteria() { return estanteria.size();	}
	
	public synchronized void donarLibro(Libro libro) throws InterruptedException { // esta reemplaza a la deprecada (boeee) agregarLibro
		agregarLibroLista(libro); // lo agrego a la base de datos
		while (getCantLibrosEstanteria() == CANT_LIBROS_ESTANTERIA) {
			wait();
		}
		// ya puede donar libro
		agregarLibroEstanteria(libro);
	}
	
	/**
	 * @param idLibro id del libro a retirar
	 */
	public synchronized Libro retirarLibroConId(int idLibro) throws InterruptedException, IdInvalidoException, LibroNoEncontradoException {
		Libro libro;
		if (idLibro <= 0)
			throw new IdInvalidoException();
		
		// encontrar el libro
		int i=0;
		while (libros.get(i).getId() != idLibro)
			i++;
		
		if (i == getCantLibrosLista())
			throw new LibroNoEncontradoException();
		
		libro = libros.get(i);
		// fijarme si está disponible
		while (!libro.isDisponible())
			wait();
		
		// ahora sí está disponible
		quitarLibroEstanteria(libro);
		notifyAll(); // al liberar un espacio en la estanteria, un donador puede donar
		return libro.retirarLibro();
	}
	
	public synchronized void devolverLibro(Libro libro) throws InterruptedException { // es responsabilidad del socio de una vez devuelto el libro no mantener una referencia a este, sino no sé como diseñar
		while (getCantLibrosEstanteria() == CANT_LIBROS_ESTANTERIA)
			wait();

		agregarLibroEstanteria(libro);
		libro.devolverLibro();
		notifyAll(); // no lo había puesto antes y algunos se quedaban sin libro ):
	}

}
