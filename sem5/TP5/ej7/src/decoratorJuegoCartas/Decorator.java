package decoratorJuegoCartas;

public abstract class Decorator extends Personaje {
	protected Personaje personaje;
	
	public Decorator(Personaje personaje) {
		this.personaje = personaje;
	}
	public abstract double getArmadura();
	public abstract double getAtaqueCorto();
	public abstract double getAtaqueLargo();
}
