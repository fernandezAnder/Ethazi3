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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;

import controlador.Billete;
import controlador.Metodoak;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.ListSelectionModel;
import java.awt.Rectangle;

public class Ventana5 extends JFrame {
	private String nan="";
	private final JTable table = new JTable();
	
	

	public Ventana5(Billete billete) {
		int cod_billete=billete.getCod_billete();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(78);
		table.setBounds(117, 81, 490, 410);
		
		getContentPane().add(table);
		cod_billete++;
		billete.setCod_billete(cod_billete);
		
	}
}
