package controlador;
import modelo.*;
import vista.*;
import java.util.ArrayList;


public class BileteMakinaAPP {

	public static void main(String[] args) {
		
		
		String baseDatos="ethazi";
		Conexion base1 = new Conexion(baseDatos);
		
		Metodoak.lehenengoLeihoa();
	}

}
