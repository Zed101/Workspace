package ba.objects.homewoek16;

public class Animal {

	public static final int NO_WATER = 0;
	public static final int LITTLE_WATER = 1;
	public static final int MEDIUM_WATER = 2;
	public static final int LOT_WATER = 3;

	public static final int DAY = 1;
	public static final int NIGHT = 2;

	private String name;
	private int activityOfAnimal;
	private int waterNeed;

	private int dayNight = DAY;
	private static int waterInEnviroment = LITTLE_WATER;

	public Animal(String name, int activityOfAnimal, int waterNeed) {
		this.name = name;
		this.activityOfAnimal = activityOfAnimal;
		this.waterNeed = waterNeed;

	}

	public String getActivityOfAnimal() {
		if (activityOfAnimal == dayNight && waterInEnviroment >= waterNeed) {
			return "It’s fine. The animal is active and has water";
		} else if (activityOfAnimal == dayNight && waterInEnviroment < waterNeed) {
			return "The animal is active, but does not have enough water.";
		} else if (activityOfAnimal != dayNight && waterInEnviroment >= waterNeed) {
			return "The animal is not active, but has enough water";
		} else if (activityOfAnimal != dayNight && waterInEnviroment < waterNeed) {
			return "The animal is not active and it does not have enough water.";
		}
		return "Error message";
	}
	public int setEviroment(){
		if(dayNight == DAY){
			dayNight = NIGHT;
			return dayNight;
		}
			dayNight = DAY;
			return dayNight;
	}
	public static void setWater(int water){
		waterInEnviroment = water;
	}

}
