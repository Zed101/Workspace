package ba.excercices.objects.animals;

import ba.excercices.objects.LifeForm;

public abstract class Animal extends LifeForm {


	private int kg;
	private String food;
	private int healty;
	
	public Animal(boolean isAlive, int kg, String food, int healty){
		super(isAlive);
		this.kg = kg;
		this.food = food;
		this.healty = healty;
		if(healty > 100){
			this.healty = 100;
		}else if(healty <= 0){
			this.setIsAlive(false);
			this.healty = 0;
		
		}
	}
	
	
	public int getHealty(){
		return healty;
	}
	
	public void setHealty(int healty){
		this.healty = healty;
		
	}
	
	
	public int getKg(){
		return kg;
	}
	public void setKg(int kg){
		this.kg = kg;
	}
	
	
	public String getFood(){
		return food;
	}
	public void setFood(String food){
		this.food = food;
	}
	
	
	
	public abstract void eat(Object food);
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kg" + kg + " " + "\n" + "Food" + food  + " " + "\n";
		}
	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (food == null) {
			if (other.food != null)
				return false;
		} else if (!food.equals(other.food))
			return false;
		if (kg != other.kg)
			return false;
		return true;
	}
}
