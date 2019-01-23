package controlador;
import modelo.*;
import vista.*;
import java.util.ArrayList;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Frame Ejecutar=new Frame();
		Ejecutar.setVisible(true);
		
		ArrayList <Autobus> buses= new ArrayList <Autobus>();
		ArrayList <Cliente> clientes= new ArrayList <Cliente>();
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		//buses =Consultas.datosAutobus();
		//clientes=Consultas.datosCliente();
		String linea="L1";
		paradas=Consultas.datosParadas(linea);
		
		for (Autobus a : buses) {
		    System.out.println(a.getColor());
		}
		
		for (Cliente b : clientes) {
		    System.out.println(b.getDni()+"\t\t"+b.getNombre()+"\t\t"+b.getApellido()+
		    		"\t\t"+b.getFecha_nac()+"\t\t"+b.getContraseña());
		}

		for (Parada c : paradas) {
		    System.out.println(c.getNombre());
		}
		
		
		
	}

}
