package ba.twoD.arrays;

public class ThreeWarmingUp {
	
	 // Napisati metodu koja prima 2D niz i vrati iz metode sumu svih elemenata matrice.
	 

	public static void main(String[] args) {
		int[][] TDarray = new int [][] {{1,2,3}, {4,5,6}, {7,8,9,10} };
		System.out.println(sumOfMatrix(TDarray));
	}
	public static int sumOfMatrix (int[][] TDarray){
		int sum = 0;
		for (int i = 0; i < TDarray.length; i++) {
			for (int j = 0; j < TDarray[i].length; j++) {
				int b = TDarray[i][j];
				sum +=   b;
			}
		}
		return sum;
	}
}
