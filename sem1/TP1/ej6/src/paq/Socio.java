package paq;

public class Socio {
	int id, edad;
	String nombre;
	final static double CUOTA = 500, DESC_MENORES = 0.25, DESC_MAYORES = 0.50;
	
	// bob el constructor
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public double calcularCuota() {
		if (edad < 18)
			return CUOTA * (1 - DESC_MENORES);
		else
			if (edad > 65)
				return CUOTA * (1 - DESC_MAYORES);
			else
				return CUOTA;
	}
	
	//getters y setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
