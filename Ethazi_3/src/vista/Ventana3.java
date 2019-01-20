package vista;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class Ventana3 extends JPanel {

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
	   	 geltokiak.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
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
	   	 
	   	
	   	 
	   	 JLabel lblXLinearenInformazioa = new JLabel("X Linearen Informazioa");
	   	 lblXLinearenInformazioa.setRequestFocusEnabled(false);
	   	 lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblXLinearenInformazioa.setBounds(202, 26, 304, 49);
	   	 add(lblXLinearenInformazioa);
	   	 
	   	 JLabel lblJatorriGeltokia = new JLabel("Jatorri Geltokia");
	   	 lblJatorriGeltokia.setRequestFocusEnabled(false);
	   	 lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJatorriGeltokia.setBounds(66, 247, 201, 49);
	   	 add(lblJatorriGeltokia);
	   	 
	   	 JSpinner jatorri_geltokia = new JSpinner();
	   	 jatorri_geltokia.setModel(new SpinnerListModel(new String[] {"kaixo", "egunon", "zelan"}));
	   	 jatorri_geltokia.setBounds(277, 259, 57, 32);
	   	 add(jatorri_geltokia);
	   	 
	   	 JLabel lblHelmugaGeltokia = new JLabel("Helmuga Geltokia");
	   	 lblHelmugaGeltokia.setRequestFocusEnabled(false);
	   	 lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblHelmugaGeltokia.setBounds(66, 296, 226, 49);
	   	 add(lblHelmugaGeltokia);
	   	 
	   	 JSpinner spinner = new JSpinner();
	   	 spinner.setModel(new SpinnerListModel(new String[] {"zelan ", "ondo ", "ondo", "bai"}));
	   	 spinner.setBounds(294, 302, 57, 32);
	   	 add(spinner);
	   	 
	   	 JLabel lblData = new JLabel("Data");
	   	 lblData.setRequestFocusEnabled(false);
	   	 lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblData.setBounds(66, 356, 76, 49);
	   	 add(lblData);
	   	 
	   	 JDateChooser dateChooser = new JDateChooser();
	   	 dateChooser.setBounds(177, 371, 95, 20);
	   	 add(dateChooser);
	   	 
	   	 JLabel lblJoanEtaEtorri = new JLabel("Joan eta etorri?");
	   	 lblJoanEtaEtorri.setRequestFocusEnabled(false);
	   	 lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJoanEtaEtorri.setBounds(424, 247, 216, 49);
	   	 add(lblJoanEtaEtorri);
	   	 
	   	 JCheckBox chckbxNewCheckBox = new JCheckBox("Bai");
	   	 chckbxNewCheckBox.setBounds(646, 259, 97, 30);
	   	 add(chckbxNewCheckBox);
	   	 
	   	 //JARRAITU BOTOIA
	   	 jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 jarraitu.addActionListener(new ActionListener() {
	   		 public void actionPerformed(ActionEvent arg0) {
	   			 if(Frame.Ventana3.isVisible()){
	                	Frame.Ventana4.setVisible(true);
	                	Frame.Ventana5.setVisible(false);
	                	Frame.Ventana1.setVisible(false);
	                	Frame.Ventana2.setVisible(false);
	                	Frame.Ventana3.setVisible(false);           	 
	             }
	   			String prezioa = String.valueOf(Zerrenda.dezimal.format(Zerrenda.preziototala));
	   			Metodoak.preziototala2=Zerrenda.preziototala;
		    	Frame.Ventana4.ordaindubehar.setText(prezioa); 
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
	            	}
	   			 Metodoak.berriroHasieratu();
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
	            	}
	   			Zerrenda.zerrenda="";
	   			Frame.Ventana3.jarraitu.setEnabled(true);
	   		 }
	   	 });
	   	 atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
	   	 atzera.setBounds(294, 463, 114, 42);
	   	 add(atzera);

	    }
	}
