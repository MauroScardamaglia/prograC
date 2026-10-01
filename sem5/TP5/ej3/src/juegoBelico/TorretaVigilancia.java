package juegoBelico;

public class TorretaVigilancia extends Edificio implements IHostil {
	private static int costoInicial = 200;
	private static int energiaInicial = 2000;
	private static int tiempoConstruccionInicial = 40;
	private static double danoRecibidoPorc = 1.0;
	private static int danoProducido = 10;
	
	public TorretaVigilancia(String equipo) {
		super(equipo,costoInicial,energiaInicial,tiempoConstruccionInicial);
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