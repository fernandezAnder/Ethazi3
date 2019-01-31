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

import controlador.Billete;
import controlador.Metodoak;
public class Ventana6 extends JFrame {
	//private JTextField textSartzekoDirua;
	private JLabel lblOrdainketa = new JLabel("Ordainketa :");
	private JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
	private JLabel lblItzuliak = new JLabel("Itzuliak :");
	private static JTextArea Itzuliak = new JTextArea();
	private static JButton btnAmaitu = new JButton("Amaitu");
	private static JTextField dirua;
	private static JButton btnEzeztatu = new JButton("Ezeztatu");
	private static JButton btnAtzera = new JButton("Atzera");
	private final JButton btnOrdaindu = new JButton("Ordaindu");
	private double preziototala;


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
		Itzuliak.setSelectedTextColor(Color.BLACK);
		Itzuliak.setText("shglkfgblkdthl");
		Itzuliak.setFont(new Font("Monospaced", Font.PLAIN, 16));
		Itzuliak.setToolTipText("");
		Itzuliak.setBounds(126, 215, 454, 199);
		Itzuliak.setForeground(Color.WHITE);
		
		//TEXTAREA ITZULIAK
		Itzuliak.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Itzuliak.setEditable(false);

		getContentPane().add(Itzuliak);
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
		dirua.setBounds(308, 76, 136, 26);
		getContentPane().add(dirua);
		dirua.setColumns(10);
		
		btnEzeztatu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				dispose();
//				Metodoak.hirugarrenLeihoa();
			}
		});
		btnEzeztatu.setBounds(288, 468, 136, 33);
		getContentPane().add(btnEzeztatu);
		
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.bostgarrenLeihoa(billete);
			}
		});
		btnAtzera.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnAtzera.setBounds(126, 468, 136, 33);
		getContentPane().add(btnAtzera);
		
		//ORDAINDU BOTOIA
		btnOrdaindu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double prezioa = 5;
				String ordaindu=(String) dirua.getText();//Sartutako diru kantitatea testu moduan gordeko da
				
				//KONPROBATU LETRA
	   			 boolean letra=Metodoak.konprobatuLetra(ordaindu);
	   			 String mezua="";
	   			 
	   			 if (letra==false) {
	   				double zbk= Double.parseDouble(ordaindu);//Zenbaki formatura pasatzen da
		   			 

	   				//KONPROBATU ZENBAKI NEGATIBOA
	   				boolean zenbakia=Metodoak.konprobatuNegatibo(zbk);
	   				if (zenbakia==true){
			   			 
	   					//KONPROBATU DIRU FALTA
//	   					preziototala = prezioa-zbk;
	   					
	   					boolean diru_falta=Metodoak.diruFalta(zbk, prezioa);
		   				if (diru_falta==true){
		   					prezioa = prezioa - zbk;
		   					mezua=(prezioa+" € falta zaizkizu");
		   					System.out.println(mezua);
		   					Ventana6.Itzuliak.setText(mezua);
				   			 

		   				}else {
		   					if (preziototala<0) {
		   						
			   					preziototala=preziototala*(-1);
			   					System.out.println(preziototala);
			   					String kanbioak=Metodoak.kanbioMetodoa(preziototala);
			   					Ventana6.Itzuliak.setText(kanbioak);
			   					Ventana6.btnAmaitu.setEnabled(true);
			   					Ventana6.btnEzeztatu.setEnabled(false);
					   			 System.out.println("4");

		   					}else if(preziototala==0) {
		   						mezua="Eskerrik asko erosteagatik";
			   					Ventana6.Itzuliak.setText(mezua);
			   					Ventana6.btnAmaitu.setEnabled(false);
			   					Ventana6.btnEzeztatu.setEnabled(false);
					   			 System.out.println("5");
		   					}
		   				}
	   				}
	   				 
	   			}
	   			Ventana6.dirua.setText("");	
	   		 }
		});
		btnOrdaindu.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnOrdaindu.setBounds(494, 74, 141, 27);
		
		getContentPane().add(btnOrdaindu);

	}
}