package vista;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana1 extends JPanel {

	private static final long serialVersionUID = 1L;
	Font fuente = new Font("Comic Sans MS", Font.ITALIC, 40);
   
    JLabel txtOngiEotirriMaquina = new JLabel("Ongi Etorri");
    JLabel Icono = new JLabel("");
    JLabel lblTxrtelSaltzailera = new JLabel("Txartel Saltzailea");

	public Ventana1() {
		   	addMouseListener(new MouseAdapter() {
		   		 @Override
		   		 public void mouseClicked(MouseEvent e) {
		   			 
		   			 Ventana2 Ejecutar=new Ventana2 ();
		   			 Ejecutar.setVisible(true);
		   			 
		   			 
		   		 }
		   	});
        	this.setBackground(SystemColor.control);
        	setLayout(null);
       	 
        	  //LABEL ONGI ETORRI

        	txtOngiEotirriMaquina.setFont(new Font("Comic Sans MS", Font.PLAIN, 27));
        	txtOngiEotirriMaquina.setBounds(179, 76, 161, 44);
        	add(txtOngiEotirriMaquina);
       	 
        	//LABEL ICONO

        	//Icono.setIcon(new ImageIcon(Ventana1.class.getResource("/ethazi2/fotos/termibus.png")));
        	Icono.setBounds(257, 271, 301, 139);
        	add(Icono);
       	 
        	 //LABEL MAKINA SALTZAILEA

        	lblTxrtelSaltzailera.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        	lblTxrtelSaltzailera.setBounds(321, 131, 255, 44);
        	add(lblTxrtelSaltzailera);
       	 
    	}
    }
