package ba.excercices.zadaci;


public class Task1 {

	public static void main(String[] args) {
		int a = 5;
		int  b = 3;

		int[][] array = fillArray(a, b);

	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	

	
	private static int[][] fillArray (int a, int b){
		int[][] array = new int[a][b];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 10)+1;
			}
		}
		
		return array;
	}

}
