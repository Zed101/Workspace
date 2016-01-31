package ba.excercices.zadaci;

import java.util.Arrays;

public class ReadInLine {

	public static void main(String[] args) {
		TextIO reader = new TextIO();
		reader.readFile("text.in");
		int[] array = new int[0];
		int counter1 = 2;
		int i = 0;
		int first = reader.getInt();	// because this method getAnychar take from file first number, because of that and before that, here I take that number
			
		
		

	


			while (reader.getAnyChar() != 10) {  // 10 in ASCII is end of line, this method getAnyChar returns all char in file including space and end of line
			
					int number = reader.getInt();
					i++;					

					array = Arrays.copyOf(array, counter1++);
					array[0] = first;  // give array on 0 index first number from file
					array[i] = number;
				System.out.println(Arrays.toString(array));
				
				
			}
		
	
			
		
	}

}
