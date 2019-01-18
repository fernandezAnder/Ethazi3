package controlador;

import java.sql.Date;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private String sexo;
	private String contrase�a;
	
	public Cliente(String dni, String nombre, String apellido, Date fecha_nac, String sexo, String contrase�a) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
		this.contrase�a = contrase�a;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
		
	
}
