package controlador;
import java.io.FileWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import modelo.Consultas;
import vista.*;

/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Metodoak {

	Calendar fecha = Calendar.getInstance();
/**
 * 
 * @param input
 * @return
 */
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
	public static void bigarrenLeihoaB(ArrayList<Cliente> clientes) {
		Ventana2b ventana2b= new Ventana2b(clientes);
		ventana2b.setVisible(true);
	}
	
	/**
	 * 
	 * @param nan
	 */
	public static void hirugarrenLeihoa(String nan) {

		Ventana3 ventana3= new Ventana3(nan);
		ventana3.setVisible(true);

	}
	
	/**
	 * 
	 * @param linea
	 * @param cod_bus
	 * @param nan
	 */
	public static void laugarrenLeihoa(String linea, int cod_bus, String nan) {

		ArrayList <Parada> paradas= new ArrayList <Parada>();
		ArrayList <Autobus> bus= new ArrayList <Autobus>();


		paradas= Consultas.paradastabla(linea);
		bus=Consultas.datosAutobus(linea,cod_bus);
		Ventana4 ventana4= new Ventana4(paradas,bus,linea,cod_bus,nan);
		ventana4.setVisible(true);

	}
/**
 * 
 * @param billete
 * @param t1
 */
	public static void bostgarrenLeihoa(Billete billete, Tiket t1) {

		Ventana5 ventana5= new Ventana5(billete,t1);
		ventana5.setVisible(true);


	}
	
	/**
	 * 
	 * @param bidaiakop
	 * @param cod_linea
	 * @param cod_bus
	 * @param hasiera_geltoki_kod
	 * @param amaiera_geltoki_kod
	 * @param lehen_data
	 * @param ordua
	 * @param nan
	 * @param prezioa
	 * @return
	 */
	public static Billete billete(int bidaiakop,String cod_linea,int cod_bus,int
			hasiera_geltoki_kod,int amaiera_geltoki_kod,String lehen_data, 
			String ordua, String nan, double prezioa) {
		Billete billete= new Billete(bidaiakop,cod_linea,cod_bus,hasiera_geltoki_kod,amaiera_geltoki_kod,lehen_data,ordua,nan,prezioa);
		return billete;

	}
/**
 * 
 * @param dni
 * @param nombre
 * @param apellido
 * @param fecha_nac
 * @param sexo
 * @param contrase�a
 * @return
 */
	public static Cliente cliente(String dni,String nombre,String apellido,java.sql.Date fecha_nac,String
			sexo,String contrase�a) {
		Cliente cliente= new Cliente(dni,nombre,apellido,fecha_nac,sexo,contrase�a);
		return cliente;

	}
/**
 * 
 * @param billete
 * @param t1
 */
	public static void seigarrenLeihoa(Billete billete, Tiket t1) {

		Metodoak.igoDatuak(billete);
		Ventana6 ventana6= new Ventana6(billete,t1);
		ventana6.setVisible(true);

	}
/**
 * 
 * @param billete
 */
	public static void igoDatuak(Billete billete) {
		Consultas.datubaseraIgo(billete);
	}

	public static void zazpigarrenLeihoa() {
		Ventana7 ventana7= new Ventana7();
		ventana7.setVisible(true);
		
	}

	public static void kontagailua() {
		Contador contador = new Contador();
		contador.start();
	}
	/**
	 * 
	 * @param lng1
	 * @param lat1
	 * @param lng2
	 * @param lat2
	 * @return
	 */
	public static double distanciaCoord(double lng1, double lat1, double lng2, double lat2) {  
	
		double radioTierra = 6371;//en kil�metros  
		double dLat = Math.toRadians(lat2 - lat1);  
		double dLng = Math.toRadians(lng2 - lng1);  
		double sindLat = Math.sin(dLat / 2);  
		double sindLng = Math.sin(dLng / 2);  
		double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2)  
		* Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2));  
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));  
		double distancia = radioTierra * va2;  
		System.out.println(distancia);
		return distancia;  
	}
	
	/**
	 * 
	 * @param distantzia
	 * @param kontsumo_bus
	 * @param bidaiariak
	 * @return
	 */
	public static double prezioaKalkulatu(double distantzia,double kontsumo_bus,int bidaiariak) {
		
		double prezioa=0;
		final double erregaia=0.80;
		final double onurak=0.20;
		double erregai_kontsumoa=erregaia*kontsumo_bus;
		double bidai_gastua=distantzia*erregai_kontsumoa;
		double irabaziak= bidai_gastua*onurak;
		double bidaia_totala=irabaziak+bidai_gastua;
		prezioa=bidaia_totala/bidaiariak;
		System.out.println(prezioa);
		return prezioa; 

	}
	/**
	 * 
	 * @param zbk
	 * @return
	 */
	public static boolean konprobatuNegatibo(double zbk) {
		boolean balidatu=false;
		if (zbk>0)
			balidatu=true;
		return balidatu;
	}
	
	/**
	 * 
	 * @param zbk
	 * @return
	 */
	public static String kanbioMetodoa(double zbk) {


		double kanbio= zbk;

		int aldatzailea = (int) (kanbio*100); // int-a parentesisen artean dagoena, double-a int-a bihurtzen du
		int itzultzeko = aldatzailea;
		String kanbioa="";
		String pantailaratu="";
		//DEZIMALEN FORMATOA.
		DecimalFormat dezimal = new DecimalFormat("#.00");

		pantailaratu=(" Itzultzeko " + dezimal.format(kanbio) + " eman behar da.\n");
		kanbioa=kanbioa+pantailaratu;
		// para cada moneda
		if (itzultzeko >= 20000) {
			pantailaratu=(" 200�-ko billeteak: " + itzultzeko / 20000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 20000;
		}
		if (itzultzeko >= 10000) {
			pantailaratu=(" 100�-ko billeteak: " + itzultzeko / 10000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 10000;
		}
		if (itzultzeko >= 5000) {
			pantailaratu=(" 50�-ko billeteak: " + itzultzeko / 5000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 5000;
		}
		if (itzultzeko >= 2000) {
			pantailaratu=(" 20�-ko billeteak: " + itzultzeko / 2000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 2000;
		}
		if (itzultzeko >= 1000) {
			pantailaratu=(" 10�-ko billeteak: " + itzultzeko / 1000+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 1000;
		}
		if (itzultzeko >= 500) {
			pantailaratu=(" 5�-ko billeteak: " + itzultzeko / 500+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 500;
		}
		if (itzultzeko >= 200) {
			pantailaratu=(" 2�-ko txanponak: " + itzultzeko / 200+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 200;
		}
		if (itzultzeko >= 100) {
			pantailaratu=(" 1�-ko txanponak: " + itzultzeko / 100+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 100;
		}
		if (itzultzeko >= 50) {
			pantailaratu=(" 50 zentimoko txanponak: " + itzultzeko / 50+"\n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 50;
		}
		if (itzultzeko >= 20) {
			pantailaratu=(" 20 zentimoko txanponak: " + itzultzeko / 20+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 20;
		}
		if (itzultzeko >= 10) {
			pantailaratu=(" 10 zentimoko txanponak: " + itzultzeko / 10+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 10;
		}
		if (itzultzeko >= 5) {
			pantailaratu=(" 5 zentimoko txanponak: " + itzultzeko / 5+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 5;
		}
		if (itzultzeko >= 2) {
			pantailaratu=(" 2 zentimoko txanponak: " + itzultzeko / 2+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = itzultzeko % 2;
		}
		if (itzultzeko >= 1) {
			pantailaratu=(" 1 zentimoko txanponak: " + itzultzeko+" \n");
			kanbioa=kanbioa+pantailaratu;
			itzultzeko = 0;
		}
		return kanbioa;
	}
	
	/**
	 * 
	 * @param zbk
	 * @return
	 */
	public static boolean konprobatuLetra(String zbk) {
		boolean balidatu=false;

		try {
			Double.parseDouble(zbk);
			balidatu = false;
		} catch (NumberFormatException letra) {
			balidatu = true;
		}
		return balidatu;
	}
	
	/**
	 * 
	 * @param zbk
	 * @param prezioa
	 * @return
	 */
	public static boolean diruFalta(double zbk,double prezioa) {

		boolean diru_falta=false;
		double preziototala = 0;
		preziototala = (double) (zbk-prezioa);
		if (preziototala<0) {
			diru_falta=true;

		}
		return diru_falta;
	}
	public static String orduaAtera () {
		int hora,minutos = 0;
		Calendar fecha = Calendar.getInstance();

		//ordua hartu eta gorde
		hora =fecha.get(Calendar.HOUR_OF_DAY);
		minutos = fecha.get(Calendar.MINUTE);

		String ordua = hora+":"+minutos;

		if (hora<10) {
			ordua = "0"+hora+":"+minutos;
		}
		if (minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		if(hora<10 && minutos<10) {
			ordua = hora+":"+"0"+minutos;
		}
		System.out.println(ordua);
		return ordua;
	}
	public static String dataAtera () {
		int a�o,mes,dia = 0;

		Calendar fecha = Calendar.getInstance();

		//data hartu eta gorde
		a�o = fecha.get(Calendar.YEAR);
		mes = fecha.get(Calendar.MONTH) + 1;
		dia = fecha.get(Calendar.DAY_OF_MONTH);

		String data = dia+"-"+mes+"-"+a�o;

		if(dia<10) {
			data = "0"+dia+"-"+mes+"-"+a�o;
		}
		if(mes<10) {
			data = dia+"-"+"0"+mes+"-"+a�o;
		}
		if (dia<10 && mes<10) {
			data = "0"+dia+"-"+"0"+mes+"-"+a�o;
		}
		System.out.println(data);
		return data;
	}

	public static java.sql.Time ateraOrdua()
	{
		Date fecha2 = new Date();
		java.sql.Time ordua = new java.sql.Time(fecha2.getTime());
		return (java.sql.Time) ordua ;
	}
/**
 * 
 * @param numero
 * @return
 */
	public static double Redondear(double numero)
	{
		return Math.rint(numero*100)/100;
	}

	public static void bezeroaIgo(Cliente2 cliente) {
		Consultas.bezeroIgo(cliente);
	}
/**
 * 
 * @param t1
 */
	public static void imprimatuTiketa(Tiket t1) {

		String nombre = "tiket.txt";
		try{
			FileWriter fichero = new FileWriter("src\\controlador\\"+nombre);
			fichero.write(t1.toString() + "\r\n");
			fichero.close();

		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	/**
	 * 
	 * @param dni
	 * @return
	 */
	public static String KalkulatuLetra(int dni){
		String karaktereak="TRWAGMYFPDXBNJZSQVHLCKE";
		int modulo= dni % 23;
		char letra1 = karaktereak.charAt(modulo);
		String letra = Character.toString(letra1);
		return letra; 
	} 
	
}


