package tp5_ej1;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<EmisorDeSonido> emisores = new ArrayList<>();
		emisores.add(new Perro());
		emisores.add(new Gato());
		emisores.add(new Vaca());
		emisores.add(new Pollito());
		emisores.add(new Ambulancia("aa","bb","cc"));

		for (EmisorDeSonido emisor: emisores) {
			emisor.emitirSonido();
		}
	}

}
