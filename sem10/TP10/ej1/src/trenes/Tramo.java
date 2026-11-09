package trenes;

public class Tramo { 
	// RECURSO COMPARTIDO
	private boolean sentidoCirculacionIzqDer;
	int cantEsperandoIzqDer;
	int cantEsperandoDerIzq;
	int cantCirculando;
	private String nombre;
	// monitor implícito único para toda la instancia

	public Tramo(String nombre) {
		this.nombre = nombre;
		
		this.cantEsperandoIzqDer = this.cantEsperandoDerIzq = 0;
		this.sentidoCirculacionIzqDer = true; // arbitrariamente
		this.cantCirculando = 0;
	}

	public void sumarTrenEsperando(Tren tren) {
		if (tren.isDireccionIzqDer())
			cantEsperandoIzqDer ++;
		else
			cantEsperandoDerIzq ++;		
	}
	
	public void quitarTrenEsperando(Tren tren) {
		if (tren.isDireccionIzqDer())
			cantEsperandoIzqDer --;
		else
			cantEsperandoDerIzq --;		
	}
	
	private boolean hayMismoSentido(Tren tren) {
		return sentidoCirculacionIzqDer == tren.isDireccionIzqDer();
	}
	
	private boolean hayTrenesEsperando(Tren tren) {
		if (sentidoCirculacionIzqDer)
			return cantEsperandoIzqDer > 0;
		else
			return cantEsperandoDerIzq > 0;
	}
	
	private boolean trenPuedePasar(Tren tren) {
		if (cantCirculando == 0) {
			sentidoCirculacionIzqDer = tren.isDireccionIzqDer();
		}
		return hayMismoSentido(tren);
	}

	public synchronized void entraTren(Tren tren) throws InterruptedException {
		sumarTrenEsperando(tren);
		while (!trenPuedePasar(tren)) {
			wait();
		}
		quitarTrenEsperando(tren);
		cantCirculando++;
		System.out.println("Hay " + cantEsperandoIzqDer + " trenes esperando para ir hacia la derecha" + " & " + cantEsperandoDerIzq + " trenes esperando para ir a la izquierda");
				
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- \n" + tren + " entra por " + this + "\n--- --- --- --- --- --- --- --- --- --- --- --- --- \n");

	}
	
	public synchronized void saleTren(Tren tren) throws InterruptedException {
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- \n" + tren + " sale por " + this + "\n--- --- --- --- --- --- --- --- --- --- --- --- --- \n");
		cantCirculando --;
		notifyAll();
	}
	
	@Override
	public String toString() {
		return "Tramo <" + nombre + ">";
	}
}
