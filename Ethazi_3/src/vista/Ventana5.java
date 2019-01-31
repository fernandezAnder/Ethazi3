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

import controlador.Billete;
import controlador.Metodoak;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Button;
import java.awt.Canvas;

public class Ventana5 extends JFrame {

	private JLabel lblAukeratutakoBidaia = new JLabel("Aukeratutako Bidaia :");
	private final JButton btnAtzera = new JButton("Atzera");
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton btnBalidatu = new JButton("Balidatu");
	private String nan="";
	private JTable taula;
	
	/**
	 * Create the panel.
	 * @param billete 
	 */

	public Ventana5(Billete billete) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		
		//AUKERATUTAKO BOTOIA LABEL
		lblAukeratutakoBidaia.setBounds(286, 11, 253, 34);
		lblAukeratutakoBidaia.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		getContentPane().add(lblAukeratutakoBidaia);
		btnEzeztatu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		//EZEZTATU BOTOIA
		btnEzeztatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnEzeztatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.lehenengoLeihoa();	
			}
		});
		btnEzeztatu.setBounds(335, 471, 107, 35);
		getContentPane().add(btnEzeztatu);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		btnAtzera.setBounds(187, 471, 91, 35);
		
		getContentPane().add(btnAtzera);
		
		//TAULA
		taula =  new JTable();
		taula.setAutoCreateRowSorter(true);
		taula.setToolTipText("");
		taula.setBounds(577, 109, -382, 230);
		getContentPane().add(taula);
		
		btnBalidatu.setBounds(61, 192, 97, 25);
		btnBalidatu.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		btnBalidatu.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
			Metodoak.seigarrenLeihoa(billete);
		}
	});
		btnBalidatu.setBounds(505, 471, 107, 35);
		getContentPane().add(btnBalidatu);

//		System.out.println("COD BILLETE: "+billete.getCod_billete());
//		System.out.println("COD BUS "+billete.getCod_bus());
//		System.out.println("COD LINEA "+billete.getCod_linea());
//		System.out.println("COD PARADA INICIO "+billete.getCod_parada_inicio());
//		System.out.println("COD PARADA FIN "+billete.getCod_parada_fin());
//		System.out.println("BIDAIA KOP "+billete.getN_trayecto());
//		System.out.println("NAN "+billete.getDni());
//		System.out.println("DATA "+billete.getFecha());
//		System.out.println("ORDUA "+billete.getHora());
//		System.out.println("PREZIOA "+billete.getPrecio());
	}
}
