package controlador;
import modelo.Conexion;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Metodoak.lehenengoLeihoa();
		
	}

}
