package naftaExcep;

public class CargaInvalidaException extends Exception {
	String mensaje;
	private DatoCargaInvalido datos;
	
	public CargaInvalidaException(String mensaje, String combustible, double cantidadRequerida, double cantidadDisponible) {
		super(mensaje);
		datos = new DatoCargaInvalido(cantidadDisponible, cantidadRequerida, combustible);
		this.mensaje = mensaje;
	}
	
	public String getInfo() {
		return mensaje + "\n" + datos;
	}
	
	public DatoCargaInvalido getDatoCargaInvalido() {
		return datos;
	}
}
