package paqTemplateHook;

public class CafeDulce extends Infusion {

	public CafeDulce() {
		super();
	}
	
	@Override
	public void tipoInfusion() {
		System.out.println("Café Dulce");
	}

	@Override
	public void agregarTipoInfusion() {
		System.out.println("Se agrega Café molido");
	}
	
	@Override
	public void endulzar() {
		System.out.println("La bebida se tomará dulce");
	}
}
