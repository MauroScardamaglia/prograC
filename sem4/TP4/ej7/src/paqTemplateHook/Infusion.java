package paqTemplateHook;

public abstract class Infusion {
	public Infusion() {
		
	}
	
	public void prepararInfusion() {
		// template methods
		tipoInfusion();
		calentarAgua();
		agregarTipoInfusion();
		// hook method
		endulzar();
		System.out.println();
	}

	public void tipoInfusion() {
		System.out.println("Infusión Genérica");
	}
	
	public void calentarAgua() {
		System.out.println("Calentando el agua");
	}
	
	public void agregarTipoInfusion() {
		
	}
	
	public void endulzar() {
		System.out.println("La bebida se tomará amarga");
	}
}
