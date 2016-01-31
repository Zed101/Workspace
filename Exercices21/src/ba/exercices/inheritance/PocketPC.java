package ba.exercices.inheritance;

public class PocketPC extends PortableComputer implements Information {
	private boolean haveTouch;
	private boolean haveSIMslot;
	private boolean haveMicroSD;

	public PocketPC(String oS, int RAM, int priceKM,double weight, int displaySizeInch, boolean wifi,boolean haveTouch, boolean haveSIMslot, boolean haveMicroSD){
		super(oS, RAM, priceKM, weight, displaySizeInch, wifi);
		this.haveTouch = haveTouch;
		this.haveMicroSD = haveMicroSD;
		this.haveSIMslot = haveSIMslot;
	}
	public boolean getHaveTouch() {
		return haveTouch;
	}

	public void setHaveTouch(boolean haveTouch) {
		this.haveTouch = haveTouch;
	}

	public boolean getHaveSIMslot() {
		return haveSIMslot;
	}

	public void setHaveSIMslot(boolean haveSIMslot) {
		this.haveSIMslot = haveSIMslot;
	}

	public boolean getHaveMicroSD() {
		return haveMicroSD;
	}

	public void setHaveMicroSD(boolean haveMicroSD) {
		this.haveMicroSD = haveMicroSD;
	}
	public String printInformation(){
		return "Touch screenn " + haveTouch + " " + "SIM slot " + haveSIMslot + " " + "MicroSD " + haveMicroSD + " " + super.printInformation();
	}

	@Override
	public void printTypeInfo() {
		System.out.println(
				"POCKET PC is a hardware specification for a handheld-sized smartphone or personal digital assistant (PDA)" + "\n"
						+ "It has some of the abilities of modern desktop PCs." + "\n"
						+ "Some of these devices are also mobile phones, can be used with " + "\n"
						+ "many add-ons such as GPS receivers, barcode readers," + "\n"
						+ "RFID readers, and cameras.");

	}
}
