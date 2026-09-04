package paq;

public class Producto {
	private int numCod;
	private String descrip;
	private double precioUnit;
	
	public Producto(int numCod, String descrip, double precioUnit) {
		this.numCod = numCod;
		this.descrip = descrip;
		this.precioUnit = precioUnit;
	}
	public int getNumCod() {
		return numCod;
	}
	public void setNumCod(int numCod) {
		this.numCod = numCod;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public double getPrecioUnit() {
		return precioUnit;
	}
	public void setPrecioUnit(double precioUnit) {
		this.precioUnit = precioUnit;
	}
}
