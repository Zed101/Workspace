package ba.exercices.inheritance;

public class Laptop extends PortableComputer implements Information {
	private int batteryCells;
	private boolean bluetooth;
	private boolean numKeyboard;

	public Laptop(String oS, int RAM, int priceKM, double weight, int displaySizeInch, boolean wifi,int batteryCells, boolean bluetooth, boolean numKeyboard) {
		super(oS, RAM, priceKM, weight, displaySizeInch, wifi);
		this.batteryCells = batteryCells;
		this.bluetooth = bluetooth;
		this.numKeyboard = numKeyboard;
	}

	public int getBatteryCells() {
		return batteryCells;
	}

	public void setBatteryCells(int batteryCells) {
		this.batteryCells = batteryCells;
	}

	public boolean getBluetooth() {
		return bluetooth;
	}

	public void setBluetooth(boolean bluetooth) {
		this.bluetooth = bluetooth;
	}

	public boolean getNumKeyboard() {
		return numKeyboard;
	}

	public void setNumKeyboard(boolean numKeyboard) {
		this.numKeyboard = numKeyboard;
	}

	public String printInformation(){
		return "Baterry cells " + batteryCells + " " + "Bluetooth " + bluetooth + " " + "NUmeric keyboard " + numKeyboard + " " + super.printInformation();
	}
	@Override
	public void printTypeInfo() {
		System.out.println("A LAPTOP, often called a notebook, is a portable personal  " + "\n"
				+ "computer with a clamshell form factor, suitable for mobile use." + "\n"
				+ "A laptop combines the components and inputs of a desktop computer," + "\n"
				+ "including the display, speakers, a keyboard, and pointing devices " + "\n"
				+ "into a single unit");

	}
}
