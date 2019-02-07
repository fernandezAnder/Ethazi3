package vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Contador;
import controlador.Metodoak;

import java.awt.Font;

public class Ventana7 extends JFrame {
	private JLabel lblEskerrikAsko = new JLabel("Eskerrik asko erosteagatik ");
	private JLabel lblZureTxartelaOrain = new JLabel("Zure txartela orain aterako da");
	private JLabel icono = new JLabel();

	public Ventana7() {
		
		
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//LABEL ESKERRIK ASKO
		lblEskerrikAsko.setFont(new Font("Arial", Font.PLAIN, 46));
		lblEskerrikAsko.setBounds(70, 95, 565, 78);
		getContentPane().add(lblEskerrikAsko);
		
		//LABEL ZURE TXARTELA ORAIN
		lblZureTxartelaOrain.setFont(new Font("Arial", Font.PLAIN, 41));
		lblZureTxartelaOrain.setBounds(70, 198, 555, 45);
		getContentPane().add(lblZureTxartelaOrain);
		
		
		
		icono.setBounds(194, 306, 307, 141);
		getContentPane().add(icono);
		icono.setIcon(new ImageIcon(Ventana7.class.getResource("/argazkiak/termibus.png")));
		
		
		
	}
}
