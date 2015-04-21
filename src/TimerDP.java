import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

class MyTimerTask extends TimerTask 
{


  public void run() 
  {
  		GraficoDP grafico = new GraficoDP(1);
	  grafico.notification("Sit");
	  System.out.println("Patient should be sitting");
	  
	  try 
	  {
      Thread.sleep(15000);
   	  }
      catch (InterruptedException exc) 
      {
      	
      }
    
	  grafico.notification("IV");
	  
	  System.out.println("Start IV");
	  
	  try 
	  {
      Thread.sleep(15000);
   	  }
      catch (InterruptedException exc) 
      {
      }
      
      for(int i = 0; i<3; i++)
      {
      
	  	grafico.notification("Metabolic");
	  System.out.println("Metabolic measurement");
		  
	    
	  boolean bs = grafico.notification("Blood");
	  System.out.println("Take blood sugar");
	      
	     	while(bs == false)
	     	{
	     	
	  		grafico.notification("Glucose");
	  System.out.println("Give glucose");
	     		
		      try 
			  {
		      	Thread.sleep(15000);
		   	  }
		      catch (InterruptedException exc) 
		      {
		      }
		      
	  			 bs = grafico.notification("Blood");
	  System.out.println("Take blood sugar");
	     	}
	     	
	     	
	  			grafico.notification("Pump");
	  System.out.println("Start pump");
	     	
	     	try 
			  {
		      	Thread.sleep(15000);
		   	  }
		      catch (InterruptedException exc) 
		      {
		      }
		     
		     
	  		grafico.notification("Blood");
	  System.out.println("Take blood sugar");
		     
		      
		      try 
			  {
		      	Thread.sleep(15000);
		   	  }
		      catch (InterruptedException exc) 
		      {
		      }
		      
		     
		     
	  		grafico.notification("Rest");
	  System.out.println("Rest");
		     
		     try 
			  {
		      	Thread.sleep(15000);
		   	  }
		      catch (InterruptedException exc) 
		      {
		      }
		      
      }
     	
	  			grafico.notification("Discharge");
	  System.out.println("Discharge instructions");
	  			
	  			
  }
}


public class TimerDP{
  public static void main(String args[]) {
    MyTimerTask myTask = new MyTimerTask();
    Timer myTimer = new Timer();

    
     // Set an initial delay of 1 second
     
    myTimer.schedule(myTask, 1000);

    try {
      Thread.sleep(100000000);
    } catch (InterruptedException exc) {
    }

    myTimer.cancel();

    System.out.println("End of process");
  }
}