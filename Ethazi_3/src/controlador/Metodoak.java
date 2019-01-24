package controlador;
import modelo.*;
import vista.*;
import java.math.BigInteger;
import java.security.*;

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
	
	public static void bigarrenLeihoa() {
		Ventana2 ventana2= new Ventana2();
		ventana2.setVisible(true);
	}
}
	
