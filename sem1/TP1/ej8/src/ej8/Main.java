package ej8;

public class Main {

	static public void agregarProvincia(Pais pais) {
		String nomProv;
		
		System.out.println("Nombre de la provincia?");
		nomProv = Entrada.leerString();
		pais.agregarProvincia(nomProv);
	}
	
	static public void agregarCiudad(Pais pais) {
		String nombre;
		int nroProv, cantHabitantes;
		double gastos, imp1, imp2;

		if (pais.tieneProv()) {
			pais.listado();
			System.out.println("\nNro de la provincia? (0 - " + (pais.getCantProvincias() - 1) + ").");
			nroProv = Entrada.leerInt();
			
			System.out.println("Por favor, Ingrese: \n Nombre para la ciudad \n"
					+ "Cantidad de habitantes \nGastos \nImp1 \nImp2");
			nombre = Entrada.leerString();
			cantHabitantes = Entrada.leerInt();
			gastos = Entrada.leerDouble();
			imp1 = Entrada.leerDouble();
			imp2 = Entrada.leerDouble();
			pais.getProvincias()[nroProv].agregarCiudad(nombre, cantHabitantes, gastos, imp1, imp2);
		}
		else
			System.out.println("Todavía no existen provincias en el país.");
	}
	
	public static void main(String[] args) {
		String cadena, cadena2;
		int num;
		double real;
		char c;
		
		cadena = Entrada.leerString();
		System.out.println(cadena);

		System.out.println(cadena);
		
		cadena2 = Entrada.leerString();
		System.out.println(cadena2);
		
		num = Entrada.leerInt();
		System.out.println(num);
		
		real = Entrada.leerDouble();
		System.out.println(real);
		
		c = Entrada.leerChar();
		System.out.println(c);
		
		/*
		char c = 's';
		Pais pais;
		
		System.out.println("Escribe el nombre para el país");
		pais = new Pais(Entrada.leerString());
		
		System.out.println("Desea agregar una provincia (p)? \nAgregar una ciudad(c)? \n"
				+ "Producir un informe (i) \nO finalizar el proceso(n)");
		int a = Entrada.leerInt();
		c = Entrada.leerChar();
		while (c != 'n') {
			if (c == 'c')
				Main.agregarCiudad(pais);
			else
				if (c == 'p')
					Main.agregarProvincia(pais);
				else
					if (c == 'i')
						pais.informe();
			System.out.println("Desea agregar una provincia (p)? \nAgregar una ciudad(c)? \n"
					+ "Producir un informe (i) \nO finalizar el proceso(n)");
			c = Entrada.leerChar();
		}
		*/
	}

}