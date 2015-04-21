import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class GraficoIUGM extends JFrame implements ActionListener
{
	private JMenuBar  mbGrafico;
	private JMenu     menuFiguras;
	private JMenuItem miRectangulo, miCrearFigura, miSalir;
	
	private JPanel panel1,panel;
	private GraficoDP panelGrafico[];
	private int n, i; 
		

	
    public GraficoIUGM()
    {
        super("TRINA");
        
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
        
        
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
   
  	private void crearArregloGraficos(int c)
	{
		// 1. Crear los panels de las matrices con los layers correspondientes
		if(panel1!=null) // && panel!=null)
		{
			//panel.setVisible(false);
			panel1.setVisible(false);
		}
		
		i=0;
		
		panel1 = new JPanel();
		//panel  = new JPanel();
		
		//panel1.setLayout(new GridLayout(c,2));
		panel1.setLayout(new FlowLayout());
		
		// 2. Crear matriz de graficos
		panelGrafico = new GraficoDP[c];		
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == miCrearFigura)
		{
			try
			{
				n = Integer.parseInt(JOptionPane.showInputDialog("TOTAL NUMBER OF CHAIRS "));
			}
			catch(NumberFormatException nfe)
			{
				JOptionPane.showMessageDialog(null,"NO NUMBER WAS ENTERED");
			}
			
			crearArregloGraficos(n);
			
			
        	mbGrafico.add(new JLabel("                                     TOTAL NUMBER OF CHAIRS: " + n));
			miCrearFigura.setEnabled(false);
			
			for(i=0;i<n;i++)
			{
				panelGrafico[i]= new GraficoDP(i);
				panel1.add(panelGrafico[i]);
				panel1.setVisible(true);
				add(panel1);
				setVisible(true);
			}
        	
        	
		}
			
		if(e.getSource() == miSalir)
			System.exit(0);
	}
   
    public static void main(String args[])
    {
        GraficoIUGM objeto = new GraficoIUGM();
    }
}