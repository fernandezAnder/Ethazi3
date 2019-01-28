package controlador;

public class Parada {
	private int paradanum;
	private String nombre;
	private String calle;
	private double latitud;
	private double longitud;
	
	public Parada(int paradanum, String nombre, String calle, double latitud, double longitud) {
	
		this.paradanum = paradanum;
		this.nombre = nombre;
		this.calle = calle;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getParadanum() {
		return paradanum;
	}

	public void setParadanum(int paradanum) {
		this.paradanum = paradanum;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}
