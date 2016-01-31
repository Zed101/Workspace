package ba.exercices.inheritance;

public class DesktopComputer extends StationaryComputer implements Information {
	private int slotsForRAM;
	private boolean overclock;
	private boolean opticalDrive;

	public DesktopComputer(String oS, int RAM, int priceKM,double gHz, int watts, int HDCapacity, int slotForRAM, boolean overclock, boolean opticalDrive) {
			super(oS, RAM, priceKM, gHz, watts, HDCapacity);
		this.slotsForRAM = slotForRAM;
		this.overclock = overclock;
		this.opticalDrive = opticalDrive;
	}

	public int getSlotsForRAM() {
		return slotsForRAM;
	}

	public void setSlotsFirRAM(int slotsForRAM) {
		this.slotsForRAM = slotsForRAM;
	}

	public boolean getOverclock() {
		return overclock;
	}

	public void setOverclock(boolean overclock) {
		this.overclock = overclock;
	}

	public boolean getOpticalDrive() {
		return opticalDrive;
	}

	public void setOpticalDrive(boolean opticalDrive) {
		this.opticalDrive = opticalDrive;
	}
	
	public String printInformation(){
		return "slotsForRAM " + slotsForRAM + "" + "overclock" + overclock + "" + "Optical Drive" + opticalDrive + "" + super.printInformation();
	}

	@Override
	public void printTypeInfo() {
		System.out.println("A DESKTOP COMPUTER is a personal computer designed for regular use "
				+ "\n" + "at a single location on or near a desk or table due to its size and power requirements.");

	}
}
