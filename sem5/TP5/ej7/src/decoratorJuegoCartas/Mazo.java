package decoratorJuegoCartas;
import java.util.ArrayList;
import java.util.Random;

public class Mazo {
	private static Mazo _instancia = null;
	private ArrayList<Personaje> personajes;
	
	private Mazo() {
		personajes = new ArrayList<>();
	}
	public static Mazo getInstancia() {
		if (_instancia == null)
			_instancia = new Mazo();

		return _instancia;
	}
	
	public void añadirPersonaje(Personaje personaje) {
		personajes.add(personaje);
	}
	public Personaje seleccionarPersonaje() {
		Random random = new Random();
		return personajes.get(random.nextInt(personajes.size()));
	}
}
