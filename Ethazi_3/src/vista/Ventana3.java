package vista;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.Metodoak;
import javax.swing.SwingConstants;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Ventana3 extends JFrame {

	//Botoiak eta Jlabelak sortzen dira
	private JLabel textoAukeratuLinea = new JLabel("Aukeratu linea ");
	private JButton btnBilbomungia = new JButton("Bilbao-Plentzia");
	private JButton btnBilbogernika = new JButton("Bilbao-Muskiz");
	private JButton btnBilbodonosti = new JButton("Bilbao-Balmaseda");
	private JButton btnBilboPlentzia = new JButton("Bilbao-Durango");
	private JButton btnAtzera = new JButton("Ezeztatu");
	private JLabel lbl_L1 = new JLabel("L1");
	private JLabel lbl_L2 = new JLabel("L2");
	private JLabel lbl_L3 = new JLabel("L3");
	private JLabel lbl_L4 = new JLabel("L4");
	
/**
 * 
 * @param nan
 */
	public Ventana3(String nan) {
		//Leihoaren egitura
		this.setBounds(275,100,700,600);
		getContentPane().setLayout(null);

		//TEXTO AUKERATU LINEA
		textoAukeratuLinea.setFont(new Font("Arial", Font.BOLD, 37));
		textoAukeratuLinea.setBounds(209, 52, 311, 48);
		getContentPane().add(textoAukeratuLinea);

		//BILBO-MUNGIA BOTOIA
		btnBilbomungia.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBilbomungia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				String linea="L1";
				int cod_bus=1001;
				Metodoak.laugarrenLeihoa(linea,cod_bus,nan);
			}
		});
		//BilboMungia Botoiaren Egitura
		btnBilbomungia.setBounds(274, 154, 198, 48);
		getContentPane().add(btnBilbomungia);

		//BILBO-GERNIKA BOTOIA
		btnBilbogernika.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				String linea="L2";
				int cod_bus=2001;
				Metodoak.laugarrenLeihoa(linea, cod_bus,nan);
			}
		});
		//BilboGernika Botoia
		btnBilbogernika.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBilbogernika.setBounds(274, 239, 198, 48);
		getContentPane().add(btnBilbogernika);

		//BILBO-DONOSTIA BOTOIA
		btnBilbodonosti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				String linea="L3";
				int cod_bus=3001;
				Metodoak.laugarrenLeihoa(linea, cod_bus,nan);
			}
		});


		btnBilbodonosti.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBilbodonosti.setBounds(274, 331, 198, 48);
		getContentPane().add(btnBilbodonosti);

		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Arial", Font.PLAIN, 18));
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Metodoak.lehenengoLeihoa();

			}
		});
		//Atzera botoiaren egitura
		btnAtzera.setBounds(515, 492, 120, 35);
		getContentPane().add(btnAtzera);
		
		//BilbaoPlentzia botoiak egiten duena
		btnBilboPlentzia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				String linea="L4";
				int cod_bus=4001;
				Metodoak.laugarrenLeihoa(linea, cod_bus,nan);
			}
		});
		//BilboPlentzia botoiaren egitura
		btnBilboPlentzia.setFont(new Font("Arial", Font.PLAIN, 20));
		btnBilboPlentzia.setBounds(274, 423, 198, 48);
		getContentPane().add(btnBilboPlentzia);
		
		//Label L1
		lbl_L1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_L1.setFont(new Font("Arial", Font.PLAIN, 23));
		lbl_L1.setBounds(226, 164, 38, 33);
		getContentPane().add(lbl_L1);
		
		//Label L2
		lbl_L2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_L2.setFont(new Font("Arial", Font.PLAIN, 23));
		lbl_L2.setBounds(226, 244, 38, 37);
		getContentPane().add(lbl_L2);
		
		//Label L3
		lbl_L3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_L3.setFont(new Font("Arial", Font.PLAIN, 23));
		lbl_L3.setBounds(226, 340, 38, 28);
		getContentPane().add(lbl_L3);
		
		//Label L4
		lbl_L4.setFont(new Font("Arial", Font.PLAIN, 23));
		lbl_L4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_L4.setBounds(226, 428, 38, 37);
		getContentPane().add(lbl_L4);

	}
}