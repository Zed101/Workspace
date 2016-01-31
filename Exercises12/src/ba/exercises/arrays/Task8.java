package ba.exercises.arrays;

import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {
		String text = "text.in";
		System.out.println(Arrays.toString(fromFile(text)));
	}

	@SuppressWarnings("static-access")
	private static int[] fromFile(String text) {
		TextIO reader = new TextIO();
		reader.readFile(text);
		int[] array = new int[0];
		
		int i = 0;
		int counter = 1;
		while (!reader.eof()) {
			int numbers = reader.getlnInt();
			array = Arrays.copyOf(array, counter++);
			array[i] = numbers;
			i++;
		}	
		return array;
	}

}
