package modelo;
import java.sql.*;
import java.util.ArrayList;


import controlador.*;
public class Consultas {

	public static ArrayList <Cliente> datosCliente() {

		ArrayList <Cliente> arraycliente = new ArrayList<Cliente>();
		PreparedStatement s=null;
		Connection konexioa=Conexion.getConexion();
		
		try {
			s = konexioa.prepareStatement("select * from cliente");
			ResultSet rs = s.executeQuery();
			String dni;
			String nombre;
			String apellidos;
			Date fecha_nac;
			String sexo;
			String contraseña;
			 while (rs.next()) {
				 	dni=(rs.getString(1));
				 	nombre=(rs.getString(2));
				 	apellidos=(rs.getString(3));
				 	fecha_nac=(rs.getDate(4));
				 	sexo=(rs.getString(5));
				 	contraseña=(rs.getString(6));
				 	Cliente cliente= new Cliente(dni, nombre, apellidos, fecha_nac, sexo, contraseña);
			        arraycliente.add(cliente);
				
			}
		}catch(Exception e) {e.getMessage();}
		return arraycliente;
	}

	public static ArrayList <Autobus> datosAutobus() {

		ArrayList <Autobus> arraybus = new ArrayList<Autobus>();
		PreparedStatement s=null;
		Connection konexioa=Conexion.getConexion();
		
		try {
			s = konexioa.prepareStatement("select * from autobus");
			ResultSet rs = s.executeQuery();
			int cod_bus;
			int plazas;
			double consumo;
			String color;
			 while (rs.next()) {
				 	cod_bus=(rs.getInt(1));
				 	plazas=(rs.getInt(2));
				 	consumo=(rs.getDouble(3));
				 	color=(rs.getString(4));
				 	Autobus bus= new Autobus(cod_bus, plazas, consumo, color);
			        arraybus.add(bus);
				
			}
		}catch(Exception e) {e.getMessage();}
		return arraybus;
	}
}


