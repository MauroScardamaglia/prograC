package bibliotecaLibRev;


public class Revista { // Recurso Compartido
	private static int siguienteId = 1;

	private int id;
	private boolean disponible;
	private String titulo;

	public Revista(String titulo) {
		this.id = siguienteId;
		siguienteId++;
		this.disponible = true;
		this.titulo = titulo;
	}

	protected synchronized Revista retirarRevista() {
		disponible = false;
		return this;
	}
	
	protected synchronized void devolverRevista() {
		disponible = true;
	}
	
	protected boolean isDisponible() { return disponible;	}
	public int getId() { return id;	}	
	public String getTitulo() { return titulo; }
	
	@Override
	public String toString() {
		return "Revista \"" + getTitulo() + "\" con id: " + getId();
	}
	
}
