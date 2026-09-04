package tp2_ej5;

public class Chofer {
	private Categoria categoria;
	private Domicilio domicilio;
	private String nombre;
	private Colectivo colectivo;
	
	public Chofer(Categoria categoria, Domicilio domicilio, String nombre, Colectivo colectivo) {
		super();
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.nombre = nombre;
		this.colectivo = colectivo;
	}
	
	public Chofer(Categoria categoria, Domicilio domicilio, String nombre) { // este constructor no recibe colectivo
		super();
		this.categoria = categoria;
		this.domicilio = domicilio;
		this.nombre = nombre;
	}
	
	public void desvincularColectivo() {
		colectivo = null;
	}
	
	public boolean tieneColectivo() {
		return colectivo != null;
	}
	
	@Override	
	public String toString() {
		return "Nombre: " + nombre + "\n" + categoria + "\n" + domicilio + "\n" + colectivo + "\n";
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Colectivo getColectivo() {
		return colectivo;
	}

	public void setColectivo(Colectivo colectivo) {
		this.colectivo = colectivo;
	}
	
}
