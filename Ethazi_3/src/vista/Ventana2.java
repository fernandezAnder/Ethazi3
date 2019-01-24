package vista;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Ventana2 extends JFrame {

	//Botoiak eta Jlabelak sortzen dira
	JLabel textoAukeratuLinea = new JLabel("Aukeratu linea :");
	JButton btnBilbomungia = new JButton("Bilbo-Mungia");
	JButton btnBilbogernika = new JButton("Bilbo-Gernika");
	JButton btnBilbodonosti = new JButton("Bilbo-Donosti");
	JButton btnAtzera = new JButton("Atzera");


	
	public Ventana2() {
		this.setBounds(275,100,700,600);

		//TEXTO AUKERATU LINEA
		textoAukeratuLinea.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
		textoAukeratuLinea.setBounds(265, 43, 193, 35);
		add(textoAukeratuLinea);

		//BILBO-MUNGIA BOTOIA
		btnBilbomungia.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbomungia.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnBilbomungia.setBounds(282, 139, 198, 48);
		add(btnBilbomungia);

		//BILBO-GERNIKA BOTOIA
		btnBilbogernika.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnBilbogernika.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbogernika.setBounds(282, 236, 198, 48);
		add(btnBilbogernika);
		
		//BILBO-DONOSTIA BOTOIA
		btnBilbodonosti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
	
			}
		});

		
		btnBilbodonosti.setFont(new Font("Bookman Old Style", Font.PLAIN, 20));
		btnBilbodonosti.setBounds(282, 323, 198, 48);
		add(btnBilbodonosti);
		
		//ATZERA BOTOIA
		btnAtzera.setFont(new Font("Bookman Old Style", Font.PLAIN, 16));
		btnAtzera.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
		
			}
		});
		btnAtzera.setBounds(497, 464, 120, 40);
		add(btnAtzera);

	}
}

