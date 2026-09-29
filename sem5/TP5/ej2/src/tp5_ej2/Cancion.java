package tp5_ej2;

public class Cancion {
	private int numeroPista, cantMin, cantSeg;
	private String titulo;
	
	public Cancion(int numeroPista, String titulo, int cantMin, int cantSeg) {
		super();
		this.numeroPista = numeroPista;
		this.cantMin = cantMin;
		this.cantSeg = cantSeg;
		this.titulo = titulo;
	}

	public int getCantSeg() {
		return cantSeg;
	}
	public int getNumeroPista() {
		return numeroPista;
	}
	public int getCantMin() {
		return cantMin;
	}
	public String getTitulo() {
		return titulo;
	}
}
