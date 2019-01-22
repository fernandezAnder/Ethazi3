package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;

import controlador.*;
public class Consultas {

	public static ArrayList <Cliente> datosCliente() {

		ArrayList <Cliente> arrayClientes = new ArrayList<Cliente>();
		Statement s=null;
		Connection konexioa=Conexion.getConexion();
		Cliente cliente= new Cliente(null, null, null, null, null, null);
		try {

			s = konexioa.createStatement();
			ResultSet rs = s.executeQuery("select * from cliente");

			 while (rs.next()) {
//			        cliente.setApellido(rs.getString(columnIndex));
//			        cliente.setContraseña(contraseña);
//			        cliente.setDni();
//			        cliente.setFecha_nac(fecha_nac);
//			        cliente.setNombre(nombre);
//			        cliente.setSexo(sexo);
//			        arrayClientes.add(cliente);
				//System.out.println(rs.getString(1) + "\t\t " + rs.getString(2));
			}
		}catch(Exception e) {e.getMessage();}


		return arrayClientes;
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
//				
			}
		}catch(Exception e) {e.getMessage();}
		return arraybus;
	}
}


