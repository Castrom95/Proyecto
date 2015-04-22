package Mundo;

import java.util.ArrayList;

public class Hospital 
{
	
	//--------------------------------------ATRIBUTOS-------------------------------------

	//clientes que hay actualmente en el hospital
	private ArrayList<Cliente> clientes;
	
	//sillas del hospital
	private ArrayList<Silla> sillas;
	
	//Numero de sillas que tiene el hospital
	private int numSillas;
	
	//-----------------------------------------METODOS-----------------------------------------

	public Hospital(int pNumeroSillas)
	{
		clientes = new ArrayList<>();
		sillas = new ArrayList<>();
		numSillas = pNumeroSillas;
		
		
		//Se crean las sillas
		for (int i = 0; i < numSillas; i++) {
			sillas.add(new Silla(i+1));
		}		
	}

	public void asignarCualquierSilla(Cliente pCliente)throws Exception
	{
		//Si ya hay tantos clientes como sillas avisa.
		if(clientes.size() >= numSillas)
		{
			throw new Exception("Todas las sillas estan ocupadas, porfavor espere a que se desocupe una.");
		}
		
		//Si hay sillas libre busca y asigna la primera que encuentre libre.
		boolean encontro = false;
		for (int i = 0; i < sillas.size() && !encontro; i++) 
		{
			Silla sill = sillas.get(i);
			if(!sill.estaOcupada())
			{
				sill.asignarCliente(pCliente);
				clientes.add(pCliente);
				encontro = true;
			}
		}
		
		
	}
	
	public void asignarUnaSilla(Cliente pCliente, int numeroSilla)throws Exception
	{
		
		Silla sill = sillas.get(numeroSilla-1);

		//Si esta ocupada la silla avisa.
		if(sill.estaOcupada())
		{
			throw new Exception("Esta silla ya se encuentra ocupada.");
		}
		
		//Si esta libre la ocupa.
		sill.asignarCliente(pCliente);
		clientes.add(pCliente);
		
		
		
	}
	
	
	
	
	

}
