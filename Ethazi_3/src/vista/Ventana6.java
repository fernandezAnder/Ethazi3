package vista;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controlador.Billete;
import controlador.Contador;
import controlador.Metodoak;
import controlador.Tiket;
import javax.swing.SwingConstants;
public class Ventana6 extends JFrame {

	private JLabel lblOrdainketa = new JLabel("Ordainketa :");
	private JLabel lblSartuDirua = new JLabel("Sartu Dirua :");
	private JLabel lblItzuliak = new JLabel("Itzuliak :");
	private JButton btnAmaitu = new JButton("Amaitu");
	private JTextField dirua= new JTextField();
	private JButton btnEzeztatu = new JButton("Ezeztatu");
	private JButton btnAtzera = new JButton("Atzera");
	private JButton btnOrdaindu = new JButton("Ordaindu");
	private JTextArea Itzuliak = new JTextArea();
	private JLabel lblOrdaintzeko = new JLabel("");


	private double preziototala=0;
	private ArrayList<Double> preziotot = new ArrayList<Double>();
	private double prezioa;
	private double prezioBerria=0;
	private double prezio2 = 0;
	private DecimalFormat formateador = new DecimalFormat("###.##");


	public Ventana6(Billete billete, Tiket t1) {
		prezioa=billete.getPrecio();
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);
		lblOrdainketa.setBounds(90, 106, 162, 34);

		//LABEL ORDAINKETA
		lblOrdainketa.setFont(new Font("Arial", Font.BOLD, 25));
		getContentPane().add(lblOrdainketa);
		lblSartuDirua.setBounds(90, 151, 162, 37);

		//LABEL SARTU DIRUA
		lblSartuDirua.setFont(new Font("Arial", Font.BOLD, 24));
		getContentPane().add(lblSartuDirua);
		lblItzuliak.setBounds(135, 199, 105, 34);


		//LABEL ITZULIAK
		lblItzuliak.setFont(new Font("Arial", Font.BOLD, 24));
		getContentPane().add(lblItzuliak);
		btnAmaitu.setBounds(514, 467, 97, 43);

		//BOTOIA AMAITU
		btnAmaitu.setFont(new Font("Arial", Font.PLAIN, 18));
		btnAmaitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.imprimatuTiketa(t1);
				Contador contador = new Contador();
				contador.start();
				Metodoak.zazpigarrenLeihoa();
			}
		});
		getContentPane().add(btnAmaitu);

		//TEXTUA SARTZEKO DIRUA
		dirua = new JTextField();
		dirua.setBounds(262, 161, 136, 26);
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
		btnEzeztatu.setBounds(339, 468, 112, 41);

		btnEzeztatu.setFont(new Font("Arial", Font.PLAIN, 18));
		btnEzeztatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.lehenengoLeihoa();
			}
		});
		getContentPane().add(btnEzeztatu);
		btnAtzera.setBounds(176, 467, 105, 43);
		String nan = billete.getDni();
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.hirugarrenLeihoa(nan);
			}
		});
		btnAtzera.setFont(new Font("Arial", Font.PLAIN, 18));
		getContentPane().add(btnAtzera);
		btnOrdaindu.setBounds(470, 151, 141, 37);
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
							Itzuliak.setText(mezua);	
							btnAtzera.setEnabled(false);
							btnAmaitu.setEnabled(false);

						}else {
							if (preziototala<0) {

								preziototala=preziototala*(-1);
								System.out.println(preziototala);
								String kanbioak=Metodoak.kanbioMetodoa(preziototala);
								Itzuliak.setText(kanbioak);
								btnAmaitu.setEnabled(true);
								btnEzeztatu.setEnabled(false);
								btnAtzera.setEnabled(false);
								btnOrdaindu.setEnabled(false);

							}else if(preziototala==0) {
								mezua="Eskerrik asko erosteagatik";
								Itzuliak.setText(mezua);
								btnAmaitu.setEnabled(true);
								btnEzeztatu.setEnabled(false);
								btnAtzera.setEnabled(false);
								btnOrdaindu.setEnabled(false);

							}
						}
					}

				}
				dirua.setText("");	
			}
		});
		btnOrdaindu.setFont(new Font("Arial", Font.PLAIN, 20));

		getContentPane().add(btnOrdaindu);

		Itzuliak.setBounds(231, 244, 380, 195);
		getContentPane().add(Itzuliak);
		String ordaintzeko = String.valueOf(billete.getPrecio());
		lblOrdaintzeko.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrdaintzeko.setText(ordaintzeko);
		lblOrdaintzeko.setFont(new Font("Arial", Font.PLAIN, 18));
		lblOrdaintzeko.setBounds(274, 112, 52, 30);
		getContentPane().add(lblOrdaintzeko);
		
		JLabel lblOrdainketa_1 = new JLabel("ORDAINKETA");
		lblOrdainketa_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrdainketa_1.setFont(new Font("Arial", Font.BOLD, 37));
		lblOrdainketa_1.setBounds(223, 41, 273, 43);
		getContentPane().add(lblOrdainketa_1);

	}
}