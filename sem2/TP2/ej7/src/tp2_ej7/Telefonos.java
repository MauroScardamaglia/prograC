package tp2_ej7;
import java.util.ArrayList;

public class Telefonos {
	private String telefonoFijo = null;
	private ArrayList<String> telefonosCelulares = new ArrayList<>();

	// constructores
	public Telefonos() {
		
	}
	public Telefonos(String telefonoFijo, ArrayList<String> telefonosCelulares) {
		this.telefonoFijo = telefonoFijo;
		this.telefonosCelulares = telefonosCelulares;
	}
	public Telefonos(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public Telefonos(ArrayList<String> telefonosCelulares) {
		this.telefonosCelulares = telefonosCelulares;
	}
	
	@Override
	public String toString() {
		String stAux = "";
		for (int i=0; i < telefonosCelulares.size();i++)
			stAux += telefonosCelulares.get(i) + "\n";
		
		if (telefonoFijo != null)
			return telefonoFijo + "\n" + stAux;
		else
			return stAux;
	}
	
	//geters y setters
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public ArrayList<String> getTelefonosCelulares() {
		return telefonosCelulares;
	}	
	
}
