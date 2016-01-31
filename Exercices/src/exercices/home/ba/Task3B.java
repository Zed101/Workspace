package exercices.home.ba;

import java.util.Arrays;

public class Task3B {

	public static void main(String[] args) {
		TextIO reader = new TextIO();
		reader.readFile("text.in");
		int[] array = new int[0];
		int counter1 = 1;
		int k = 0;
		int first = reader.getInt(); // because this method getAnychar take from
										// file first number, because of that
										// and before that, here I take that
										// number

		try {
			int counter = 2;
			int i = 0;

			while (!reader.eof()) { // 10 in ASCII is end of line, this method
									// getAnyChar returns all char in file
									// including space and end of line

				int number = reader.getInt();
				i++;

				array = Arrays.copyOf(array, counter++);
				array[0] = first; // give array on 0 index first number from
									// file
				array[i] = number;
			}

		} catch (Exception e) { // when numbers in file isn't in one line, here
								// it's throws exception

		}

		System.out.println(Arrays.toString(array));
	}

}
