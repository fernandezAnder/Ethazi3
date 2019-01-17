package controlador;
import modelo.*;
import java.sql.*;
public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		Statement s = DbCliente.datosCliente();
		
		System.out.println("hola");

		
		
	}

}
