package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.*;

public class Ventana2 extends JFrame {

	private JTextField textNAN;
	private JTextField textLetra;
	private JPasswordField Pasahitza;
	private JLabel lblTxatelaErregistroa = new JLabel("Txatel Logina");
	private JLabel lblNan = new JLabel("NAN");
	private JLabel lblLetra = new JLabel("Letra");
	private JLabel lblPasahitza = new JLabel("Pasahitza");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton Atzera = new JButton("Atzera");
	private JButton Jarraitu = new JButton("Jarraitu");
	private JButton Balidatu = new JButton("Balidatu");
	private String nan="";
	private String letra="";
	private String zenbakia="";
	private String pasahitza="";

	public Ventana2(ArrayList<Cliente> clientes) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Arial", Font.BOLD, 37));
		lblTxatelaErregistroa.setBounds(222, 46, 250, 37);
		getContentPane().add(lblTxatelaErregistroa);

		//LABEL NAN
		lblNan.setFont(new Font("Arial", Font.BOLD, 20));
		lblNan.setBounds(165, 128, 47, 28);
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
		textNAN.setBounds(241, 128, 109, 28);
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
		textLetra.setBounds(422, 128, 32, 28);
		getContentPane().add(textLetra);



		//LETRA LABEL
		lblLetra.setFont(new Font("Arial", Font.BOLD, 20));
		lblLetra.setBounds(360, 128, 52, 28);
		getContentPane().add(lblLetra);

		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Arial", Font.BOLD, 20));
		lblPasahitza.setBounds(120, 212, 92, 28);
		getContentPane().add(lblPasahitza);

		//EZEZTATU BOTOIA
		Atzera.setFont(new Font("Arial", Font.PLAIN, 18));
		Atzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.lehenengoLeihoa();

			}
		});
		Atzera.setBounds(97, 372, 115, 55);
		getContentPane().add(Atzera);

		//JARRAITU BOTOIA
		Jarraitu.setEnabled(false);
		Jarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		Jarraitu.setFont(new Font("Arial", Font.PLAIN, 18));
		Jarraitu.setBounds(488, 372, 115, 55);
		getContentPane().add(Jarraitu);

		

		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pasahitza.setBounds(241, 213, 170, 28);
		getContentPane().add(Pasahitza);

		//DNI ETA PASAHITZA BALIDATZEKO BOTOIA
		
				
				
				Balidatu.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//BALIDAZIORAKO BARIABLEAK
						zenbakia=textNAN.getText();
						letra=textLetra.getText();
						nan=zenbakia+letra;
						pasahitza=Pasahitza.getText();
						
						for (int i=0;i<clientes.size();i++) {
							//System.out.println(clientes.get(i).getDni());
							//System.out.println(nan);
						}
						boolean balidatu=true;
						for (int i=0;i<clientes.size();i++) {
							if (clientes.get(i).getDni().equals(nan)) {
								System.out.println(nan);
								
								if (clientes.get(i).getContraseña().equals(Metodoak.ateraMD5(pasahitza))) {
									System.out.println(pasahitza);
									Jarraitu.setEnabled(true);
									Balidatu.setEnabled(false);
									
								}else {
									balidatu=false;
									Pasahitza.setText("");
									JOptionPane.showMessageDialog(null,"Pasahitza gaizki dago. Mesedez sartu berriro.");
									
									}
								
							}else {
								if(i==clientes.size()-1 && balidatu==true) {
								textNAN.setText("");
								textLetra.setText("");
								JOptionPane.showMessageDialog(null,"NAN-a gaizki dago. Mesedez sartu berriro.");
								}
							}
						}
						
					}
				});
				Balidatu.setFont(new Font("Arial", Font.PLAIN, 18));
				Balidatu.setBounds(297, 372, 115, 55);
				getContentPane().add(Balidatu);
				
				JButton btnKontuBerria = new JButton("Erregistratu");
				btnKontuBerria.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						Metodoak.bigarrenLeihoaB();
					}
				});
				btnKontuBerria.setFont(new Font("Arial", Font.PLAIN, 20));
				btnKontuBerria.setBounds(464, 204, 170, 44);
				getContentPane().add(btnKontuBerria);

		
	}
}

