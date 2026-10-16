package gui;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class Main {
	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ventana de Prueba");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(10,10));
		panelPrincipal.add(new JPanel(),BorderLayout.NORTH);
		panelPrincipal.add(new JPanel(),BorderLayout.SOUTH);
		panelPrincipal.add(new JPanel(),BorderLayout.WEST);
		panelPrincipal.add(new JPanel(),BorderLayout.EAST);
		
		
		// esta forma es más directa
		JPanel panelEntradaTexto = new JPanel(new FlowLayout());
		
		JLabel infoTexto = new JLabel("Ingrese Texto Random :0");
		JTextField cuadroTexto = new JTextField(10);
		
		panelEntradaTexto.add(infoTexto);
		panelEntradaTexto.add(cuadroTexto);		

		panelPrincipal.add(panelEntradaTexto,BorderLayout.CENTER);
		
		ventana.getContentPane().add(panelPrincipal);
		ventana.pack();
		ventana.setSize(500,500);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
}