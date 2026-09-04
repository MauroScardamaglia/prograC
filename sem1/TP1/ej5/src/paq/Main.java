package paq;

public class Main {

	public static void main(String[] args) {
		Guerrero prota = new Guerrero("Marco Aurelio");
		
		prota.mover(23,46.23);
		prota.recibirDano(23);
		prota.mover(-1.23, 92.11);
		
		System.out.println(prota.getNombre() + " " + prota.getVida() + " " + prota.getArmadura() + " " + prota.getX() + " " + prota.getY());
		
		prota.mover(12, -21.2);
		prota.recibirDano(12);
		
		System.out.println(prota.getNombre() + " " + prota.getVida() + " " + prota.getArmadura() + " " + prota.getX() + " " + prota.getY());
		
		prota.recibirDano(45.9);
		
		System.out.println(prota.getNombre() + " " + prota.getVida() + " " + prota.getArmadura() + " " + prota.getX() + " " + prota.getY());
		
		prota.recibirDano(87.2);
		
		System.out.println(prota.getNombre() + " " + prota.getVida() + " " + prota.getArmadura() + " " + prota.getX() + " " + prota.getY());
		
		prota.recibirDano(52.2);
		
		prota.recibirDano(87.2);
		
		System.out.println(prota.getNombre() + " " + prota.getVida() + " " + prota.getArmadura() + " " + prota.getX() + " " + prota.getY());
		
	}
}
