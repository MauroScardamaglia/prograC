package paq;

public class Main {

	public static void main (String[] args) {
		Socio[] socios = new Socio[4];
		int i;
		socios[0] = new Socio(1,"Pepe González",35);
		socios[1] = new Socio (2,"María Rodriguez de la Sarna",64);
		socios[2] = new Socio(3,"Mariano Federico Milán",17);
		socios[3] = new Socio(4,"Jesús Aurelio Sagrado",92);
		
		System.out.println("ID  Nombre y Apellido   Edad  Cuota");
		for (i=0;i<4;i++) {
			System.out.println(socios[i].id + "  " + socios[i].nombre + "   " + socios[i].edad + "   $" + socios[i].calcularCuota());
		}
	}
}
