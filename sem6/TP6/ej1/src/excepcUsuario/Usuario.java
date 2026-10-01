package excepcUsuario;

public class Usuario {
	private String nombre, contraseña;
	/*
		ámbos válidos si es distinto de null y de vacío ("")
		la contraseña, además, necesita tener más de 6 caracteres, y el primero debe ser una letra
	 */
	
	@Override
	public String toString() {
		return "Usuario: " + nombre + "\nContraseña: " + contraseña; // jajaj era re inseguro el sistema
	}
	
	public Usuario(String nombre, String contraseña) throws NombreInvalidoException, ContraseñaInvalidaException {
		super();
		setNombre(nombre);
		setContraseña(contraseña);
	}
	
	public void setNombre(String nombre) throws NombreInvalidoException {
		if (nombre == null)
			throw new NombreInvalidoException("Nombre Nulo");
		else if (nombre.equals(""))
			throw new NombreInvalidoException("Nombre Vacío");
		else
			this.nombre = nombre;
	}

	public void setContraseña(String contraseña) throws ContraseñaInvalidaException {
		if (contraseña == null)
			throw new ContraseñaInvalidaException("Contraseña Nula");
		else if (contraseña.equals(""))
			throw new ContraseñaInvalidaException("Contraseña Vacía");
		else if (contraseña.length() < 6)
			throw new ContraseñaInvalidaException("Contraseña con Menos de 6 Caracteres");
		else if (!Character.isLetter(contraseña.charAt(0)))
			throw new ContraseñaInvalidaException("Contraseña con 1er Caracter No Letra");
		else
			this.contraseña = contraseña;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getContraseña() {
		return contraseña;
	}
}