package juegoBelico;

// el orden estándar es public abstract, no al revés
public abstract class Unidad implements IPosicionable {
	protected String equipo;
	protected int costo;
	protected int energia;
	protected int x = 0,y = 0;
	
	public Unidad(String equipo, int costo, int energia) {
		super();
		this.equipo = equipo;
		this.costo = costo;
		this.energia = energia;
	}
	
	public abstract void recibeDano(int cantidad);
	public String getEquipo() {
		return equipo;
	}
	public int getCosto() {
		return costo;
	}
	public int getEnergia() {
		return energia;
	}

	@Override
	public int getX() {
		return x;
	}
	@Override
	public int getY() {
		return y;
	}

}
