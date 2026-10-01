package juegoBelico;

public abstract class Edificio extends Unidad implements IConstruible {
	protected int tiempoConstruccion;
	
	public Edificio(String equipo, int costo, int energia,int tiempoConstruccion) {
		super(equipo,costo,energia);
		this.tiempoConstruccion = tiempoConstruccion;
	}
	

	public abstract void recibeDano(int cantidad);

	@Override
	public int getTiempoConstruccion() {
		return tiempoConstruccion;
	}
}
