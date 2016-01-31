package ba.practice.objects;

public class Director {
	
	public String name;
	public int pay;
	public int yearOfBirth;
	
	public Director(String name, int pay, int yearOfBirth) {
		this.name = name;
		this.pay = pay;
		this.yearOfBirth = yearOfBirth;
	}
	
	@Override
	public String toString() {
		return "Director name: " + name + "\nPay: " + pay + "\nBirthyear: " + yearOfBirth;
	}

}
