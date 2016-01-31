package ba.weekend.bora;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hour to get activity");
		int h = scan.nextInt();
		System.out.println(getActivity(h));
	}
	private static String getActivity (int h){
		switch(h){
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		return "Classes";
		case 14:
		case 15:
		case 16:
		case 17:
		return "Execirces";
		case 18:
		case 19:
		case 20:
		case 21:
		case 22:
		case 23:
		case 24:
		case 1:
		return "Homework";
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		return "Sleep";
		
		default:
			return "Error";
	
		}
		
	}

}
