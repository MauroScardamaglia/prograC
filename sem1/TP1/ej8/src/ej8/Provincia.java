package ej8;

public class Provincia {
	private String nombre;
	private int cantCiudades;
	private Ciudad[] ciudades;
	private final static int MAX_CIUDADES = 25;
	
	public Provincia(String nombre){
		this.nombre = nombre;
		cantCiudades = 0;
		ciudades = new Ciudad[MAX_CIUDADES];
	}
	
	public void agregarCiudad(String nombre, int cantHabitantes, double gastos, double imp1, double imp2) {
		ciudades[cantCiudades] = new Ciudad(nombre,cantHabitantes);
		ciudades[cantCiudades].setMontos(gastos,  imp1,  imp2);
		cantCiudades++;
	}	
	
	public boolean deficit(){
		int i, cantDeficit = 0, cantCiudadesAConsiderar = 0;
		double porc = 0;
		Ciudad ciudad;

		System.out.println(nombre + ":");
		for (i=0; i < cantCiudades; i++) {
			ciudad = ciudades[i];
			System.out.println(ciudad.getNombre() + ciudad.getCantHabitantes() + " habitantes \nBalance: $" + ciudad.balance() + ".");
			if (ciudad.getCantHabitantes() >= Pais.COND_HABITANTES) {
				cantCiudadesAConsiderar++;
				if (ciudad.balance() < 0)
					cantDeficit++;
			}
		}
		if (cantCiudadesAConsiderar > 0)
			porc =  (double) cantDeficit / cantCiudadesAConsiderar;
		System.out.println("\nEl porcentaje de ciudades que cumplen la condición y tienen deficit sobre las que cumplen la condición es "
				+ porc + "%.\n");
		if (porc >= 0.5)
			return true;
		else
			return false;
	}
	
	public int getCantCiudades() {
		return cantCiudades;
	}
	
	public String getNombre() {
		return nombre;
	}
}