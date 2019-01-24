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
public class Ventana5 extends JFrame {
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
		this.setBounds(275,100,700,600);
		
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
		textAreaItzuliak.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		textAreaItzuliak.setEditable(false);
		textAreaItzuliak.setBounds(126, 214, 454, 199);
		
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		String linea="L1";
		paradas=Consultas.mostrarParadas(linea);
		String pantailaratu;
		for (Parada emaitza : paradas) {
			pantailaratu= emaitza.toString()+"\n";
		    textAreaItzuliak.setText(pantailaratu);
		}
		
		add(textAreaItzuliak);
		
		//BOTOIA AMAITU
		btnAmaitu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
