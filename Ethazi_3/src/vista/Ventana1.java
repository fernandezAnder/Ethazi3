package vista;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


import controlador.Metodoak;

/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Ventana1 extends JFrame {

	private final long serialVersionUID = 1L;
	private JLabel txtOngiEotirriMaquina = new JLabel("Ongi Etorri");
	private JLabel Icono = new JLabel("");
	private JLabel lblTxrtelSaltzailera = new JLabel("Txartel Saltzailera");

	public Ventana1() {

		this.setBounds(275,100,700,600);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Metodoak.bigarrenLeihoa();	
			}
		});
		this.setBackground(SystemColor.control);
		getContentPane().setLayout(null);

		//LABEL ONGI ETORRI

		txtOngiEotirriMaquina.setFont(new Font("Arial", Font.PLAIN, 46));
		txtOngiEotirriMaquina.setBounds(233, 78, 239, 54);
		getContentPane().add(txtOngiEotirriMaquina);

		//LABEL ICONO

		Icono.setBounds(202, 264, 301, 139);
		getContentPane().add(Icono);
		Icono.setIcon(new ImageIcon(Ventana1.class.getResource("/argazkiak/termibus.png")));
		//LABEL TXARTEL SALTZAILEA

		lblTxrtelSaltzailera.setFont(new Font("Arial", Font.PLAIN, 46));
		lblTxrtelSaltzailera.setBounds(159, 157, 377, 44);
		getContentPane().add(lblTxrtelSaltzailera);


	}

}
