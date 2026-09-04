package paq;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hola");
		Empleado emp1 = new Empleado("Mauro Rodriguez","2235189699","mgsgap@gmail.com");
		Producto prod1 = new Producto(1, "Shampoo para calvos", 1999.99);
		Producto prod2 = new Producto(2, "Whisky para gatos", 49999.05);
		Pedido pedido = new Pedido(emp1, "2026-09-02");
		pedido.agregarLineaPedido(prod1, 1);
		pedido.agregarLineaPedido(prod2,  5);
		System.out.println("El costo total es: " + pedido.informarCostoTotal());
		pedido.agregarLineaPedido(prod1, 10);
		System.out.println("El costo total es: " + pedido.informarCostoTotal());
		System.out.println("chau");
	}
}
