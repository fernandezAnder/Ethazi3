package controlador;
import modelo.*;
import vista.*;
import java.math.BigInteger;
import java.security.*;
import java.util.ArrayList;
import java.util.Date;

public class Metodoak {

	public static String ateraMD5(String input) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] messageDigest = md.digest(input.getBytes());
			BigInteger number = new BigInteger(1, messageDigest);
			String hashtext = number.toString(16);

			while (hashtext.length() < 32) {
				hashtext = "0" + hashtext;
			}
			return hashtext;
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}

	public static void lehenengoLeihoa() {
		Ventana1 ventana1= new Ventana1();
		ventana1.setVisible(true);

	}
	public static void bigarrenLeihoa() {

		ArrayList <Cliente> clientes= new ArrayList <Cliente>();
		clientes=Consultas.datosCliente();
		Ventana2 ventana2= new Ventana2(clientes);
		ventana2.setVisible(true);


	}
	public static void hirugarrenLeihoa() {

		Ventana3 ventana3= new Ventana3();
		ventana3.setVisible(true);

	}
	public static void laugarrenLeihoa(String linea) {

		ArrayList <Parada> paradas= new ArrayList <Parada>();
		paradas= Consultas.paradastabla(linea);
		
		Ventana4 ventana4= new Ventana4(paradas,linea);
		ventana4.setVisible(true);

	}

	public static void bostgarrenLeihoa() {
		
		Ventana5 ventana5= new Ventana5();
		ventana5.setVisible(true);
		

	}
	public static void seigarrenLeihoa() {

		Ventana6 ventana6= new Ventana6();
		ventana6.setVisible(true);

	}
	public static void zazpigarrenLeihoa() {

		Ventana7 ventana7= new Ventana7();
		ventana7.setVisible(true);

	}

	/** 
	* Calculate distance between two points in latitude and longitude taking 
	* into account height difference. If you are not interested in height 
	* difference pass 0.0. Uses Haversine method as its base. 
	* 
	* lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters 
	* el2 End altitude in meters 
	* @returns Distance in Meters 
	*/ 
	public static double distance(double lat1, double lat2, double lon1, 
	     double lon2, double el1, double el2) { 

	    final int R = 6371; // Radius of the earth 

	    double latDistance = Math.toRadians(lat2 - lat1); 
	    double lonDistance = Math.toRadians(lon2 - lon1); 
	    double a = Math.sin(latDistance/2) * Math.sin(latDistance/2) 
	      + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) 
	      * Math.sin(lonDistance/2) * Math.sin(lonDistance/2); 
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a)); 
	    double distance = R * c * 1000; // convert to meters 

	    double height = el1 - el2; 

	    distance = Math.pow(distance, 2) + Math.pow(height, 2); 

	    return Math.sqrt(distance); 
	} 
}
	
