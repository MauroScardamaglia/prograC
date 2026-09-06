package tp2_ej7;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		ArrayList<String> cel1 = new ArrayList<>();
		ArrayList<String> cel2 = new ArrayList<>();
		ArrayList<String> cel3 = new ArrayList<>();
		ArrayList<String> cel4 = new ArrayList<>();
		ArrayList<String> cel5 = new ArrayList<>();

		cel1.add("223 518 9699");
		cel1.add("11 1256 9810");
		Telefonos t1 = new Telefonos("450 4388", cel1);
		agenda.alta("Mauro Scardamaglia", t1);
		
		cel2.add("5345 123 010");
		Telefonos t2 = new Telefonos("450 4388", cel2);
		agenda.alta("Gabriela Fumero", t2);
		
		cel3.add("11 1234 7890");
		Telefonos t3 = new Telefonos(cel3);
		agenda.alta("Jose Antonio Garbaréz", t3);
		
		Telefonos t4 = new Telefonos("440 7410");
		agenda.alta("Nikolá Tesla", t4);
		
		cel5.add("223 518 9700");
		cel5.add("105 123 8828");
		cel5.add("101 150 7205");
		Telefonos t5 = new Telefonos("141 654 9102",cel5);
		agenda.alta("Luo Ji", t5);
		
		
		System.out.println("4. Mostrar todos los contactos\n");
		agenda.mostrarContactos();
		
		System.out.println("2. Búsqueda de un contacto por nombre\n");
		System.out.println("Vamos a buscar Luo Ji \n");
		if (agenda.seEncuentra("Luo Ji")) {
				System.out.println("Se encontró\n");
				agenda.mostrarContacto("Luo Ji");
		}
		
		System.out.println("Vamos a buscar Sarah Johnson\n");
		if (agenda.seEncuentra("Sarah Johnson")) {
				System.out.println("Se encontró\n");
				agenda.mostrarContacto("Sarah Johnson");
		}
		else
			System.out.println("No se encontró\n");
		
		System.out.println("alta pablo\n");
		Telefonos aux1 = new Telefonos("900 123 8292");
		agenda.alta("pablo", aux1);
		
		System.out.println("alta Nikolá Tesla\n");
		agenda.alta("Nikolá Tesla", aux1);
		
		Telefonos aux2 = new Telefonos("901 153 8162");
		System.out.println("Modificacion Gabriela Fumero\n");
		agenda.modificacion("Gabriela Fumero", aux2);
		
		System.out.println("Modificacion Albert Einsten\n");
		agenda.modificacion("Albert Einstein", aux2);

		System.out.println("Baja Mauro Scardamaglia\n");
		agenda.baja("Mauro Scardamaglia");
		
		System.out.println("Baja Fulano de Tal\n");
		agenda.baja("Fulano de Tal");
		
		agenda.mostrarContactos();
	}
		// 				|	LISTOOOOOOOOOOOOOOOOOOOOO
}
