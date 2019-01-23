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
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;

import controlador.*;

import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JSeparator;

public class Ventana3 extends JPanel {


		private static final long serialVersionUID = 1L;
		/**
		 * LEHIOAN SORTUTAKO ELEMENTUAK.
		 */
		JLabel lblGeltokiak = new JLabel("GELTOKIAK");
		JButton jarraitu = new JButton("Jarraitu");
		JButton ezeztatu = new JButton("Ezeztatu");
		JButton atzera = new JButton("Atzera");
	   	JLabel lblXLinearenInformazioa = new JLabel("X Linearen Informazioa");
	   	JLabel lblJatorriGeltokia = new JLabel("Jatorri Geltokia");
	   	JSpinner spinnerJatorri_geltokia = new JSpinner();
	   	JLabel lblHelmugaGeltokia = new JLabel("Helmuga Geltokia");
	    JSpinner spinnerHelmuga_Geltokia = new JSpinner();
	   	JLabel lblJoanEtaEtorri = new JLabel("Joan eta etorri?");
	    JCheckBox chckbxJoanEtorri = new JCheckBox("Bai");
	    JDateChooser btnJCalendar = new JDateChooser();
		JLabel lblItzuliData = new JLabel("Itzuli data");
		private final JTable table = new JTable();
	    

	    ArrayList <Parada> paradas= new ArrayList <Parada>();
		
	    public Ventana3() {
	    	setVerifyInputWhenFocusTarget(false);
	     setBackground(SystemColor.control);
	   	 setLayout(null);
	   	 lblGeltokiak.setRequestFocusEnabled(false);
	   	 
	   	 //LABEL ZERRENDA
	   	 lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblGeltokiak.setBounds(464, 86, 153, 49);
	   	 add(lblGeltokiak);
	   	 
	   	 //TITULOAREN LABELA
	   	 lblXLinearenInformazioa.setRequestFocusEnabled(false);
	   	 lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblXLinearenInformazioa.setBounds(202, 26, 304, 49);
	   	 add(lblXLinearenInformazioa);
	   	 
	   	 //JATORRI GELTOKIA LABELA
	   	 lblJatorriGeltokia.setRequestFocusEnabled(false);
	   	 lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJatorriGeltokia.setBounds(57, 162, 201, 49);
	   	 add(lblJatorriGeltokia);
	   	 
	   	 //JATORRI GELTOKIA SpinnerLista 
	   	 spinnerJatorri_geltokia.setModel(new SpinnerListModel(new String[] {"kaixo", "egunon", "zelan"}));
	   	 spinnerJatorri_geltokia.setBounds(268, 176, 57, 32);
	   	 add(spinnerJatorri_geltokia);
	   	 
	   	 //HELMUGA GELTOKIA LABELA
	   	 lblHelmugaGeltokia.setRequestFocusEnabled(false);
	   	 lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblHelmugaGeltokia.setBounds(57, 224, 226, 49);
	   	 add(lblHelmugaGeltokia);
	   	 
	   	 //HELMUGA GELTOKIA SPINNER
	   	 spinnerHelmuga_Geltokia.setModel(new SpinnerListModel(new String[] {"zelan ", "ondo ", "ondo", "bai"}));
	   	 spinnerHelmuga_Geltokia.setBounds(293, 238, 57, 32);
	   	 add(spinnerHelmuga_Geltokia);
	   	 
	   	 //JOAN ETORRI LABELA
	   	 lblJoanEtaEtorri.setRequestFocusEnabled(false);
	   	 lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
	   	 lblJoanEtaEtorri.setBounds(67, 318, 216, 49);
	   	 add(lblJoanEtaEtorri);
	   	 
	   	 //CHECKBOX JOAN ETORRI 
	   	 chckbxJoanEtorri.setBounds(293, 333, 97, 30); 
	   	 add(chckbxJoanEtorri);
	   	 btnJCalendar.setVerifyInputWhenFocusTarget(false);
	   	 btnJCalendar.setVisible(false);
	    
	   	 //DATA JCALENDAR
	   	 btnJCalendar.setDateFormatString("dd-MM-yyyy");
	   	 btnJCalendar.getCalendarButton().addActionListener(new ActionListener() {
	   	 	public void actionPerformed(ActionEvent arg0) {
	   	 	}
	   	 });
	   	 btnJCalendar.setBounds(230, 397, 95, 20);
	   	 add(btnJCalendar);
	   	 
	   	 //ITZULI DATA LABELA
	   	 //lblItzuliData.setRequestFocusEnabled(false);
	   	 lblItzuliData.setVisible(false);
	   	 lblItzuliData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
	   	 lblItzuliData.setBounds(67, 378, 175, 49);
	   	 add(lblItzuliData);
	   	 
	   	 
	 	chckbxJoanEtorri.addActionListener(new ActionListener() {
	 	    public void actionPerformed(ActionEvent e) {
	             if (chckbxJoanEtorri.isSelected()==false) {
	                 lblItzuliData.setVisible(false);
	                 btnJCalendar.setVisible(false);
	             }else {
	            	 lblItzuliData.setVisible(true);
	                 btnJCalendar.setVisible(true);
	             }
	
	 	    }
	   	});
	   
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
	   	 table.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
	   	 table.setBounds(406, 196, 284, 221);
	   	 
	   	 add(table);
	   	 
	  
	}
}
