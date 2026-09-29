package tp5_ej1;

public class Pollito extends Animal implements EmisorDeSonido {
	public Pollito() {
		super("Pollito",7);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Kikiriki ... ig");
	}
}