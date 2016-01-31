package ba.practice.objects;

public class Main {

	public static void main(String[] args) {

		Student zeljka = new Student("Zeljka Miletovic", 3);
		Student boris = new Student("Boris Tomic", 2);
		Student s1 = new Student("Student propao 1", 2);
		Student s2 = new Student("Student propao 2", 2);
		Student s3 = new Student("Student propao 3", 2);
		
		Student[] students2 = new Student[2];
		students2[0] = zeljka;
		students2[1] = boris;
		
		
		Student[] students = new Student[5];
		students[0] = zeljka;
		students[1] = boris;
		students[2] = s1;
		students[3] = s2;
		students[4] = s3;
		
		Director disman = new Director("Disman Dico", 200, 1960);

		School fkks = new School("Fakultet", "Zmaja od Bosne", disman, students);

		System.out.println("Studenti: ");
		System.out.println(zeljka.toString() + "\n" + boris.toString());

		System.out.println();

		System.out.println("Direktor: ");
		System.out.println(disman.toString());

		System.out.println();

		System.out.println("Skola: ");
		System.out.println(fkks.toString());

		System.out.println();
		System.out.println();

		int minYear = 11;
		for (int i = 0; i < fkks.students.length; i++) {
			if(minYear > students[i].academicYear) {
				minYear = students[i].academicYear;
			}
		}
		
		for (int i = 0; i < students2.length; i++) {
			if(minYear == students[i].academicYear) {
				System.out.println(students[i].toString());
			}
		}
		
	}

}
