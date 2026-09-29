package tp5_ej2;

public class Libro implements Prestable {
	private int codigo;
	private String titulo;
	private int añoPublicacion;
	private boolean prestado;
	
	public Libro(int codigo, String titulo, int añoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
		this.prestado = false;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\nTítulo: " + titulo +
		"\nAño Publicación: " + añoPublicacion + "\nPrestado? -> " + prestado + "\n";
	}
	
	
	@Override
	public void prestar() {
		prestado = true;
	}
	@Override
	public void devolver() {
		prestado = false;
	}
	@Override
	public boolean isPrestado() {
		return prestado;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public String getTitulo() {
		return titulo;
	}
}
