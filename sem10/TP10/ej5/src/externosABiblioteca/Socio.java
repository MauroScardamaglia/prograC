package externosABiblioteca;
import bibliotecaLibros.Biblioteca;
import bibliotecaLibros.Libro;
import bibliotecaLibros.IdInvalidoException;
import bibliotecaLibros.LibroNoEncontradoException;

public class Socio implements Runnable {
	private String nombre;
	private int idLibro; // el libro que quiere retirar
	private Biblioteca biblioteca;
	
	public Socio(String nombre, int idLibro, Biblioteca biblioteca) {
		this.nombre = nombre;
		this.idLibro = idLibro;
		this.biblioteca = biblioteca;
	}
	@Override public String toString() {
		return nombre;
	}
	
	@Override
	public void run() {
		try {
			System.out.println("Yo, " + this + " quiero sacar el libro con id " + idLibro + "\n");
			Libro libro;
			libro = biblioteca.retirarLibroConId(idLibro);
			Thread.sleep(3000);
			System.out.println(this + " dice: \"" + "Ah, mirá que interesante " + libro.getTitulo() + "\"\n");
			biblioteca.devolverLibro(libro);
		}
		catch (InterruptedException e) { System.out.println("Algo falló manito"); }
		catch (IdInvalidoException e) { System.out.println(this + ", flaco, poné un id correcto\n"); }		
		catch (LibroNoEncontradoException e) { System.out.println(this + ", amigo, no tenemos este libro en la base de datos ): \n"); }		
	}
	
}
