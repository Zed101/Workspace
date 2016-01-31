package ba.vjezbe.vjezbe;

public class Homework11Task1 {

	public static void main(String[] args) {
		int n = 0;
		int n2 = 2;
		int n3 = 1;
		//System.out.println(getMin(n, n2));
		System.out.println(getMIn(n3, n2, n));

	}
	private static int getMin (int n, int n2){
		if(n < n2){
			return n;
		}
		return n2;
	}
	private static int getMIn (int n3, int n2, int n){
		int smallern = getMin(n, n2);
		if(smallern < n3){
			return smallern;
		}
		return n3;
	}

}
