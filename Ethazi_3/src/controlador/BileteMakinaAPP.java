package controlador;
import modelo.*;
import java.sql.*;
import java.util.ArrayList;
public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		ArrayList <Autobus> buses= new ArrayList <Autobus>();
		
		buses =Consultas.datosAutobus();
//		for (int i=0;i<buses.size();i++) {
//			System.out.println(buses.get(i));
//		}

		
		
	}

}
