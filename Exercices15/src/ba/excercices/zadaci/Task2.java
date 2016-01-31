package ba.excercices.zadaci;

public class Task2 {

	public static void main(String[] args) {
		boolean boo = true;
		int[][] array = new int[][]{{1,2,3,4},{5,6,7,8},{1, 2, 3, 4},{5,6,7,8}};
		int[][] array1 = reverseArray(array, boo); 
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
	}
	
	private static int[][] reverseArray (int[][] array, boolean boo){
		int[][] e = new int [0][0];
		if(boo == false){
			return array;
			}
		if(boo == true){
			for (int i = array.length -1; i >= 0; i--) {
				for (int j = array[i].length-1; j >= 0; j--) {
				System.out.print(array[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("_______________________");
			
		}
		
		return e;
	}
}
