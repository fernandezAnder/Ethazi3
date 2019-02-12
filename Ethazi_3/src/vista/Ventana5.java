package vista;

import java.awt.Font;
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
	JLabel lblNewLabel = new JLabel("Biletearen Informazioa");
	JTextArea textArea = new JTextArea();
	JButton btnAtzera = new JButton("Atzera");
	JButton btnBalidatu = new JButton("Balidatu");
	private int biletekod=0;
	private String nan="";

	

	public Ventana5(Billete billete, Tiket t1) {
		nan=billete.getDni();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 37));
		
		lblNewLabel.setBounds(151, 40, 418, 44);
		getContentPane().add(lblNewLabel);
		textArea.setEditable(false);
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		
		textArea.setBounds(44, 131, 603, 251);
		getContentPane().add(textArea);
		textArea.setText(t1.toString());
		btnAtzera.setFont(new Font("Arial", Font.PLAIN, 18));
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				biletekod=t1.getCod_billete();
				biletekod=biletekod-1;
				t1.setCod_billete(biletekod);
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
		btnBalidatu.setBounds(498, 451, 108, 44);
		getContentPane().add(btnBalidatu);
		
		
	}
}
