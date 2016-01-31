package second.day.objects.ba;

public class MainForMethods {

	public static void main(String[] args) {
		 Bag newBag = new Bag(40);
		 System.out.println(newBag.getMaxCapaciy());
		 newBag.addStuff(20);
		 //newBag.addStuff(30);
		 System.out.println(newBag.getFreeSpace());
		 newBag.addStuff(20);
		 System.out.println(newBag.getFreeSpace());
		 System.out.println(newBag.getCurrentCapacity() + " current capacity");
		 newBag.removeStuff(10);
		 System.out.println(newBag.getCurrentCapacity() + " after remove");
		 
	}
	

}
