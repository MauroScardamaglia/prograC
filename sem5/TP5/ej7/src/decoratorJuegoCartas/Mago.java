package decoratorJuegoCartas;

public class Mago extends Personaje {
	private static double ARMADURA = 500;
	private static double ATAQUE_CORTO = 50;
	private static double ATAQUE_LARGO = 70;
	
	public Mago() {
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
