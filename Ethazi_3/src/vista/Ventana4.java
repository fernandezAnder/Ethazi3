package vista;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import controlador.Metodoak;
import controlador.Parada;
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
	JDateChooser btnJCalendar = new JDateChooser();
	JLabel lblItzuliData = new JLabel("Itzuli data");
	DefaultTableModel modelo = new DefaultTableModel();
	JLabel lblData = new JLabel("Data");
	JDateChooser dateChooser = new JDateChooser();
	JComboBox Hasiera_geltoki = new JComboBox();
	JComboBox Amaiera_geltoki = new JComboBox();
	JTextPane geltoki = new JTextPane();
	
	ArrayList <Parada> paradas= new ArrayList <Parada>();

		public Ventana4(ArrayList<Parada> paradas) {
		
		setBackground(SystemColor.control);
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblGeltokiak.setBounds(458, 129, 146, 36);
		lblGeltokiak.setRequestFocusEnabled(false);

		//LABEL ZERRENDA
		lblGeltokiak.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		getContentPane().add(lblGeltokiak);
		lblXLinearenInformazioa.setBounds(244, 5, 286, 36);

		//TITULOAREN LABELA
		lblXLinearenInformazioa.setRequestFocusEnabled(false);
		lblXLinearenInformazioa.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
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
		lblJoanEtaEtorri.setBounds(30, 269, 203, 36);
		lblJoanEtaEtorri.setRequestFocusEnabled(false);
		lblJoanEtaEtorri.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		getContentPane().add(lblJoanEtaEtorri);
		chckbxJoanEtorri.setBounds(277, 282, 39, 23);
		getContentPane().add(chckbxJoanEtorri);
		btnJCalendar.setBounds(190, 439, 87, 20);
		btnJCalendar.setVerifyInputWhenFocusTarget(false);
		btnJCalendar.setVisible(false);

		//DATA JCALENDAR
		btnJCalendar.setDateFormatString("dd-MM-yyyy");
		btnJCalendar.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		getContentPane().add(btnJCalendar);
		lblItzuliData.setBounds(42, 431, 104, 28);

		//ITZULI DATA LABELA
		//lblItzuliData.setRequestFocusEnabled(false);
		lblItzuliData.setVisible(false);
		lblItzuliData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		getContentPane().add(lblItzuliData);


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
		getContentPane().add(jarraitu);
		ezeztatu.setBounds(326, 490, 107, 35);

		//EZEZTATU BOTOIA
		ezeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		getContentPane().add(ezeztatu);
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
		getContentPane().add(atzera);
		modelo.addColumn("PARADAS");
		
		lblData.setBounds(42, 363, 50, 32);
		lblData.setRequestFocusEnabled(false);
		lblData.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
		getContentPane().add(lblData);
		
		dateChooser.setBounds(154, 375, 87, 20);
		dateChooser.setDateFormatString("dd-MM-yyyy");
		getContentPane().add(dateChooser);
		String geltokiak="";
		for (int i=0;i<paradas.size();i++) {
			geltokiak=geltokiak+(paradas.get(i).getNombre()+"\r\n");
			
		}
		//Geltoki textPane
		geltoki.setText(geltokiak);
		geltoki.setBounds(447, 176, 175, 156);
		getContentPane().add(geltoki);
		
		//Hasiera geltoki konbo box-a
		Hasiera_geltoki.setBounds(277, 143, 114, 20);
		for (int i=0;i<paradas.size();i++) {
			Hasiera_geltoki.addItem(paradas.get(i).getNombre());
		}
		
		getContentPane().add(Hasiera_geltoki);
		
		//Amaiera geltoki konbo box-a
		Amaiera_geltoki.setBounds(277, 207, 114, 20);
		for (int i=0;i<paradas.size();i++) {
			Amaiera_geltoki.addItem(paradas.get(i).getNombre());
		}
		getContentPane().add(Amaiera_geltoki);



	}
}
