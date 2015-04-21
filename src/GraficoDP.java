import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.TitledBorder;

public class GraficoDP extends JPanel implements ActionListener
{
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	private JButton bStart;
	private JTextField tfName, tfID, tfTime;
	private JTextArea taLog;
	
	int counter = 0;
	
	DatosINIC datos;
	
	public GraficoDP(int i)
	{
		
		//Crear Objetos
		bStart 		= new JButton("Start");
    	tfName		= new JTextField(10);
    	tfID		= new JTextField(7);
    	tfTime		= new JTextField(10);
    	panel1		= new JPanel();
    	panel2		= new JPanel();
    	panel3		= new JPanel();
    	panel4		= new JPanel();
    	panel5		= new JPanel();
    	panel6		= new JPanel();
    	taLog		= new JTextArea();
		
		//Adicionar addActionListener a los botones
    	bStart.addActionListener(this);
		
		//Definir layouts
		panel1.setLayout(new BorderLayout(5,5));
		panel2.setLayout(new GridLayout(4,1));
		panel3.setLayout(new GridLayout(1,1));
		panel4.setLayout(new GridLayout(1,1));
		panel5.setLayout(new GridLayout(1,1));
		panel6.setLayout(new GridLayout(3,1));
		
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Chair #" + (i+1));
		
		//Adicionar Objetos al panel
		panel2.add(new JLabel("Name"));
    	panel2.add(tfName);
    	panel2.add(new JLabel("ID"));
    	panel2.add(tfID);
    	
    	panel4.add(taLog);
    	
    	
    	panel6.add(bStart);
    	panel6.add(tfTime);
		panel6.add(new JLabel("Timer"));
    	
    	panel1.add(panel2,BorderLayout.WEST);
    	panel1.add(panel4,BorderLayout.CENTER);
    	panel1.add(panel6,BorderLayout.EAST);
    	
    	panel1.setBorder(title);
    	panel1.setPreferredSize(new Dimension(400,170));
		
		// Hace visible el JFrame
		add(panel1);
		setSize(400,150);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bStart)
		{
			String strName = tfName.getText();
			if(strName.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"NAME SPACE IS EMPTY");
			}
			else
			{
				DatosINIC datos = new DatosINIC(strName);
			}
		}
	
	
	}
	
	public JPanel getPanel()
	{
		counter ++;
		return this.panel1;
	}
	
	public boolean notification(String alert)
	{
		int met, bs;
		try
		{
		
		
		if(alert == "Sit")
		{
			JOptionPane.showMessageDialog(null,"Patient should be sitting");
		}
		else
			if(alert == "IV")
		{
			
			JOptionPane.showMessageDialog(null,"Start IV");
		}
		else
			if(alert == "Metabolic")
		{
			
			met = Integer.parseInt(JOptionPane.showInputDialog(null,"Metabolic Measurement"));
		}
		else
			if(alert == "Blood")
		{
			
			bs = Integer.parseInt(JOptionPane.showInputDialog(null,"Take blood sugar"));
			if (bs >= 150)
				return true;
					else
						return false;
		}
		else
			if(alert == "Glucose")
		{
			
			JOptionPane.showMessageDialog(null,"Give glucose");
		}
		else
			if(alert == "Pump")
		{
			
			JOptionPane.showMessageDialog(null,"Start Pump");
		}
		if(alert == "Rest")
		{
			
			JOptionPane.showMessageDialog(null,"Rest");
		}
		else
			if(alert == "Discharge")
		{
			
			JOptionPane.showMessageDialog(null,"Give discharge instructions and disconnect IV");
		}
		}
		catch(NumberFormatException nfe)
		{
			JOptionPane.showMessageDialog(null,"Cant cancel an operation");
		}
		
		return true;
	}
	
	public void message()
	{
		JOptionPane.showMessageDialog(null, "Mensaje");
	}
	
	public static void main(String args[])
	{
		new GraficoDP(1);
	}
}