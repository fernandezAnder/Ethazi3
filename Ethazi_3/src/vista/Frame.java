package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends JFrame {


	private static final long serialVersionUID = 1L;
	GridBagConstraints config = new GridBagConstraints();
	
	static vista.Ventana1 Ventana1 = new  vista.Ventana1();
	static vista.Ventana2 Ventana2 = new  vista.Ventana2();
	static Ventana3 Ventana3 = new  vista.Ventana3();
	static Ventana4 Ventana4 = new  vista.Ventana4();
	static Ventana5 Ventana5 = new  vista.Ventana5();
	static Ventana6 Ventana6 = new  vista.Ventana6();
	static Ventana7 Ventana7 = new  vista.Ventana7();

	
	public Frame() {
		setTitle("Makina Saltzailea");
		
		this.setSize(770,670);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		Ventana2.setVisible(false);
		Ventana3.setVisible(false);
		Ventana4.setVisible(false);
		Ventana5.setVisible(false);
		Ventana6.setVisible(false);
		Ventana7.setVisible(false);
		
		Ventana1.setBounds(0, 0, 750, 650);
		Ventana1.addMouseListener(new MouseAdapter(){
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
		
		//JPANEL2
		Ventana2.setBounds(0, 0, 750, 650);

		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
	    
	  //JPANEL3
		Ventana3.setBounds(0, 0, 750, 650);

		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
		 
	  //JPANEL4
		
		Ventana4.setBounds(0, 0, 750, 650);
	    
		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
		
	    
	  //JPANEL5
		
		Ventana5.setBounds(0, 0, 750, 650);

		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
		
		//JPANEL6
		
		Ventana6.setBounds(0, 0, 750, 650);

		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
		
		//JPANEL7
		
		Ventana7.setBounds(0, 0, 750, 650);

		config.gridx=0;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;

		config.gridx=1;
		config.gridy=1;
		config.gridwidth=1;
		config.gridheight=1;
		config.ipadx=100;
		config.ipady=10;
		config.weighty=0.0;
		config.anchor=GridBagConstraints.CENTER;
		config.fill= GridBagConstraints.CENTER;
	    }
	    
	}
