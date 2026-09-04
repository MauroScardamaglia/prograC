package paquete;

public class Rectangulo {
	private int x1, y1, x2, y2;
	
	// 3 constructores, el básico, con 2 parámetros y con 4 parámetros

	public Rectangulo(){
		this.x1 = -1;
		this.y1 = -1;
		this.x2 = 1;
		this.y2 = 1;
	}
	
	public Rectangulo(int ancho, int alto) {
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = ancho;
		this.y2 = alto;
	}
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// métodos

	public int ancho() {
		return x2 - x1;
	}
	
	public int alto() {
		return y2 - y1;
	}
	
	public int perimetro() {
		return 2 * ancho() + 2 * alto();
	}

	public int area() {
		return ancho() * alto();
	}
	
	// 8 getters y setters escritos automáticamente con el IDE


	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	
	
}
