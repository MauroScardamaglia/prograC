package buscaminas;

public class Buscaminas {
	public Buscaminas (int ancho, int alto, int cantidadMinas) throws ParametrosInvalidoException {
		super();
		if (ancho < 0 || alto < 0)
			throw new ParametrosInvalidoException("Ancho y/o Alto negativo/s");
		else if (cantidadMinas > ancho * alto)
			throw new ParametrosInvalidoException("Cantidad de Minas mayor al número de celdas");
		else { // Parámetros válidos
			
		}
	}
	
	public int getMinasCercanas(int i, int j) {
		return 5;
	}
	
	public boolean isMinas(int i, int j) {
		return true;
	}
}
