package modelo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * 
 * @author oier, ander, aintzane
 *
 */
public class Conexion {
	private String  maquina;
    private String  usuario;
    private String  clave;
    private int puerto          = 3306;
    private String  servidor="";
    private static Connection conexion  = null;
 
    //CONSTRUCTOR
    //Recibe el nombre de la base de datos
    /**
     * 
     * @param baseDatos
     */
    public Conexion(String baseDatos){
       
    		String fichero = "src\\modelo\\Fitxeroa.txt";
    		int kontagailua =0;
    		String server="jdbc:mysql://";
    		try {
    		      FileReader fr = new FileReader(fichero);
    		      BufferedReader br = new BufferedReader(fr);
    		 
    		      String linea;
    		      while((linea = br.readLine()) != null) {
    		    	  System.out.println(linea);
    		        if(kontagailua==0) {
    		        	this.maquina=linea;}
    		      	if (kontagailua==1) {
    		      		this.usuario=linea;}
    		      	if (kontagailua==2) {
    		      		this.clave=linea;}
    		      	kontagailua++;
    		      	linea="";
    		      	}
    		      
    		      if (kontagailua==3) {
    		    	  this.servidor="";
    		    	  
    		      }
    		     
    		      
    		 
    		      fr.close();
    		    }
    		    catch(Exception e) {
    		      System.out.println("Excepcion leyendo fichero "+ fichero + ": " + e);
    		    }
    	
    	this.servidor="jdbc:mysql://"+this.maquina+":"+ this.puerto+"/"+baseDatos;

        //Registrar el driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("ERROR AL REGISTRAR EL DRIVER");
            System.exit(0); //parar la ejecuci�n
        }
 
        //Establecer la conexi�n con el servidor
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://"+this.maquina,this.usuario, this.clave);
        } catch (SQLException e) {
            System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
            System.exit(0); //parar la ejecuci�n
        }
        System.out.println("Conectado a "+baseDatos);
    }
 
/**
 * 
 * @return conexion
 */
    //Devuelve el objeto Connection que se usar� en la clase Controller
    public static Connection getConexion() {
        return conexion;
    }
 
}

