package tp2_ej6;

public class Main {

	public static void main(String[] args) {
		Estacion estacion = new Estacion();
		Surtidor s1 = new Surtidor();
		Surtidor s2 = new Surtidor();
		Surtidor s3 = new Surtidor();
		Surtidor s4 = new Surtidor();
		Surtidor s5 = new Surtidor();
		
		estacion.añadirSurtidor(s1);
		estacion.añadirSurtidor(s2);
		estacion.añadirSurtidor(s3);
		estacion.añadirSurtidor(s4);
		estacion.añadirSurtidor(s5);
		
		s1.extraerGasoil(150);
		s4.extraerPremium(20);
		s2.extraerSuper(2000);
		s5.extraerPremium(100);
		s1.extraerGasoil(20000);
		s1.extraerPremium(50);
		s1.extraerSuper(25);
		s1.llenarDepositoGasoil();
		s1.extraerGasoil(10);
		s2.extraerSuper(250);
		s4.extraerSuper(190);
		s5.extraerPremium(200);
		
		System.out.println("1) Conocer la cantidad total de surtidores: " + estacion.cantSurtidores() + "\n\n\n");
		System.out.println("2) Conocer la existencia en litros de un determinado tipo de combustible \n");
		System.out.println("Gasoil: " + estacion.cantLitrosDisponiblesGasoil() + "l.\n");
		System.out.println("Super: " + estacion.cantLitrosDisponiblesSuper() + "l.\n");
		System.out.println("Premium: " + estacion.cantLitrosDisponiblesPremium() + "l.\n");
		System.out.println("\n");
		
		System.out.println("3) Informar cual es el surtidor que ha realizado mayor cantidad de ventas de un tipo de\n" + 
				"combustible.\n");
		System.out.println("Gasoil:\n");
		estacion.informarSurtidorMayorCantVentas("Gasoil");
		System.out.println("Super:\n");
		estacion.informarSurtidorMayorCantVentas("Super");
		System.out.println("Premium:\n");
		estacion.informarSurtidorMayorCantVentas("Premium");

		System.out.println("\n\n4. Conocer el histórico de los litros vendidos de un determinado combustible, de un"+
				"determinado surtidor y de toda la estación.\n" );
		estacion.informarHistorico();
		
		estacion.informarHistorico("Gasoil");
		estacion.informarHistorico("Super");
		estacion.informarHistorico("Premium");
		
		estacion.informarHistorico(s1);
		estacion.informarHistorico(s2);
		estacion.informarHistorico(s3);
		estacion.informarHistorico(s4);
		estacion.informarHistorico(s5);
		
		// 					PERFECTIRIJILO  // LA PUTA MADRE ESTUVE COMO 3 HORAS HACIENDO ESTO 
	}

}
