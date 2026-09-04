package paquete;

public class Categoria
{
	private String nombreCategoria;
	private double sueldoPorHora;
	
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	
	public double getSueldoPorHora() {
		return sueldoPorHora;
	}
	
	// este es el construct, por convención va antes que los metodos, pero lo copié tal cual de la consigna
	public Categoria() {
		
	}
	
	public Categoria(String nombreCategoria, double sueldoPorHora)
	{
		this.nombreCategoria = nombreCategoria;
		this.sueldoPorHora = sueldoPorHora;
	}
	
}
