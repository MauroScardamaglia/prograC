package tp2_ej6;
import java.util.ArrayList;

public class Surtidor {
	private static int sigNroSurtidor = 1;
	private int nroSurtidor;
	private int cantGasoil;
	private int cantSuper;
	private int cantPremium;
	private int maximaCarga = 20000;
	private ArrayList<Venta> ventas = new ArrayList<>();
	
	//constructor
	public Surtidor() {
		nroSurtidor = sigNroSurtidor;
		sigNroSurtidor++;
		cantGasoil = cantSuper = cantPremium = maximaCarga;
	}
	
	//resto de métodos
	
	@Override
	public String toString() {
		return "Surtidor n°" + nroSurtidor;
	}
	
	public void informarHistorico() {
		for (int i = 0; i < ventas.size();i++)
			System.out.println(ventas.get(i).toString() + "\n\n");
		System.out.println("\n");
	}
	public void informarHistorico(String combustible) {
		for (int i = 0; i < ventas.size();i++) {
			if (ventas.get(i).getCombustible() == combustible)
				System.out.println(ventas.get(i).toString() + "\n\n");
		}
		System.out.println("\n");
	}
	
	public int cantVentasCombustible(String combustible) {
		int aux = 0;
		for (int i =0; i < ventas.size();i++)
			if (ventas.get(i).getCombustible() == combustible)
				aux += ventas.get(i).getCant();
		return aux;
	}
	
	boolean extraerGasoil(int litros) {
		if (litros <= 0) {
			System.out.println(litros + "l es unaCantidad invalida de litros\n");
			return false;
		}
		else {
			if (cantGasoil-litros>=0) {
				cantGasoil-=litros;
				ventas.add(new Venta(litros,"Gasoil"));
				return true;
			}
			else {
				ventas.add(new Venta(cantGasoil,"Gasoil"));
				cantGasoil = 0;
				return false;
			}
		}
	}
	boolean extraerSuper(int litros) {
		if (litros <= 0) {
			System.out.println(litros + "l es unaCantidad invalida de litros\n");
			return false;
		}
		else {
			if (cantSuper-litros>=0) {
				cantSuper-=litros;
				ventas.add(new Venta(litros,"Super"));
				return true;
			}
			else {
				ventas.add(new Venta(cantSuper,"Super"));
				cantSuper = 0;
				return false;
			}
		}
	}	
	boolean extraerPremium(int litros) {
		if (litros <= 0) {
			System.out.println(litros + "l es unaCantidad invalida de litros\n");
			return false;
		}
		else {
			if (cantPremium-litros>=0) {
				cantPremium-=litros;
				ventas.add(new Venta(litros,"Premium"));
				return true;
			}
			else {
				ventas.add(new Venta(cantGasoil,"Premium"));
				cantPremium = 0;
				return false;
			}
		}
	}

	void llenarDepositoGasoil() {
		cantGasoil = maximaCarga;
	}
	void llenarDepositoSuper() {
		cantSuper = maximaCarga;
	}	
	void llenarDepositoPremium() {
		cantPremium = maximaCarga;
	}

	// devuelve true si no sobró combustible
	boolean reponerGasoil(int litros) {
		if (cantGasoil+litros > maximaCarga) {
			cantGasoil = maximaCarga;
			return false;
		}
		else {
			cantGasoil += litros;
			return true;
		}
	}
	boolean reponerSuper(int litros) {
		if (cantSuper+litros > maximaCarga) {
			cantSuper = maximaCarga;
			return false;
		}
		else {
			cantSuper += litros;
			return true;
		}
	}
	boolean reponerPremium(int litros) {
		if (cantPremium+litros > maximaCarga) {
			cantPremium = maximaCarga;
			return false;
		}
		else {
			cantPremium += litros;
			return true;
		}
	}
	
	//getters
	public int getCantGasoil() {
		return cantGasoil;
	}

	public int getCantSuper() {
		return cantSuper;
	}

	public int getCantPremium() {
		return cantPremium;
	}

	public int getMaximaCarga() {
		return maximaCarga;
	}
	public int getNroSurtidor() {
		return nroSurtidor;
	}
	public int getSigNroSurtidor() {
		return sigNroSurtidor;
	}
}
