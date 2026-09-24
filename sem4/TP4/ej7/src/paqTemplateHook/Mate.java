package paqTemplateHook;

public class Mate extends Infusion {

	public Mate() {
		super();
	}
	
	@Override
	public void tipoInfusion() {
		System.out.println("Mate");
	}
	
	@Override
	public void agregarTipoInfusion() {
		System.out.println("Se agrega Yerba al mate");
	}
	
}
