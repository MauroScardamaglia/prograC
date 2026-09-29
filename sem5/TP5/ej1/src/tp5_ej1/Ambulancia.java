package tp5_ej1;

public class Ambulancia extends Vehiculo implements EmisorDeSonido {
	
	public Ambulancia(String patente, String numeroChasis, String numeroMotor) {
		super(patente, numeroChasis, numeroMotor);
	}
	
	@Override
	public void emitirSonido(){
		System.out.println("Sirena Sonando");
	}
	
}
