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

public class  Ventana5 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	JButton bukatu = new JButton("Bukatu");
    JButton ezeztatu = new JButton("Ezeztatu");
	/**
	 * Create the panel.
	 */
	public Ventana5() {
		 
    	//EZEZTATU BOTOIA
    	ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
    	ezeztatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			
   			 if(Frame.Ventana4.isVisible()){
                	Frame.Ventana1.setVisible(true);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
            	}
   			 
   		 }
    	});
    	ezeztatu.setBounds(121, 541, 121, 37);
    	add(ezeztatu);
    
    	//BUKATU BOTOIA
    	bukatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
    	bukatu.addActionListener(new ActionListener() {
   		 public void actionPerformed(ActionEvent e) {
   			 if(Frame.Ventana4.isVisible()){
                	Frame.Ventana5.setVisible(true);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);
                	Frame.Ventana4.setVisible(false);  
            	}
   			Frame.Ventana4.ezeztatu.setEnabled(true);
   		 }
    	});
	}
}
