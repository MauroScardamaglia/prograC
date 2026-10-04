package excepBanco;

public class Main {

	public static void main(String[] args) throws ExtraccionInvalidaException {
		CuentaBancaria cuenta = new CuentaBancaria("Leonard Shelby");
			
		try {
			cuenta.depositar(15);
			System.out.println(cuenta + "\n");
//			cuenta.depositar(-2);
//			System.out.println(cuenta + "\n");
			cuenta.depositar(30);
			System.out.println(cuenta + "\n");
			
			cuenta.extraer(15);
			System.out.println(cuenta + "\n");
//			cuenta.extraer(-6);
//			System.out.println(cuenta + "\n");
			cuenta.extraer(100);
			System.out.println(cuenta + "\n");
		}
		catch(DepositoInvalidoException e){
			System.out.println(e.getInf());
		}
		catch(ExtraccionInvalidaException e) {
			System.out.println(e.getInf());
			throw e; // esto es para probar que se crashee el programa
		}

	}

}
