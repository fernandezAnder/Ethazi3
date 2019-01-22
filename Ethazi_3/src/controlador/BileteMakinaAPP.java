package controlador;
import modelo.*;
import vista.*;
import java.util.ArrayList;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
//		Frame Ejecutar=new Frame();
//		Ejecutar.setVisible(true);
		
		ArrayList <Autobus> buses= new ArrayList <Autobus>();
		ArrayList <Cliente> clientes= new ArrayList <Cliente>();
		buses =Consultas.datosAutobus();
		clientes=Consultas.datosCliente();
		
		for (Autobus a : buses) {
		    System.out.println(a.getColor());
		}
		
		for (Cliente b : clientes) {
		    System.out.println(b.getDni()+"\t\t"+b.getNombre()+"\t\t"+b.getApellido()+
		    		"\t\t"+b.getSexo()+"\t\t"+b.getContraseña());
		}

		String pasahitza="abracadabra";
		String pasahitza2="ec5287c45f0e70ec22d52e8bcbeeb640";
		if (Metodoak.ateraMD5(pasahitza).equals(pasahitza2))
				System.out.println("berdinak dira");
		else
			System.out.println("Ezberdinak dira");
		
		
		
	}

}
