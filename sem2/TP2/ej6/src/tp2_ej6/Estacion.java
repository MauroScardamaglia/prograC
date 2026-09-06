package tp2_ej6;
import java.util.ArrayList;

public class Estacion {
	private static int sigNroSucursal = 1;
	private int nroSucursal;
	private ArrayList<Surtidor> surtidores = new ArrayList<>();

	public Estacion() {
		nroSucursal = sigNroSucursal; // esto no lo voy a usar porque no voy a tener más de una estación
		sigNroSucursal++;
	}
	
	// a) Conocer la cantidad total de surtidores
	public int cantSurtidores() {
		return surtidores.size();
	}
	
	//b) Conocer la existencia en litros de un determinado tipo de combustible
	public int cantLitrosDisponiblesGasoil() {
		int cant = 0;
		for (int i = 0; i < surtidores.size();i++)
			cant += surtidores.get(i).getCantGasoil();
		return cant;
	}
	public int cantLitrosDisponiblesSuper() {
		int cant = 0;
		for (int i = 0; i < surtidores.size();i++)
			cant += surtidores.get(i).getCantSuper();
		return cant;
	}
	public int cantLitrosDisponiblesPremium() {
		int cant = 0;
		for (int i = 0; i < surtidores.size();i++)
			cant += surtidores.get(i).getCantPremium();
		return cant;
	}
	
	// c) Informar cual es el surtidor que ha realizado mayor cantidad de ventas de un tipo de combustible
	public void informarSurtidorMayorCantVentas(String combustible) {
		int maxCant = -1;
		int cant;
		Surtidor surtidor = null;
		for (int i=0; i < surtidores.size(); i++) {
			cant = surtidores.get(i).cantVentasCombustible(combustible);
			if (cant > maxCant) {
				maxCant = cant;
				surtidor = surtidores.get(i);
			}
		}
		System.out.println("El surtidor con más ventas de " + combustible + "es:\n" + 
		surtidor.toString() + "\nCon " + maxCant + "l vendidos.\n");
	}
	
	// d) Conocer el histórico de los litros vendidos de un determinado combustible,
	// de un determinado surtidor y de toda la estación
	// onda corte de control (estación -> surtidor -> combustible)
	public void informarHistorico() {
		System.out.println("Histórico de ventas de la Estación \n\n");
		for (int i = 0; i < surtidores.size();i++) {
			System.out.println(surtidores.get(i) + "\n");
			surtidores.get(i).informarHistorico();
			System.out.println("\n\n");
		}
	}
	public void informarHistorico(String combustible) {
		System.out.println("Histórico de ventas de " + combustible + " de la Estación \n\n");
		for (int i = 0; i < surtidores.size();i++) {
			System.out.println(surtidores.get(i) + "\n");
			surtidores.get(i).informarHistorico(combustible);
			System.out.println("\n\n");
		}
	}
	public void informarHistorico(Surtidor surtidor) {
		System.out.println("Histórico de ventas de\n" + surtidor.toString() + "\n\n");
		surtidor.informarHistorico();
		System.out.println("\n\n");
	}
	
	public void añadirSurtidor(Surtidor surtidor) {
		surtidores.add(surtidor);
	}

	// devuelve true si lo pudo eliminar (se encontraba en el ArrayList
	public boolean eliminarSurtidor(Surtidor surtidor) {
		int i = surtidores.indexOf(surtidor);
		if (i != -1)
			surtidores.remove(i);
		return i != -1;
	}
	
	public int getNroSucursal() {
		return nroSucursal;
	}
	public ArrayList<Surtidor> getSurtidores(){
		return surtidores;
	}
}