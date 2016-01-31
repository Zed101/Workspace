package ba.excercices.objects.plants;

public class Weed extends Plants{

	public Weed(boolean isAlive, boolean isToxic, String utilization){
		super(isAlive, isToxic, utilization);
		isToxic = false;   // weed is not toxic by default
	}
	
}
