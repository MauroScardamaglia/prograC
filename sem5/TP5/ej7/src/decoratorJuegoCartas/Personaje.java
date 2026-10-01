package decoratorJuegoCartas;
//me estoy dando cuenta a la mitad del desarrollo de que como las variables estáticas que les puse
// mayúsculas no son constantes, no es buena práctica, pero igual lo hice para diferenciarlas de las
// que tiene esta clase que son en minúsculas, porque no se me ocurría otro nombre
public abstract class Personaje {
	protected double armadura, ataqueCorto, ataqueLargo;
	
	public abstract double getArmadura();
	public abstract double getAtaqueCorto();
	public abstract double getAtaqueLargo();	
	
	public Personaje eligeAdversario() {
		return Mazo.getInstancia().seleccionarPersonaje();
		// uso del patrón singleton,
		// personaje no conoce a mazo, pero accede a él desde la clase Mazo
	}

}