package tp4__ej4;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		
		vehiculos.add(new Auto("ABC123",2));
		vehiculos.add(new Combi("NA123LK",3));
		vehiculos.add(new CamionetaCarga("CCC333",5,2.15));
		vehiculos.add(new Camion("CTC414",2));
		vehiculos.add(new Combi("LOL520",4));
		vehiculos.add(new Auto("POP617",10));
		vehiculos.add(new Auto("PIP719",3));
		vehiculos.add(new CamionetaCarga("OCT808",7,5.20));
		vehiculos.add(new Camion("NSF923",6));
		vehiculos.add(new Auto("MEN100",1));
		
		for (Vehiculo x : vehiculos) {
			System.out.println(x + "\n");
			System.out.printf("Precio de Alquiler: $%.2f \n\n\n",x.calcularCosto());
		}
	}

}