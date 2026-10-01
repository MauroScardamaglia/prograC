package doubleDispach;

public abstract class Artesano {
	protected String nombre;
	
	public Artesano(String nombre) {
		super();
		this.nombre = nombre;		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String trabajar(Material mat);
	
	@Override
	public String toString() {
		return nombre;
	}
}
