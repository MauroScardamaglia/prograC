package ej8;

public class Pais {
	private String nombre;
	private int cantProvincias;
	private Provincia[] provincias;
	private final static int MAX_PROVINCIAS = 50;
	public final static int COND_HABITANTES = 100000;
	
	public Pais(String nombre) {
		this.nombre = nombre;
		cantProvincias = 0;
		provincias = new Provincia[MAX_PROVINCIAS];
	}
	
	public void agregarProvincia(String nombre) {
		provincias[cantProvincias] = new Provincia(nombre);
		cantProvincias++;
	}
	
	public void listado() {
		int i;
		
		System.out.println();
		for (i=0; i < cantProvincias; i++) {
			System.out.println(i + ":  " +
					provincias[i].getNombre() + "  " + provincias[i].getCantCiudades() + " ciudades.");
		}
	}
	
	public void informe() {
		int i = 0;
		
		System.out.println("Informe Anual Balance de Provincias \n");
		
		for (; i < cantProvincias; i++) {
			if (provincias[i].deficit())
				System.out.println(provincias[i].getNombre() + " está en déficit fiscal.");
			System.out.println();		
		}
	}

	public boolean tieneProv() {
		return cantProvincias >= 0;
	}
	
	public int getCantProvincias() {
		return cantProvincias;
	}

	public Provincia[] getProvincias() {
		return provincias;
	}

	public String getNombre() {
		return nombre;
	}
}
