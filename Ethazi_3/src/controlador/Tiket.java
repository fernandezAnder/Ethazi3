package controlador;

import java.util.Date;

public class Tiket {

	private static int kontagailua=1;
	private int cod_billete;
	private int n_trayecto;
	private String cod_linea;
	private int cod_bus;
	private String parada_inicio;
	private String parada_fin;
	private String fecha_ida;
	private String fecha_vuelta;
	private double precio;
	
	public Tiket( int n_trayecto, String cod_linea, int cod_bus, String parada_inicio,
			String parada_fin, String fecha_ida, String fecha_vuelta, double precio) {
		
		this.cod_billete = kontagailua++;
		this.n_trayecto = n_trayecto;
		this.cod_linea = cod_linea;
		this.cod_bus = cod_bus;
		this.parada_inicio = parada_inicio;
		this.parada_fin = parada_fin;
		this.fecha_ida = fecha_ida;
		this.fecha_vuelta = fecha_vuelta;
		this.precio = precio;
	}
	public int getCod_billete() {
		return cod_billete;
	}
	public void setCod_billete(int cod_billete) {
		this.cod_billete = cod_billete;
	}
	public int getN_trayecto() {
		return n_trayecto;
	}
	public void setN_trayecto(int n_trayecto) {
		this.n_trayecto = n_trayecto;
	}
	public String getCod_linea() {
		return cod_linea;
	}
	public void setCod_linea(String cod_linea) {
		this.cod_linea = cod_linea;
	}
	public int getCod_bus() {
		return cod_bus;
	}
	public void setCod_bus(int cod_bus) {
		this.cod_bus = cod_bus;
	}
	public String getParada_inicio() {
		return parada_inicio;
	}
	public void setParada_inicio(String parada_inicio) {
		this.parada_inicio = parada_inicio;
	}
	public String getParada_fin() {
		return parada_fin;
	}
	public void setParada_fin(String parada_fin) {
		this.parada_fin = parada_fin;
	}
	public String getFecha_ida() {
		return fecha_ida;
	}
	public void setFecha_ida(String fecha_ida) {
		this.fecha_ida = fecha_ida;
	}
	public String getFecha_vuelta() {
		return fecha_vuelta;
	}
	public void setFecha_vuelta(String fecha_vuelta) {
		this.fecha_vuelta = fecha_vuelta;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Billete Kodea: " + cod_billete +" "+" "+ " Bidaia Kopurua: " + n_trayecto+" \t\n"+" \t\n"  
				+ "Linea: " + cod_linea+" "+" "+ " Autobusa: " + cod_bus+" \t\n"+" \t\n"
				+ "Hasiera Geltokia " + parada_inicio+" "+" " + " Amaiera Geltokia " + parada_fin+" \t\n"+" \t\n" 
				+ "Joateko Data " + fecha_ida +" "+" "+ " Itzultzeko Data " + fecha_vuelta+" \t\n"+" \t\n" 
				+ "Prezioa: " + precio;
	}
	
	
}
