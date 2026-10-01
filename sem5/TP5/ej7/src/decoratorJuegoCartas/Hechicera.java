package decoratorJuegoCartas;

public class Hechicera extends Personaje {
	private static double ARMADURA = 1000;
	private static double ATAQUE_CORTO = 70;
	private static double ATAQUE_LARGO = 50;
	
	public Hechicera() {
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
