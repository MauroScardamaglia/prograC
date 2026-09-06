package tp2_ej5;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Empresa empresa = new Empresa();
		
		
		// es mala práctica pasar parametros y construir el objeto en el método, es mejor pasar el objeto mismo
		//empresa.añadirCategoria("Gil laburante", 2.0);
		//empresa.añadirCategoria("Chofer piola", 5000);
		//empresa.añadirCategoria("Chofer CEO", 100000);
	
		Categoria cat1 = new Categoria("Gil laburante", 2.0);
		Categoria cat2 = new Categoria("Chofer piola", 5000);
		Categoria cat3 = new Categoria("Chofer CEO", 100000);
		
		empresa.añadirCategoria(cat1);
		empresa.añadirCategoria(cat2);
		empresa.añadirCategoria(cat3);
		
		
		
		//empresa.añadirColectivo("Colectivo Azul");
		//empresa.añadirColectivo("Colectivo Marrón");
		//empresa.añadirColectivo("Colectivo Rojo");
		
		Colectivo col1 = new Colectivo("Colectivo Azul");
		Colectivo col2 = new Colectivo("Colectivo Marrón");
		Colectivo col3 = new Colectivo("Colectivo Rojo");
	
		empresa.añadirColectivo(col1);
		empresa.añadirColectivo(col2);
		empresa.añadirColectivo(col3);
		
		
		
		Domicilio dom1 = new Domicilio("Bariloche",586);
		Chofer ch1 = new Chofer(cat3,dom1,"MauropleXOR Chadmaglia",col1);
		Domicilio dom2 = new Domicilio("Avenida SiempreViva",50);
		Chofer ch2 = new Chofer(cat1,dom2,"Homero \"Odyseo\" Simpson,",col2);
		Domicilio dom3 = new Domicilio("Bariloche",586); // el domicilio tiene relación de composición, hay 1 objeto independiente por cada chofer, aunque tengan mismos valores son 2 objetos distintos
		Chofer ch3 = new Chofer(cat2,dom3,"Pipo \"garra fuerte\" Greyson Galbumaglia",col3);
		Domicilio dom4 = new Domicilio("Av. Independencia",1590);
		Chofer ch4 = new Chofer(cat1,dom4,"Átomo de Silicio"); // no conduce ningún colectivo
		
		empresa.añadirChoferes(ch1);
		empresa.añadirChoferes(ch2);
		empresa.añadirChoferes(ch3);
		empresa.añadirChoferes(ch4);
		
		
		
		System.out.println("Hora de hacer testing\n\n");
		
		System.out.println("Información de choferes: \n");
		System.out.println(ch1.toString());
		System.out.println(ch2.toString());
		System.out.println(ch3.toString());
		System.out.println(ch4.toString());
		
		System.out.println("1) ¿Cuántos choferes no tienen un colectivo asignado?\n");
		System.out.println(empresa.cantChoferesSinColectivo() + "\n");
		
		System.out.println("2) ¿Cuántos colectivos posee la empresa en total?\n");
		System.out.println(empresa.cantColectivos() + "\n");
		
		System.out.println("3) ¿Qué choferes pertencen a una determinada categoría?\n");
		ArrayList<Chofer> choferes;
		choferes = empresa.choferesMismaCategoria(cat1);
		
		// con respecto a los for, si uno declara la variable "i" dentro del for, esta sobrevive solo en el for, luego para usarla de vuelta hay que volver a declararla
		for (int i=0;i < choferes.size();i++)
			System.out.println(choferes.get(i).toString() + "\n");
		
		choferes = empresa.choferesMismaCategoria(cat2);
		for (int i=0;i < choferes.size();i++)
			System.out.println(choferes.get(i).toString() + "\n");
		
		choferes = empresa.choferesMismaCategoria(cat3);
		for (int i=0;i < choferes.size();i++)
			System.out.println(choferes.get(i).toString() + "\n");
		System.out.println("\n");
		
		System.out.println("4) ¿Qué categorías tienen un sueldo superior a un monto determinado?\n");
		double monto = 5;
		ArrayList<Categoria> categorias = empresa.categoriasSueldoSuperior(monto);

		for (int i=0; i< categorias.size();i++)
			System.out.println(categorias.get(i).toString() + "\n");
		
		System.out.println("5) ¿Qué choferes tienen un sueldo superior a un monto determinado?\n");
		monto = 10;
		choferes = empresa.choferesSueldoSuperior(monto);
		
		for (int i=0;i<choferes.size();i++)
			System.out.println(choferes.get(i).toString() + "\n");
	} // SOLIDO
}