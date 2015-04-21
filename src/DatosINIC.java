import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;


public class DatosINIC extends JFrame implements ActionListener
{
	
		private JTextField tfWeight, tfBP, tfP, tfRR, tfTemp;
		private JButton bCancel, bOK;
		private JPanel pData;
		
		private int weight, bp, p, rr, temp;
		
		TimerDP timer;
		GraficoDP grafico;
		MyTimerTask myTask;
		
	public DatosINIC(String name)
	{
		  tfWeight    = new JTextField();
		  tfBP        = new JTextField();
		  tfP         = new JTextField();
		  tfRR        = new JTextField();
		  tfTemp      = new JTextField();
		  bOK         = new JButton("OK");
		  bCancel     = new JButton("CANCEL");
		  pData       = new JPanel();
		  
		  TitledBorder title;
		  title = BorderFactory.createTitledBorder("Patient: " + name);
		  
		  bOK.addActionListener(this);
		  bCancel.addActionListener(this);
		  
		  pData.setLayout(new GridLayout(6,2));
		  
		  pData.add(new JLabel("Weight(Kg)"));
		  pData.add(tfWeight);
		  pData.add(new JLabel("BP"));
		  pData.add(tfBP);
		  pData.add(new JLabel("P"));
		  pData.add(tfP);
		  pData.add(new JLabel("RR"));
		  pData.add(tfRR);
		  pData.add(new JLabel("Temp"));
		  pData.add(tfTemp);
		  pData.add(bCancel);
		  pData.add(bOK);
		  
		  
    	pData.setBorder(title);
		  
		  add(pData);
		  setSize(300,300);
		  setVisible(true);
		 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bOK)
		{
			try
			{
				weight = Integer.parseInt(tfWeight.getText());
				bp = Integer.parseInt(tfBP.getText());
				p = Integer.parseInt(tfP.getText());
				rr = Integer.parseInt(tfRR.getText());
				temp = Integer.parseInt(tfTemp.getText());	
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null, "Empty Field");
			}
			MyTimerTask myTask = new MyTimerTask();
			myTask.run();
			
		}
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public int getBP()
	{
		return bp;
	}
	
	public int getP()
	{
		return p;
	}
	
	public int getRR()
	{
		return rr;
	}
	
	public int getTemp()
	{
		return temp;
	}
	
	public static void main(String[] args)
	{
		DatosINIC datos = new DatosINIC("");
	}
	
	
}
    	
    	

		
		
		

	