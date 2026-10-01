package decoratorJuegoCartas;

public class Tierra extends Decorator {
	private static double PORC_ARMADURA = 0.25;
	private static double PORC_ATAQUE_CORTO = -0.20;
	private static double PORC_ATAQUE_LARGO = -0.30;
	
	public Tierra(Personaje personaje) {
		super(personaje);
	}
	public double getArmadura() {
		return personaje.getArmadura() * (1 + PORC_ARMADURA);
	}
	public double getAtaqueCorto() {
		return personaje.getAtaqueCorto() * (1 + PORC_ATAQUE_CORTO);
	}
	public double getAtaqueLargo() {
		return personaje.getAtaqueLargo() * (1 + PORC_ATAQUE_LARGO);
	}
}