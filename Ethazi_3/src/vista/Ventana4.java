package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JPanel {

	JLabel lblNewLabel = new JLabel("Aukeratutako Bidaia :");
	JLabel lblBidaia = new JLabel("Bidaia :");
	JLabel lblData = new JLabel("Data :");
	JLabel lblPrezioa = new JLabel("Prezioa :");
	JTextPane textPaneBidaia = new JTextPane();
	JTextPane textPaneData = new JTextPane();
	JTextPane textPanePrezioa = new JTextPane();
	private final JButton btnAtzera = new JButton("Atzera");
	private final JButton btnBalidatu = new JButton("Balidatu");
	
	
	/**
	 * Create the panel.
	 */
	public Ventana4() {
		setLayout(null);
		
		lblNewLabel.setBounds(83, 24, 297, 34);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		add(lblNewLabel);
		
		lblBidaia.setBounds(38, 80, 83, 26);
		lblBidaia.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblBidaia);
		
		lblData.setBounds(38, 135, 74, 26);
		lblData.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblData);
		
		lblPrezioa.setBounds(38, 188, 91, 34);
		lblPrezioa.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		add(lblPrezioa);
		
		textPaneBidaia.setBounds(139, 80, 104, 20);
		add(textPaneBidaia);
		
		textPaneData.setBounds(139, 135, 104, 20);
		add(textPaneData);
		
		textPanePrezioa.setBounds(139, 202, 104, 20);
		add(textPanePrezioa);
		
		JButton btnEzeztatu = new JButton("Ezeztatu");
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnEzeztatu.setBounds(169, 266, 74, 23);
		add(btnEzeztatu);
		btnAtzera.setBounds(253, 266, 74, 23);
		
		add(btnAtzera);
		btnBalidatu.setBounds(350, 266, 74, 23);
		
		add(btnBalidatu);

	}
}
