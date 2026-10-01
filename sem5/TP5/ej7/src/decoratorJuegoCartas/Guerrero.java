package decoratorJuegoCartas;

public class Guerrero extends Personaje {
	private static double ARMADURA = 1500;
	private static double ATAQUE_CORTO = 100;
	private static double ATAQUE_LARGO = 100;
	
	public Guerrero() {
		armadura = ARMADURA;
		ataqueCorto = ATAQUE_CORTO;
		ataqueLargo = ATAQUE_LARGO;
	}
	public double getArmadura() {
		return armadura;
	}
	public double getAtaqueCorto() {
		return ataqueCorto;
	}
	public double getAtaqueLargo() {
		return ataqueLargo;
	}
}
