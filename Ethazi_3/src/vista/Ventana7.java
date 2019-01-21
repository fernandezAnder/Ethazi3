package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSlider;

public class Ventana7 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ventana7() {
		setLayout(null);
		
		JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
		lblEskerrikAsko.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblEskerrikAsko.setBounds(98, 75, 245, 41);
		add(lblEskerrikAsko);
		
		JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");
		lblZureTxartelaOrain.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblZureTxartelaOrain.setBounds(81, 127, 272, 46);
		add(lblZureTxartelaOrain);

	}
}
