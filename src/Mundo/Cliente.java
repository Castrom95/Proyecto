package Mundo;

public class Cliente 
{
	
	//--------------------------------------ATRIBUTOS-------------------------------------

	private double weight;
	private double BP;
	private double P;
	private double RR;
	private double temp;

	
	
	
	
	//-----------------------------------------METODOS-----------------------------------------

	public Cliente(double pPeso, double pBP, double pP, double pRR, double pTemp)
	{
		weight = pPeso;
		BP = pBP;
		P = pP;
		RR = pRR;
		temp = pTemp;
		
	}





	public double getWeight() {
		return weight;
	}





	public void setWeight(double weight) {
		this.weight = weight;
	}





	public double getBP() {
		return BP;
	}





	public void setBP(double bP) {
		BP = bP;
	}





	public double getP() {
		return P;
	}





	public void setP(double p) {
		P = p;
	}





	public double getRR() {
		return RR;
	}





	public void setRR(double rR) {
		RR = rR;
	}





	public double getTemp() {
		return temp;
	}





	public void setTemp(double temp) {
		this.temp = temp;
	}

}
