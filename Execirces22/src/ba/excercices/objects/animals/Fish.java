package ba.excercices.objects.animals;

import ba.excercices.objects.Constants;
import ba.excercices.objects.plants.Cactus;
import ba.excercices.objects.plants.Plants;
import ba.excercices.objects.plants.Trees;
import ba.excercices.objects.plants.Weed;

public class Fish extends Animal {
	private boolean isToxic;

	public Fish(boolean isAlive, int kg, String food, int healty, boolean isToxic) {
		super(isAlive, kg, food, healty);
		this.isToxic = isToxic;
	}

	@Override
	public void eat(Object food) { // fish can eat other fishes or grass
		int h = this.getHealty();
		if(food instanceof Tiger || food instanceof Zebra || food instanceof Giraffe || food instanceof Bear || food instanceof Cactus){
			throw new UnsupportedOperationException("Fish can't eat that");
		}
		if (this.getHealty() > 0) {
			if (this.getFood().equals(Constants.EAT_ANIMALS)) {
				if (food instanceof Fish) {
					Fish f = (Fish) food;
					if (isToxic == false) {
						f.setIsAlive(false);
						this.setHealty(h += 20);
					}
				}
			}
			if (this.getFood().equals(Constants.EAT_PLANTS)) {
				if (food instanceof Plants) {
					if (food instanceof Trees) {
						throw new UnsupportedOperationException("Fish can't eat trees");
					}
					if (food instanceof Weed) {
						Weed w = (Weed) food;
						w.setIsAlive(false);
						if (w.getUtilization().equals(Constants.P_SMALL)) {
							this.setHealty(h += 5);
						} else if (w.getUtilization().equals(Constants.P_MEDIUM)) {
							this.setHealty(h += 10);
						} else if (w.getUtilization().equals(Constants.P_HIGH)) {
							this.setHealty(h += 15);
						}
					}
				}
			}
		}

	}

	public boolean isToxic() {
		return isToxic;
	}

	public void setToxic(boolean isToxic) {
		this.isToxic = isToxic;
	}
}
