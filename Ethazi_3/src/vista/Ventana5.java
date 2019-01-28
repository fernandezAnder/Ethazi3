package vista;

import javax.swing.JPanel; 
import javax.swing.JLabel;

import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JTextPane;

import modelo.Consultas;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;

import controlador.Billete;

public class Ventana5 extends JFrame {

	private JLabel lblAukeratutakoBidaia = new JLabel("Aukeratutako Bidaia :");
	private final JButton btnAtzera = new JButton("Atzera");
	private final JButton btnBalidatu = new JButton("Balidatu");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JTable taula;

	
	/**
	 * Create the panel.
	 */
	public Ventana5() {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//AUKERATUTAKO BOTOIA LABEL
		lblAukeratutakoBidaia.setBounds(286, 11, 253, 34);
		lblAukeratutakoBidaia.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		getContentPane().add(lblAukeratutakoBidaia);
		btnEzeztatu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		//EZEZTATU BOTOIA
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnEzeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
   			 
				
			}
		});
		btnEzeztatu.setBounds(335, 471, 107, 35);
		getContentPane().add(btnEzeztatu);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		btnAtzera.setBounds(187, 471, 91, 35);
		
		getContentPane().add(btnAtzera);
		
		//BALIDATU BOTOIA
		btnBalidatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		btnBalidatu.setBounds(507, 471, 99, 35);
		
		
		getContentPane().add(btnBalidatu);
		
		taula = new JTable();
		taula.setAutoCreateRowSorter(true);
		taula.setToolTipText("");
		taula.setBounds(577, 109, -382, 230);
		getContentPane().add(taula);

	}
}
