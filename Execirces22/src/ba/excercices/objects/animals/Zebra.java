package ba.excercices.objects.animals;

import ba.excercices.objects.Constants;
import ba.excercices.objects.plants.Cactus;
import ba.excercices.objects.plants.Plants;
import ba.excercices.objects.plants.Trees;
import ba.excercices.objects.plants.Weed;

public class Zebra extends Animal {

	private int age;
	private String stateOfZebra;

	public Zebra(boolean isAlive, int kg, String food, int healty, int age, String stateOfZebra) {
		super(isAlive, kg, food, healty);
		this.age = age;
		this.stateOfZebra = stateOfZebra;
	}

	public int getAges() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStateOfZebra() {
		return stateOfZebra;
	}

	public void setStateOfZebra(String state) {
		this.stateOfZebra = state;
	}

	@Override
	public void eat(Object food) {
		if (food instanceof Animal) {
			throw new UnsupportedOperationException("Zebras only eat plants"); // fish is animal also 
		}
		if(food instanceof Cactus){
			throw new UnsupportedOperationException(" Don't want to eat because is toxic");
		}
		if(food instanceof Trees){
			throw new UnsupportedOperationException("Zebras can't eat trees");
		}
		int healtyg = this.getHealty();
		if (food instanceof Plants || food instanceof Weed) {
			Plants p = (Plants) food;

			if (p.getIsAlive() == true) {
				
				if (p.getisToxic() == true) { // if plant is toxic, plant have level of toxic like utilization
					p.setIsAlive(false);
				
					if (p.equals(Constants.P_SMALL)) {
						this.setHealty(healtyg -= 20); // if utilization of plant is small healthy of animal decrease by 20

					}
					if (p.equals(Constants.P_MEDIUM)) {
						this.setHealty(healtyg -= 40); // if utilization of plant is small healthy of animal decrease by 40

					}

					if (p.equals(Constants.P_HIGH)) {
						this.setHealty(healtyg -= 60); // if utilization of plant is small  healthy of animal decrease by 60

					}
				}
				
		
		
				if (p.getisToxic() == false) {  // zebras usually eat weed(grass) =) and influence for health is significant this is for PLANTS GRNERALY and for WEED the same
					p.setIsAlive(false);

				
					if (p.getUtilization().equals(Constants.P_HIGH)) {
						this.setStateOfZebra(Constants.Z_HEALTHY);
						this.setHealty(healtyg += 30);// if utilization of plant is high healthy of zebra increase by 30

					}
					if (p.getUtilization().equals(Constants.P_SMALL)) {
						this.setStateOfZebra(Constants.Z_SICK);
						this.setHealty(healtyg += 10);// if utilization of plant is high healthy of zebra increase by 10
					}
					if (p.getUtilization().equals(Constants.P_MEDIUM)) {
						this.setHealty(healtyg += 20);// if utilization of plant is high healthy of zebra increase by 20
					}
					

					if (this.getHealty() < 30) { // after all check level healthy to set state of zebra
						this.setStateOfZebra(Constants.Z_DEADLY_ILL);
					} else if (this.getHealty() > 30 && this.getHealty() < 80) {
						this.setStateOfZebra(Constants.Z_SICK);
					} else if (this.getHealty() > 80) {
						this.setStateOfZebra(Constants.Z_HEALTHY);
					}
				}

			}
		}
	}

	@Override
	public String toString() {

		return "Zebra's age " + age + " " + "\n" + "Zebra's condition " + stateOfZebra + " " + super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zebra other = (Zebra) obj;
		if (age != other.age)
			return false;
		if (stateOfZebra == null) {
			if (other.stateOfZebra != null)
				return false;
		} else if (!stateOfZebra.equals(other.stateOfZebra))
			return false;
		return true;
	}
}
