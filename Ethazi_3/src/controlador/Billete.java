package controlador;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Billete {

	private static int kontagailua=1;
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
	
	/**
	 * 
	 * @param n_trayecto
	 * @param cod_linea
	 * @param cod_bus
	 * @param cod_parada_inicio
	 * @param cod_parada_fin
	 * @param lehen_data
	 * @param hora
	 * @param dni
	 * @param precio
	 */
	public Billete( int n_trayecto, String cod_linea, int cod_bus, int cod_parada_inicio,
			int cod_parada_fin, String lehen_data, String hora, String dni, double precio) {
		
		this.cod_billete = kontagailua++;
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
/**
 * 
 * @param cod_billete
 */
	public void setCod_billete(int cod_billete) {
		this.cod_billete = cod_billete;
	}

	public int getN_trayecto() {
		return n_trayecto;
	}
/**
 * 
 * @param n_trayecto
 */
	public void setN_trayecto(int n_trayecto) {
		this.n_trayecto = n_trayecto;
	}

	public String getCod_linea() {
		return cod_linea;
	}
/**
 * 
 * @param cod_linea
 */
	public void setCod_linea(String cod_linea) {
		this.cod_linea = cod_linea;
	}

	public int getCod_bus() {
		return cod_bus;
	}
/**
 * 
 * @param cod_bus
 */
	public void setCod_bus(int cod_bus) {
		this.cod_bus = cod_bus;
	}

	public int getCod_parada_inicio() {
		return cod_parada_inicio;
	}
/**
 * 
 * @param cod_parada_inicio
 */
	public void setCod_parada_inicio(int cod_parada_inicio) {
		this.cod_parada_inicio = cod_parada_inicio;
	}

	public int getCod_parada_fin() {
		return cod_parada_fin;
	}
/**
 * 
 * @param cod_parada_fin
 */
	public void setCod_parada_fin(int cod_parada_fin) {
		this.cod_parada_fin = cod_parada_fin;
	}

	public String getFecha() {
		return fecha;
	}
/**
 * 
 * @param fecha
 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHora() {
		return hora;
	}
/**
 * 
 * @param hora
 */
	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getDni() {
		return dni;
	}
/**
 * 
 * @param dni
 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getPrecio() {
		return precio;
	}
/**
 * 
 * @param precio
 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
