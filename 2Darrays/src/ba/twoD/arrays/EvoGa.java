package ba.twoD.arrays;

public class EvoGa {

	public static void main(String[] args) {
		int[][] TDArray = new int[][] {{1,2,3}, {1,2,3,4}, {1,2,3,4,5,6}};
		for (int i = 0; i < TDArray.length; i++) {
			for (int j = 0; j < TDArray[i].length; j++) {
				System.out.print(TDArray[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------");
	}

}
