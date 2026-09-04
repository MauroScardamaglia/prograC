package paq;
import java.util.ArrayList;

public class Pedido {
	private Empleado emp;
	private String fecha;
	private ArrayList<LineaPedido> lineas = new ArrayList<LineaPedido>();
	
	public Pedido(Empleado emp, String fecha) {
		this.emp = emp;
		this.fecha = fecha;
	}

	public double informarCostoTotal() {
		int i;
		double costoTotal = 0;
		for (i=0; i < lineas.size(); i++)
			costoTotal += lineas.get(i).costo();
		return costoTotal;
	}
	
	public void agregarLineaPedido(Producto prod, int cant) {
		if (cant > 0) {
			LineaPedido lin = new LineaPedido(prod,cant);
			lineas.add(lin);
		}
	}
	
	public Empleado getEmp() {
		return emp;
	}

	public void setEmp(Empleado emp) {
		this.emp = emp;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<LineaPedido> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaPedido> lineas) {
		this.lineas = lineas;
	}
	
}
