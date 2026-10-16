package buscaminas;

public class FueraTableroException extends Exception {
	int i,j;
	public FueraTableroException(int i, int j) {
		super("Casillero Fuera del Tablero");
	}
	public String getInfo() {
		return "Posición inválida: [" + i + ", " + j + "]";
	}
}
