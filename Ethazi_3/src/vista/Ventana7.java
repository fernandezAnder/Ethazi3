package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Ventana7 extends JFrame {
	JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
	JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");

	/**
	 * Create the panel.
	 */
	public Ventana7() {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//LABEL ESKERRIK ASKO
		lblEskerrikAsko.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblEskerrikAsko.setBounds(184, 94, 346, 78);
		getContentPane().add(lblEskerrikAsko);
		
		//LABEL ZURE TXARTELA ORAIN
		lblZureTxartelaOrain.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblZureTxartelaOrain.setBounds(161, 259, 439, 45);
		getContentPane().add(lblZureTxartelaOrain);

	}
}
