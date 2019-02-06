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
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Component;


public class Ventana5 extends JFrame {
	JLabel lblNewLabel = new JLabel("Biletearen Informazioa");
	JTextArea textArea = new JTextArea();
	JButton btnAtzera = new JButton("Atzera");
	JButton btnBalidatu = new JButton("Balidatu");

	private String nan="";

	

	public Ventana5(Billete billete, Tiket t1) {
		nan=billete.getDni();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 37));
		
		lblNewLabel.setBounds(151, 40, 418, 44);
		getContentPane().add(lblNewLabel);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 16));
		
		textArea.setBounds(100, 131, 495, 251);
		getContentPane().add(textArea);
		textArea.setText(t1.toString());
		btnAtzera.setFont(new Font("Arial", Font.PLAIN, 18));
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		btnAtzera.setBounds(357, 451, 89, 44);
		getContentPane().add(btnAtzera);
		btnBalidatu.setFont(new Font("Arial", Font.PLAIN, 18));
		
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.seigarrenLeihoa(billete,t1);
			}
		});
		btnBalidatu.setBounds(498, 451, 97, 44);
		getContentPane().add(btnBalidatu);
		
		
	}
}
