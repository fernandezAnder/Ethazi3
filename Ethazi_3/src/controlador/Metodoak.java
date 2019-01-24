package controlador;
import modelo.*;
import vista.*;
import java.math.BigInteger;
import java.security.*;
import java.util.ArrayList;

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
		
		Ventana2 ventana2= new Ventana2();
		ventana2.setVisible(true);
		
		
		}
	public static void hirugarrenLeihoa(String linea) {
		
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		paradas= Consultas.paradastabla(linea);
		
		Ventana3 ventana3= new Ventana3(paradas);
		ventana3.setVisible(true);
		
		}
	public static void laugarrenLeihoa() {
		
		Ventana4 ventana4= new Ventana4();
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
}
	
