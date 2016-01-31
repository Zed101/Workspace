package second.day.objects.ba;

public class Bag {
	private double capacity;
	private double currentCapacity;
	
	public Bag(double capacity){
		this.capacity = capacity;
		this.currentCapacity = 0;
	}
	
	public  double getMaxCapaciy (){
		return capacity;
	}
	public double getCurrentCapacity(){
		return currentCapacity;
	}
	public double getFreeSpace (){
		return capacity - currentCapacity;
	}
	public double addStuff (double add){
		if(add + currentCapacity > capacity){
			throw new UnsupportedOperationException("You can't add that much");
		}
		return currentCapacity += add;
	}
	public void removeStuff (double remove){
		if(remove > currentCapacity){
			throw new UnsupportedOperationException("You cant't remove that much");
		}
		currentCapacity -= remove;
		
	}
}


