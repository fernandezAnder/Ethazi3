package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.ComponentOrientation;
import modelo.*;
import controlador.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
public class Ventana6 extends JFrame {
	private JTextField textSartzekoDirua;
	private JLabel lblOrdainketa = new JLabel("Ordainketa :");
	private JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
	private JButton btnOrdaindu = new JButton("Ordaindu");
	private JLabel lblItzuliak = new JLabel("Itzuliak :");
	private JTextArea textAreaItzuliak = new JTextArea();
	private JButton btnAmaitu = new JButton("Amaitu");

	/**
	 * Create the panel.
	 * @param billete 
	 */
	public Ventana6(Billete billete) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//LABEL ORDAINKETA
		lblOrdainketa.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		lblOrdainketa.setBounds(104, 11, 162, 34);
		getContentPane().add(lblOrdainketa);
		
		//LABEL SARTU DIRUA
		lblSartuDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblSartuDirua.setBounds(90, 67, 162, 37);
		getContentPane().add(lblSartuDirua);
		
		//TEXTUA SARTZEKO DIRUA
		
		textSartzekoDirua.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				char validar =evt.getKeyChar();
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					evt.consume();
					}
			}
		});
		textSartzekoDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 11));
		textSartzekoDirua.setBounds(266, 73, 162, 34);
		getContentPane().add(textSartzekoDirua);
		textSartzekoDirua.setColumns(10);
		
		//ORDAINDU BOTOIA
		btnOrdaindu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
	
			}
		});
		
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 15));
		btnOrdaindu.setBounds(534, 86, 120, 40);
		getContentPane().add(btnOrdaindu);
		
		
		//LABEL ITZULIAK
		lblItzuliak.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		lblItzuliak.setBounds(120, 153, 136, 34);
		getContentPane().add(lblItzuliak);
		textAreaItzuliak.setForeground(Color.WHITE);
		
		//TEXTAREA ITZULIAK
		textAreaItzuliak.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textAreaItzuliak.setEditable(false);
		textAreaItzuliak.setBounds(126, 214, 454, 199);

		getContentPane().add(textAreaItzuliak);
		
		//BOTOIA AMAITU
		btnAmaitu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		btnAmaitu.setBounds(308, 470, 120, 37);
		getContentPane().add(btnAmaitu);

	}
}