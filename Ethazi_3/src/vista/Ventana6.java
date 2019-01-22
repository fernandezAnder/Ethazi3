package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Ventana6 extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
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
		setLayout(null);
		
		lblTxatelaErregistroa.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblTxatelaErregistroa.setBounds(144, 36, 163, 40);
		add(lblTxatelaErregistroa);
		
		lblNan.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblNan.setBounds(83, 120, 62, 40);
		add(lblNan);
		
		textField = new JTextField();
		textField.setBounds(146, 124, 142, 38);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(391, 124, 40, 38);
		add(textField_1);
		
		lblLetra.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblLetra.setBounds(320, 120, 62, 40);
		add(lblLetra);
		
		lblPasahitza.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
		lblPasahitza.setBounds(83, 191, 88, 40);
		add(lblPasahitza);
		
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnEzeztatu.setBounds(69, 295, 102, 33);
		add(btnEzeztatu);
		
		btnAtzera.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Frame.Ventana3.isVisible()){
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(true);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
            	}


				
				
				
				
			}
		});
		btnAtzera.setBounds(199, 295, 89, 33);
		add(btnAtzera);
		
		btnBalidatu.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		btnBalidatu.setBounds(333, 295, 89, 33);
		add(btnBalidatu);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(199, 198, 124, 40);
		add(passwordField);

	}
}

