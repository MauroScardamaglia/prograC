package juegoBelico;

public class Cuartel extends Edificio {
	private static int costoInicial = 500;
	private static int energiaInicial = 3000;
	private static int tiempoConstruccionInicial = 60;
	private static double danoRecibidoPorc = 0.5;
	
	public Cuartel(String equipo) {
		super(equipo,costoInicial,energiaInicial,tiempoConstruccionInicial);
	}
	
	@Override
	public void recibeDano(int cantidad) {
		energia -= danoRecibidoPorc * cantidad;
		if (energia < 0)
			energia = 0;
	}
}
