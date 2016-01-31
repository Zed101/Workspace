package ba.weekend.bora;

public class SmallGame {

	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.println(getZeros(array));
		//array = getRandomA(array);
		//System.out.println(getZeros(array));
		System.out.println(getIndex(array, 1));

	}

	private static int[] getRandomA(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 4) + 1;
		}
		return array;
	}

	private static boolean getZeros(int[] array) {
		boolean boo = true;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				boo = false;
				break;
			}
		}
		return boo;
	}

	private static int getIndex(int[] array, int n) {
		try {
			int value = array[n];
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[n]);
				if(n % 2 != 0){
					
				}
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
		}
		return 0;

	}
}
