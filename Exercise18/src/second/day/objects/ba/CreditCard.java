package second.day.objects.ba;

public class CreditCard {
	public int numberOfCreditCard;
	public String nameOfBank;
	public int monthOfExpiration;
	public int yearOfExpitarion;
	private double minus;
	
	private double statusOnCC;
	
	public CreditCard(){
		minus = 400;
	}
	public CreditCard( String name, int numberOfCC, int yearOfExpiration, int monthOfExpiration){
		this.numberOfCreditCard = numberOfCC;
		this.nameOfBank = name;
		this.monthOfExpiration = monthOfExpiration;
		this.yearOfExpitarion = yearOfExpiration;
		minus = 400;
	}
	public CreditCard (double maxMinus){
		this.minus = maxMinus;
	}
	
	
	
	public double addOnCard (double add){
		statusOnCC = add;
		return statusOnCC;
	}
	
	public void removeFromCard(double remove){
		if(remove > minus){
			throw new UnsupportedOperationException(" You break bound of prooved minus");
		}
		statusOnCC -= remove;
	}
	public double status (){
		return statusOnCC;
	}
	
	@Override
	public String toString() {
		return nameOfBank;
	}
	
}
