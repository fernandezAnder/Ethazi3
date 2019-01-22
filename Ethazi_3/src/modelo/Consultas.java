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
		Autobus bus= new Autobus(0, 0, 0, null);
		try {
			

			s = konexioa.prepareStatement("select * from autobus");
			ResultSet rs = s.executeQuery();

			 while (rs.next()) {
				 	bus.setCod_bus(rs.getInt(1));
				 	bus.setN_plazas(rs.getInt(2));
				 	bus.setConsumo_km(rs.getDouble(3));
				 	bus.setColor(rs.getString(4));
			        arraybus.add(bus);
//				System.out.println(bus.getCod_bus() + "\t\t " +bus.getN_plazas()+ "\t\t "+ bus.getConsumo_km()+"\t\t "
//						+bus.getColor());
			}
		}catch(Exception e) {e.getMessage();}
		return arraybus;
	}
}


