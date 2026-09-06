package tp2_ej7;
import java.util.HashMap;

public class Agenda {
	private HashMap<String,Telefonos> contactos = new HashMap<>();

	// constructor
	public Agenda() {

	}
	
	//resto de métodos

	public void msjNoEncontrado(String nombre) {
		System.out.println("No existe el contacto \" " + nombre + "\"\n");
	}
	
	// 1. ABM de Contactos
	
	public void alta(String nombre, Telefonos telefonos){
		if (contactos.containsKey(nombre))
			System.out.println("El contacto con nombre \"" + nombre + "\" ya existe, puede modificarlo con la función correspondiente\n");
		else
			contactos.put(nombre, telefonos);
	}
	
	public void modificacion(String nombre, Telefonos telefonos) {
		if (contactos.containsKey(nombre)) {
			System.out.println("Los teléfonos\n" + contactos.get(nombre) + "\n fueron reemplazados por los siguientes \n");
			contactos.put(nombre, telefonos);
			System.out.println(telefonos + "\n");
		}
		else {
			msjNoEncontrado(nombre);
			System.out.println("Puede dar de alta el contacto con la función correspondiente\n");
		}
	}
	
	public void baja(String nombre) {
		if (contactos.containsKey(nombre)) {
			contactos.remove(nombre);
			System.out.println("Se dio de baja el contacto \"" + nombre + "\"\n");
		}
		else 
			msjNoEncontrado(nombre);
	}
	
	
	// 2. Busqueda de un contacto por nombre
	public Telefonos busqueda(String nombre) {
		if (contactos.containsKey(nombre)) {
			return contactos.get(nombre);
		}
		else {
			msjNoEncontrado(nombre);
			return null;
		}
	}
	
	public boolean seEncuentra(String nombre) {
		if (contactos.containsKey(nombre))
			return true;
		else
			return false;
	}
	
	// 4. Mostrar todos los contactos
	public void mostrarContactos() {
		System.out.println("Agenda de contactos:\n\n");
		for (String nombre : contactos.keySet())
			mostrarContacto(nombre);
			
	}
	
	public void mostrarContacto(String nombre) {
		if (contactos.containsKey(nombre))
			System.out.println("Nombre: " + nombre + "\nTeléfonos:\n" + contactos.get(nombre) + "\n");
		else
			System.out.println("-\n");
	}
	
	//getter
 	public HashMap<String,Telefonos> getContactos(){
		return contactos;
	}

}