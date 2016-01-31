package ba.practice.objects;

import java.util.Arrays;

public class School {
	
	public String name;
	public String address;
	public Director director;
	public Student[] students;
	public Teacher[] teachers;
	
	
	public School(String name, String address, Director director, Student[] students) {
		this.name = name;
		this.address = address;
		this.director = director;
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		String s = "";
		s += "School name: " + name;
		s += "\nAddress: " + address;
		s += "\nDirector: " + director.toString();
		s += "\nStudents: " + Arrays.toString(students);
		return s;
	}

}
