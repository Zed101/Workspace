package ba.exercices.inheritance;

public class Workstation extends StationaryComputer implements Information {
	private int numberOfDisplays;
	private int nOfCoresProcessor;
	private boolean ECCmemory;
	
	public Workstation(String oS, int RAM, int priceKM,double gHz, int watts, int HDCapacity, int numberOfDisplays, int nOfCpresProcessor, boolean ECCmemory){
		super(oS, RAM, priceKM,gHz, watts, HDCapacity);
		this.numberOfDisplays = numberOfDisplays;
		this.nOfCoresProcessor = nOfCpresProcessor;
		this.ECCmemory = ECCmemory;
	}

	public int getNumberOfDislays() {
		return numberOfDisplays;
	}

	public void setNumberOfDisplays(int numberOfDisplays) {
		this.numberOfDisplays = numberOfDisplays;
	}

	public int getNOfCoresProcessor() {
		return nOfCoresProcessor;
	}

	public void setNOfCoresProcessor(int nOfProcessorCores) {
		this.nOfCoresProcessor = nOfProcessorCores;
	}

	public boolean getECCMemory() {
		return ECCmemory;
	}

	public void setEECMemory(boolean EECmemory) {
		this.ECCmemory = EECmemory;
	}

	public String printInformation(){
		return "Number of displays " + numberOfDisplays + " " + "Number of cores processor " + nOfCoresProcessor + " " + "ECC memory " + ECCmemory + " " + super.printInformation();
	}
	@Override
	public void printTypeInfo() {
		System.out.println("A WORKSTATION is a special computer designed for technical or scientific applications."
				+ "\n" + "Intended primarily to be used by one person at a time," + "\n"
				+ "they are commonly connected to a local area " + "\n"
				+ "network and run multi-user operating systems.");

	}
}
