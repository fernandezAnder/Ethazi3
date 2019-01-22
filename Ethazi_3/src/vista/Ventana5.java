package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

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
		
		lblOrdainketa.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		lblOrdainketa.setBounds(36, 25, 162, 34);
		add(lblOrdainketa);
		
		lblSartuDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblSartuDirua.setBounds(36, 70, 136, 34);
		add(lblSartuDirua);
		
		textSartzekoDirua = new JTextField();
		textSartzekoDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		textSartzekoDirua.setBounds(182, 80, 106, 19);
		add(textSartzekoDirua);
		textSartzekoDirua.setColumns(10);
		
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		btnOrdaindu.setBounds(316, 76, 110, 24);
		add(btnOrdaindu);
		
		lblItzuliak.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		lblItzuliak.setBounds(36, 105, 136, 34);
		add(lblItzuliak);
		
		textAreaItzuliak.setBounds(36, 139, 390, 109);
		add(textAreaItzuliak);
		
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
