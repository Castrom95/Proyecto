import java.awt.GridLayout;

import javax.swing.JPanel;


public class PanelSillas extends JPanel
{
	
	private FramePrincipal principal;

	public PanelSillas(FramePrincipal x, int numSillas)
	{
		principal = x;
		int numero = numSillas%2 ==0? numSillas/2:(numSillas/2)+1;
		setLayout(new GridLayout(numero,numero));
		setVisible(true);
		for (int i = 0; i < numSillas; i++) {
			PacienteGUI panel = new PacienteGUI();
			add(panel);
		}
	}
}
