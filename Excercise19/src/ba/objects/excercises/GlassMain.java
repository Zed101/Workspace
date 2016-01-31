package ba.objects.excercises;

public class GlassMain {

	public static void main(String[] args) {
		Glass glassOfHC = new Glass();
		//System.out.println(glassOfHC.getTypeOfLiquid());
		//System.out.println(glassOfHC.getMaxAmount() + " maximal amaunt");
		//System.out.println(glassOfHC.getAmount() + " current amount in glass");
		System.out.println(addLiquid(glassOfHC, "Hot Chocolate", 0.40) + " added liquid to glass");
		glassOfHC.emptyGlass(glassOfHC);
		System.out.println(glassOfHC.getAmount() + " glass is empty");
	}

	public static double addLiquid (Glass glassOfHC, String typeOfLiquid, double amountToAdd){
	
	 if(!typeOfLiquid.equals(glassOfHC.getTypeOfLiquid())){
		 System.out.println("Error");
	 }else{
	
	 if(amountToAdd > glassOfHC.getMaxAmount()){
		amountToAdd = glassOfHC.getMaxAmount();
	 }
	 glassOfHC.setAmount(amountToAdd);
	 }
	 return glassOfHC.getAmount();
	 
	}

}
