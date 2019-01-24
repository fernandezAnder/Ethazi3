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
import javax.swing.SpinnerModel;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.ListSelectionModel;
import javax.swing.JSeparator;
import modelo.*;
import controlador.*;
import javax.swing.JTextField;
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
	DefaultTableModel modelo = new DefaultTableModel();


	ArrayList <Parada> paradas= new ArrayList <Parada>();
	JTextField textFieldGeltokiak;

	public Ventana3() {
		setVerifyInputWhenFocusTarget(false);
		setBackground(SystemColor.control);
		this.setBounds(275,100,700,600);
		setLayout(null);
		lblGeltokiak.setBounds(446, 52, 146, 36);
		lblGeltokiak.setRequestFocusEnabled(false);

		//LABEL ZERRENDA
		lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblGeltokiak);
		lblXLinearenInformazioa.setBounds(244, 5, 286, 36);

		//TITULOAREN LABELA
		lblXLinearenInformazioa.setRequestFocusEnabled(false);
		lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblXLinearenInformazioa);
		lblJatorriGeltokia.setBounds(37, 87, 196, 36);

		//JATORRI GELTOKIA LABELA
		lblJatorriGeltokia.setRequestFocusEnabled(false);
		lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblJatorriGeltokia);
		spinnerJatorri_geltokia.setBounds(268, 101, 48, 20);

		//JATORRI GELTOKIA SpinnerLista 
		spinnerJatorri_geltokia.setModel(new SpinnerListModel(new String[] {"kaixo", "egunon", "zelan"}));
		add(spinnerJatorri_geltokia);
		lblHelmugaGeltokia.setBounds(37, 129, 208, 36);

		//HELMUGA GELTOKIA LABELA
		lblHelmugaGeltokia.setRequestFocusEnabled(false);
		lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblHelmugaGeltokia);

		//HELMUGA GELTOKIA SPINNER
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		String linea="L1";
		paradas=Consultas.paradastabla(linea);
		for (int i=0;i<paradas.size();i++) {
			spinnerHelmuga_Geltokia.setToolTipText(paradas.get(i).getNombre());
		}
		spinnerHelmuga_Geltokia.setBounds(268, 143, 29, 20);
		
		add(spinnerHelmuga_Geltokia);
		lblJoanEtaEtorri.setBounds(36, 176, 203, 36);

		//JOAN ETORRI LABELA
		lblJoanEtaEtorri.setRequestFocusEnabled(false);
		lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		add(lblJoanEtaEtorri);
		chckbxJoanEtorri.setBounds(258, 189, 39, 23);
		add(chckbxJoanEtorri);
		btnJCalendar.setBounds(173, 293, 87, 20);
		btnJCalendar.setVerifyInputWhenFocusTarget(false);
		btnJCalendar.setVisible(false);

		//DATA JCALENDAR
		btnJCalendar.setDateFormatString("dd-MM-yyyy");
		btnJCalendar.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		add(btnJCalendar);
		lblItzuliData.setBounds(37, 285, 104, 28);

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
		jarraitu.setBounds(406, 350, 101, 35);

		//JARRAITU BOTOIA
		jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		jarraitu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				


			}
		});
		add(jarraitu);
		ezeztatu.setBounds(248, 350, 107, 35);

		//EZEZTATU BOTOIA
		ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		add(ezeztatu);
		atzera.setBounds(109, 350, 91, 35);

		//ATZERA BOTOIA
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				


			}
		});
		atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		add(atzera);
		modelo.addColumn("PARADAS");
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(36, 223, 50, 32);
		lblData.setRequestFocusEnabled(false);
		lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		add(lblData);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(124, 235, 87, 20);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		add(dateChooser);
		
		textFieldGeltokiak = new JTextField();
		textFieldGeltokiak.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		textFieldGeltokiak.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textFieldGeltokiak.setEditable(false);
		textFieldGeltokiak.setBounds(403, 99, 275, 228);
		add(textFieldGeltokiak);
		textFieldGeltokiak.setColumns(10);


	}
}
