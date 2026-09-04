package paq;

public class Guerrero {
	private String nombre;
	private double vida, armadura, x, y;

	public Guerrero(String nombre) {
		this.nombre = nombre;
		this.vida = 100;
		this.armadura = 100;
		this.x = 0;
		this.y = 0;
	}

	void mover(double desplX, double desplY) {
		this.x += desplX;
		this.y += desplY;
	}
	
	void recibirDano(double dano) {
		if (vida == 0)
			System.out.println(nombre + " Ya estaba muerto");
		else {
			if (armadura - dano >= 0)
				armadura -= dano;
			else {
				if (vida - (dano - armadura) <= 0) {
					vida = 0;
					System.out.println(nombre +" Está muerto");
				}
				else
					vida -= (dano - armadura);
				armadura = 0;
			}		
		}
	}
	
	// getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getArmadura() {
		return armadura;
	}

	public void setArmadura(double armadura) {
		this.armadura = armadura;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
