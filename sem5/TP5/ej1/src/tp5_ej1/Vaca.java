package tp5_ej1;

public class Vaca extends Animal implements EmisorDeSonido {
	public Vaca() {
		super("Vaca",20);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Muuuuu");
	}
}
