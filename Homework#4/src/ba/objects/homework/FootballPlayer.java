package ba.objects.homework;

public class FootballPlayer {
	private String name;
	private int yearOfBirth;
	private String position;
	
	public FootballPlayer(String name, int yearOfBirth, String position){
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public String getposition() {
		return position;
	}

	public void setposition(String position) {
		this.position = position;
	}
}
