package controlador;
import java.sql.*;
import java.sql.Date;
public class Billete {

	
	private int cod_billete=0;
	private int n_trayecto;
	private String cod_linea;
	private int cod_bus;
	private int cod_parada_inicio;
	private int cod_parada_fin;
	private String fecha;
	private String hora;
	private String dni;
	private double precio;
	
	public Billete(/*int cod_billete,*/ int n_trayecto, String cod_linea, int cod_bus, int cod_parada_inicio,
			int cod_parada_fin, String lehen_data, String hora, String dni, double precio) {
		
		this.cod_billete = cod_billete++;
		this.n_trayecto = n_trayecto;
		this.cod_linea = cod_linea;
		this.cod_bus = cod_bus;
		this.cod_parada_inicio = cod_parada_inicio;
		this.cod_parada_fin = cod_parada_fin;
		this.fecha = lehen_data;
		this.hora = hora;
		this.dni = dni;
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

	public int getCod_parada_inicio() {
		return cod_parada_inicio;
	}

	public void setCod_parada_inicio(int cod_parada_inicio) {
		this.cod_parada_inicio = cod_parada_inicio;
	}

	public int getCod_parada_fin() {
		return cod_parada_fin;
	}

	public void setCod_parada_fin(int cod_parada_fin) {
		this.cod_parada_fin = cod_parada_fin;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
