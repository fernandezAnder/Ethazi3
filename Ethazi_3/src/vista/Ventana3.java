package vista;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
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
import javax.swing.JFrame;


import controlador.*;
import javax.swing.JTextField;
public class Ventana3 extends JFrame {


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
	DefaultTableModel modelo = new DefaultTableModel();
	JLabel lblData = new JLabel("Data");
	JDateChooser dateChooser = new JDateChooser();


	ArrayList <Parada> paradas= new ArrayList <Parada>();
	JTextField textFieldGeltokiak;

		public Ventana3(ArrayList<Parada> paradas) {
		
		setBackground(SystemColor.control);
		this.setBounds(275,100,700,600);
		setLayout(null);
		lblGeltokiak.setBounds(447, 129, 146, 36);
		lblGeltokiak.setRequestFocusEnabled(false);

		//LABEL ZERRENDA
		lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblGeltokiak);
		lblXLinearenInformazioa.setBounds(244, 5, 286, 36);

		//TITULOAREN LABELA
		lblXLinearenInformazioa.setRequestFocusEnabled(false);
		lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblXLinearenInformazioa);
		lblJatorriGeltokia.setBounds(37, 129, 196, 36);

		//JATORRI GELTOKIA LABELA
		lblJatorriGeltokia.setRequestFocusEnabled(false);
		lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblJatorriGeltokia);
		spinnerJatorri_geltokia.setBounds(283, 143, 48, 20);

		//JATORRI GELTOKIA SpinnerLista
		for (int i=0;i<paradas.size();i++) {
			spinnerJatorri_geltokia.setToolTipText(paradas.get(i).getNombre());
		}
		add(spinnerJatorri_geltokia);
		lblHelmugaGeltokia.setBounds(37, 193, 208, 36);

		//HELMUGA GELTOKIA LABELA
		lblHelmugaGeltokia.setRequestFocusEnabled(false);
		lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblHelmugaGeltokia);

		//HELMUGA GELTOKIA SPINNER
		
		for (int i=0;i<paradas.size();i++) {
			spinnerHelmuga_Geltokia.setToolTipText(paradas.get(i).getNombre());
		}
		spinnerHelmuga_Geltokia.setBounds(287, 207, 29, 20);
		add(spinnerHelmuga_Geltokia);
		lblJoanEtaEtorri.setBounds(30, 269, 203, 36);

		//JOAN ETORRI LABELA
		lblJoanEtaEtorri.setRequestFocusEnabled(false);
		lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblJoanEtaEtorri);
		chckbxJoanEtorri.setBounds(277, 282, 39, 23);
		add(chckbxJoanEtorri);
		btnJCalendar.setBounds(190, 439, 87, 20);
		btnJCalendar.setVerifyInputWhenFocusTarget(false);
		btnJCalendar.setVisible(false);

		//DATA JCALENDAR
		btnJCalendar.setDateFormatString("dd-MM-yyyy");
		btnJCalendar.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnJCalendar);
		lblItzuliData.setBounds(42, 431, 104, 28);

		//ITZULI DATA LABELA
		//lblItzuliData.setRequestFocusEnabled(false);
		lblItzuliData.setVisible(false);
		lblItzuliData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
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
		jarraitu.setBounds(491, 490, 101, 35);

		//JARRAITU BOTOIA
		jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		jarraitu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				


			}
		});
		add(jarraitu);
		ezeztatu.setBounds(326, 490, 107, 35);

		//EZEZTATU BOTOIA
		ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		add(ezeztatu);
		atzera.setBounds(154, 490, 91, 35);

		//ATZERA BOTOIA
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.lehenengoLeihoa();
			}
		});
		atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		add(atzera);
		modelo.addColumn("PARADAS");
		
		lblData.setBounds(42, 363, 50, 32);
		lblData.setRequestFocusEnabled(false);
		lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		add(lblData);
		
		dateChooser.setBounds(154, 375, 87, 20);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		add(dateChooser);
		
		textFieldGeltokiak = new JTextField();
		textFieldGeltokiak.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textFieldGeltokiak.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textFieldGeltokiak.setEditable(false);
		textFieldGeltokiak.setBounds(396, 220, 275, 228);
		for (int i=0;i<paradas.size();i++) {
			textFieldGeltokiak.setText(paradas.get(i).getNombre());
		}
		add(textFieldGeltokiak);
		textFieldGeltokiak.setColumns(10);


	}
}
