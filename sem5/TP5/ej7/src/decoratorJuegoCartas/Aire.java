package decoratorJuegoCartas;

public class Aire extends Decorator {
	private static double PORC_ARMADURA = -0.10;
	private static double PORC_ATAQUE_CORTO = +0.20;
	private static double PORC_ATAQUE_LARGO = +0.10;
	
	public Aire(Personaje personaje) {
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
	
	public void invocarHuracan() {
		System.out.println("fuaa wacho un huracán");
	}
}