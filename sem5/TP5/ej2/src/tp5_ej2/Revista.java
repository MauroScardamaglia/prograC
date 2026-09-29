package tp5_ej2;

public class Revista {
	private int codigo;
	private String titulo;
	private int numero;
	private int añoPublicacion;
	
	public Revista(int codigo, String titulo, int añoPublicacion, int numero) {
		super();
		this.codigo = codigo;
		this.numero = numero;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}	

	@Override
	public String toString() {
		return "Código: " + codigo + "\nTítulo: " + titulo +
		"\nNúmero: " + numero + "\nAño Publicación: " + añoPublicacion + "\n";
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
	public int getNumero() {
		return numero;
	}
}
