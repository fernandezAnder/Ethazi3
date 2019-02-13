package controlador;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Autobus {

	private int cod_bus;
	private int n_plazas;
	private double consumo_km;
	private String color;
	
	/**
	 * 
	 * @param cod_bus busaren kodea
	 * @param n_plazas
	 * @param consumo_km
	 * @param color
	 */
	public Autobus(int cod_bus, int n_plazas, double consumo_km, String color) {
		
		this.cod_bus = cod_bus;
		this.n_plazas = n_plazas;
		this.consumo_km = consumo_km;
		this.color = color;
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

	public int getN_plazas() {
		return n_plazas;
	}
/**
 * 
 * @param n_plazas
 */
	public void setN_plazas(int n_plazas) {
		this.n_plazas = n_plazas;
	}

	public double getConsumo_km() {
		return consumo_km;
	}
/**
 * 
 * @param consumo_km
 */
	public void setConsumo_km(double consumo_km) {
		this.consumo_km = consumo_km;
	}

	public String getColor() {
		return color;
	}
/**
 * 
 * @param color
 */
	public void setColor(String color) {
		this.color = color;
	}
	
}
