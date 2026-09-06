package tp2_ej6;

public class Venta {
	private static int sigNroVenta;
	private int nroVenta;
	private int cant;
	private String combustible;

	public Venta(int cant, String combustible) {
		nroVenta = sigNroVenta;
		sigNroVenta++;
		this.cant = cant;
		this.combustible = combustible;
	}
	
	@Override
	public String toString() {
		return "Número de venta: " + nroVenta + 
		".\nCombustible vendido: " + combustible + 
		".\nCantidad de Litros vendidos: " + cant + "l.";
	}

	public int getCant() {
		return cant;
	}
	
	public String getCombustible() {
		return combustible;
	}
	
	public int getNroVenta() {
		return nroVenta;
	}

	public int getSigNroVenta() {
		return sigNroVenta;
	}
}