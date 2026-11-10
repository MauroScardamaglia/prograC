package bibliotecaLibRev;

public class Libro { // Recurso Compartido
	private static int siguienteId = 1;

	private int id;
	private boolean disponible;
	private String titulo;

	public Libro(String titulo) {
		this.id = siguienteId;
		siguienteId++;
		this.disponible = true;
		this.titulo = titulo;
	}

	protected synchronized Libro retirarLibro() {
		disponible = false;
		return this;
	}
	
	protected synchronized void devolverLibro() {
		disponible = true;
	}
	
	protected boolean isDisponible() { return disponible;	}
	public int getId() { return id;	}	
	public String getTitulo() { return titulo; }
	
	@Override
	public String toString() {
		return "Libro \"" + getTitulo() + "\" con id: " + getId();
	}
	
}
