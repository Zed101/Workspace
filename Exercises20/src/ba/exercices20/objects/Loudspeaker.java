package ba.exercices20.objects;

public class Loudspeaker {
	private String nManufacturer;
	private int price;
	private boolean  onOff;
	private int volume;
	private int bateryConsumption;
	
	
	public Loudspeaker (String nManufacturer, int price, int bateryConsumption){
		this.nManufacturer= nManufacturer;
		this.price = price;
		this.bateryConsumption = bateryConsumption;
		onOff = false;
		volume = 0;
	}
	public String getLManufacturer(){
		return nManufacturer;
	}
	public int getPrice(){
		return price;
	}
	public int getVolume (){
		return volume;
	}
	public boolean getOnOFF (){
		return onOff;
	}
	public int getBateryConsumption(){
		return bateryConsumption;
	}
	public void enable(){
		onOff = true;
	}
	public void disable(){
		onOff = false;
	}
	public void volumeUP(){
		if(volume < 0 || volume > 100){
			throw new UnsupportedOperationException("Volume can't be more than 100 and less then 0!");
		}
		volume += 10;
		
	}
	public void volumeCutDown(){
		if(volume < 0 || volume > 100){
			throw new UnsupportedOperationException("Volume can't be more than 100 and less then 0!");
		}
		 volume -= 10;
	}
	@Override
	public String toString() {
		if(onOff == false){
			return "OFF";
		}
		return nManufacturer + "\n" + "volume:" + "" + volume;
		
	
	
	}
}

