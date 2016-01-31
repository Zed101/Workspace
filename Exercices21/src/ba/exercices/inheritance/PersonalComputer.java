package ba.exercices.inheritance;

public abstract class PersonalComputer  {
	private String oS;
	private int RAM;
	private int priceKM;
	public PersonalComputer(String oS, int RAM, int priceKM){
		this.oS = oS;
		this.RAM = RAM;
		this.priceKM = priceKM;
	}
	public String getOS(){
		return oS;
	}
	public void setOS(String oS){
		this.oS = oS;
	}
	public int getRAM(){
		return RAM;
	}
	public void setRAM(int RAM){
		this.RAM = RAM;
	}
	public int getPriceM(){
		return priceKM;
	}
	public void setPrice(int priceKM){
		this.priceKM = priceKM;
	}
	
	public String printInformation(){
		return "OS  " + oS + " " + "RAM " + RAM + " " + "Price  " + priceKM + " " ;
	}
}
