package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import controlador.Billete;
import controlador.Metodoak;
import controlador.Tiket;

public class Ventana5 extends JFrame {
	private String nan="";
	
	

	public Ventana5(Billete billete, Tiket t1) {
		nan=billete.getDni();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biletearen Informazioa");
		lblNewLabel.setBounds(228, 72, 199, 29);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 134, 495, 176);
		getContentPane().add(textArea);
		textArea.setText(t1.toString());
		
		JButton btnAtzera = new JButton("Atzera");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		btnAtzera.setBounds(100, 472, 89, 23);
		getContentPane().add(btnAtzera);
		
		JButton btnBalidatu = new JButton("Balidatu");
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.seigarrenLeihoa(billete, t1);
			}
		});
		btnBalidatu.setBounds(356, 472, 89, 23);
		getContentPane().add(btnBalidatu);
		
		
	}
}
