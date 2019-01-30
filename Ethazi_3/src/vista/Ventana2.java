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

public class Ventana2 extends JFrame {

	JTextField textNAN;
	JTextField textLetra;
	JPasswordField Pasahitza;
	JLabel lblTxatelaErregistroa = new JLabel("Txatela Erregistroa");
	JLabel lblNan = new JLabel("NAN");
	JLabel lblLetra = new JLabel("Letra");
	JLabel lblPasahitza = new JLabel("Pasahitza");
	JButton btnEzeztatu = new JButton("Ezeztatu");
	JButton Ezeztatu = new JButton("Atzera");
	JButton Jarraitu = new JButton("Jarraitu");
	JButton Balidatu = new JButton("Balidatu");
	String nan="";
	String letra="";
	String zenbakia="";
	String pasahitza="";

	public Ventana2(ArrayList<Cliente> clientes) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTxatelaErregistroa.setBounds(222, 46, 250, 37);
		getContentPane().add(lblTxatelaErregistroa);

		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
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
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(360, 128, 52, 28);
		getContentPane().add(lblLetra);

		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(165, 212, 92, 28);
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
		Ezeztatu.setBounds(241, 343, 109, 44);
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
		Jarraitu.setBounds(424, 343, 115, 44);
		getContentPane().add(Jarraitu);

		

		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Pasahitza.setBounds(302, 212, 170, 28);
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
							System.out.println(clientes.get(i).getDni());
							//System.out.println(nan);
						}

						for (int i=0;i<clientes.size();i++) {
							if (clientes.get(i).getDni().equals(nan)) {
								System.out.println(nan);
								
								if (clientes.get(i).getContraseña().equals(Metodoak.ateraMD5(pasahitza))) {
									System.out.println(pasahitza);
									Jarraitu.setEnabled(true);
									Balidatu.setEnabled(false);
									
								}
							}
						}
					}
				});
				Balidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
				Balidatu.setBounds(529, 196, 115, 44);
				getContentPane().add(Balidatu);

		
	}
}

