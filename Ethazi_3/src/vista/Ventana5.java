package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class Ventana5 extends JPanel {
	private JTextField textSartzekoDirua;

	/**
	 * Create the panel.
	 */
	public Ventana5() {
		setLayout(null);
		
		JLabel lblOrdainketa = new JLabel("Ordainketa :");
		lblOrdainketa.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		lblOrdainketa.setBounds(36, 25, 162, 34);
		add(lblOrdainketa);
		
		JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
		lblSartuDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblSartuDirua.setBounds(36, 70, 136, 34);
		add(lblSartuDirua);
		
		textSartzekoDirua = new JTextField();
		textSartzekoDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		textSartzekoDirua.setBounds(182, 80, 106, 19);
		add(textSartzekoDirua);
		textSartzekoDirua.setColumns(10);
		
		JButton btnOrdaindu = new JButton("Ordaindu");
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		btnOrdaindu.setBounds(316, 76, 110, 24);
		add(btnOrdaindu);
		
		JLabel lblItzuliak = new JLabel("Itzuliak :");
		lblItzuliak.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblItzuliak.setBounds(36, 105, 136, 34);
		add(lblItzuliak);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(36, 139, 390, 109);
		add(textArea);
		
		JButton btnAmaitu = new JButton("Amaitu");
		btnAmaitu.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		btnAmaitu.setBounds(316, 265, 110, 24);
		add(btnAmaitu);
		
//		JScrollPane scrollBar = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//		scrollBar.setBounds(409, 139, 17, 109);
//		add(scrollBar);
//
//		textArea.add(scrollBar);

		
	}
}
