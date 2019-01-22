package controlador;

public class Parada {
	private int parada;
	private String nombre;
	private String calle;
	private double latitud;
	private double longitud;
	
	public Parada(int parada, String nombre, String calle, double latitud, double longitud) {
	
		this.parada = parada;
		this.nombre = nombre;
		this.calle = calle;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public int getParada() {
		return parada;
	}

	public void setParada(int parada) {
		this.parada = parada;
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
