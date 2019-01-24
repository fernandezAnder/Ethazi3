package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.plaf.RootPaneUI;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Ventana6 extends JPanel {
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
		
		//LABEL TXARTEL ERREGISTROA
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 26));
		lblTxatelaErregistroa.setBounds(206, 25, 274, 54);
		add(lblTxatelaErregistroa);
		
		//LABEL NAN
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblNan.setBounds(117, 156, 62, 40);
		add(lblNan);
		
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
		textNAN.setBounds(223, 160, 142, 40);
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
		textLetra.setBounds(525, 161, 40, 38);
		add(textLetra);
		
		//NANaren Stringa
		String nan=zenbakia+letra;
		
		//LETRA LABEL
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblLetra.setBounds(430, 159, 62, 40);
		add(lblLetra);
		
		//LABEL PASAHITZA
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblPasahitza.setBounds(182, 280, 120, 54);
		add(lblPasahitza);
		
		//EZEZTATU BOTOIA
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnEzeztatu.setBounds(89, 464, 114, 40);
		add(btnEzeztatu);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {

				

				
			}
		});
		btnAtzera.setBounds(294, 463, 114, 42);
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
		btnBalidatu.setBounds(497, 464, 120, 40);
		add(btnBalidatu);
		
		//PASAHITZA TEXTUA
		Pasahitza = new JPasswordField();
		Pasahitza.setBounds(338, 290, 142, 43);
		add(Pasahitza);

	}
}

