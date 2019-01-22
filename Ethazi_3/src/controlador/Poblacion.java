package controlador;

public class Poblacion {

	private int cod_postal;
	private String nombre;
	
	public Poblacion(int cod_postal, String nombre) {
		super();
		this.cod_postal = cod_postal;
		this.nombre = nombre;
	}

	public int getCod_postal() {
		return cod_postal;
	}

	public void setCod_postal(int cod_postal) {
		this.cod_postal = cod_postal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
