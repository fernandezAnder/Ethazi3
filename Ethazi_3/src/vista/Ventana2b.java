package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import controlador.*;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class Ventana2b extends JFrame {

	private JTextField textNAN;
	private JTextField textLetra;
	private JPasswordField Pasahitza;
	private JLabel lblTxatelaErregistroa = new JLabel("Txatela Erregistroa");
	private JLabel lblNan = new JLabel("NAN");
	private JLabel lblLetra = new JLabel("Letra");
	private JLabel lblPasahitza = new JLabel("Pasahitza");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton Ezeztatu = new JButton("Atzera");
	private JButton Jarraitu = new JButton("Jarraitu");
	private JButton Balidatu = new JButton("Balidatu");
	private JTextField izena = new JTextField();
	private JTextField abizenatextfield = new JTextField();
	private JLabel lblSexua = new JLabel("Sexua*");
	private JLabel lblIzena = new JLabel("Izena");
	private final JTextField izenatextField = new JTextField();
	private JLabel lblJaiotzeData = new JLabel("Jaiotze data ");
	private JLabel lblAbizena = new JLabel("Abizena");
	private JComboBox AukeratuSexua = new JComboBox();
	private JLabel lblMNeska = new JLabel("   M = Neska");
	private JLabel lblNewLabel = new JLabel("* V = Mutila");
	private JLabel lblErabiltzaileDatuak = new JLabel("Erabiltzaile Datuak  ----------------------------------------------------------------------------------------------------------------------------------");
	private JLabel lblDatuPertsonalak = new JLabel("Datu Pertsonalak  ----------------------------------------------------------------------------------------------------------------------------------");
	private JLabel label = new JLabel("-");
	private JLabel label_1_marra = new JLabel("-");
	private JSpinner spinner_Urtea = new JSpinner(new SpinnerNumberModel(Calendar.YEAR,1900,Calendar.YEAR,1));
	private JSpinner spinner_Hilabetea = new JSpinner(new SpinnerNumberModel((Calendar.MONTH)+1,1,12,1));
	private JSpinner spinner_Eguna = new JSpinner(new SpinnerNumberModel((Calendar.DAY_OF_MONTH),1900,31,1));

	

	private String nan="";
	private String letra="";
	private String zenbakia="";
	private String pasahitza="";
	private String izena2="";
	private String abizena="";
	private String jaio_data;
	private String sexua;


	public Ventana2b() {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTxatelaErregistroa.setBounds(222, 46, 250, 37);
		getContentPane().add(lblTxatelaErregistroa);

		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNan.setBounds(108, 274, 47, 28);
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
		textNAN.setBounds(192, 276, 109, 28);
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
		textLetra.setBounds(440, 276, 32, 28);
		getContentPane().add(textLetra);

		//LETRA LABEL
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(359, 274, 52, 28);
		getContentPane().add(lblLetra);

		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(63, 336, 92, 28);
		getContentPane().add(lblPasahitza);

		



		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pasahitza.setBounds(192, 338, 170, 28);
		getContentPane().add(Pasahitza);




		Balidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		Balidatu.setBounds(315, 452, 115, 44);
		getContentPane().add(Balidatu);

		//LABEL IZENA
		lblIzena.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblIzena.setBounds(92, 125, 63, 28);
		getContentPane().add(lblIzena);

		//TEXT IZENA
		izena.setFont(new Font("Tahoma", Font.PLAIN, 16));
		izena.setColumns(10);
		izena.setBounds(192, 127, 109, 28);
		getContentPane().add(izena);

		//LABEL ABIZENA
		lblAbizena.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblAbizena.setBounds(80, 180, 92, 28);
		getContentPane().add(lblAbizena);

		//LABEL TEXT
		abizenatextfield = new JTextField();
		abizenatextfield.setFont(new Font("Tahoma", Font.PLAIN, 16));
		abizenatextfield.setColumns(10);
		abizenatextfield.setBounds(192, 182, 109, 28);
		getContentPane().add(abizenatextfield);

		//LABEL JAIOYTZE DATA
		lblJaiotzeData.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblJaiotzeData.setBounds(326, 125, 133, 28);
		getContentPane().add(lblJaiotzeData);

		//LABEL SEXUA
		lblSexua.setFont(new Font("Arial", Font.BOLD, 20));
		lblSexua.setBounds(359, 180, 78, 28);
		getContentPane().add(lblSexua);

		//IZENA TEXT
		izenatextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		izenatextField.setColumns(10);
		izenatextField.setBounds(192, 127, 109, 28);
		getContentPane().add(izenatextField);

		lblDatuPertsonalak.setBounds(22, 92, 632, 22);
		getContentPane().add(lblDatuPertsonalak);

		lblErabiltzaileDatuak.setBounds(22, 241, 632, 22);
		getContentPane().add(lblErabiltzaileDatuak);


		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(533, 180, 74, 22);
		getContentPane().add(lblNewLabel);


		lblMNeska.setToolTipText("");
		lblMNeska.setBounds(533, 200, 74, 22);
		getContentPane().add(lblMNeska);

		
		AukeratuSexua.setFont(new Font("Arial", Font.PLAIN, 18));
		AukeratuSexua.setModel(new DefaultComboBoxModel(new String[] {"V", "M"}));
		AukeratuSexua.setBounds(440, 186, 40, 20);
		getContentPane().add(AukeratuSexua);

		//DNI ETA PASAHITZA BALIDATZEKO BOTOIA

		Balidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				//BALIDAZIORAKO BARIABLEAK
				zenbakia=textNAN.getText();
				letra=textLetra.getText();

				nan=zenbakia+letra;
				izena2=izena.getText();
				abizena=abizenatextfield.getText();
				jaio_data= "1998-01-04";
				int sexuzbk;
				sexuzbk=AukeratuSexua.getSelectedIndex();
				if (sexuzbk==0)
					sexua="V";
				else
					sexua="M";
				pasahitza=Pasahitza.getText();
				pasahitza=Metodoak.ateraMD5(pasahitza);
			
				Cliente2 cliente = new Cliente2(nan, izena2, abizena, jaio_data, sexua, pasahitza);
				
				
				Metodoak.bezeroaIgo(cliente);
			}
		});
		
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

				//JARRAITU BOTOIA
				Jarraitu.setEnabled(false);
				Jarraitu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
						Metodoak.hirugarrenLeihoa(nan);
					}
				});
				Jarraitu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				Jarraitu.setBounds(462, 452, 115, 44);
				getContentPane().add(Jarraitu);
				
				label.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
				label.setBounds(518, 125, 32, 28);
				getContentPane().add(label);
				
				label_1_marra.setFont(new Font("Bookman Old Style", Font.PLAIN, 40));
				label_1_marra.setBounds(575, 125, 17, 28);
				getContentPane().add(label_1_marra);
				
				spinner_Urtea.setBounds(462, 131, 59, 22);
				getContentPane().add(spinner_Urtea);
				
				spinner_Hilabetea.setBounds(533, 131, 40, 22);
				getContentPane().add(spinner_Hilabetea);
				
				spinner_Eguna.setBounds(593, 131, 50, 22);
				getContentPane().add(spinner_Eguna);

	}
}

