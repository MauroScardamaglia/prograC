package clonPackage;

public class Main {

	public static void main(String[] args) {
		ConjuntoNumeros conj = new ConjuntoNumeros("Mi primer Set de números Enteros",5);
		ConjuntoNumeros conj2;
		int[] numeros = conj.getCeldas();
		
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 2;
		numeros[3] = 3;
		numeros[4] = 4;
		
		System.out.println(conj + "\n");

		try {
			conj2 = (ConjuntoNumeros)conj.clone();
			
			numeros = conj2.getCeldas();
			numeros[0] = 0;
			numeros[1] = 10;
			numeros[2] = 20;
			numeros[3] = 30;
			numeros[4] = 40;
			conj2.setNombre("Evil Conjunto");
			conj2.setLargo(4);
			
			System.out.println(conj + "\n" + conj2);
		}
		catch(CloneNotSupportedException e) {
			System.out.println("ERROR");
		}
		
	}

}
