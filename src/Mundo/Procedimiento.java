package Mundo;

public class Procedimiento {
	
	//--------------------------------------ATRIBUTOS-------------------------------------
	
		//Tiempo que ha pasado
		private String timepo;
		
				
		private double azucar = 0;
		
		
		
	//-----------------------------------------METODOS-----------------------------------------

	public void inicioProceso(String time)
	{
		//Despliega que el procedimiento inició 
		//(time + " Patient " + paciente + "should SIT and start RESTING \n");
	}
	
	public void inicioIV(String time)
	{
		//Despliega que se debe iniciar la intravenosa
		//(time + " Patient " + paciente + "should be started on the IV \n");
	}
	
	public void mideMetabolismo(String time)
	{
		//Despliega que se debe tomar el metabolismo
		//(time + " Patient " + paciente + "should have METABOLISM measurement \n");
	}
	
	public double mideAzucar(String time)
	{
		
		//Despliega que se debe tomar el azucar de la sangre
		//(time + " Patient " + paciente + "should have BLOOD SUGAR measured \n");
		return azucar;
	}
	
	public void darGlucosa(String time)
	{
		//Despliega que se debe dar bebida con glucosa
		//(time + " Patient " + paciente + "should be started given GLUCOSE DRINK \n");
	}
	
	public void iniciaBomba(String time)
	{
		//Despliega que se debe iniciar la bomba
		//(time + " Patient " + paciente + "should be starting PUMP \n");
	}
	
	public void rest(String time)
	{
		//Despliega que se debe Descanzar
		//(time + " Patient " + paciente + "should be RESTING \n");
	}
	
	public void instruccionesSalida(String time)
	{
		//Despliega que se debe dar instrucciones de salida
		//(time + " Patient " + paciente + "should be given DISCHARGE INSTRUCTIONS \n");
	}
		
}
