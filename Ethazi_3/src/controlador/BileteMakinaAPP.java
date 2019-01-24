package controlador;
import modelo.*;
import vista.*;
import java.util.ArrayList;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Metodoak.lehenengoLeihoa();
		
		ArrayList <Autobus> buses= new ArrayList <Autobus>();
		ArrayList <Cliente> clientes= new ArrayList <Cliente>();
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		//buses =Consultas.datosAutobus();
		//clientes=Consultas.datosCliente();
		String linea="L1";
		paradas=Consultas.mostrarParadas(linea);		
		
		
		
		
	}

}
