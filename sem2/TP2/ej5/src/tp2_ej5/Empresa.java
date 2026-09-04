package tp2_ej5;
import java.util.ArrayList;

public class Empresa {
	private ArrayList<Categoria> categorias = new ArrayList<>();
	private ArrayList<Colectivo> colectivos = new ArrayList<>();
	private ArrayList<Chofer> choferes = new ArrayList<>();


/* El sistema debe poder responder a lo siguiente:
1. ¿Cuántos choferes no tienen un colectivo asignado? LISTO
2. ¿Cuántos Colectivos posee la empresa en total? LISTO
3. ¿Qué choferes pertenecen a una determinada categoría? LISTO
4. ¿Qué categorías tienen un sueldo superior a un monto determinado? LISTO
5. ¿Qué choferes tienen un sueldo superior a un monto determinado? LISTO */

	public Empresa() {
		
	}

	public void añadirCategoria(String nombre, double sueldo) {
		categorias.add(new Categoria(nombre, sueldo));
	}
	
	public void añadirColectivo(String modelo) {
		colectivos.add(new Colectivo(modelo));
	}
	
	public void añadirChoferes(Categoria categoria, String nombre, String calle, int altura) {
		Domicilio dom = new Domicilio(calle, altura);
		this.choferes.add(new Chofer(categoria, dom, nombre));
	}
	public void añadirChoferes(Categoria categoria, String nombre, String calle, int altura, Colectivo colectivo) {
		Domicilio dom = new Domicilio(calle, altura);
		this.choferes.add(new Chofer(categoria, dom, nombre, colectivo));
	}
	
	public int cantChoferesSinColectivo() {
		int cant = 0;
		for (int i = 0; i < choferes.size(); i++) {
			if (!choferes.get(i).tieneColectivo())
				cant ++;
		}
		return cant;
	}
	
	public int cantColectivos() {
		return colectivos.size();
	}
	
	public ArrayList<Chofer> choferesMismaCategoria(Categoria categoria){
		ArrayList<Chofer> choferes = new ArrayList<>;
		for (int i = 0; i < this.choferes.size(); i++)
			if (this.choferes.get(i).getCategoria() == categoria)
				choferes.add(this.choferes.get(i));
		return choferes;
	}
	
	
	public ArrayList<Categoria> categoriasSueldoSuperior(double monto){
		ArrayList<Categoria> categorias = new ArrayList<>();
		for (int i = 0; i < this.categorias.size(); i++)
			if (this.categorias.get(i).getSueldo() > monto)
				categorias.add(this.categorias.get(i));
		return categorias;
	}

	public ArrayList<Chofer> choferesSueldoSuperior(double monto){
		ArrayList<Chofer> choferes = new ArrayList<>();
		for (int i = 0; i < this.choferes.size(); i++)
			if (this.choferes.get(i).getCategoria().getSueldo() > monto)
				choferes.add(this.choferes.get(i));
		return choferes;
	}
}	