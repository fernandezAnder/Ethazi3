package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Ventana5 extends JPanel {
	private JTextField textSartzekoDirua;
	JLabel lblOrdainketa = new JLabel("Ordainketa :");
	JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
	JButton btnOrdaindu = new JButton("Ordaindu");
	JLabel lblItzuliak = new JLabel("Itzuliak :");
	JTextArea textAreaItzuliak = new JTextArea();
	JButton btnAmaitu = new JButton("Amaitu");

	/**
	 * Create the panel.
	 */
	public Ventana5() {
		setLayout(null);
		
		//LABEL ORDAINKETA
		lblOrdainketa.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		lblOrdainketa.setBounds(104, 11, 162, 34);
		add(lblOrdainketa);
		
		//LABEL SARTU DIRUA
		lblSartuDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblSartuDirua.setBounds(90, 67, 162, 37);
		add(lblSartuDirua);
		
		//TEXTUA SARTZEKO DIRUA
		textSartzekoDirua = new JTextField();
		textSartzekoDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		textSartzekoDirua.setBounds(266, 73, 162, 34);
		add(textSartzekoDirua);
		textSartzekoDirua.setColumns(10);
		
		//ORDAINDU BOTOIA
		btnOrdaindu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				
				
				
				
				
			}
		});
		
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		btnOrdaindu.setBounds(534, 86, 120, 40);
		add(btnOrdaindu);
		
		
		//LABEL ITZULIAK
		lblItzuliak.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblItzuliak.setBounds(120, 153, 136, 34);
		add(lblItzuliak);
		textAreaItzuliak.setForeground(Color.WHITE);
		
		//TEXTAREA ITZULIAK
		textAreaItzuliak.setBounds(126, 214, 454, 199);
		add(textAreaItzuliak);
		
		//BOTOIA AMAITU
		btnAmaitu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Frame.Ventana5.isVisible()){
                	Frame.Ventana6.setVisible(true);
                	Frame.Ventana1.setVisible(false);
                	Frame.Ventana2.setVisible(false);
                	Frame.Ventana3.setVisible(false);  
                	Frame.Ventana4.setVisible(false);
                	Frame.Ventana5.setVisible(false);
                	Frame.Ventana7.setVisible(false);
            	}

			}
		});
		
		btnAmaitu.setBounds(497, 464, 120, 40);
		add(btnAmaitu);
		
		// SCROLLBAR
//		JScrollPane scrollBar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scrollBar.setBounds(409, 139, 17, 109);
//		add(scrollBar);
//
//		textArea.add(scrollBar);

		
	}
}
