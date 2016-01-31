package ba.objects.homework;

public class RunAuthorsBook {

	public static void main(String[] args) {

		Book bookPk1 = new Book("Eleven Minutes", 2003, "novel", true);
		Book bookPk2 = new Book("Aleph", 2010, "novel", true);
		Book bookPk3 = new Book("Veronika Decides to die", 1998, "novel", true);
		Book bookPk4 = new Book("The Fifth Mountain", 1996, "drama", true);
		Book bookPk5 = new Book("Manual of the Warrior of Light", 1997, "selfhelp", false);
		Book bookPk6 = new Book("The Pilgrimage", 1987, "philosophy", false);

		Book[] arrayPC = new Book[] { bookPk1, bookPk2, bookPk3, bookPk4, bookPk5, bookPk6 };

		Book bookHh1 = new Book("Siddhartha", 1922, "novel", true);
		Book bookHh2 = new Book("Demian", 1919, "drama", true);
		Book bookHh3 = new Book("Gertrud ", 1910, "tragedy", false);

		Book[] arrayHh = new Book[] { bookHh1, bookHh2, bookHh3 };

		Author hermanHese = new Author("Herman Hese", 1887, arrayHh);
		Author pauloCoelho = new Author("Paulo Coelho", 1947, arrayPC);

		Author[] authors = new Author[] { hermanHese, pauloCoelho };

		// System.out.println(countBestSellinBooks(pauloCoelho) + "
		// bestsellers");
		// System.out.println(getnumberOfWrittenBooks(pauloCoelho, 1997, 2000) +
		// " books between these years");
		System.out.println(getAuthorWithMostBestssellers(authors));
	}

	/*
	 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar,
	 * niz autora. Metoda vraća autora koji je autor imao najviše bestsellera iz
	 * datog niza autora. Metoda: Author getAuthorWithMostBestsellers(Author[]
	 * authors)
	 */
	public static Author getAuthorWithMostBestssellers(Author[] authors) {
		Author author = null;
		int c = 0;
		int max = 0;
		boolean first = true;
		
		for (int i = 0; i < authors.length; i++) {
			for (int j = 0; j < authors[i].getauthorsBooks().length; j++) {

				if (authors[i].getauthorsBooks()[j].getisBestseller() == true) {
					c++;
					System.out.println(c + " prvi if");
				}
			}
			if(first){
				max = c;
				author = authors[i];
				first = false;
			}
			if(c > max){
				max = c;
				author = authors[i];
			}
			c = 0;

		}
		return author;

	}

	/*
	 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre,
	 * jednog autora i dvije godine. Metoda vraća broj koji odgovara broju
	 * knjiga objavljenih između date dvije godine (uključujući obije) od strane
	 * datog autora. Metoda: int getNumberOfWrittenBooks(Author a, int year1,
	 * int year2)
	 */
	public static int getnumberOfWrittenBooks(Author author, int year1, int year2) {
		int counter = 0;
		int publish = 0;
		for (int i = 0; i < author.getauthorsBooks().length; i++) {

			publish = author.getauthorsBooks()[i].getyearOfPublish();

			if (publish >= year1 && publish <= year2) {
				counter++;

			}

		}
		return counter;
	}

	public static int countBestSellinBooks(Author books) {
		int counter = 0;
		for (int i = 0; i < books.getauthorsBooks().length; i++) {
			if (books.getauthorsBooks()[i].getisBestseller() == true) {
				counter++;

			}
		}
		return counter;
	}

}
