package ba.exercices.inheritance;


public abstract class PortableComputer extends PersonalComputer {
	private double weight;
	private int displaySizeInch;
	private boolean wifi;
	public PortableComputer(String oS, int RAM, int priceKM, double weight, int displaySizeInch, boolean wifi){
		super(oS, RAM, priceKM);
		this.weight = weight;
		this.displaySizeInch = displaySizeInch;
		this.wifi = wifi;
	}
	private double getWeight(){
		return weight;
	}
	private void setWeight(double weight){
		this.weight = weight;
	}
	private int getDisplaySizeInch(){
		return displaySizeInch;
	}
	private void setDisplaySizeInch(int displaySizeInch){
		this.displaySizeInch = displaySizeInch;
	}
	private boolean getWifi(){
		return wifi;
	}
	private void setWifi(boolean wifi){
		this.wifi = wifi;
	}
	public String printInformation(){
		return "weight " + weight + " " + "Display size " + displaySizeInch + " " + "WiFi " + wifi + " " + super.printInformation();
	}
}
