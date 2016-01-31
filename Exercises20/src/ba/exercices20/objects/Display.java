package ba.exercices20.objects;

public class Display {
	private String brandName;
	private int brightness;
	private boolean isOn;
	private int batteryConsumption;
	
	public Display(String brandName, int batteryConsumption){
		this.brandName = brandName;
		this.batteryConsumption = batteryConsumption;
		brightness = 100;
	}
	public int getBrightness(){
		return brightness;
	}
	public void displayON(){
		isOn = true;
	}
	public void displayOff(){
		isOn = false;
	}
	public void increeseBrightness(){
		if(isOn == true && brightness < 100){
			brightness += 10;
		}
	}
	public void decreeseBrightness(){
		if(isOn == true && brightness != 0 ){
			brightness -= 10;
		}
	}
	@Override
	public String toString() {
	if(isOn == true){
		return "Brand name:" + brandName + "\n" + "Brightness level:" + brightness;
	}
	return "Off";
	}
	
}
