package juegoBelico;

public class Soldado extends Personaje implements IHostil {
	private static int costoInicial = 100;
	private static int energiaInicial = 500;
	private static double danoRecibidoPorc = 1.0;
	private static int danoProducido = 50;
	
	public Soldado(String equipo) {
		super(equipo, costoInicial, energiaInicial);
	}
	
	@Override
	public void atacar(Unidad adversario) {
		adversario.recibeDano(danoProducido);
	}
	
	@Override
	public void recibeDano(int cantidad) {
		energia -= danoRecibidoPorc * cantidad;
		if (energia < 0)
			energia = 0;
	}

}
