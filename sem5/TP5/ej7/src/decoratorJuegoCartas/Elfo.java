package decoratorJuegoCartas;

public class Elfo extends Personaje {
	private static double ARMADURA = 1000;
	private static double ATAQUE_CORTO = 20;
	private static double ATAQUE_LARGO = 100;
	
	public Elfo() {
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
