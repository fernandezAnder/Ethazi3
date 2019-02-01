package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.*;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;

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
	private JTextField izena;
	private JTextField abizenatextfield;
	private final JTextField sexuatextfield = new JTextField();
	private JLabel lblSexua = new JLabel("Sexua");
	private JLabel lblIzena = new JLabel("Izena");
	private final JTextField izenatextField = new JTextField();
	private JLabel lblJaiotzeData = new JLabel("Jaiotze data ");
	private JDateChooser jaiotzedata = new JDateChooser();
	private JLabel lblAbizena = new JLabel("Abizena");
	

	private String nan="";
	private String letra="";
	private String zenbakia="";
	private String pasahitza="";
	
	public Ventana2b(ArrayList<Cliente> clientes) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTxatelaErregistroa.setBounds(222, 46, 250, 37);
		getContentPane().add(lblTxatelaErregistroa);

		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNan.setBounds(146, 274, 47, 28);
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
		textNAN.setBounds(238, 276, 109, 28);
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
		textLetra.setBounds(484, 276, 32, 28);
		getContentPane().add(textLetra);



		//LETRA LABEL
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(402, 274, 52, 28);
		getContentPane().add(lblLetra);

		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(146, 336, 92, 28);
		getContentPane().add(lblPasahitza);

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
		Jarraitu.setBounds(407, 437, 115, 44);
		getContentPane().add(Jarraitu);

		

		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pasahitza.setBounds(297, 338, 170, 28);
		getContentPane().add(Pasahitza);

		//DNI ETA PASAHITZA BALIDATZEKO BOTOIA
		
				
				
				Balidatu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//BALIDAZIORAKO BARIABLEAK
						zenbakia=textNAN.getText();
						letra=textLetra.getText();
						nan=zenbakia+letra;
						pasahitza=Pasahitza.getText();
						
//						for (int i=0;i<clientes.size();i++) {
//							System.out.println(clientes.get(i).getDni());
//							//System.out.println(nan);
//						}

//						for (int i=0;i<clientes.size();i++) {
//							if (clientes.get(i).getDni().equals(nan)) {
//								System.out.println(nan);
//								
//								if (clientes.get(i).getContraseña().equals(Metodoak.ateraMD5(pasahitza))) {
//									System.out.println(pasahitza);
//									Jarraitu.setEnabled(true);
//									Balidatu.setEnabled(false);
//									
//								}
//							}
//						}
					}
				});
				
				
				Balidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				Balidatu.setBounds(539, 288, 115, 44);
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
				lblJaiotzeData.setBounds(359, 125, 133, 28);
				getContentPane().add(lblJaiotzeData);
				
				//JCALENDAR JAIOTZE DATA
				jaiotzedata.setDateFormatString("yyyy-MM-dd");
				jaiotzedata.setBounds(504, 131, 105, 22);
				getContentPane().add(jaiotzedata);
				
				//LABEL SEXUA
				lblSexua.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
				lblSexua.setBounds(359, 189, 71, 28);
				getContentPane().add(lblSexua);
				
				//SEXUA TEXT
				sexuatextfield.setHorizontalAlignment(SwingConstants.CENTER);
				sexuatextfield.setFont(new Font("Tahoma", Font.PLAIN, 16));
				sexuatextfield.setColumns(10);
				sexuatextfield.setBounds(442, 186, 32, 28);
				getContentPane().add(sexuatextfield);
				
				//IZENA TEXT
				izenatextField.setFont(new Font("Tahoma", Font.PLAIN, 16));
				izenatextField.setColumns(10);
				izenatextField.setBounds(192, 131, 109, 28);
				getContentPane().add(izenatextField);

		
	}

	
}

