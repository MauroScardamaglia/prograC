package tp5_ej1;

public class Animal {
	protected String especie;
	protected int esperanzaVida;
	
	public Animal(String especie, int esperanzaVida) {
		super(); // buena práctica? xD
		this.especie = especie;
		this.esperanzaVida = esperanzaVida;
	}
}
