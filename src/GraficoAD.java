import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.StringTokenizer;

public class GraficoAD{

	private Connection conexion;
	private Statement statement;
	private SessionDP session;

	public GraficoAD(){
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/trina?user=root");
			System.out.println("Conexion exitosa con driver tipo 4");
		}catch(ClassNotFoundException cnfe){

			System.out.println("Error ,"+cnfe);
		}catch(InstantiationException ie){

			System.out.println("Error ,"+ie);
		}catch(IllegalAccessException iae){

			System.out.println("Error ,"+iae);
		}catch(SQLException sql){

			System.out.println("Error,"+sql);
		}
	}

	public String captureS(String datos){
		
		String insertSession = "";
		String respuesta = "";


		SessionDP sessiondp = new SessionDP(datos);
		
		String insertPaciente = "INSERT INTO session VALUES("+sessiondp.toStringSQL()+");";
		
		

		try{
			//Abrir bd hospital
			statement = conexion.createStatement();

			//Capturar en la BD
			statement.executeUpdate(insertPaciente);

			//Cerrar BD
			statement.close();

			respuesta = "Datos capturados "+ datos;
			System.out.println(conexion.nativeSQL(insertPaciente));

		}catch(SQLException sqle){
			System.out.println("Error: "+ sqle);
			respuesta = ("Error en capturar datos "+ sqle);
		}
		return respuesta;

	}
	
		public String toDB()
	{
		
		String datos="";
		String respuesta;
		
		try
		{
		//Creamos un archivo FileReader que obtiene lo que tenga el archivo
		FileReader lector=new FileReader("consulta.txt");
		
		//El contenido de lector se guarda en un BufferedReader
		BufferedReader contenido=new BufferedReader(lector);
		
		//Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
		while((datos=contenido.readLine())!=null)
		{
			//hospital.toDB(datos);
		}
			 respuesta = "Captura correcta";
			
		}
		
		//Si se causa un error al leer cae aqui
		catch(Exception e)
		{
			respuesta = "Error al capturar" + e;
		}
	
		return respuesta;
	}


}
	
