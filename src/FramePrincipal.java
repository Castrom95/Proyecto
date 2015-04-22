import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import Mundo.Hospital;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class FramePrincipal extends JFrame implements ActionListener
{
	
	private Hospital hospital;
	private PanelBotones panelBotones;
	private PanelSillas panelSillas;
	
	private JMenuBar  mbGrafico;
	private JMenu     menuFiguras;
	private JMenuItem miRectangulo;
	private JMenuItem miCrearFigura;
	private JMenuItem miSalir;
	
	
		
	//A VER SI SIRVE
	
    public FramePrincipal()
    {
        super("TRINA");
        setLayout(new BorderLayout());
        
        // 1. Crear o Inicializar atributos
        mbGrafico     = new JMenuBar();
        menuFiguras   = new JMenu("MAIN");
        miCrearFigura = new JMenuItem("CREATE MATRIX");
        miRectangulo  = new JMenuItem("ADD CHAIR");
        miSalir   	  = new JMenuItem("EXIT");
        
        
        // 2. Adicionamos a los MenuItems, addActionListener
        miRectangulo.addActionListener(this);
        miCrearFigura.addActionListener(this);
        miSalir.addActionListener(this);
             	
     	 // 3. Adicionar los MenuItems creados al JMenu menuFiguras
        menuFiguras.add(miCrearFigura);
        menuFiguras.add(miRectangulo);
        menuFiguras.add(miSalir);
        
        // 4. Adicionar menuFiguras al JMenuBar mbGrafico
        mbGrafico.add(menuFiguras); 
        
        // 5. Adicionar el JMenuBar mbGraficos al JFrame
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        setJMenuBar(mbGrafico);
        setSize(1300,720);
        setVisible(true);
        
        panelSillas = new PanelSillas(this, 2);
    	add(panelSillas, BorderLayout.NORTH);
        
        panelBotones = new PanelBotones(this);
        add(panelBotones, BorderLayout.SOUTH);
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
   
    public void crearPanelesPaciente(int numero)
    {
    	System.out.println("entra acrear");
    	panelSillas = new PanelSillas(this, numero);
    	add(panelSillas, BorderLayout.NORTH);
    	repaint();
    }
    
 

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == miCrearFigura)
		{
			int n = 0;
			try
			{
				n = Integer.parseInt(JOptionPane.showInputDialog("TOTAL NUMBER OF CHAIRS "));
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null,"NO NUMBER WAS ENTERED");
			}
			crearPanelesPaciente(n);        	
		}			
		else if(e.getSource() == miSalir)
			System.exit(0);
	}
   
    public static void main(String args[])
    {
        FramePrincipal id = new FramePrincipal(  );
        id.setVisible( true );
    }
}