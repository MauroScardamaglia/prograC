package doubleDispach;

public class Joyero extends Artesano {
	
	public Joyero(String nombre) {
		super(nombre);
	}
	
	public String trabajar(Material mat) {
		return this + " fabricó un " + mat.trabajaJoyero() + " de " + mat;
	}
}
