package ba.weekend.bora;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter M");
		int M = scan.nextInt();
		int[] array1 = new int[M];
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Enter index value");
			int value = scan.nextInt();
			array1[i] = value;
		}
		System.out.println(Arrays.toString(array1));

		System.out.println("Enter N");
		int N = scan.nextInt();
		int[] array2 = new int[N];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Enter index value");
			int value = scan.nextInt();
			array2[i] = value;
		}
		//System.out.println(Arrays.toString(array2));

		//System.out.println(getArray(array1, array2));
		//System.out.println(Arrays.toString(getSumOfArrays(array1, array2)));
		System.out.println(Arrays.toString(getComibination(array1, array2)));
	}

	private static boolean getArray(int[] array1, int[] array2) {
		boolean boo = true;
		for (int i = 0; i < array1.length; i++) {
			int value1 = array1[i];
			int value2 = array2[i];
			if (value1 != value2) {
				boo = false;
				break;
			}
		}
		return boo;
	}

	private static int[] getSumOfArrays(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length];
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			int value1 = array1[i];
			int value2 = array2[i];
			sum = value1 + value2;
			array3 [i] = sum;
		}
	
		return array3;

	}
	private static int[] getComibination (int[] array1, int[] array2){
		int[] array3 = new int[array1.length + array2.length];
		
		for (int i = 0; i < array1.length; i++) {
			int value1 = array1[i];
			
			array3[i] += value1;
		}
		int k = 0;
		for (int i = array1.length; i < array3.length; i++) {
			
			int value2 = array2[k];
			k++;
			System.out.println(i + " i");
			array3[i] += value2;
		}
		return array3;
	}

}
