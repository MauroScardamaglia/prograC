package buscaminas;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.BorderLayout;


public class VentanaGeneracionTablero extends JFrame implements InterfazGeneracionTablero {
	private JButton boton;
	private JTextField campoAncho, campoAlto, campoCantMinas;
	
	public VentanaGeneracionTablero() {
		super("Generar Ventana Buscaminas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout(15,5)); // que son los 10? pixeles?

		JPanel panelCampos = new JPanel();
		panelCampos.setLayout(new BorderLayout(100,40));
		campoAncho = new JTextField(8); // qué valor ingreso?
		campoAlto = new JTextField(8);
		panelCampos.add(campoAncho,BorderLayout.CENTER);
		panelCampos.add(campoAlto,BorderLayout.SOUTH);
		panelPrincipal.add(panelCampos,BorderLayout.NORTH);
		
		
		campoCantMinas = new JTextField(8);
		JPanel panelCampoCantMinas = new JPanel();
		panelCampoCantMinas.add(campoCantMinas);
		panelPrincipal.add(panelCampoCantMinas,BorderLayout.CENTER);
				
		boton = new JButton("Generar Tablero");
		// boton.setActionCommand(COMANDO?);
		JPanel botonera = new JPanel();
		botonera.add(boton);
		panelPrincipal.add(panelCampoCantMinas,BorderLayout.SOUTH);
		
		getContentPane().add(panelPrincipal);
		// esta última línea añade el panel principal que construimos a la ventana
	}
	
	@Override
	public void arrancar() {
		pack();
		setSize(500,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	// inserte controladores
	
	
	
	
	
	

}