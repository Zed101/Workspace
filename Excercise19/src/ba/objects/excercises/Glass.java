package ba.objects.excercises;

public class Glass {
	private String typeOfLiquid;
	private double amount;
	private double maxAmount;
	
	public Glass(String typeOfLiquid, double amount, double maxAmount){
		this.typeOfLiquid = typeOfLiquid;
		this.amount = amount;
		this.maxAmount = maxAmount;
	}
	public Glass(){
		amount = 0.0;
		maxAmount = 0.50;
		typeOfLiquid = "Hot Chocolate"; 
	}
	
	public String getTypeOfLiquid(){
		return typeOfLiquid;
	}
	public void setTypeOfLiquid(String typeOfLiquid){
		this.typeOfLiquid = typeOfLiquid;
	}
	public double getAmount(){
		return amount;
	}
	public void setAmount (double amount){
		this.amount = amount;
	}
	public double getMaxAmount(){
		return maxAmount;
	}
	public void setMaxAmount(double maxAmount){
		this.maxAmount = maxAmount;
	}
	public void emptyGlass(Glass g){
		g.setAmount(0.0);
	}
	
}
