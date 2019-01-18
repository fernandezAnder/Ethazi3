package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Ventana2 extends JPanel {

	//Botoiak eta Jlabelak sortzen dira
	JLabel textoAukeratuLinea = new JLabel("Aukeratu linea :");
	JButton btnBilbomungia = new JButton("Bilbo-Mungia");
	JButton btnBilbogernika = new JButton("Bilbo-Gernika");
	JButton btnBilbodonosti = new JButton("Bilbo-Donosti");
	JButton btnAtzera = new JButton("Atzera");

	
	/**
	 * Create the panel.
	 */
	public Ventana2() {
		setLayout(null);
		
		textoAukeratuLinea.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		textoAukeratuLinea.setBounds(108, 29, 193, 35);
		add(textoAukeratuLinea);
		
		btnBilbomungia.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbomungia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBilbomungia.setBounds(125, 97, 176, 27);
		add(btnBilbomungia);
		
		btnBilbogernika.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBilbogernika.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbogernika.setBounds(125, 146, 176, 27);
		add(btnBilbogernika);
		
		btnBilbodonosti.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbodonosti.setBounds(125, 196, 176, 27);
		add(btnBilbodonosti);
		btnAtzera.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		btnAtzera.setBounds(337, 252, 89, 23);
		add(btnAtzera);

	}
}
