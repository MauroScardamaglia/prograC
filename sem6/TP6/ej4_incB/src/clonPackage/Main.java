package clonPackage;

public class Main {

	public static void main(String[] args) {
		ConjuntoNumeros conj1, conj2;
		Numero[] numeros1, numeros2;
		
		conj1 = new ConjuntoNumeros("Conjunto A",3);
		System.out.println(conj1 + "\n");
		
		numeros1 = conj1.getNumeros();
		numeros1[0] = new Numero(1);
		numeros1[1] = new Numero(2);
		numeros1[2] = new Numero(3);
		System.out.println(conj1 + "\n");
		
		try {
			conj2 = conj1.clone();
			conj2.setNombre("Conjunto B");
			System.out.println(conj2 + "\n\n\n");
			
			numeros2 = conj2.getNumeros();
			numeros2[0] = new Numero(-1);
			numeros2[1] = new Numero(-2);
			numeros2[2] = new Numero(-3);
			
			System.out.println(conj1 + "\n\n" + conj2);
		}
		catch (CloneNotSupportedException e) {
			System.out.println("ERROR");
		}
	}

}
