package trenes;

public class Tramo { 
	// RECURSO COMPARTIDO
	private boolean sePuedePasar;
	private boolean tienePreferenciaIzqDer;
	int cantEsperandoIzqDer;
	int cantEsperandoDerIzq;
	private String nombre;
	// monitor implícito único para toda la instancia

	public Tramo(String nombre) {
		this.nombre = nombre;
		
		this.sePuedePasar = true;
		this.cantEsperandoIzqDer = this.cantEsperandoDerIzq = 0;
		this.tienePreferenciaIzqDer = true; // arbitrariamente
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
	
	private boolean hayMismaPreferencia(Tren tren) {
		return tienePreferenciaIzqDer == tren.isDireccionIzqDer();
	}
	
	private boolean hayTrenesEsperando(Tren tren) {
		if (tienePreferenciaIzqDer)
			return cantEsperandoIzqDer > 0;
		else
			return cantEsperandoDerIzq > 0;
	}
	
	private boolean trenPuedePasar(Tren tren) {
		return sePuedePasar && (hayMismaPreferencia(tren) || !(hayTrenesEsperando(tren)) );
	}

	public synchronized void pasaTren(Tren tren) throws InterruptedException {
		sumarTrenEsperando(tren);
		while (!trenPuedePasar(tren)) {
			wait();
		}
		quitarTrenEsperando(tren);
		System.out.println("Hay " + cantEsperandoIzqDer + " trenes esperando para ir hacia la derecha" + " & " + cantEsperandoDerIzq + " trenes esperando para ir a la izquierda");
				
		System.out.println("--- --- --- --- --- --- --- --- --- --- --- --- --- \n" + tren + " entra por " + this + "\n--- --- --- --- --- --- --- --- --- --- --- --- --- \n");

		sePuedePasar = true; // bueno, ya está, ya la usé
		this.tienePreferenciaIzqDer = !tren.isDireccionIzqDer();
		notifyAll();
	}
	
	@Override
	public String toString() {
		return "Tramo <" + nombre + ">";
	}
}
