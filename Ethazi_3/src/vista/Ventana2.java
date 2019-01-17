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

public class  Ventana2 extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
	JButton btnJarraitu = new JButton("jarraitu");
	/**
	 * Create the panel.
	 */
	public Ventana2() {
		setMinimumSize(new Dimension(500, 500));
	   	setAutoscrolls(true);
	   	setPreferredSize(new Dimension(719, 569));
	   	setMaximumSize(new Dimension(32870, 32833));
	   	
	   	this.setBackground(SystemColor.control);
    	setLayout(null);
    	           	 
	
		btnJarraitu.setBounds(335, 523, 117, 46);
	
		//JARRAITU BOTOIA
		btnJarraitu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnJarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Frame.Ventana2.isVisible()){
	            	Frame.Ventana3.setVisible(true);
	            	Frame.Ventana4.setVisible(false);
	            	Frame.Ventana5.setVisible(false);
	            	Frame.Ventana6.setVisible(false);
	            	Frame.Ventana7.setVisible(false);
	            	Frame.Ventana1.setVisible(false);
	            	Frame.Ventana2.setVisible(false);
				}

		}
});
}
}

