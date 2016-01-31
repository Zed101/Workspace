package ba.exercices.inheritance;

public class Main {

	public static void main(String[] args) {

		DesktopComputer desk = new DesktopComputer("ubuntu", 4, 1000, 2.4, 500, 500, 2, false, false);
		//desk.printTypeInfo();
		System.out.println(desk.printInformation());
		Laptop lap = new Laptop("Win", 2, 1000, 2, 10, true, 2, true, true);
		//lap.printTypeInfo();
		System.out.println(lap.printInformation());
		PocketPC PDA = new PocketPC("Android", 2, 1000, 1, 10, true, true, true, true);
		//PDA.printTypeInfo();
		System.out.println(PDA.printInformation());
		Workstation station = new Workstation("win", 2, 1000, 2.4, 500, 10000, 2, 2, true);
		//station.printTypeInfo();
		System.out.println(station.printInformation());

	}

}
