package co.edu.uniquindio.poo.interfazUser;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class seleccionTorneo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	private JFrame frame;
	pantallaInicio Informacion;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 * @param info 
	 */
	public seleccionTorneo(pantallaInicio info) {
		initialize();
		Informacion=info;
	
	}

	public seleccionTorneo() {
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(162, 219, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
