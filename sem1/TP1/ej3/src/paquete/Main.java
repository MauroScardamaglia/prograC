package paquete;

/*
	Inciso b)
	Crea la clase Prueba, y en el método main instancia 6 empleados y 3 categorías de manera que
	tengan las siguientes características:
	Empleados:
	• “Juan Perez” - Categoría Principiante – horas trabajadas 100 – antigüedad 4 años
	• “Roberto Gonzalez” - Categoría Principiante – horas trabajadas 120 – antigüedad 8 años
	• “Sandra Lopez” - Categoría Principiante – horas trabajadas 120 – antigüedad 14 años
	• “German Gutierrez” - Categoría Operario – horas trabajadas 110 – antigüedad 16 años
	• “Vicente Hernandez” - Categoría Experto – horas trabajadas 100 – antigüedad 9 años
	• “Carolina Gomez” - Categoría Experto – horas trabajadas 115 – antigüedad 20 años
	Categorías:
	• Principiante - sueldo por hora $ 80
	• Operario - sueldo por hora $ 100
	• Experto sueldo por hora $ 130
	Muestra por pantalla los sueldos de cada empleado.

 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Bienvenido");

		Categoria cat1 = new Categoria("Principiante",80);
		Categoria cat2 = new Categoria("Operario", 100);
		Categoria cat3 = new Categoria("Experto",130);
		
		Empleado emp1 = new Empleado("Juan Perez",4,100,cat1);
		Empleado emp2 = new Empleado("Roberto Gonzalez",8,120,cat1);
		Empleado emp3 = new Empleado("Sandra Lopez",14,120,cat1);
		Empleado emp4 = new Empleado("German Gutierrez",16,110,cat2);
		Empleado emp5 = new Empleado("Vicente Hernandez",9,100,cat3);
		Empleado emp6 = new Empleado("Carolina Gomez",20,115,cat2);
			
		System.out.println(emp1.getNombre()+": $"+emp1.getSueldo());
		System.out.println(emp2.getNombre()+": $"+emp2.getSueldo());
		System.out.println(emp3.getNombre()+": $"+emp3.getSueldo());
		System.out.println(emp4.getNombre()+": $"+emp4.getSueldo());
		System.out.println(emp5.getNombre()+": $"+emp5.getSueldo());
		System.out.println(emp6.getNombre()+": $"+emp6.getSueldo());
		
		
	}
}
