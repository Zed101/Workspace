package ba.excercices.objects.plants;

public class Cactus extends Plants {
	
	public Cactus(boolean isAlive, boolean isToxic, String utilization){
		super(isAlive, isToxic, utilization);
		isToxic = true;
	}

}
