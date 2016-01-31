package ba.exercices.inheritance;

public abstract class StationaryComputer extends PersonalComputer {
	private double gHz;
	private int watts;
	private int HDCapacity;
	
	public StationaryComputer(String oS,int RAM, int priceKM, double gHz, int watts, int HDCapacity){
		super(oS, RAM, priceKM);
		this.gHz = gHz;
		this.watts = watts;
		this.HDCapacity = HDCapacity;
	}
	
	public double getGHZ(){
		return gHz;
	}
	public void setGHZ(double gHz){
		this.gHz = gHz;
	}
	public int getWatts(){
		return watts;
	}
	public void setWatts(int watts){
		this.watts = watts;
	}
	public int getHDCapacity(){
		return HDCapacity;
	}
	public void setHDCapacity(int HDCapacity){
		this.HDCapacity = HDCapacity;
	}
	
	public String printInformation(){
		return "GHZ" + gHz +"" + "WAtts" + watts + "" + "CApacity of HD " + HDCapacity + "";
	}
}
