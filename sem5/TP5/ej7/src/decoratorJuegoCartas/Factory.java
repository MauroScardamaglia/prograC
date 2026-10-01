package decoratorJuegoCartas;

public class Factory {
	
	public static Personaje crearPersonaje(String personaje) {
		switch(personaje.toLowerCase()) {
		case "mago":
			return new Mago();
		case "elfo":
			return new Elfo();
		case "hechicera":
			return new Hechicera();
		case "dragon":
			return new Dragon();
		case "guerrero":
			return new Guerrero();
		default:
			return null;
		}
	}
	
	public static Personaje crearPersonaje(String personaje,String elemento) {
		Personaje personajeAux = crearPersonaje(personaje);
		
		switch (elemento.toLowerCase()) {
		case "tierra":
			return new Tierra(personajeAux);
		case "aire":
			return new Aire(personajeAux);
		case "agua":
			return new Agua(personajeAux);
		case "fuego":
			return new Fuego(personajeAux);
		default:
			return null;
		}
	}
	
	public static void competencia(Personaje p1, Personaje p2, String competencia) {
		double stat1, stat2;
		competencia.toLowerCase(); // no funca, no sé porque
		switch (competencia) {
		case "armadura":
			stat1 = p1.getArmadura();
			stat2 = p2.getArmadura();
			System.out.println("stat1: "+ stat1 + ", stat2: " + stat2);
			break;
		case "ataquecorto":
			stat1 = p1.getAtaqueCorto();
			stat2 = p2.getAtaqueCorto();
			System.out.println("stat1: "+ stat1 + ", stat2: " + stat2);
			break;
		case "ataquelargo":
			stat1 = p1.getAtaqueLargo();
			stat2 = p2.getAtaqueLargo();
			System.out.println("stat1: "+ stat1 + ", stat2: " + stat2);
			break;
		default:
			System.out.println("no existe :p");
			break;
		}
	}
}
