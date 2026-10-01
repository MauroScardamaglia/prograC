package decoratorJuegoCartas;

public class Dragon extends Personaje {
	private static double ARMADURA = 10000;
	private static double ATAQUE_CORTO = 500;
	private static double ATAQUE_LARGO = 200;
	
	public Dragon() {
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
