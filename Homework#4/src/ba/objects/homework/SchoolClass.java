package ba.objects.homework;

public class SchoolClass {
	private String name;
	private int nOfStudent;

	public SchoolClass(String name, int nOfStudent) {
		this.name = name;
		this.nOfStudent = nOfStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getnOfStudent() {
		return nOfStudent;
	}

	public void setnOfStudent(int nOfStudent) {
		this.nOfStudent = nOfStudent;
	}
}
