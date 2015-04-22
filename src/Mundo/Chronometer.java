package Mundo;

import java.util.TimerTask;

public class Chronometer extends TimerTask{
	
	//--------------------------------------ATRIBUTOS-------------------------------------
	
	//Atributos que representan segundos, minutos y horas del Timer.
	private int segundos;
	private int minutos;
	private int horas;
	
	
	
	
	
	
	
	
	//-----------------------------------------METODOS-----------------------------------------
	
	public Chronometer()
	{
		segundos = 0;
		minutos= 0;
		horas = 0;
	}
	
	
	
	public void increaseTime()
    {
    	if(segundos == 59)
    	{
    		segundos = 0;
    		if(minutos == 59)
    		{
    			minutos = 0;
    			horas++;
    		}
    		else
    		{
    			minutos++;
    		}
    	}
    	else
    	{
    		segundos++;
    	}        	
    }

    public String getTime()
    {
    	String secs = segundos < 10? "0"+segundos: String.valueOf(segundos);
    	String mins = minutos < 10? "0"+minutos: String.valueOf(minutos);
    	String hora = horas < 10? "0"+horas: String.valueOf(horas);
    	String tiempo = hora+":"+mins+":"+secs;
    	
    	return tiempo;

    }
	
	
	
	@Override
	public void run() 
	{		
		increaseTime();
		System.out.println("Tiempo: " + getTime());		
	}

	
	
}
