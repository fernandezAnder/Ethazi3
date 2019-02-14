package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import controlador.Cliente2;
import controlador.Metodoak;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Ventana2b extends JFrame {

	
	private static final long serialVersionUID = 1L;
	private JTextField textNAN;
	private JTextField textLetra;
	private JPasswordField Pasahitza;
	private JLabel lblTxatelaErregistroa = new JLabel("Txatela Erregistroa");
	private JLabel lblNan = new JLabel("NAN");
	private JLabel lblLetra = new JLabel("Letra");
	private JLabel lblPasahitza = new JLabel("Pasahitza");
	private JButton Ezeztatu = new JButton("Atzera");
	private JButton Jarraitu = new JButton("Jarraitu");
	private JButton Balidatu = new JButton("Balidatu");
	private JTextField izena = new JTextField();
	private JDateChooser jaiodata = new JDateChooser();
	private JTextField abizenatextfield = new JTextField();
	private JLabel lblSexua = new JLabel("Sexua*");
	private JLabel lblIzena = new JLabel("Izena");
	private JLabel lblJaiotzeData = new JLabel("Jaiotze data ");
	private JLabel lblAbizena = new JLabel("Abizena");
	private JComboBox AukeratuSexua = new JComboBox();
	private JLabel lblMNeska = new JLabel("   M = Neska");
	private JLabel lblMutila = new JLabel("* V = Mutila");
	private JLabel lblErabiltzaileDatuak = new JLabel("Erabiltzaile Datuak  ----------------------------------------------------------------------------------------------------------------------------------");
	private JLabel lblDatuPertsonalak = new JLabel("Datu Pertsonalak  ----------------------------------------------------------------------------------------------------------------------------------");
	SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");


	private String nan="";
	private String nan2="1";
	private String letra="";
	private String letra2="";
	private String zenbakia="";
	private String pasahitza="";
	private String izena2="";
	private String abizena="";
	private String jaio_data;
	private String sexua;


	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Ventana2b() {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Arial", Font.BOLD, 37));
		lblTxatelaErregistroa.setBounds(181, 44, 351, 37);
		getContentPane().add(lblTxatelaErregistroa);

		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNan.setBounds(108, 321, 47, 28);
		getContentPane().add(lblNan);

		//TEXT NAN
		textNAN = new JTextField();
		textNAN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textNAN.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				if(textNAN.getText().length()>=8) {
					evt.consume();	

				}
				char validar =evt.getKeyChar();
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					evt.consume();	

				}
			}
		});
		zenbakia=textNAN.getText();
		textNAN.setBounds(192, 323, 109, 28);
		getContentPane().add(textNAN);
		textNAN.setColumns(10);

		//TEXT LETRA
		textLetra = new JTextField();
		textLetra.setHorizontalAlignment(SwingConstants.CENTER);
		textLetra.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textLetra.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				if(textLetra.getText().length()>=1) {
					evt.consume();	
				}
				char validar =evt.getKeyChar();
				char c=evt.getKeyChar();
				if(Character.isDigit(validar) ) {
					getToolkit().beep();
					evt.consume();	

				}
				if(Character.isLowerCase(c)) {
					String cad=(""+c).toUpperCase();
					c=cad.charAt(0);
					evt.setKeyChar(c);
				}

			}
		});
		letra=textLetra.getText();
		textLetra.setColumns(10);
		textLetra.setBounds(440, 323, 32, 28);
		getContentPane().add(textLetra);

		//LETRA LABEL
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(359, 321, 52, 28);
		getContentPane().add(lblLetra);

		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(63, 378, 92, 28);
		getContentPane().add(lblPasahitza);

		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pasahitza.setBounds(192, 380, 170, 28);
		getContentPane().add(Pasahitza);

		//Balidatu botoia
		Balidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Balidatu.setBounds(315, 452, 115, 44);
		getContentPane().add(Balidatu);

		//LABEL IZENA
		lblIzena.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblIzena.setBounds(92, 151, 63, 28);
		getContentPane().add(lblIzena);
		izena.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char validar =evt.getKeyChar();
				
				if(Character.isDigit(validar) ) {
					getToolkit().beep();
					evt.consume();	

				}

			}
		});

		//TEXT IZENA
		izena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		izena.setColumns(10);
		izena.setBounds(192, 153, 109, 28);
		getContentPane().add(izena);

		//LABEL ABIZENA
		lblAbizena.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAbizena.setBounds(80, 214, 92, 28);
		getContentPane().add(lblAbizena);

		//LABEL TEXT
		abizenatextfield = new JTextField();
		abizenatextfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char validar =evt.getKeyChar();
				if(Character.isDigit(validar) ) {
					getToolkit().beep();
					evt.consume();	

				}

			}
		});
		abizenatextfield.setFont(new Font("Tahoma", Font.PLAIN, 16));
		abizenatextfield.setColumns(10);
		abizenatextfield.setBounds(192, 216, 109, 28);
		getContentPane().add(abizenatextfield);

		//LABEL JAIOTZE DATA
		lblJaiotzeData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblJaiotzeData.setBounds(327, 151, 133, 28);
		getContentPane().add(lblJaiotzeData);

		//DATA JCALENDAR
		jaiodata.setBounds(470, 151, 122, 28);
		jaiodata.setVerifyInputWhenFocusTarget(false);
		jaiodata.setDateFormatString("yyyy-MM-dd");	
		getContentPane().add(jaiodata);
		jaiodata.getDate();
		jaiodata.cleanup();
		jaiodata.setMaxSelectableDate(new Date());

		//LABEL SEXUA
		lblSexua.setFont(new Font("Arial", Font.BOLD, 20));
		lblSexua.setBounds(359, 213, 78, 28);
		getContentPane().add(lblSexua);

		//LABEL DATU PERSTSONALAK
		lblDatuPertsonalak.setBounds(22, 118, 632, 22);
		getContentPane().add(lblDatuPertsonalak);

		//LABEL ERABILTZAILE DATUAK
		lblErabiltzaileDatuak.setBounds(22, 288, 632, 22);
		getContentPane().add(lblErabiltzaileDatuak);

		//LABEL INFO TESTUA
		lblMutila.setToolTipText("");
		lblMutila.setBounds(533, 213, 74, 22);
		getContentPane().add(lblMutila);

		lblMNeska.setToolTipText("");
		lblMNeska.setBounds(533, 233, 74, 22);
		getContentPane().add(lblMNeska);
		AukeratuSexua.setForeground(Color.BLACK);
		AukeratuSexua.setBackground(Color.WHITE);


		AukeratuSexua.setFont(new Font("Arial", Font.PLAIN, 18));
		AukeratuSexua.setModel(new DefaultComboBoxModel(new String[] {"V", "M"}));
		AukeratuSexua.setBounds(450, 220, 40, 20);
		getContentPane().add(AukeratuSexua);


		//EZEZTATU BOTOIA
		Ezeztatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Ezeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.lehenengoLeihoa();


			}
		});
		Ezeztatu.setBounds(165, 452, 109, 44);
		getContentPane().add(Ezeztatu);
		//DNI ETA PASAHITZA BALIDATZEKO BOTOIA

		Balidatu.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				//BALIDAZIORAKO BARIABLEAK
				try {
					zenbakia=textNAN.getText();
					int zbk= Integer.parseInt(zenbakia);
					letra=textLetra.getText();
					nan=zenbakia+letra;

					letra2=Metodoak.KalkulatuLetra(zbk);
					nan2=zenbakia+letra2;
					System.out.println("Sartutako nan: "+nan);
					System.out.println("Izan behar den nan: "+nan2);
				}catch (Exception e) {

				}

				if (nan.equals(nan2) && !izena.getText().equals("") && !abizenatextfield.getText().equals("") && !Pasahitza.getText().equals("") && zenbakia.length()==8) {
					Jarraitu.setEnabled(true);
					Balidatu.setEnabled(false);
				}else if(izena.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Izena hutsik dago. Mesedez osotu");

				}
				else if(abizenatextfield.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Abizena hutsik dago. Mesedez osotu");
				}
				else if(Pasahitza.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Pasahitza hutsik dago. Mesedez osotu");
				}
				else if(zenbakia.length()<8) {
					JOptionPane.showMessageDialog(null, "Nan zenbakia txarto dago");
				}
				else {
					JOptionPane.showMessageDialog(null, "Nan letra txarto dago");
				}

				izena2=izena.getText();
				abizena=abizenatextfield.getText();

				int sexuzbk;
				sexuzbk=AukeratuSexua.getSelectedIndex();
				if (sexuzbk==0)
					sexua="V";
				else
					sexua="M";
				pasahitza=Pasahitza.getText();
				pasahitza=Metodoak.ateraMD5(pasahitza);
				try {
					Date jaio_data2= jaiodata.getDate();
					jaio_data= sm.format(jaio_data2);
				}catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Data hutsik dago. Mesedez osotu");
				}
			}
		});

		//Ezeztatu Botoia

		Ezeztatu.setBounds(165, 452, 109, 44);
		getContentPane().add(Ezeztatu);
		
		//JARRAITU BOTOIA
		Jarraitu.setEnabled(false);
		//Jarraitu Botoiak egiten duena
		Jarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Cliente2 cliente = new Cliente2(nan, izena2, abizena, jaio_data, sexua, pasahitza);
				Metodoak.bezeroaIgo(cliente);
				Metodoak.bigarrenLeihoa();
			}
		});
		//Jarraitu Botoiaren egitura
		Jarraitu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Jarraitu.setBounds(462, 452, 115, 44);
		getContentPane().add(Jarraitu);

	}
}