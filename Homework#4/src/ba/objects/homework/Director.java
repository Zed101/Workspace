package ba.objects.homework;

public class Director {
	private String name;
	private int yearOfB;
	
	public Director(String name, int yearOfB){
		this.name = name;
		this.yearOfB = yearOfB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfB() {
		return yearOfB;
	}

	public void setYearOfB(int yearOfB) {
		this.yearOfB = yearOfB;
	}
}
