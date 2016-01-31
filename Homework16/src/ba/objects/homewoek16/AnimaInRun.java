package ba.objects.homewoek16;

public class AnimaInRun {

	public static void main(String[] args) {
		Animal animal1 = new Animal("Ziva", Animal.DAY, Animal.LOT_WATER);
		
		System.out.println(animal1.getActivityOfAnimal());
		animal1.setEviroment();
		System.out.println(animal1.getActivityOfAnimal());
		animal1.setWater(Animal.LOT_WATER);
		System.out.println(animal1.getActivityOfAnimal());
		animal1.setEviroment();
		System.out.println(animal1.getActivityOfAnimal());
	}

}
