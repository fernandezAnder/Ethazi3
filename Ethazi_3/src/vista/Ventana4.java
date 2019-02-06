package vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import controlador.Autobus;
import controlador.Metodoak;
import controlador.Parada;
import controlador.Tiket;
import javax.swing.SwingConstants;
public class Ventana4 extends JFrame {


	private static final long serialVersionUID = 1L;
	/**
	 * LEHIOAN SORTUTAKO ELEMENTUAK.
	 */
	private JLabel lblGeltokiak = new JLabel("GELTOKIAK");
	private JButton jarraitu = new JButton("Jarraitu");
	private JButton ezeztatu = new JButton("Ezeztatu");
	private JButton atzera = new JButton("Atzera");
	private JLabel lblXLinearenInformazioa = new JLabel("X Linearen Informazioa");
	private JLabel lblJatorriGeltokia = new JLabel("Jatorri Geltokia");
	private JLabel lblHelmugaGeltokia = new JLabel("Helmuga Geltokia");
	private JLabel lblJoanEtaEtorri = new JLabel("Joan eta etorri?");
	private JCheckBox chckbxJoanEtorri = new JCheckBox("Bai");
	private JDateChooser lehendata = new JDateChooser();
	private JDateChooser bigarrendata = new JDateChooser();
	private JLabel lblItzuliData = new JLabel("Itzuli data");
	private DefaultTableModel modelo = new DefaultTableModel();
	private JLabel lblData = new JLabel("Data");
	private JComboBox Hasiera_geltoki = new JComboBox();
	private JComboBox Amaiera_geltoki = new JComboBox();
	private JTextPane geltoki = new JTextPane();

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
	private String lehen_data_string;
	private String bigarren_data_string;
	private int bidaiakop=1;
	private int cod_linea;
	private double prezioa;
	private String ordua;
	private String data;
	private boolean biderketa=false;
	private int cod_billete;
	private double prezio2;
	DecimalFormat dezimal = new DecimalFormat("#.00");
	SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");

