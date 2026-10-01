package decoratorJuegoCartas;

public class Prueba {

	// hay cosas que me hubiera gustado añadir como los toString e invocar a las funciones
	// incendio e invocar huracan. Pero estuve una banda de tiempo con este ejercicio y me re harté
	// hice 14 clases, por dios, qué sufrimiento
	
	public static void main(String[] args) {
		Personaje p1 = Factory.crearPersonaje("dragon");
		Personaje p2 = Factory.crearPersonaje("hechicera","fuego");
		Personaje p3 = Factory.crearPersonaje("guerrero","tierra");
		Personaje p4 = Factory.crearPersonaje("mago");
		Personaje p5 = Factory.crearPersonaje("elfo","aire");
		Personaje p6 = Factory.crearPersonaje("elfo","agua");
		Personaje p7 = Factory.crearPersonaje("dragon","fuego");
		Personaje p8 = Factory.crearPersonaje("elfo");
		Personaje p9 = Factory.crearPersonaje("hechicera","agua");
		
		Mazo mazo = Mazo.getInstancia();
		
		mazo.añadirPersonaje(p1);
		mazo.añadirPersonaje(p2);
		mazo.añadirPersonaje(p3);
		mazo.añadirPersonaje(p4);
		mazo.añadirPersonaje(p5);
		mazo.añadirPersonaje(p6);
		mazo.añadirPersonaje(p7);
		mazo.añadirPersonaje(p8);
		mazo.añadirPersonaje(p9);

		
		Factory.competencia(p1, p2, "armadura");
		Factory.competencia(p8, p8.eligeAdversario(), "ataquelargo");
		Factory.competencia(p3, p7, "ataquecorto");
		Factory.competencia(p5, p5.eligeAdversario(), "armadura");

	}

}
