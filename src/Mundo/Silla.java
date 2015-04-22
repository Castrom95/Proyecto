package Mundo;

public class Silla
{
	
	//--------------------------------------ATRIBUTOS-------------------------------------

	//# de la silla
	private int numeroSilla;
	
	//Cliente que esta ocupando la silla
	private Cliente cliente;
	
	//Timer de la silla
	private Chronometer cronometro;
	
	//-----------------------------------------METODOS-----------------------------------------

	public Silla(int pNumero)
	{
		numeroSilla = pNumero;
		cronometro = new Chronometer();		
	}
	
	public boolean estaOcupada()
	{
		return cliente != null;
	}

	public void asignarCliente(Cliente pCliente)
	{
		cliente = pCliente;
	}
	
	public void desocuparSilla()
	{
		cliente = null;
	}
}
