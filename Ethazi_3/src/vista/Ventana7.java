package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana7 extends JPanel {
	JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
	JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");

	/**
	 * Create the panel.
	 */
	public Ventana7() {
		this.setBounds(275,100,700,600);
		
		//LABEL ESKERRIK ASKO
		lblEskerrikAsko.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblEskerrikAsko.setBounds(217, 74, 346, 78);
		add(lblEskerrikAsko);
		
		//LABEL ZURE TXARTELA ORAIN
		lblZureTxartelaOrain.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblZureTxartelaOrain.setBounds(207, 182, 389, 78);
		add(lblZureTxartelaOrain);

	}
}
