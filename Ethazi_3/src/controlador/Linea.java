package controlador;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Linea {

	private int cod_linea;
	private String nombre;
	/**
	 * 
	 * @param cod_linea
	 * @param nombre
	 */
	public Linea(int cod_linea, String nombre) {
		super();
		this.cod_linea = cod_linea;
		this.nombre = nombre;
	}

	public int getCod_linea() {
		return cod_linea;
	}

	public void setCod_linea(int cod_linea) {
		this.cod_linea = cod_linea;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
