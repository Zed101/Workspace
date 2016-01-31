package ba.practice.objects;

public class Student implements UpdateYear {
	
	public Grade[] grades;
	public String name;
	public int academicYear;
	public Predmet[] predmeti;
	public Teacher[] teachers;
	
	public Student(String studentName, int academicYear) {
		this.name = studentName;
		this.academicYear = academicYear;
	}
	
	@Override
	public String toString() {
		return "Student name: " + name + "\nAcademic year: " + academicYear;
	}

	@Override
	public void changeYear(int year) {
		this.academicYear = year;
	}

}
