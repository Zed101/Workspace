package ba.homework.objects;

public class Employee {
	private String name;
	private String gender;
	private int salary;
	
	public Employee(String name, String gender, int salary){
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}
	
	public String getNameOfEmployee(){
		return name;
	}
	public String getGenderOfEmployee(){
		return gender;
	}
	public int getSalaryOfEmployee(){
		return salary;
	}
	public void setSalaryOfEmployee(int salary){
		this.salary = salary;
	}
	
}
