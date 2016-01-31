package ba.twoD.arrays;

public class Exercise {

	public static void main(String[] args) {
	 int[][] emptyArray = new int [0][2];
	 
	 for (int i = 0; i < emptyArray.length; i++) {
		for (int j = 0; j < emptyArray[i].length; j++) {
			System.out.print(emptyArray[i][j] + " ");
		}
		System.out.println();
	}
	 System.out.println("------------------------------------------------------------");
	}

}
