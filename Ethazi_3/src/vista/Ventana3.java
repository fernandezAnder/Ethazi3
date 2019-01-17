package vista;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class  Ventana3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	JButton jarraitu = new JButton("Jarraitu");
	JButton ezeztatu = new JButton("Ezeztatu");
	JButton atzera = new JButton("Atzera");
	/**
	 * Create the panel.
	 */
	public Ventana3() {
		 //JARRAITU BOTOIA
	   	 jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 jarraitu.addActionListener(new ActionListener() {
	   		 public void actionPerformed(ActionEvent arg0) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana4.setVisible(true);
	                	Frame.Ventana5.setVisible(false);
	                	Frame.Ventana6.setVisible(false);
	                	Frame.Ventana7.setVisible(false);
	                	Frame.Ventana1.setVisible(false);
	                	Frame.Ventana2.setVisible(false);
	                	Frame.Ventana3.setVisible(false);           	 
	             }
	   		 }
	   	 });
	   	 jarraitu.setBounds(497, 464, 120, 40);
	   	 add(jarraitu);
	   	 
	   	 //EZEZTATU BOTOIA
	   	 ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 ezeztatu.addActionListener(new ActionListener() {
	   		 public void actionPerformed(ActionEvent e) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana1.setVisible(true);
	                	Frame.Ventana2.setVisible(false);
	                	Frame.Ventana3.setVisible(false);  
	                	Frame.Ventana4.setVisible(false);
	                	Frame.Ventana5.setVisible(false);
	                	Frame.Ventana6.setVisible(false);
	                	Frame.Ventana7.setVisible(false);
	   			 }
	   		 }
	   	 });
	   	 ezeztatu.setBounds(89, 464, 114, 40);
	   	 add(ezeztatu);
	   	 
	   	 //ATZERA BOTOIA
	   	 atzera.addActionListener(new ActionListener() {
	   		 public void actionPerformed(ActionEvent arg0) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana1.setVisible(false);
	                	Frame.Ventana2.setVisible(true);
	                	Frame.Ventana3.setVisible(false);  
	                	Frame.Ventana4.setVisible(false);
	                	Frame.Ventana5.setVisible(false);
	                	Frame.Ventana6.setVisible(false);
	                	Frame.Ventana7.setVisible(false);
	   			 }
	   			Frame.Ventana3.jarraitu.setEnabled(true);
	   		 }
	   	 });
	   	 atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 atzera.setBounds(294, 463, 114, 42);
	   	 add(atzera);
}
}


