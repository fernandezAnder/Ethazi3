package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana4 extends JPanel {

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
		setLayout(null);
		
		//AUKERATUTAKO BOTOIA LABEL
		lblAukeratutakoBidaia.setBounds(141, 23, 297, 34);
		lblAukeratutakoBidaia.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		add(lblAukeratutakoBidaia);
		
		//BIDAIA LABEL
		lblBidaia.setBounds(121, 121, 114, 34);
		lblBidaia.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		add(lblBidaia);
		
		//BIDAIA DATA
		lblData.setBounds(121, 212, 90, 26);
		lblData.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		add(lblData);
		
		//PREZIOA LABEL
		lblPrezioa.setBounds(121, 309, 104, 40);
		lblPrezioa.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		add(lblPrezioa);
		
		//TEXTPANE BIDAIA
		textPaneBidaia.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPaneBidaia.setEditable(false);
		textPaneBidaia.setBounds(294, 121, 114, 40);
		add(textPaneBidaia);
		
		//TEXTPANE DATA
		textPaneData.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPaneData.setEditable(false);
		textPaneData.setBounds(294, 210, 120, 40);
		add(textPaneData);
		
		//TEXTPANE PREZIOA
		textPanePrezioa.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textPanePrezioa.setEditable(false);
		textPanePrezioa.setBounds(294, 309, 131, 40);
		add(textPanePrezioa);
		btnEzeztatu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		//EZEZTATU BOTOIA
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnEzeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//
				if(Frame.Ventana4.isVisible()){
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
		btnEzeztatu.setBounds(89, 464, 114, 40);
		add(btnEzeztatu);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(Frame.Ventana4.isVisible()){
                	Frame.Ventana3.setVisible(true);  
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana6.setVisible(false);
                	Frame.Ventana7.setVisible(false);
            	}
				
				
			}
		});
		btnAtzera.setBounds(294, 463, 114, 42);
		
		add(btnAtzera);
		
		//BALIDATU BOTOIA
		btnBalidatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Frame.Ventana4.isVisible()){
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
		btnBalidatu.setBounds(497, 464, 120, 40);
		
		add(btnBalidatu);

	}
}
