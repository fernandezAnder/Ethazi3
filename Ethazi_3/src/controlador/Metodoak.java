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
	public static void laugarrenLeihoa(String linea, int cod_bus) {

		ArrayList <Parada> paradas= new ArrayList <Parada>();
		for (int i=0;i<paradas.size();i++) {
	
		}
		ArrayList <Autobus> bus= new ArrayList <Autobus>();
		
		ArrayList <Double> distantzia= new ArrayList<Double>();
		
		paradas= Consultas.paradastabla(linea);
		bus=Consultas.datosAutobus(linea);
		Ventana4 ventana4= new Ventana4(paradas,bus,linea,cod_bus);
		ventana4.setVisible(true);

	}

	public static void bostgarrenLeihoa() {
		
		Ventana5 ventana5= new Ventana5();
		ventana5.setVisible(true);
		

	}
	public static Billete billete(int cod_billete,int bidaiakop,int cod_linea,int cod_bus,int
			hasiera_geltoki_kod,int amaiera_geltoki_kod,Date lehen_data, 
			String ordua, String nan, double prezioa) {
		Billete billete= new Billete(cod_billete,bidaiakop,cod_linea,cod_bus,hasiera_geltoki_kod,amaiera_geltoki_kod,lehen_data,ordua,nan,prezioa);
		return billete;
		
	}
	
	public static void seigarrenLeihoa() {

		Ventana6 ventana6= new Ventana6();
		ventana6.setVisible(true);

	}
	public static void zazpigarrenLeihoa() {

		Ventana7 ventana7= new Ventana7();
		ventana7.setVisible(true);

	}

	public static double distanciaCoord(double lat1, double lng1, double lat2, double lng2) {  
        //double radioTierra = 3958.75;//en millas  
        double radioTierra = 6371;//en kilómetros  
        double dLat = Math.toRadians(lat2 - lat1);  
        double dLng = Math.toRadians(lng2 - lng1);  
        double sindLat = Math.sin(dLat / 2);  
        double sindLng = Math.sin(dLng / 2);  
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
                * Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
        double distancia = radioTierra * va2;  
   
        return distancia;  
    }
	public static double prezioaKalkulatu(double distantzia,final double erregaia,double kontsumo_bus,int bidaiariak,final double onurak) {
		double prezioa=0;
		double erregai_kontsumoa=erregaia*kontsumo_bus;
		double bidai_gastua=distantzia*erregai_kontsumoa;
		double irabaziak= bidai_gastua*onurak;
		double bidaia_totala=irabaziak+bidai_gastua;
		prezioa=bidaia_totala/bidaiariak;
		
		
		return prezioa;
		
	}
}
	
