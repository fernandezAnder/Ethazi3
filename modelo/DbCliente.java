package modelo;
import java.sql.*;
public class DbCliente {

	public static Statement datosCliente() {
		Statement s=null;
		Connection konexioa=Conexion.getConexion();
		try {
		// Se crea un Statement, para realizar la consulta
        s = konexioa.createStatement();
        
        // Se realiza la consulta. Los resultados se guardan en el ResultSet rs
        
        ResultSet rs = s.executeQuery("select * from cliente");
        
        // Se recorre el ResultSet, mostrando por pantalla los resultados.
        while (rs.next()) {
            System.out.println(rs.getString(1) + "\t\t " + rs.getString(2));
        }
		}catch(Exception e) {e.getMessage();}
		
		
		return s;
	}
}
		

