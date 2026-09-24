package paqTemplateHook;

public class CafeAmargo extends Infusion {

	public CafeAmargo() {
		super();
	}
	
	@Override
	public void tipoInfusion() {
		System.out.println("Café Amargo");
	}
	
	@Override
	public void agregarTipoInfusion() {
		System.out.println("Se agrega Café molido");
	}
}
