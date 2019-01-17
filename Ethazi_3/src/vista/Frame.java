package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {

	private JPanel contentPane;

	static Ventana1 Ventana1 = new  Ventana1();
	static Ventana2 Ventana2 = new  Ventana2();
	static Ventana3 Ventana3 = new  Ventana3();
	static Ventana4 Ventana4 = new  Ventana4();
	static Ventana5 Ventana5 = new  Ventana5();
	static Ventana6 Ventana6 = new  Ventana6();
	static Ventana7 Ventana7 = new  Ventana7();

	
	public Frame() {
		setTitle("Makina Saltzailea");
		
		this.setSize(770,670);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		getContentPane().add(Ventana2);
		Ventana2.setVisible(false);
		getContentPane().add(Ventana3);
		Ventana3.setVisible(false);
		getContentPane().add(Ventana4);
		Ventana4.setVisible(false);
		
		Ventana1.setBounds(0, 0, 750, 650);
		Ventana1.addMouseListener(New MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
		   		 if(Ventana1.isVisible()){
		   			Ventana2.setVisible(true);
		        	Ventana3.setVisible(false);
		        	Ventana4.setVisible(false);
		        	Ventana5.setVisible(false);
		        	Ventana6.setVisible(false);
		        	Ventana7.setVisible(false);
		        	Ventana1.setVisible(false);           	 
		   	 
		   		 }   	 
		   		 
		   	 }
			});
		
	}

}
