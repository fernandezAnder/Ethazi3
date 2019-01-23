package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setLayout(null);
		
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
		textNAN.setBounds(223, 160, 142, 40);
		add(textNAN);
		textNAN.setColumns(10);
		
		//TEXT LETRA
		textLetra = new JTextField();
		textLetra.setColumns(10);
		textLetra.setBounds(525, 161, 40, 38);
		add(textLetra);
		
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
				if(Frame.Ventana6.isVisible()){
                	Frame.Ventana1.setVisible(true);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana6.setVisible(false);
                	Frame.Ventana7.setVisible(false);
            	}
				
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
				if(Frame.Ventana6.isVisible()){
                	Frame.Ventana5.setVisible(true);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana6.setVisible(false);
                	Frame.Ventana7.setVisible(false);
            	}
	
			}
		});
		btnAtzera.setBounds(294, 463, 114, 42);
		add(btnAtzera);
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//BALIDATU BOTOIA
		btnBalidatu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(Frame.Ventana6.isVisible()){
                	Frame.Ventana7.setVisible(true);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana6.setVisible(false);
            	}
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

