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
		
		Ventana3 ventana2= new Ventana3();
		ventana2.setVisible(true);
		
		
		}
	public static void hirugarrenLeihoa(String linea) {
		
		ArrayList <Parada> paradas= new ArrayList <Parada>();
		paradas= Consultas.paradastabla(linea);
		
		Ventana4 ventana3= new Ventana4(paradas);
		ventana3.setVisible(true);
		
		}
	public static void laugarrenLeihoa() {
		
		Ventana5 ventana4= new Ventana5();
		ventana4.setVisible(true);
		
		}
	public static void bostgarrenLeihoa() {
		
		Ventana6 ventana5= new Ventana6();
		ventana5.setVisible(true);
		
		}
	public static void seigarrenLeihoa() {
	
	Ventana2 ventana6= new Ventana2();
	ventana6.setVisible(true);
	
	}
	public static void zazpigarrenLeihoa() {
		
		Ventana7 ventana7= new Ventana7();
		ventana7.setVisible(true);
		
		}
}
	
