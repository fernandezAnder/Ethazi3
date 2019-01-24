package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.RootPaneUI;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana6 extends JFrame {
	private JTextField textNAN;
	private JTextField textLetra;
	private JPasswordField Pasahitza;
	JLabel lblTxatelaErregistroa = new JLabel("Txatela Erregistroa");
	JLabel lblNan = new JLabel("NAN");
	JLabel lblLetra = new JLabel("Letra");
	JLabel lblPasahitza = new JLabel("Pasahitza");
	JButton btnEzeztatu = new JButton("Ezeztatu");
	JButton btnAtzera = new JButton("Atzera");
	JButton btnBalidatu = new JButton("Balidatu");

	/**
	 * Create the panel.
	 */
	public Ventana6() {
		this.setBounds(275,100,700,600);
		setLayout(null);
		
		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTxatelaErregistroa.setBounds(224, 11, 250, 37);
		add(lblTxatelaErregistroa);
		
		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNan.setBounds(169, 75, 47, 28);
		add(lblNan);
		
		String kaixo;
		int adibidide;
		//TEXT NAN
		textNAN = new JTextField();
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
		String zenbakia=textNAN.getText();
		textNAN.setBounds(241, 83, 86, 20);
		add(textNAN);
		textNAN.setColumns(10);
		
		//TEXT LETRA
		textLetra = new JTextField();
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
		String letra=textLetra.getText();
		textLetra.setColumns(10);
		textLetra.setBounds(457, 83, 32, 20);
		add(textLetra);
		
		//NANaren Stringa
		String nan=zenbakia+letra;
		
		//LETRA LABEL
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(377, 75, 52, 28);
		add(lblLetra);
		
		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(165, 212, 92, 28);
		add(lblPasahitza);
		
		//EZEZTATU BOTOIA
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnEzeztatu.setBounds(162, 321, 95, 31);
		add(btnEzeztatu);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				

				
			}
		});
		btnAtzera.setBounds(302, 321, 81, 31);
		add(btnAtzera);
		//BALIDATU BOTOIA

		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				

			}
		});
		
		//BALIDATU BOTOIA
		btnBalidatu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		
		btnBalidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBalidatu.setBounds(414, 321, 89, 31);
		add(btnBalidatu);
		
		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setBounds(302, 220, 92, 20);
		add(Pasahitza);

	}
}

