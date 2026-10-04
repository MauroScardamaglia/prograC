package naftaExcep;

public class Surtidor {
	private static double cantMaxima = 20000;
	private double cantidadDiesel, cantidadPremium, cantidadSuper;
	
	// Bob el Constructor
	public Surtidor() {
		super();
		cantidadDiesel = cantidadPremium = cantidadSuper = cantMaxima;
	}
	
	public String toString() {
		return "Cantidad Máxima: " + cantMaxima + "l\nCantidad Diesel: " +
				cantidadDiesel + "\nCantidad Premium: " + cantidadPremium +
				"\nCantidad Super: " + cantidadSuper;
	}

	public void cargarCombustible(String combustible, double cantidad) throws CargaInvalidaException {
		combustible = combustible.toLowerCase();
		
//		if (cantidad < 0)
//			throw new CargaInvalidaException("Cantidad Negativa Solicitada",combustible,cantidad,-1);
//		lo había puesto acá, y me pareció mejor
//		pero así no puedo mostrar la cantidad de combustible disponible
	
		switch (combustible) {		
		
		case "diesel":
			if (cantidad < 0)
				throw new CargaInvalidaException("Cantidad Negativa Solicitada",combustible,cantidad,cantidadDiesel);

			if (cantidad > cantidadDiesel)
				throw new FaltaCombustibleException("Cantidad no Disponible en el Surtidor",combustible,cantidad,cantidadDiesel);

			cantidadDiesel -= cantidad;
			break;
		
		case "premium":
			if (cantidad < 0)
				throw new CargaInvalidaException("Cantidad Negativa Solicitada",combustible,cantidad,cantidadPremium);
			
			if (cantidad > cantidadPremium)
				throw new FaltaCombustibleException("Cantidad no Disponible en el Surtidor",combustible,cantidad,cantidadPremium);

			cantidadPremium -= cantidad;
			break;

		case "super":
			if (cantidad < 0)
				throw new CargaInvalidaException("Cantidad Negativa Solicitada",combustible,cantidad,cantidadSuper);
			
			if (cantidad > cantidadSuper)
				throw new FaltaCombustibleException("Cantidad no Disponible en el Surtidor",combustible,cantidad,cantidadSuper);

			cantidadSuper -= cantidad;
			break;
		
		default:
			throw new TipoCombustibleException("Combustible Desconocido",combustible,cantidad,-1);
		}
	}
	
	public void llenarDiesel() {
		cantidadDiesel = cantMaxima;
	}
	public void llenarPremum() {
		cantidadPremium = cantMaxima;
	}
	public void llenarSuper() {
		cantidadSuper = cantMaxima;
	}
	// getters
	public double getCantidadPremium() {
		return cantidadPremium;
	}
	public double getCantidadSuper() {
		return cantidadSuper;
	}
	public double getCantidadDiesel() {
		return cantidadDiesel;
	}
}
