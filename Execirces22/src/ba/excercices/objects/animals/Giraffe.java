package ba.excercices.objects.animals;

import ba.excercices.objects.Constants;
import ba.excercices.objects.plants.Cactus;
import ba.excercices.objects.plants.Plants;
import ba.excercices.objects.plants.Trees;
import ba.excercices.objects.plants.Weed;

public class Giraffe extends Animal {
	private int height;

	public Giraffe(boolean isAlive, int kg, String food, int healthy, int height) {
		super(isAlive, kg, food, healthy);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void eat(Object food) {
		int healthyg = this.getHealty();
		if(this.getHealty() > 0){
		if (food instanceof Animal) {
			throw new UnsupportedOperationException("Giraffe don't eat animals");
		}
		if (food instanceof Plants) {
			if(food instanceof Cactus){
					throw new UnsupportedOperationException("Don't want to eat that, because is toxic");
					}
						}
			if(food instanceof Weed){
				Weed w = (Weed) food;
				w.setIsAlive(false);
				if(w.getUtilization() == Constants.P_SMALL){
					this.setHealty(healthyg += 5); 
				}
				if(w.getUtilization() == Constants.P_MEDIUM){
					this.setHealty(healthyg += 10);
				}
				if(w.getUtilization() == Constants.P_HIGH){
					this.setHealty(healthyg += 15);
				}
			}
			if (food instanceof Trees) {
				Trees t = (Trees) food;
				if (t.getEatable() <= this.getHeight()) {
					t.setIsAlive(false);
					if(t.getUtilization() == Constants.P_SMALL){
						this.setHealty(healthyg += 5); 
					}
					if(t.getUtilization() == Constants.P_MEDIUM){
						this.setHealty(healthyg += 10);
					}
					if(t.getUtilization() == Constants.P_HIGH){
						this.setHealty(healthyg += 15);
					}
				}
			}
		
		}
	
	}
}
