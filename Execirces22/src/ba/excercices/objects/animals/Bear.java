package ba.excercices.objects.animals;

import ba.excercices.objects.Constants;
import ba.excercices.objects.plants.Cactus;
import ba.excercices.objects.plants.Plants;
import ba.excercices.objects.plants.Trees;
import ba.excercices.objects.plants.Weed;

public class Bear extends Animal {
	private boolean isBearHibernate;

	public Bear(boolean isAlive, int kg, String food, int healthy, boolean isBearHibernate) {
		super(isAlive, kg, food, healthy);
		this.isBearHibernate = isBearHibernate;
	}

	public boolean getIsBearHibernate() {
		return isBearHibernate;
	}

	public void setIsBearHibernate(boolean isHibernate) {
		this.isBearHibernate = isHibernate;
	}

	@Override
	public void eat(Object food) {
		if (this.isBearHibernate == true) {
			throw new UnsupportedOperationException(" Bear is in hibernation and can't eat");
		}
		int healthy = this.getHealty();
		
		if (this.getIsBearHibernate() == false) {
			if (this.getHealty() > 0) {
				
				if (food instanceof Animal) {
					if(food instanceof Fish){
						System.out.println("jojoij");
						Fish f = (Fish) food;
						
						if(f.isToxic() == false){
						f.setIsAlive(false);
						if(f.getHealty() > 40 && f.getHealty() < 70){
							this.setHealty(healthy += 30);
						}else if(f.getHealty() > 70){
							this.setHealty(healthy += 40);
						}else if(f.getHealty() < 40){
							this.setHealty(healthy += 20);
						}
					}
						if(f.isToxic() == true){
						f.setHealty(healthy /2);
					}
					}
					
					if(food instanceof Tiger){
						Tiger t = (Tiger) food;
						int random = (int)(Math.random() * 2) + 1;
						System.out.println(random + " random broj");
						if(random == 1){
							this.setIsAlive(false); // tiger kill bear
							
						}else{
							t.setIsAlive(false);
							this.setHealty(100); // bear kill tiger gets on health 100
						}
					}
					
					if (food instanceof Zebra) { // if food is zebra bear have the same benefits like tiger
						Zebra z = (Zebra) food;
						if (z.getStateOfZebra().equals(Constants.Z_HEALTHY)) {
							int p = z.getKg() / 10;
							this.setHealty(healthy += p);
							z.setIsAlive(false);
						}
						if (z.getStateOfZebra().equals(Constants.Z_SICK)) {
							this.setHealty(healthy / 2);
							z.setIsAlive(false);
						}
						if (z.getStateOfZebra().equals(Constants.Z_DEADLY_ILL)) {
							this.setHealty(0);
							z.setIsAlive(false);
						}

					}
				}
				
			
				if(food instanceof Plants || food instanceof Weed){
					Plants p = (Plants) food;
					if(food instanceof Trees){
						Trees t = (Trees) food;
						if(t.getisToxic() == false){
							t.setIsAlive(false);
							if(t.getUtilization() == Constants.P_SMALL){
								this.setHealty(healthy += 5); 
							}
							if(t.getUtilization() == Constants.P_MEDIUM){
								this.setHealty(healthy  += 10);
							}
							if(t.getUtilization() == Constants.P_HIGH){
								this.setHealty(healthy += 15);
							}
						}
						if(t.getisToxic() == true){
							throw new UnsupportedOperationException(" Don't eat that because is toxic");
						}
					}
					if(p.getisToxic() == true){ //if plant is toxic everything is same like zebra's have
						p.setIsAlive(false);
						if(p instanceof Cactus){
							throw new UnsupportedOperationException(" Don't want to eat because is toxic");
						}
						if(p.getUtilization().equals(Constants.P_SMALL)){
							this.setHealty(healthy -= 20);
						}
						if(p.getUtilization().equals(Constants.P_MEDIUM)){
							this.setHealty(healthy -= 40);
						}
						if(p.getUtilization().equals(Constants.P_HIGH)){
							this.setHealty(healthy -= 60);
						}
		
					}
					if(p.getisToxic() == false){ // if none toxic plant everything is same like zebra's have
						p.setIsAlive(false);
						if(p.getUtilization().equals(Constants.P_HIGH)){
							this.setHealty(healthy += 30);
						}
						if(p.getUtilization().equals(Constants.P_MEDIUM)){
							this.setHealty(healthy += 20);
						}
						if(p.getUtilization().equals(Constants.P_SMALL)){
							this.setHealty(healthy += 10);
						}
						
						
					}
				}
			}
		}
		
	

	}
	
	@Override
	public String toString() {
	
		return "Is baear in hibernate: " + isBearHibernate + "\n" + " Healthy of bear " + super.toString();
	}
	

}
