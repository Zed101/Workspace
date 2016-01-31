package ba.objects.homework;

public class Maker {

	public static void main(String[] args) {
		Director director = new Director("Boris", 1986);
		Director director2 = new Director("Zeljka", 1990);
		Director director3 = new Director("Joan", 1998);
		Director director4 = new Director("Horatio", 1989);
		SchoolClass class1 = new SchoolClass("V-1", 32);
		SchoolClass class3 = new SchoolClass("VIII", 27);
		SchoolClass class4 = new SchoolClass("I", 19);
		SchoolClass class2 = new SchoolClass("VII", 60);
		SchoolClass class5 = new SchoolClass("VII", 7);
		SchoolClass class6 = new SchoolClass("III", 56);
		SchoolClass[] array = new SchoolClass[] { class1, class2 };
		SchoolClass[] sCarray = new SchoolClass[] { class3, class4 };
		SchoolClass[] arrayOfClasses = new SchoolClass[] { class5, class6 };

		School school1 = new School("Ivan Goran Kovacic", director, array);
		School school2 = new School("Filip Lastric", director2, sCarray);
		School school3 = new School("Norbat2", director3, sCarray);
		School school4 = new School("Hemigvey", director4, arrayOfClasses);

		School[] arrayOfSchool = new School[] { school1, school2, school3, school4 };

		System.out.println(getOfClassWithTheMostsStudents(school1));

		System.out.println(getSchoolWithYoungiestDirector(arrayOfSchool) + " youngest director");
		System.out.println(getSchoolWithMoreStudents(school3, school4) + " this is school with more students");

	}
	/*
	 * Napisati metodu koja prima, kao parametre, dvije škole. Metoda vraća ime
	 * škole koja ima više učenika. Metoda: String
	 * getNameOfSchoolWithMoreStudents(School s1, School s2)
	 */

	public static String getSchoolWithMoreStudents(School s1, School s2) {

		int nS = 0;
		int nS2 = 0;

		for (int i = 0; i < s1.getArrayOfSC().length; i++) {
			nS += s1.getArrayOfSC()[i].getnOfStudent();
		}
		for (int i = 0; i < s2.getArrayOfSC().length; i++) {
			nS2 += s2.getArrayOfSC()[i].getnOfStudent();
		}
		if (nS > nS2) {

			return s1.getName();
		}

		return s2.getName();

	}

	/*
	 * Napisati metodu koja prima, kao parametar, niz škola. Metoda vraća školu
	 * koja ima najmlađeg direktora. Metoda: School
	 * getSchoolWithYoungestDirector(School[] schools)
	 */

	public static String getSchoolWithYoungiestDirector(School[] schools) {
		String name = "";
		int year = 0;

		for (int i = 0; i < schools.length; i++) {

			if (schools[i].getDirector().getYearOfB() > year) {
				year = schools[i].getDirector().getYearOfB();
				name = schools[i].getDirector().getName();

			}

		}
		return name;

	}

	/*
	 * Napisati metodu koja prima, kao parametar, jednu školu. Metoda vraća ime
	 * razreda koje ima najviše učenika. Metoda: String
	 * getNameOfClassWithTheMostStudents(School s)
	 */

	public static String getOfClassWithTheMostsStudents(School school) {
		String classOfS = "";
		int nOfS = 0;
		for (int i = 0; i < school.getArrayOfSC().length; i++) {

			if (school.getArrayOfSC()[i].getnOfStudent() > nOfS) {
				nOfS = school.getArrayOfSC()[i].getnOfStudent();
				classOfS = school.getArrayOfSC()[i].getName();

			}
		}
		return classOfS;
	}

}
