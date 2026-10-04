package naftaExcep;

public class Main {

	public static void main(String[] args) {
		Surtidor surtidor = new Surtidor();

		try {
			surtidor.cargarCombustible("Premium", 2);
			System.out.println(surtidor + "\n\n");
			
//			surtidor.cargarCombustible("sarasa", 2);
//			System.out.println(surtidor + "\n");
			
//			surtidor.cargarCombustible("diEseL", -92);
//			System.out.println(surtidor + "\n");

			surtidor.cargarCombustible("Super", 65000);
			System.out.println(surtidor + "\n");
			
		}
		catch (CargaInvalidaException e) {
			System.out.println(e.getInfo());
		}
		finally {
			System.out.println("\nFinally: Bye bye");
		}

	}
}