	public Ventana4(ArrayList<Parada> paradas,ArrayList<Autobus> buses,String linea, int cod_bus, String nan) {

		cod_billete++;
		setBackground(SystemColor.control);
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblGeltokiak.setHorizontalAlignment(SwingConstants.CENTER);
		lblGeltokiak.setBounds(489, 84, 146, 36);
		lblGeltokiak.setRequestFocusEnabled(false);

		//LABEL ZERRENDA
		lblGeltokiak.setFont(new Font("Arial", Font.BOLD, 25));
		getContentPane().add(lblGeltokiak);
		lblXLinearenInformazioa.setHorizontalAlignment(SwingConstants.CENTER);
		lblXLinearenInformazioa.setBounds(71, 26, 564, 36);

		//TITULOAREN LABELA
		lblXLinearenInformazioa.setRequestFocusEnabled(false);
		lblXLinearenInformazioa.setFont(new Font("Arial", Font.BOLD, 37));
		lblXLinearenInformazioa.setText(linea+" Linearen Informazioa");
		getContentPane().add(lblXLinearenInformazioa);
		lblJatorriGeltokia.setBounds(37, 129, 196, 36);

		//JATORRI GELTOKIA LABELA
		lblJatorriGeltokia.setRequestFocusEnabled(false);
		lblJatorriGeltokia.setFont(new Font("Arial", Font.BOLD, 22));
		getContentPane().add(lblJatorriGeltokia);

		//HELMUGA GELTOKIA LABELA
		lblHelmugaGeltokia.setBounds(37, 193, 216, 36);
		lblHelmugaGeltokia.setRequestFocusEnabled(false);
		lblHelmugaGeltokia.setFont(new Font("Arial", Font.BOLD, 22));

		getContentPane().add(lblHelmugaGeltokia);

		//JOAN ETORRI LABELA
		lblJoanEtaEtorri.setBounds(37, 258, 203, 36);
		lblJoanEtaEtorri.setRequestFocusEnabled(false);
		lblJoanEtaEtorri.setFont(new Font("Arial", Font.BOLD, 22));
		getContentPane().add(lblJoanEtaEtorri);
		chckbxJoanEtorri.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbxJoanEtorri.setMaximumSize(new Dimension(49, 23));
		chckbxJoanEtorri.setBounds(258, 259, 61, 36);
		getContentPane().add(chckbxJoanEtorri);

		//DATA JCALENDAR
		bigarrendata.setBounds(158, 402, 117, 20);
		bigarrendata.setVerifyInputWhenFocusTarget(false);
		bigarrendata.setVisible(false);
		bigarrendata.setDateFormatString("yyyy-MM-dd");	
		getContentPane().add(bigarrendata);
		bigarrendata.getDate();
		bigarrendata.cleanup();
		bigarrendata.setSelectableDateRange(new Date(), lehen_data);

		//ITZULI DATA LABELA
		lblItzuliData.setBounds(37, 394, 104, 28);
		lblItzuliData.setVisible(false);
		lblItzuliData.setFont(new Font("Arial", Font.BOLD, 20));
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
					bidaiakop=2;
					biderketa=true;

				}

			}
		});
		jarraitu.setBounds(491, 481, 131, 44);



		//EZEZTATU BOTOIA
		ezeztatu.setFont(new Font("Arial", Font.PLAIN, 18));
		ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.lehenengoLeihoa();
			}
		});
		getContentPane().add(ezeztatu);
		atzera.setBounds(154, 481, 110, 44);

		//ATZERA BOTOIA
		atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
				Hashtable<String,Double> ordenaketa=new Hashtable<String,Double>();
				ArrayList <Double> distantziaarray= new ArrayList<Double>();
				double termi_lati=43.2614;
				double termi_longi=-2.94974;
				double distantzia=0;
				for (int i=0;i<paradas.size();i++) {
					if(!"Termibus-Bilbao".equals(paradas.get(i).getNombre())) {
						distantzia= Metodoak.distanciaCoord(termi_lati, termi_longi, paradas.get(i).getLatitud(), paradas.get(i).getLongitud());

						distantziaarray.add(distantzia);
						ordenaketa.put(paradas.get(i).getNombre(), distantzia);
					}
				}
				Collections.sort(distantziaarray);

				for (int i=0;i<distantziaarray.size();i++) {

				}
				ordenaketa.get(paradas);
			}
		});
		atzera.setFont(new Font("Arial", Font.PLAIN, 18));
		getContentPane().add(atzera);
		modelo.addColumn("PARADAS");

		//LABEL DATA
		lblData.setBounds(37, 325, 50, 32);
		lblData.setRequestFocusEnabled(false);
		lblData.setFont(new Font("Arial", Font.BOLD, 22));
		getContentPane().add(lblData);

		//JCALENDAR LEHEN DATA
		lehendata.setBounds(157, 337, 118, 20);
		lehendata.setDateFormatString("yyyy-MM-dd");
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
		Hasiera_geltoki.setBounds(236, 134, 206, 34);
		for (int i=0;i<paradas.size();i++) {
			Hasiera_geltoki.addItem(paradas.get(i).getNombre());

		}

		getContentPane().add(Hasiera_geltoki);
		Amaiera_geltoki.setBackground(Color.WHITE);

		//Amaiera geltoki konbo box-a
		Amaiera_geltoki.setBounds(236, 198, 206, 34);
		for (int i=0;i<paradas.size();i++) {
			Amaiera_geltoki.addItem(paradas.get(i).getNombre());

		}
		getContentPane().add(Amaiera_geltoki);

		//JARRAITU BOTOIA
		jarraitu.setFont(new Font("Arial", Font.PLAIN, 18));
		jarraitu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
				lehen_data= lehendata.getDate();
				lehen_data_string=sm.format(lehen_data);
				bigarren_data=bigarrendata.getDate();
				bigarren_data_string=sm.format(bigarren_data);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Data hutsik dago. Mesedez osotu");
				}
				

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
				for (int i=0;i<buses.size();i++) {
					prezioa=Metodoak.prezioaKalkulatu(distantzia, buses.get(i).getConsumo_km(),buses.get(i).getN_plazas());
					prezio2=Metodoak.Redondear(prezioa);
				}
				if (biderketa==true)
					prezio2=prezio2*2;
				Tiket t1 = new Tiket(bidaiakop, linea, cod_bus, hasiera_geltokia, amaiera_geltokia, lehen_data_string, bigarren_data_string, prezio2);
				data= Metodoak.dataAtera();
				ordua=Metodoak.orduaAtera();
				if(!lehen_data_string.equals("")) {
					dispose();
					Metodoak.bostgarrenLeihoa(Metodoak.billete(bidaiakop, linea, cod_bus, hasiera_geltoki_kod, amaiera_geltoki_kod, data, ordua, nan, prezio2),t1);
				}
			}
		});
		getContentPane().add(jarraitu);
		ezeztatu.setBounds(311, 481, 131, 44);

	}
}
