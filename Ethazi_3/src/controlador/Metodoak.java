package controlador;
import modelo.*;
import vista.*;
import java.math.BigInteger;
import java.security.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Hashtable;

public class Metodoak {

	Calendar fecha = Calendar.getInstance();
	
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
	public static void bigarrenLeihoaB() {
		Ventana2b ventana2b= new Ventana2b(null);
		ventana2b.setVisible(true);
	}
	public static void hirugarrenLeihoa(String nan) {

		Ventana3 ventana3= new Ventana3(nan);
		ventana3.setVisible(true);

	}
	public static void laugarrenLeihoa(String linea, int cod_bus, String nan) {

		ArrayList <Parada> paradas= new ArrayList <Parada>();
		ArrayList <Autobus> bus= new ArrayList <Autobus>();
		
		
		paradas= Consultas.paradastabla(linea);
		bus=Consultas.datosAutobus(linea,cod_bus);
		Ventana4 ventana4= new Ventana4(paradas,bus,linea,cod_bus,nan);
		ventana4.setVisible(true);

	}

	public static void bostgarrenLeihoa(Billete billete) {
		
		Ventana5 ventana5= new Ventana5(billete);
		ventana5.setVisible(true);
		

	}
	public static Billete billete(int cod_billete,int bidaiakop,String cod_linea,int cod_bus,int
			hasiera_geltoki_kod,int amaiera_geltoki_kod,String lehen_data, 
			String ordua, String nan, double prezioa) {
		Billete billete= new Billete(cod_billete,bidaiakop,cod_linea,cod_bus,hasiera_geltoki_kod,amaiera_geltoki_kod,lehen_data,ordua,nan,prezioa);
		return billete;
		
	}
	
	public static Cliente cliente(String dni,String nombre,String apellido,java.sql.Date fecha_nac,String
			sexo,String contraseña) {
		Cliente cliente= new Cliente(dni,nombre,apellido,fecha_nac,sexo,contraseña);
		return cliente;
		
	}
	
	public static void seigarrenLeihoa(Billete billete) {

		Metodoak.igoDatuak(billete);
		Ventana6 ventana6= new Ventana6(billete);
		ventana6.setVisible(true);

	}
	
	public static void igoDatuak(Billete billete) {
		Consultas.datubaseraIgo(billete);
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
	public static double prezioaKalkulatu(double distantzia,double kontsumo_bus,int bidaiariak) {
		double prezioa=0;
		final double erregaia=0.80;
		final double onurak=0.20;
		double erregai_kontsumoa=erregaia*kontsumo_bus;
		double bidai_gastua=distantzia*erregai_kontsumoa;
		double irabaziak= bidai_gastua*onurak;
		double bidaia_totala=irabaziak+bidai_gastua;
		prezioa=bidaia_totala/bidaiariak;
		
		
		return prezioa;
		
	}
	public static boolean konprobatuNegatibo(double zbk) {
		boolean balidatu=false;
	if (zbk>0)
		balidatu=true;
	return balidatu;
}
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
        	pantailaratu=("200€-ko billeteak: " + itzultzeko / 20000+" \n");
            kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 20000;
        }
        if (itzultzeko >= 10000) {
        	pantailaratu=("100€-ko billeteak: " + itzultzeko / 10000+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 10000;
        }
        if (itzultzeko >= 5000) {
        	pantailaratu=("50€-ko billeteak: " + itzultzeko / 5000+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 5000;
        }
        if (itzultzeko >= 2000) {
        	pantailaratu=("20€-ko billeteak: " + itzultzeko / 2000+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 2000;
        }
        if (itzultzeko >= 1000) {
        	pantailaratu=("10€-ko billeteak: " + itzultzeko / 1000+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 1000;
        }
        if (itzultzeko >= 500) {
        	pantailaratu=("5€-ko billeteak: " + itzultzeko / 500+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 500;
        }
        if (itzultzeko >= 200) {
        	pantailaratu=("2€-ko txanponak: " + itzultzeko / 200+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 200;
        }
        if (itzultzeko >= 100) {
        	pantailaratu=("1€-ko txanponak: " + itzultzeko / 100+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 100;
        }
        if (itzultzeko >= 50) {
        	pantailaratu=("50 zentimoko txanponak: " + itzultzeko / 50+"\n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 50;
        }
        if (itzultzeko >= 20) {
        	pantailaratu=("20 zentimoko txanponak: " + itzultzeko / 20+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 20;
        }
        if (itzultzeko >= 10) {
        	pantailaratu=("10 zentimoko txanponak: " + itzultzeko / 10+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 10;
        }
        if (itzultzeko >= 5) {
        	pantailaratu=("5 zentimoko txanponak: " + itzultzeko / 5+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 5;
        }
        if (itzultzeko >= 2) {
        	pantailaratu=("2 zentimoko txanponak: " + itzultzeko / 2+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = itzultzeko % 2;
        }
        if (itzultzeko >= 1) {
        	pantailaratu=("1 zentimoko txanponak: " + itzultzeko+" \n");
        	kanbioa=kanbioa+pantailaratu;
            itzultzeko = 0;
        }
        return kanbioa;
	}
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
			int año,mes,dia = 0;
			
			Calendar fecha = Calendar.getInstance();

			//data hartu eta gorde
	        año = fecha.get(Calendar.YEAR);
	        mes = fecha.get(Calendar.MONTH) + 1;
	        dia = fecha.get(Calendar.DAY_OF_MONTH);
	        
			String data = dia+"/"+mes+"/"+año;
	        
	        if(dia<10) {
				data = "0"+dia+"/"+mes+"/"+año;
			}
			if(mes<10) {
				data = dia+"/"+"0"+mes+"/"+año;
			}
			if (dia<10 && mes<10) {
				data = "0"+dia+"/"+"0"+mes+"/"+año;
			}
			System.out.println(data);
			return data;
		}

	    public static java.sql.Date ateraData(java.sql.Date date)
	    {
	    	Date fecha2 = new Date();
			java.sql.Date data = new java.sql.Date(fecha2.getTime());
	        return (java.sql.Date) data ;
	    }

	    public static java.sql.Time ateraOrdua()
	    {
	    	Date fecha2 = new Date();
			java.sql.Time ordua = new java.sql.Time(fecha2.getTime());
	        return (java.sql.Time) ordua ;
	    }



}
	
