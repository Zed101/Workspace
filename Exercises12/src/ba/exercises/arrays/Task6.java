package ba.exercises.arrays;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		// System.out.println(getArrayOrException(15));
		int i = 3;
		int v = 2;
		System.out.println(Arrays.toString(arrayLine(i, v)));
	}

	private static int[] arrayLine(int index, int values) {
		int[] array = new int[10];
		if (index < 0 || index > array.length -1){
			throw new IndexOutOfBoundsException("Index " + index + " dosen't exist");
		}
		for (int j = index; j < array.length; j++) {
			array[j] = values;
		}
		return array;

	}

	private static int getArrayOrException(int index) {
		int[] array = new int[15];
		if (index < 0 || index > array.length - 1) {
			throw new IndexOutOfBoundsException("Index " + index + " doesn't exist in array.");
		}
		return array[index];
	}

}
