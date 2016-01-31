package ba.twoD.arrays;

public class Task1 {

	public static void main(String[] args) {
		int[][] dArray = new int[][] { { 2, 1, 1 }, { -1, -1, 0 }, { 1, 0, 1 } };
		System.out.println(isSingular(dArray));
	}

	private static boolean isSingular(int[][] dArray) {
		boolean boo = false;

		int singular = (dArray[0][0] * dArray[1][1] * dArray[2][2]) + (dArray[0][1] * dArray[1][2] * dArray[2][0])
				+ (dArray[0][2] * dArray[1][0] * dArray[2][1]) - (dArray[0][2] * dArray[1][1] * dArray[2][0])
				- (dArray[0][0] * dArray[1][2] * dArray[2][1]) - (dArray[0][1] * dArray[1][0] * dArray[2][2]);
		if (singular == 0) {
			boo = true;
		}

		return boo;
	}
}
