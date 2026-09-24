package paqTemplateHook;

public class Main {

	public static void main(String[] args) {
		Infusion mate = new Mate();
		Infusion cafeAmargo = new CafeAmargo();
		Infusion cafeDulce = new CafeDulce();

		mate.prepararInfusion();
		cafeAmargo.prepararInfusion();
		cafeDulce.prepararInfusion();
		
	}

}
