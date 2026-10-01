package excepcUsuario;

public class Main {

	public static void main(String[] args) {
		Usuario usuario;
		try {
			usuario = new Usuario("Lionel Roberto Messi","eehh123");
			System.out.println("Se pudió");
			System.out.println(usuario + "\n");

			usuario = new Usuario("nico nico niii", "");
			System.out.println("se pudió");
			System.out.println(usuario + "\n");
			
			usuario = new Usuario("","ase");
			System.out.println("Se pudió");
			System.out.println(usuario);
		}
		catch (NombreInvalidoException e) {
			System.out.println(e.getTipoError());
		}
		catch (ContraseñaInvalidaException e) {
			System.out.println(e.getTipoError());
		}
		

	}

}
