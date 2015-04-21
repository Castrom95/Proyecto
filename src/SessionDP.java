import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class SessionDP
{
	private String idp, session, date;
	//private String dateApertura;
	private GraficoAD hospital = new GraficoAD();
	
	/*** Constructores ***/
	public SessionDP()
	{
		this.idp 		= "";
		this.session	= "";
		this.date		= "";
	}
	
	public SessionDP(String datos)
	{
		StringTokenizer st = new StringTokenizer(datos,"_");
		
		this.idp 		= st.nextToken();
		this.session	= st.nextToken();
		this.date	  	= st.nextToken();
	}
	
	/*** Accesors ***/
	public String getIDP()
	{
		return this.idp;
	}
	
	public String getSession()
	{
		return this.session;
	}

	public String getDate()
	{
		return this.date;
	}
	
	/*** Mutators ***/
	public void setIDP(String str)
	{
		this.idp = str;
	}
	
	public void setSession(String str)
	{
		this.session = str;
	}
	
	public void setdate(String str)
	{
		this.date = str;
	}
	
	public String toString()
	{
		return this.idp+"_"+this.session+"_"+this.date;
	}

	public String toStringSQL()
	{
		return "'"+this.idp+"','"+this.session+"','"+this.date+"'";
	}
	
	public String toTxt(String strDatos)
	{
		String strRespuesta ="";
		
		try
		{
		//Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
		File archivo=new File("consulta.txt");
		
		//Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
		FileWriter escribir=new FileWriter(archivo,true);
		
		//Escribimos en el archivo con el metodo write 
		escribir.write(strDatos);
		
		//Cerramos la conexion
		escribir.close();
		
		strRespuesta = "Captura correcta";
		}
		
		//Si existe un problema al escribir cae aqui
		catch(Exception e)
		{
		strRespuesta = "Error al escribir";
		}
		
		return strRespuesta;
		
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
			hospital.toDB();
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