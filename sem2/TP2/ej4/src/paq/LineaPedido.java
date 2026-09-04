package paq;

public class LineaPedido {
	private Producto prod;
	private int cant;
	
	public LineaPedido(Producto prod, int cant) {
		this.prod = prod;
		this.cant = cant;
	}
	
	public double costo() {
		return cant * prod.getPrecioUnit();
	}
	
	public Producto getProd() {
		return prod;
	}
	public void setProd(Producto prod) {
		this.prod = prod;
	}
	public int getCant() {
		return cant;
	}
	public void setCant(int cant) {
		this.cant = cant;
	}
	
}
