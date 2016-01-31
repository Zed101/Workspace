package ba.vjezbe.vjezbe;

import java.util.Scanner;

public class Homework11Task2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your score");
		int score = scan.nextInt();
		System.out.println(getGrade(score));
		scan.close();
	}
	public static char getGrade (int score){
		
		
		if(score < 54){
			return 'F';
		}
		switch (score) {
		
		case 54:
		return 'F';
		
		
		case 55:
		case 56:
		case 57:
		case 58:
		case 59:
		case 60:
		case 61:
		case 62:
		case 63:
		
			return 'V';
		
		case 64:	
		case 65:
		case 66:
		case 67:
		case 68:
		case 69:
		case 70:
		case 71:
		case 72:
		case 73:
		return 'D';
		
		case 74:	
		case 75:
		case 76:
		case 77:
		case 78:
		case 79:
		case 80:
		case 81:
		case 82:
		case 83:
			return 'C';
		
		case 84:	
		case 85:
		case 86:
		case 87:
		case 88:
		case 89:
		case 90:
		case 91:
		case 92:
		case 93:
		return 'B';
		
		case 94:	
		case 95:
		case 96:
		case 97:
		case 98:
		case 99:
		case 100:
		return 'A';
		
		
		
		
		
		default:
			return '1';
		}
	}

}
