package juegoBelico;

public abstract class Personaje extends Unidad implements IMovible {
	
	public Personaje(String equipo, int costo, int energia) {
		super(equipo,costo,energia);
	}

	public abstract void recibeDano(int cantidad);
	
	@Override
	public void mover(int x, int y) {
		this.x += x;
		this.y += y;
	}
}
