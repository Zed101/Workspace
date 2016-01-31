package ba.homework.objects;

public class Company {
	private String name;
	private Employee director;
	private Employee[] employees;

	public Company(String name, Employee director, Employee[] employees) {
		this.name = name;
		this.director = director;
		this.employees = employees;
	}

	public int getEmpoyees() {
		return employees.length;
	}

	public int getExpenceForEmployees(Employee[] salary) {
		int sumExpence = 0;
		for (int i = 0; i < salary.length; i++) {
			sumExpence += salary[i].getSalaryOfEmployee();
		}

		return sumExpence;
	}

	public int getFemaleEmployees(Employee[] allEmployee) {
		int counter = 0;
		for (int i = 0; i < allEmployee.length; i++) {
			if (allEmployee[i].getGenderOfEmployee().equals("F")) {
				counter++;
			}
		}
		if (director.getGenderOfEmployee().equals("F")) {
			counter++;
		}
		return counter;
	}

	public void setSalary(Employee[] allEmployee, int newSalary) {
		for (int i = 0; i < allEmployee.length; i++) {
			allEmployee[i].setSalaryOfEmployee(newSalary);
		}
	}

	@Override
	public String toString() {

		return "Name of companiy: " + name + "\n" + "Name of director: " + director.getNameOfEmployee() + "\n"
				+ "Number of employees: " + employees.length;
	}
}
