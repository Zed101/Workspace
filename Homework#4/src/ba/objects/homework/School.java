package ba.objects.homework;

public class School {
	private String name;
	private Director director;
	private SchoolClass[] arrayOfSC;
	
	public School(String name, Director director, SchoolClass[] arrayOfSC){
		this.name = name;
		this.director = director;
		this.arrayOfSC = arrayOfSC;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public SchoolClass[] getArrayOfSC() {
		return arrayOfSC;
	}

	public void setArrayOfSC(SchoolClass[] arrayOfSC) {
		this.arrayOfSC = arrayOfSC;
	}
}
