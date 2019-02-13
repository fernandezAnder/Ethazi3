package controlador;
import modelo.Conexion;

/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class BileteMakinaAPP {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Metodoak.lehenengoLeihoa();
		
	}

}
