package vista;

import javax.swing.JPanel; 
import javax.swing.JLabel;

import java.awt.ComponentOrientation;
import java.awt.Font;
import javax.swing.JTextPane;



import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Billete;
import controlador.Metodoak;
import controlador.Tiket;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import java.awt.Rectangle;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;

public class Ventana5 extends JFrame {
	private String nan="";
	
	

	public Ventana5(Billete billete, Tiket t1) {
		nan=billete.getDni();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Biletearen Informazioa");
		lblNewLabel.setBounds(228, 72, 199, 29);
		getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(63, 134, 495, 176);
		getContentPane().add(textArea);
		textArea.setText(t1.toString());
		
		JButton btnAtzera = new JButton("Atzera");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		btnAtzera.setBounds(100, 472, 89, 23);
		getContentPane().add(btnAtzera);
		
		JButton btnBalidatu = new JButton("Balidatu");
		btnBalidatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.seigarrenLeihoa(billete, t1);
			}
		});
		btnBalidatu.setBounds(356, 472, 89, 23);
		getContentPane().add(btnBalidatu);
		
		
	}
}
