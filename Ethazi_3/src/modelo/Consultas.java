package modelo;
import java.sql.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.sql.Date;

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
			java.sql.Date fecha_nac;
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

	public static ArrayList <Autobus> datosAutobus(String linea,int cod_bus) {

		ArrayList <Autobus> arraybus = new ArrayList<Autobus>();
		PreparedStatement s=null;
		Connection konexioa=Conexion.getConexion();
		
		try {
			s = konexioa.prepareStatement("SELECT * FROM autobus, linea_autobus, linea WHERE autobus.Cod_bus=linea_autobus.Cod_bus AND linea_autobus.Cod_Linea=linea.Cod_Linea AND linea.Cod_Linea LIKE"+"'" +linea+"' AND autobus.Cod_bus ='"+cod_bus+"'");
			ResultSet rs = s.executeQuery();
			
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
			        System.out.println(bus.getCod_bus()+" \t\t"+bus.getColor()+" \t\t"+bus.getConsumo_km()+" \t\t"+bus.getN_plazas());
			}
		}catch(Exception e) {e.getMessage();}
		return arraybus;
	}

	public static ArrayList <Parada> paradastabla(String linea){

		ArrayList <Parada> arrayparada=new ArrayList<Parada>();
		PreparedStatement s=null;
		Connection konexioa=Conexion.getConexion();
		ResultSet rs = null;		
		try {
			
			s = konexioa.prepareStatement("SELECT * FROM parada, linea_parada,linea WHERE parada.Cod_Parada=linea_parada.Cod_Parada and linea.Cod_Linea=linea_parada.Cod_Linea AND linea.Cod_Linea like"+"'" +linea+"'");
			rs = s.executeQuery();
			int paradanum;
			String nombre;
			String calle;
			double latitud;
			double longitud;
			 while (rs.next()) {
				 
				 	paradanum=(rs.getInt(1));
				 	nombre=(rs.getString(2));
				 	calle=(rs.getString(3));
				 	latitud=(rs.getDouble(4));
				 	longitud=(rs.getDouble(5));
				 	Parada parada= new Parada(paradanum, nombre, calle, longitud, latitud);
			        arrayparada.add(parada);
			        
				
			}
		}catch(Exception e) {e.getMessage();}
		return arrayparada;
	}
	
	public static void datubaseraIgo(Billete billete) {
		
		PreparedStatement s=null;
		Connection konexioa=Conexion.getConexion();
		ResultSet rs = null;
//		
//				int bidaiakop=billete.getN_trayecto();
//				String cod_linea=billete.getCod_linea();
//				int cod_bus=billete.getCod_bus();
//				int cod_parada_inicio=billete.getCod_parada_inicio();
//				int cod_parada_fin=billete.getCod_parada_fin();
//				//java.sql.Date data= java.sql.);
//				Timestamp ordua=new Timestamp(System.currentTimeMillis());
//				String nan=billete.getDni();
//				double prezioa=billete.getPrecio();
		try {
			s = konexioa.prepareStatement("INSERT INTO 'billete' ('Cod_Billete','NTrayecto','Cod_Linea','Cod_Bus','Cod_Parada_Inicio','Cod_Parada_Fin','Fecha','Hora','DNI','Precio') VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			s.setInt(1,billete.getCod_billete());
			s.setInt(2,billete.getN_trayecto());
			s.setString(3,billete.getCod_linea());
			s.setInt(4,billete.getCod_bus());
			s.setInt(5,billete.getCod_parada_inicio());
			s.setInt(6,billete.getCod_parada_fin());
			s.setDate(7,Date.valueOf(LocalDate.now()));
			s.setTimestamp(8,new Timestamp(System.currentTimeMillis()));
			s.setString(9,billete.getDni()); 
			s.setDouble(10,billete.getPrecio());
			
			System.out.println(billete.getCod_billete());
			System.out.println(bidaiakop);
			System.out.println(cod_linea);
			System.out.println(cod_bus);
			System.out.println(cod_parada_inicio);
			System.out.println(cod_parada_fin);
			//System.out.println(data);
			System.out.println(ordua);
			System.out.println(nan); 
			System.out.println(prezioa);

			s.executeUpdate();
			s.close();
			 
		}catch(Exception e) {e.getMessage();}
	}
		
		
	}



