package tp5_ej2;
import java.util.ArrayList;

public class Disco implements Prestable, Comparable<Disco> {
	private int codigo;
	private String titulo, interprete;
	ArrayList<Cancion> listaCanciones;
	private boolean prestado;
	
	public Disco(int codigo, String titulo, String interprete, ArrayList<Cancion> listaCanciones) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.interprete = interprete;
		this.listaCanciones = listaCanciones;
		this.prestado = false;
	}

	// Interfaz Comparable
	@Override
	public int compareTo(Disco otro) {
		int res, inter;
		inter = this.interprete.compareTo(otro.getInterprete());
		res = inter;
		if (res == 0)
			res = this.titulo.compareTo(otro.getTitulo());
		
		return res;
	}
	
	// Interfaz Prestable
	@Override
	public void prestar() {
		prestado = true;
	}
	@Override
	public void devolver() {
		prestado = false;
	}
	@Override
	public boolean isPrestado() {
		return prestado;
	}
	
	
	// getters
	public int getCodigo() {
		return codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public ArrayList<Cancion> getListaCanciones() {
		return listaCanciones;
	}
}
