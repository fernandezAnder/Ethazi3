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
import java.awt.event.ActionEvent;

public class Ventana4 extends JFrame {

	JLabel lblAukeratutakoBidaia = new JLabel("Aukeratutako Bidaia :");
	JLabel lblBidaia = new JLabel("Bidaia :");
	JLabel lblData = new JLabel("Data :");
	JLabel lblPrezioa = new JLabel("Prezioa :");
	JTextPane textPaneBidaia = new JTextPane();
	JTextPane textPaneData = new JTextPane();
	JTextPane textPanePrezioa = new JTextPane();
	private final JButton btnAtzera = new JButton("Atzera");
	private final JButton btnBalidatu = new JButton("Balidatu");
	JButton btnEzeztatu = new JButton("Ezeztatu");

	
	/**
	 * Create the panel.
	 */
	public Ventana4() {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//AUKERATUTAKO BOTOIA LABEL
		lblAukeratutakoBidaia.setBounds(286, 11, 253, 34);
		lblAukeratutakoBidaia.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		getContentPane().add(lblAukeratutakoBidaia);
		
		//BIDAIA LABEL
		lblBidaia.setBounds(155, 129, 91, 29);
		lblBidaia.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		getContentPane().add(lblBidaia);
		
		//BIDAIA DATA
		lblData.setBounds(155, 210, 72, 29);
		lblData.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		getContentPane().add(lblData);
		
		//PREZIOA LABEL
		lblPrezioa.setBounds(155, 297, 101, 29);
		lblPrezioa.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		getContentPane().add(lblPrezioa);
		
		//TEXTPANE BIDAIA
		textPaneBidaia.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPaneBidaia.setEditable(false);
		textPaneBidaia.setBounds(286, 138, 104, 20);
		getContentPane().add(textPaneBidaia);
		
		//TEXTPANE DATA
		textPaneData.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPaneData.setEditable(false);
		textPaneData.setBounds(286, 219, 104, 20);
		getContentPane().add(textPaneData);
		
		//TEXTPANE PREZIOA
		textPanePrezioa.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPanePrezioa.setEditable(false);
		textPanePrezioa.setBounds(286, 297, 104, 20);
		getContentPane().add(textPanePrezioa);
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

	}
}
