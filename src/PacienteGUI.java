import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;


public class PacienteGUI extends JFrame implements ActionListener
{
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	private JButton bStart;
	private JTextField tfName, tfID, tfTime;
	private JTextArea taLog;
	
	public PacienteGUI()
	{
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
    	
    	bStart.addActionListener(this);
    	
    	panel1.setLayout(new BorderLayout(5,5));
		panel2.setLayout(new GridLayout(4,1));
		panel3.setLayout(new GridLayout(1,1));
		panel4.setLayout(new GridLayout(1,1));
		panel5.setLayout(new GridLayout(1,1));
		panel6.setLayout(new GridLayout(3,1));
		
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Chair #" );
		
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
    	
    	add(panel1);
		setSize(400,150);
		setVisible(true);
    	
    	
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
	private static void main(String[] args)
	{
		new PacienteGUI();
	}


	
	
}
