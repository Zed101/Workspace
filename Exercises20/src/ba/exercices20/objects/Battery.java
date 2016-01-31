package ba.exercices20.objects;

public class Battery {
	private String name;
	private int batteryStatus;
	private int chargeBattery = 1;
	
	public Battery(String name, int chargeBattery){
		this.name = name;
		batteryStatus = 50;
		this.chargeBattery = chargeBattery;
	}
	public String getName(){
		return name;
	}
	public double getChargeBattery(){
		return chargeBattery;
	}
	public void chargeBattery(double time){
		for (int i = 0; i < time; i++) {
			if(batteryStatus == 100){
				System.out.println("Charged");
				break;
			}
				batteryStatus += chargeBattery;
			
		}
	}
	public void drainBattery(double time){
		for (int i = 0; i < time; i++) {
			if(batteryStatus < 0){
				System.out.println("Battery is dead");
				break;
			}
			batteryStatus -= chargeBattery ;
		}
	}
	
	@Override
	public String toString() {
		return name + batteryStatus;
	}
}
