package controlador;

/**
 * 
 * @author oier, ander, aintzane
 *
 */

public class Cliente2 {

	private String dni;
	private String nombre;
	private String apellido;
	private String fecha_nac;
	private String sexo;
	private String contrase�a;
	
	/**
	 * 
	 * @param dni
	 * @param nombre
	 * @param apellido
	 * @param fecha_nac
	 * @param sexo
	 * @param contrase�a
	 */
	
	public Cliente2(String dni, String nombre, String apellido,String fecha_nac, String sexo, String contrase�a) {
		
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

	public String getFecha_nac() {
		return fecha_nac;
	}
/**
 * 
 * @param fecha_nac
 */
	public void setFecha_nac(String fecha_nac) {
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

	public String getContrase�a() {
		return contrase�a;
	}
/**
 * 
 * @param contrase�a
 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
		
	
}
