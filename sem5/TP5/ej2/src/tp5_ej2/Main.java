package tp5_ej2;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Libro lib1 = new Libro(1,"El Problema de los 3 Cuerpos",2006);
		Libro lib2 = new Libro(2,"El Bosque Oscuro",2008);
		Libro lib3 = new Libro(3,"El Fin de la Muerte",2010);

		Revista rev1 = new Revista(1, "Patouruzú", 1999,1);
		Revista rev2 = new Revista(2, "Patouruzú", 1999,2);
		
		ArrayList<Cancion> canciones1 = new ArrayList<>();
		ArrayList<Cancion> canciones2 = new ArrayList<>();
		ArrayList<Cancion> canciones3 = new ArrayList<>();

		canciones1.add(new Cancion(1,"Power",3,2));
		canciones1.add(new Cancion(2,"Monster",5,35));
		canciones1.add(new Cancion(3,"Who will survive in America?",5,8));
		
		canciones2.add(new Cancion(1,"F*ck Your Ethnicity",3,45));
		canciones2.add(new Cancion(2,"ADHD",3,36));
		canciones2.add(new Cancion(3,"No Make-Up",3,56));
		
		canciones3.add(new Cancion(1,"Black SkkkkHead",2,12));
		canciones3.add(new Cancion(2,"New Slaves",3,47));
		
		Disco disk1 = new Disco(1,"MBFTF","Kanye West",canciones1);
		Disco disk2 = new Disco(2,"Section.80","Kendrick Lamar",canciones2);
		Disco disk3 = new Disco(3,"Yeezus","Kanye West",canciones3);
	
		System.out.println(lib1);
		System.out.println(lib2);
		System.out.println(lib3);
		System.out.println(rev1);
		System.out.println(rev2);
		System.out.println(disk1.compareTo(disk3));
		System.out.println(disk1.compareTo(disk2));
		System.out.println(disk2.compareTo(disk3));
	
	}

}
