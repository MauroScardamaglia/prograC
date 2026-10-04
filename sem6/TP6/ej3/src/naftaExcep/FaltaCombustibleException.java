package naftaExcep;

public class FaltaCombustibleException extends CargaInvalidaException {

	public FaltaCombustibleException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje,combustible, cantidadRequerida, cantidadDisponible);
	}
	
	@Override
	public String getInfo() {
		return super.getInfo();
	}
}
