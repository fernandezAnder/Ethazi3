package vista;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import controlador.*;


import java.awt.Dimension;
import java.awt.Color;
public class Ventana4 extends JFrame {


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
	JLabel lblHelmugaGeltokia = new JLabel("Helmuga Geltokia");
	JLabel lblJoanEtaEtorri = new JLabel("Joan eta etorri?");
	JCheckBox chckbxJoanEtorri = new JCheckBox("Bai");
	JDateChooser bigarrendata = new JDateChooser();
	JLabel lblItzuliData = new JLabel("Itzuli data");
	DefaultTableModel modelo = new DefaultTableModel();
	JLabel lblData = new JLabel("Data");
	JDateChooser lehendata = new JDateChooser();
	JComboBox Hasiera_geltoki = new JComboBox();
	JComboBox Amaiera_geltoki = new JComboBox();
	JTextPane geltoki = new JTextPane();
	
	//BARIABLEAK
	
	
	private String hasiera_geltokia="";
	private int hasiera_geltoki_kod=0;
	//Hasiera geltoki kooordenatuak
	private double hasiera_geltoki_latit=0;
	private double hasiera_geltoki_longi=0;
	//Amaiera geltoki koordenatuak
	private double amaiera_geltoki_latit=0;
	private double amaiera_geltoki_longi=0;
	private String amaiera_geltokia="";
	private int amaiera_geltoki_kod=0;
	private Date lehen_data;
	private Date bigarren_data;
	private int cod_billete=0;
	private String bidaia="";
	private int cod_linea=0;
	private int cod_bus=0;
	private double prezioa;
	private String ordua="";
	private String nan="";
	
	
	public Ventana4(ArrayList<Parada> paradas,ArrayList<Autobus> buses,String linea) {
		
		setBackground(SystemColor.control);
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblGeltokiak.setBounds(473, 73, 146, 36);
		lblGeltokiak.setRequestFocusEnabled(false);

		//LABEL ZERRENDA
		lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		getContentPane().add(lblGeltokiak);
		lblXLinearenInformazioa.setBounds(211, 22, 381, 36);

		//TITULOAREN LABELA
		lblXLinearenInformazioa.setRequestFocusEnabled(false);
		lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblXLinearenInformazioa.setText(linea+" Linearen Informazioa");
		getContentPane().add(lblXLinearenInformazioa);
		lblJatorriGeltokia.setBounds(37, 129, 196, 36);

		//JATORRI GELTOKIA LABELA
		lblJatorriGeltokia.setRequestFocusEnabled(false);
		lblJatorriGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		getContentPane().add(lblJatorriGeltokia);

		//HELMUGA GELTOKIA LABELA
		lblHelmugaGeltokia.setBounds(37, 193, 208, 36);
		lblHelmugaGeltokia.setRequestFocusEnabled(false);
		lblHelmugaGeltokia.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		getContentPane().add(lblHelmugaGeltokia);

		//JOAN ETORRI LABELA
		lblJoanEtaEtorri.setBounds(37, 258, 203, 36);
		lblJoanEtaEtorri.setRequestFocusEnabled(false);
		lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		getContentPane().add(lblJoanEtaEtorri);
		chckbxJoanEtorri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxJoanEtorri.setMaximumSize(new Dimension(49, 23));
		chckbxJoanEtorri.setBounds(277, 261, 61, 36);
		getContentPane().add(chckbxJoanEtorri);
		
		//DATA JCALENDAR
		bigarrendata.setBounds(158, 402, 117, 20);
		bigarrendata.setVerifyInputWhenFocusTarget(false);
		bigarrendata.setVisible(false);
		bigarrendata.setDateFormatString("dd-MM-yyyy");
		bigarrendata.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		getContentPane().add(bigarrendata);
		
		//ITZULI DATA LABELA
		//lblItzuliData.setRequestFocusEnabled(false);v
		lblItzuliData.setBounds(37, 394, 104, 28);
		lblItzuliData.setVisible(false);
		lblItzuliData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		getContentPane().add(lblItzuliData);

		//CHECKBOX JOAN ETORRI
		chckbxJoanEtorri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxJoanEtorri.isSelected()==false) {
					lblItzuliData.setVisible(false);
					bigarrendata.setVisible(false);
				}else {
					lblItzuliData.setVisible(true);
					bigarrendata.setVisible(true);
				}

			}
		});
		jarraitu.setBounds(491, 490, 131, 35);

		

		//EZEZTATU BOTOIA
		ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.lehenengoLeihoa();
			}
		});
		getContentPane().add(ezeztatu);
		atzera.setBounds(154, 490, 110, 35);

		//ATZERA BOTOIA
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa();
			}
		});
		atzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		getContentPane().add(atzera);
		modelo.addColumn("PARADAS");

		//LABEL DATA
		lblData.setBounds(37, 325, 50, 32);
		lblData.setRequestFocusEnabled(false);
		lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		getContentPane().add(lblData);

		//JCALENDAR LEHEN DATA
		lehendata.setBounds(157, 337, 118, 20);
		lehendata.setDateFormatString("dd-MM-yyyy");
		getContentPane().add(lehendata);
		String geltokiak="";
		for (int i=0;i<paradas.size();i++) {
			geltokiak=geltokiak+(paradas.get(i).getNombre()+"\r\n");

		}
		geltoki.setFont(new Font("Tahoma", Font.PLAIN, 16));
		//Geltoki textPane
		geltoki.setText(geltokiak);
		geltoki.setBounds(459, 131, 203, 192);
		getContentPane().add(geltoki);
		Hasiera_geltoki.setBackground(Color.WHITE);

		//Hasiera geltoki konbo box-a
		Hasiera_geltoki.setBounds(258, 129, 175, 34);
		for (int i=0;i<paradas.size();i++) {
			Hasiera_geltoki.addItem(paradas.get(i).getNombre());
			
		}

		getContentPane().add(Hasiera_geltoki);
		Amaiera_geltoki.setBackground(Color.WHITE);

		//Amaiera geltoki konbo box-a
		Amaiera_geltoki.setBounds(258, 193, 175, 34);
		for (int i=0;i<paradas.size();i++) {
			Amaiera_geltoki.addItem(paradas.get(i).getNombre());
	
			}
		getContentPane().add(Amaiera_geltoki);

		//JARRAITU BOTOIA
		jarraitu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		jarraitu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				lehen_data=lehendata.getDate();
				bigarren_data=bigarrendata.getDate();
				cod_billete++;
				for(int i=0;i<paradas.size();i++) {
					//Hasiera geltoki bariableak
					hasiera_geltokia=paradas.get(Hasiera_geltoki.getSelectedIndex()).getNombre();
					hasiera_geltoki_kod=paradas.get(Hasiera_geltoki.getSelectedIndex()).getParadanum();
					hasiera_geltoki_latit=paradas.get(Hasiera_geltoki.getSelectedIndex()).getLatitud();
					hasiera_geltoki_longi=paradas.get(Hasiera_geltoki.getSelectedIndex()).getLongitud();
					//amaiera geltoki bariableak
					amaiera_geltokia=paradas.get(Amaiera_geltoki.getSelectedIndex()).getNombre();
					amaiera_geltoki_kod=paradas.get(Amaiera_geltoki.getSelectedIndex()).getParadanum();
					amaiera_geltoki_latit=paradas.get(Amaiera_geltoki.getSelectedIndex()).getLatitud();
					amaiera_geltoki_longi=paradas.get(Amaiera_geltoki.getSelectedIndex()).getLongitud();
				}
				
				Double distantzia=Metodoak.distanciaCoord(hasiera_geltoki_latit, hasiera_geltoki_longi, amaiera_geltoki_latit, amaiera_geltoki_longi);
				
				
				
				
				
				Metodoak.billete(cod_billete, bidaia, cod_linea, cod_bus, hasiera_geltoki_kod, amaiera_geltoki_kod, lehen_data, ordua, nan, prezioa);
						
				Metodoak.bostgarrenLeihoa();
			}
		});
		getContentPane().add(jarraitu);
		ezeztatu.setBounds(326, 490, 131, 35);

	}
}
