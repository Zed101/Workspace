package ba.twoD.arrays;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		TextIO reader = new TextIO();
		reader.readFile("matrix.in");
		int[][] array = new int[0][0];
		int row = reader.getInt();
		array = new int[row][0];
		int column = reader.getInt();
		array = new int[row][column];

		int rest = 0;



	
			//System.out.println(rest);
			for (int i = 0; i < array.length; i++) {
				
				for (int j = 0; j < array[i].length; j++) {
					rest = reader.getInt();
					array[i][j] = rest;
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------------------------");
			
		

		


	}

}
