package doubleDispach;

public class Madera extends Material {
	String tipo;
	
	public Madera(String tipo,String color) {
		super(color);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	
	@Override
	public String trabajaJuguetero() {
		return "Muñequito";
	}
	@Override
	public String trabajaJoyero() {
		return "Par de Aros";
	}
	
	@Override
	public String toString() {
		return tipo + " " + getColor();
	}
}
