package tp5_ej1;

public class Gato extends Animal implements EmisorDeSonido {
	public Gato() {
		super("Gato",10);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Miau");
	}
}
