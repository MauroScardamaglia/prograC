package tp5_ej1;

public class Perro extends Animal implements EmisorDeSonido {
	public Perro() {
		super("Perro",10);
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("Guau Guau");
	}
}
