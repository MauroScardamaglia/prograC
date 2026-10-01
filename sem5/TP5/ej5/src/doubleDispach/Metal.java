package doubleDispach;

public class Metal extends Material {
	String nombre;
	
	public Metal(String nombre,String color) {
		super(color);
		this.nombre = nombre;
	}	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String trabajaJuguetero() {
		return "Autito";
	}
	@Override
	public String trabajaJoyero() {
		return "Anillo";
	}
	
	@Override
	public String toString() {
		return nombre + " " + getColor();
	}
}
