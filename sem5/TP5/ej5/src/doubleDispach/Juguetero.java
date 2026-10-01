package doubleDispach;

public class Juguetero extends Artesano {
	
	public Juguetero(String nombre) {
		super(nombre);
	}
	
	public String trabajar(Material mat) {
		return this + " fabricó un " + mat.trabajaJuguetero() + " de " + mat;
	}
}
