package controlador;
import modelo.*;
import vista.*;
import java.sql.*;
import java.util.ArrayList;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Frame Ejecutar=new Frame();
		Ejecutar.setVisible(true);
		
		ArrayList <Autobus> buses= new ArrayList <Autobus>();
		
		buses =Consultas.datosAutobus();
		
		for (Autobus a : buses) {
		    System.out.println(a.getColor());
		}
		

		
		
	}

}
