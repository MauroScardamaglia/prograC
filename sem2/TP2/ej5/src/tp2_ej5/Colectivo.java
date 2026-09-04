package tp2_ej5;

public class Colectivo {
	private String modelo;
	private int numeroInterno;
	static private int sigNumeroInterno = 0;
	
	public Colectivo(String modelo) {
		super();
		this.modelo = modelo;
		this.numeroInterno = sigNumeroInterno;
		sigNumeroInterno++;
	}
	
	@Override
	public String toString() {
		return "Colectivo \nModelo: " + modelo + ", Numero Interno: " + numeroInterno;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNumeroInterno() {
		return numeroInterno;
	}
	public static int getSigNumeroInterno() {
		return sigNumeroInterno;
	}
	
}
