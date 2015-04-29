import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class PanelPaciente extends JFrame implements ActionListener
{
	private JButton bSilla;
	
	private PacienteGUI pacientegui;
	
	public PanelPaciente()
	{
		JButton bSilla = new JButton(new ImageIcon("C:\\Users\\Gabriel\\Google Drive\\TRINA\\Proyecto\\src\\silla.gif"));
		
		add(bSilla, BorderLayout.CENTER);
		setSize(100,100);
		setVisible(true);
		
	}
	

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == bSilla)
		{
			pacientegui = new PacienteGUI();
		}
		
	}
	
	public static void main(String args[])
    {
		PanelPaciente panel = new PanelPaciente();
	}

}
