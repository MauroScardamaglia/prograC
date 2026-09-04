package tp2_ej5;

public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		
		// es mala práctica pasar parametros y construir el objeto en el método, es mejor pasar el objeto mismo
		empresa.añadirCategoria("Gil laburante", 2.0);
		empresa.añadirCategoria("Chofer piola", 5000);
		empresa.añadirCategoria("Chofer CEO", 100000);
		
		empresa.añadirColectivo("Colectivo Azul");
		empresa.añadirColectivo("Colectivo Marrón");
		empresa.añadirColectivo("Colectivo Rojo");
		
		empresa.añadirChoferes(categoria, nombre, calle, altura);
		
		
		
	}

}
