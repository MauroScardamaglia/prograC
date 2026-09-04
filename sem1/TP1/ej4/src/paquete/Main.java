package paquete;

public class Main {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo(2,3);
		Rectangulo rec3 = new Rectangulo(2,4,3,6);

		System.out.println("Rectangulo  Ancho Alto   Perimetro  Area");
		System.out.println("Rec1: "+ rec1.ancho() + "   " + rec1.alto() + "  " + rec1.perimetro() + "  " + rec1.area());
		System.out.println("Rec2: "+ rec2.ancho() + "   " + rec2.alto() + "  " + rec2.perimetro() + "  " + rec2.area());
		System.out.println("Rec3: "+ rec3.ancho() + "   " + rec3.alto() + "  " + rec3.perimetro() + "  " + rec3.area());
	}

}
