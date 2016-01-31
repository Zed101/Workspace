package ba.weekend.bora;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int n = scan.nextInt();
		// getComma(n);
		// System.out.println(getNumberOfDigits(n));
		System.out.println(getReverse(n));
	}

	private static void getComma(int n) {
		String s = String.valueOf(n);
		String s1 = "";
		char chara = ' ';
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			chara = s.charAt(i);
			s1 += chara;
			counter++;
			if (counter == 3 && i != s.length() - 1) {
				s1 += ',';
				counter = 0;
			}
		}

		System.out.println(s1);
	}

	private static int getNumberOfDigits(int n) {
		String s = String.valueOf(n);
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {
			counter++;
		}
		return counter;
	}

	private static String getReverse (int n){
		String s = String.valueOf(n);
		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);
		
		s = s.substring(1, s.length() - 1);
		s += first;
		s = last + s;
	
		return s;
	}
}
