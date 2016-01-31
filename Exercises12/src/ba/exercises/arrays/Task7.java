package ba.exercises.arrays;

import java.util.Arrays;

public class Task7 {

	public static void main(String[] args) {

		int length = 867;
		int fil = 46;
		System.out.println(Arrays.toString(fillArray(length, fil)));
	}

	private static int[] fillArray(int length, int fill) {
		int[] array = new int[length];
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = counter;
			counter++;
			if (counter > fill) {
				counter = 1;
			}
		}
		return array;
	}

}
