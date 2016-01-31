package ba.homework.objects;

public class Main {

	public static void main(String[] args) {
		Employee empoloyee1 = new Employee("John", "M", 500);
		Employee empoloyee2 = new Employee("Maria", "F", 500);
		Employee empoloyee3 = new Employee("Ian", "M", 500);
		Employee empoloyee4 = new Employee("Samantha", "F", 500);
		Employee empoloyee5 = new Employee("Anna", "F", 500);
		Employee director = new Employee("Deborah", "M", 900); 
		Employee[] allEmployee = new Employee[]{empoloyee1, empoloyee2, empoloyee3, empoloyee4, empoloyee5};
		
		Company company1  = new Company("Zen", director, allEmployee);
		
		System.out.println(company1.getEmpoyees() + " number of employees");
		System.out.println(company1.getExpenceForEmployees(allEmployee) + " expences for employees");
		System.out.println(company1.getFemaleEmployees(allEmployee) + " number of female employees");
		company1.setSalary(allEmployee, 700);
		System.out.println(company1.getExpenceForEmployees(allEmployee) + " expences after raise");
		
		System.out.println(company1.toString());
		

}
}
