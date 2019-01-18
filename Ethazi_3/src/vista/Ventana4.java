package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;

public class Ventana4 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Ventana4() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Aukeratutako Bidaia :");
		lblNewLabel.setBounds(83, 24, 297, 34);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		add(lblNewLabel);
		
		JLabel lblBidaia = new JLabel("Bidaia :");
		lblBidaia.setBounds(38, 80, 83, 26);
		lblBidaia.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblBidaia);
		
		JLabel lblData = new JLabel("Data :");
		lblData.setBounds(38, 135, 74, 26);
		lblData.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblData);
		
		JLabel lblPrezioa = new JLabel("Prezioa :");
		lblPrezioa.setBounds(38, 188, 91, 34);
		lblPrezioa.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblPrezioa);
		
		JTextPane textPaneBidaia = new JTextPane();
		textPaneBidaia.setBounds(139, 80, 104, 20);
		add(textPaneBidaia);
		
		JTextPane textPaneData = new JTextPane();
		textPaneData.setBounds(139, 135, 104, 20);
		add(textPaneData);
		
		JTextPane textPanePrezioa = new JTextPane();
		textPanePrezioa.setBounds(139, 202, 104, 20);
		add(textPanePrezioa);

	}
}
