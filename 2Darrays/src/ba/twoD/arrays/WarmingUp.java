package ba.twoD.arrays;

import java.util.Scanner;

public class WarmingUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first row and than column");
		int[][] TDarray = new int[scan.nextInt()][scan.nextInt()];

		for (int i = 0; i < TDarray.length; i++) {
			for (int j = 0; j < TDarray[i].length; j++) {
				System.out.println("Enter value of row and than column");
				TDarray[i][j] = scan.nextInt();
			}
		}
		for (int i = 0; i < TDarray.length; i++) {
			for (int j = 0; j < TDarray[i].length; j++) {
				System.out.print(TDarray[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------------");
scan.close();
	}

}
