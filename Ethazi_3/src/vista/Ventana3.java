package vista;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.MatteBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import controlador.*
;public class Ventana3 extends JPanel {

		private static final long serialVersionUID = 1L;
		/**
		 * LEHIOAN SORTUTAKO ELEMENTUAK.
		 */
		JLabel lblGeltokiak = new JLabel("GELTOKIAK");
		JTextArea geltokiak = new JTextArea();
		JTextPane ordaintzeko_dirua = new JTextPane();
		JLabel label = new JLabel("\u20AC");
		JButton jarraitu = new JButton("Jarraitu");
		JButton ezeztatu = new JButton("Ezeztatu");
		JButton atzera = new JButton("Atzera");
	   	JLabel lblXLinearenInformazioa = new JLabel("X Linearen Informazioa");
	   	JLabel lblJatorriGeltokia = new JLabel("Jatorri Geltokia");
	   	JSpinner jatorri_geltokia = new JSpinner();
	   	JLabel lblHelmugaGeltokia = new JLabel("Helmuga Geltokia");
	    JSpinner spinner = new JSpinner();
	  	JLabel lblData = new JLabel("Data");
	   	JDateChooser dateChooser = new JDateChooser();
	   	JLabel lblJoanEtaEtorri = new JLabel("Joan eta etorri?");
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Bai");

	    ArrayList <Parada> paradas= new ArrayList <Parada>();
		
	    public Ventana3() {
	     setBackground(SystemColor.control);
	   	 setLayout(null);
	   	 lblGeltokiak.setRequestFocusEnabled(false);
	   	 
	   	 //LABEL ZERRENDA
	   	 lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblGeltokiak.setBounds(66, 131, 153, 49);
	   	 add(lblGeltokiak);
	   	 geltokiak.setLineWrap(true);
	   	 geltokiak.setRows(10);
	   	 
	   	 //TEXTAREA ZERRENDA
	   	 geltokiak.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 20));
	   	 geltokiak.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
	   	 geltokiak.setBounds(222, 110, 505, 90);
	   	 add(geltokiak);
	   	 ordaintzeko_dirua.setFocusable(false);
	   	 
	   	 //TEXTPANE ORDAINTZEKO DIRUA
	   	 ordaintzeko_dirua.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	   	 ordaintzeko_dirua.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	   	 ordaintzeko_dirua.setBounds(331, 395, 76, 32);
	   	 add(ordaintzeko_dirua);
	   	// String dirua=String.valueOf(Zerrenda.preziototala);
	   	 //ordaintzeko_dirua.setText(dirua);
	   	 
	   	 //LABEL EURO
	   	 label.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	   	 label.setBounds(424, 397, 24, 28);
	   	 add(label);
	   	 
	   	
	   	 
	   	 lblXLinearenInformazioa.setRequestFocusEnabled(false);
	   	 lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblXLinearenInformazioa.setBounds(202, 26, 304, 49);
	   	 add(lblXLinearenInformazioa);
	   	 
	   	 lblJatorriGeltokia.setRequestFocusEnabled(false);
	   	 lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJatorriGeltokia.setBounds(66, 247, 201, 49);
	   	 add(lblJatorriGeltokia);
	   	 
	   	 jatorri_geltokia.setModel(new SpinnerListModel(new String[] {"kaixo", "egunon", "zelan"}));
	   	 jatorri_geltokia.setBounds(277, 259, 57, 32);
	   	 add(jatorri_geltokia);
	   	 
	   	 lblHelmugaGeltokia.setRequestFocusEnabled(false);
	   	 lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblHelmugaGeltokia.setBounds(66, 296, 226, 49);
	   	 add(lblHelmugaGeltokia);
	   	 
	   	 spinner.setModel(new SpinnerListModel(new String[] {"zelan ", "ondo ", "ondo", "bai"}));
	   	 spinner.setBounds(294, 302, 57, 32);
	   	 add(spinner);
	   	 
	   	 lblData.setRequestFocusEnabled(false);
	   	 lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblData.setBounds(66, 356, 76, 49);
	   	 add(lblData);
	   	 
	   	 dateChooser.setBounds(177, 371, 95, 20);
	   	 add(dateChooser);
	   	 
	   	 lblJoanEtaEtorri.setRequestFocusEnabled(false);
	   	 lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJoanEtaEtorri.setBounds(424, 247, 216, 49);
	   	 add(lblJoanEtaEtorri);
	   	 
	   	 chckbxNewCheckBox.setBounds(646, 259, 97, 30);
	   	 add(chckbxNewCheckBox);
	   	 
	   	 //JARRAITU BOTOIA
	   	 jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 jarraitu.addActionListener(new ActionListener() {
	   		 @Override
			public void actionPerformed(ActionEvent arg0) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana4.setVisible(true);
	                	Frame.Ventana5.setVisible(false);
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
	   		 @Override
			public void actionPerformed(ActionEvent e) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana1.setVisible(true);
	                	Frame.Ventana2.setVisible(false);
	                	Frame.Ventana3.setVisible(false);  
	                	Frame.Ventana4.setVisible(false);
	                	Frame.Ventana5.setVisible(false);
	            	}


	   			 
	   			 
	   		 }
	   	 });
	   	 ezeztatu.setBounds(89, 464, 114, 40);
	   	 add(ezeztatu);
	   	 
	   	 //ATZERA BOTOIA
	   	 atzera.addActionListener(new ActionListener() {
	   		 @Override
			public void actionPerformed(ActionEvent arg0) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana1.setVisible(false);
	                	Frame.Ventana2.setVisible(true);
	                	Frame.Ventana3.setVisible(false);  
	                	Frame.Ventana4.setVisible(false);
	                	Frame.Ventana5.setVisible(false);
	            	}
	   			
	   			 
	   			 
	   			 
	   			 
	   		 }
	   	 });
	   	 atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 atzera.setBounds(294, 463, 114, 42);
	   	 add(atzera);

	    }
	}
