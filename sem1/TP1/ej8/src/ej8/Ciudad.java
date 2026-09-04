package ej8;

public class Ciudad {
	private String nombre;
	private int cantHabitantes;
	private double gastosMantenimiento, recImp1, recImp2;
	
	public Ciudad(String nombre, int cantHabitantes) {
		this.nombre = nombre;
		this.cantHabitantes = cantHabitantes;
	}
	
	public void setMontos(double gastosMantenimientos, double recImp1, double recImp2) {
		this.gastosMantenimiento = gastosMantenimientos;
		this.recImp1 = recImp1;
		this.recImp2 = recImp2;
	}
	
	public double balance() {
		return recImp1 + recImp2 - gastosMantenimiento;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public double getGastosMantenimiento() {
		return gastosMantenimiento;
	}

	public void setGastosMantenimiento(double gastosMantenimiento) {
		this.gastosMantenimiento = gastosMantenimiento;
	}

	public String getNombre() {
		return nombre;
	}
}
