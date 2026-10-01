package doubleDispach;

public abstract class Material {
	protected String color;
	
	public Material(String color) {
		super();
		this.color = color;
	}	
	public String getColor() {
		return color;
	}
	
	abstract public String trabajaJuguetero();
	abstract public String trabajaJoyero();
	
	@Override
	public abstract String toString();
}
