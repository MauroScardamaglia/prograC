package naftaExcep;

public class TipoCombustibleException extends CargaInvalidaException {
	
	public TipoCombustibleException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje,combustible, cantidadRequerida, cantidadDisponible);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo();
	}
}
