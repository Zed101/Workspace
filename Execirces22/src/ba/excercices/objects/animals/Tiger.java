package ba.excercices.objects.animals;

import ba.excercices.objects.Constants;
import ba.excercices.objects.plants.Plants;

public class Tiger extends Animal {

	private int speed;
	private String state;

	public Tiger(boolean isAlive, int kg, String food, int healty, int speed, String state) {
		super(isAlive, kg, food, healty);
		this.speed = speed;
		this.state = state;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void eat(Object food) {
		int healtyg = this.getHealty();
		if (state.equals(Constants.T_HUNTING)) {
			if (this.getHealty() > 0) {
				if (food instanceof Tiger) {
					throw new UnsupportedOperationException("Tigers dont't eat other tigers");
				}
				if (food instanceof Plants) {
					throw new UnsupportedOperationException(" Tigers don't eat plants"); // Cactus
																							// and
																							// Weed
																							// is
																							// instance
																							// of
																							// plants
				}
				if (food instanceof Animal) {

					if (food instanceof Fish) {
						System.out.println("jojoij");
						Fish f = (Fish) food;

						if (f.isToxic() == false) {
							f.setIsAlive(false);
							if (f.getHealty() > 40 && f.getHealty() < 70) {
								this.setHealty(healtyg += 20);
							} else if (f.getHealty() > 70) {
								this.setHealty(healtyg += 30);
							} else if (f.getHealty() < 40) {
								this.setHealty(healtyg += 10);
							}
						}
						if (f.isToxic() == true) {
							f.setHealty(healtyg / 2);
						}
					}

					if (this.getHealty() <= 0) {

						if (food instanceof Zebra) {
							Zebra z = (Zebra) food;

							if (z.getStateOfZebra().equals(Constants.Z_DEADLY_ILL)) {
								this.setIsAlive(false);
								z.setIsAlive(false);

							}
							if (z.getStateOfZebra().equals(Constants.Z_HEALTHY)) {

								int p = z.getKg() / 10; // if zebra healthy
														// tiger
														// gets on healthy 10%
														// of
														// zebra kg

								z.setIsAlive(false);
								this.setState(Constants.T_EAT);
								this.setHealty(healtyg += p);
							}
							if (z.getStateOfZebra().equals(Constants.Z_SICK)) {
								z.setIsAlive(false);
								this.setState(Constants.T_REST);
								this.setHealty(healtyg / 2); // if zebra sick
																// tiger
																// lose 1/2 of
																// his
																// health
							}
						}
					}
				}
			}
		}
	}

	@Override
	public String toString() {

		return "Name of animal Tigar " + "\n" + " Speed " + speed + " " + "\n" + "State " + state + " "
				+ super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		if (speed != other.speed)
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}
}
