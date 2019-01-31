package vista;

import javax.swing.JPanel;  
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.ComponentOrientation;

import java.awt.event.KeyAdapter;
import java.util.ArrayList;

import controlador.Billete;
import controlador.Metodoak;
public class Ventana6 extends JFrame {
	//private JTextField textSartzekoDirua;
	private JLabel lblOrdainketa = new JLabel("Ordainketa :");
	private JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
	private JLabel lblItzuliak = new JLabel("Itzuliak :");
	private static JButton btnAmaitu = new JButton("Amaitu");
	private static JTextField dirua;
	private static JButton btnEzeztatu = new JButton("Ezeztatu");
	private static JButton btnAtzera = new JButton("Atzera");
	private final static JButton btnOrdaindu = new JButton("Ordaindu");
	private static JTextArea Itzuliak = new JTextArea();
	private double preziototala=0;
	private ArrayList<Double> preziotot = new ArrayList<Double>();
	private double prezioa = 5;
	private double prezioBerria=0;
	private double prezio2 = 0;
	
	/**
	 * Create the panel.
	 * @param billete 
	 */
	public Ventana6(Billete billete) {
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblOrdainketa.setBounds(104, 11, 162, 34);
		
		//LABEL ORDAINKETA
		lblOrdainketa.setFont(new Font("Bookman Old Style", Font.PLAIN, 25));
		getContentPane().add(lblOrdainketa);
		lblSartuDirua.setBounds(90, 67, 162, 37);
		
		//LABEL SARTU DIRUA
		lblSartuDirua.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		getContentPane().add(lblSartuDirua);
		lblItzuliak.setBounds(120, 153, 136, 34);
		
		
		//LABEL ITZULIAK
		lblItzuliak.setFont(new Font("Bookman Old Style", Font.PLAIN, 24));
		getContentPane().add(lblItzuliak);
		btnAmaitu.setBounds(460, 466, 120, 37);
		
		//BOTOIA AMAITU
		btnAmaitu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.zazpigarrenLeihoa();
			}
		});
		getContentPane().add(btnAmaitu);
		
		//TEXTUA SARTZEKO DIRUA
		dirua = new JTextField();
		dirua.setBounds(308, 76, 136, 26);
		dirua.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent evt) {
				if(dirua.getText().length()>=10) {
					evt.consume();	

				}
				char validar =evt.getKeyChar();
				if(Character.isLetter(validar)) {
					getToolkit().beep();
					evt.consume();	

				}
			}
		});
		getContentPane().add(dirua);
		dirua.setColumns(10);
		btnEzeztatu.setBounds(288, 468, 136, 33);
		
		btnEzeztatu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				dispose();
//				Metodoak.hirugarrenLeihoa();
			}
		});
		getContentPane().add(btnEzeztatu);
		btnAtzera.setBounds(126, 468, 136, 33);
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.bostgarrenLeihoa(billete);
			}
		});
		btnAtzera.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		getContentPane().add(btnAtzera);
		btnOrdaindu.setBounds(494, 74, 141, 27);
		//Arraylistari prezioa sartu
		preziotot.add(prezioa);
		//ORDAINDU BOTOIA
		btnOrdaindu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Prezioa Arraylistean sartzen da
				
				
				String ordaindu=(String) dirua.getText();//Sartutako diru kantitatea testu moduan gordeko da
				
				//KONPROBATU LETRA
	   			 boolean letra=Metodoak.konprobatuLetra(ordaindu);
	   			 String mezua="";
	   			 
	   			 if (letra==false) {
	   				double zbk= Double.parseDouble(ordaindu);//Zenbaki formatura pasatzen da
		   			 

	   				//KONPROBATU ZENBAKI NEGATIBOA
	   				boolean zenbakia=Metodoak.konprobatuNegatibo(zbk);
	   				if (zenbakia==true){ 
	   					System.out.println(preziotot.get(preziotot.size()-1));
	   					
	   					prezio2 = preziotot.get(preziotot.size()-1);
	   					preziototala = (double)prezio2-zbk;
	   					boolean diru_falta=Metodoak.diruFalta(zbk, prezio2);
	   					//KONPROBATU DIRU FALTA
		   				if (diru_falta==true){
		   					preziotot.add(preziototala);
		   					

		   					mezua=(preziotot.get(preziotot.size()-1)+" € falta zaizkizu");
		   					System.out.println(mezua);
		   					Ventana6.Itzuliak.setText(mezua);	
		   					Ventana6.btnAtzera.setEnabled(false);
		   					Ventana6.btnAmaitu.setEnabled(false);
//		   					ordaindu = dirua.getText();
//		   					zbk= Double.parseDouble(ordaindu);
//		   					diru_falta=Metodoak.diruFalta(zbk, preziotot.get(preziotot.size()-1));


		   				}else {
		   					if (preziototala<0) {
		   						
			   					preziototala=preziototala*(-1);
			   					System.out.println(preziototala);
			   					String kanbioak=Metodoak.kanbioMetodoa(preziototala);
			   					Ventana6.Itzuliak.setText(kanbioak);
			   					Ventana6.btnAmaitu.setEnabled(true);
			   					Ventana6.btnEzeztatu.setEnabled(false);
			   					Ventana6.btnAtzera.setEnabled(false);
			   					Ventana6.btnOrdaindu.setEnabled(false);

		   					}else if(preziototala==0) {
		   						mezua="Eskerrik asko erosteagatik";
			   					Ventana6.Itzuliak.setText(mezua);
			   					Ventana6.btnAmaitu.setEnabled(true);
			   					Ventana6.btnEzeztatu.setEnabled(false);
			   					Ventana6.btnAtzera.setEnabled(false);
			   					Ventana6.btnOrdaindu.setEnabled(false);
			   					
		   					}
		   				}
	   				}
	   				 
	   			}
	   			Ventana6.dirua.setText("");	
	   		 }
		});
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		
		getContentPane().add(btnOrdaindu);
		
		Itzuliak.setBounds(120, 216, 491, 223);
		getContentPane().add(Itzuliak);

	}
}