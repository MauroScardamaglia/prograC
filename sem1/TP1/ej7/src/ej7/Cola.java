package ej7;

public class Cola {
	int datos[];
	final static int MAX = 256;
	int inicio, fin;

	public Cola() {
		datos = new int[MAX];
		inicio = -1;
		fin = -1;
	}
	
	public boolean vacioCola() {
		return inicio == -1;
	}
	
	
	public void agregarCola(int x){
		if (vacioCola())
			inicio++;
		if (fin != MAX -1)
			datos[fin++] = x;
	}
	
	public int sacarCola() {
		if (!vacioCola()) {
			int aux = datos[inicio];
			inicio++;
			return aux;
		}
		else
			return -1;
	}


}
