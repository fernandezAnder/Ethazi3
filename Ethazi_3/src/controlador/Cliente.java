package controlador;

import java.util.Date;

//import java.sql.Date;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private String sexo;
	private String contraseña;
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param fecha_nac
	 * @param sexo
	 * @param contraseña
	 */
	
	public Cliente(String dni, String nombre, String apellido,Date fecha_nac, String sexo, String contraseña) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
		this.contraseña = contraseña;
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

	public String getNombre() {
		return nombre;
	}
/**
 * 
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
/**
 * 
 * @param apellido
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}
/**
 * 
 * @param fecha_nac
 */
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getSexo() {
		return sexo;
	}
/**
 * 
 * @param sexo
 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContraseña() {
		return contraseña;
	}
/**
 * 
 * @param contraseña
 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
		
	
}
