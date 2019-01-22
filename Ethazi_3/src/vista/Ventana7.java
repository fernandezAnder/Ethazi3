package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;

public class Ventana7 extends JPanel {
	JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
	JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");

	/**
	 * Create the panel.
	 */
	public Ventana7() {
		setLayout(null);
		
		lblEskerrikAsko.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblEskerrikAsko.setBounds(98, 75, 245, 41);
		add(lblEskerrikAsko);
		
		lblZureTxartelaOrain.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblZureTxartelaOrain.setBounds(81, 127, 272, 46);
		add(lblZureTxartelaOrain);

	}
}
