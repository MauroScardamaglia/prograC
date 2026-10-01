package juegoBelico;

public class Medico extends Personaje {
	private static int costoInicial = 40;
	private static int energiaInicial = 100;
	private static double danoRecibidoPorc = 1.5;
	
	public Medico(String equipo) {
		super(equipo, costoInicial, energiaInicial);
	}
	
	@Override
	public void recibeDano(int cantidad) {
		energia -= danoRecibidoPorc * cantidad;
		if (energia < 0)
			energia = 0;
	}

}
