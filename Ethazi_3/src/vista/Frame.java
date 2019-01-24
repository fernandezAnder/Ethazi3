package vista;

import java.awt.GridBagConstraints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import modelo.*;
public class Frame extends JFrame {


	private static final long serialVersionUID = 1L;
	GridBagConstraints config = new GridBagConstraints();

	public static Ventana1 Ventana1 = new  Ventana1();

	public Frame() {
		setTitle("Makina Saltzailea");

		this.setSize(770,670);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		getContentPane().add(Ventana1);


	}

}
