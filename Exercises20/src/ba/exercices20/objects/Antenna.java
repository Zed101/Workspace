package ba.exercices20.objects;

public class Antenna {
	private String name;
	private int reception;
	private int batteryConsumption;

	public Antenna(String name, int batteryConsumption) {
		this.name = name;
		this.batteryConsumption = batteryConsumption;
		reception = 4;
	}

	public String getNameOfMANAntenna() {
		return name;
	}

	public int getReceptionLevel() {
		return reception;
	}

	public void setReception(int reception) {
		if (reception > 4 || reception < 0) {
			throw new UnsupportedOperationException("Wrong value");
		}
		this.reception = reception;
	}

	public boolean Interaction(int signal, String typeOfInteraction) {

		if (signal != this.reception) {
			return false;
		} else
			if (!typeOfInteraction.substring(0, 3).equals("CAL") && !typeOfInteraction.substring(0, 3).equals("SMS")) {
			return false;
		} else if (!typeOfInteraction.substring(3, 6).equals("387")) {
			return false;
		}else if(typeOfInteraction.substring(3).length() < 11){
			return false;
		}

		return true;
	}
	@Override
	public String toString() {
		return "Name of manufacturer: " + name + "\n" + "Level of reception: " +reception;
	}
}
