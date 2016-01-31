package ba.exercises.arrays;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		
		String filename = "text2.in";
		System.out.println(Arrays.toString(stringCopy(filename)));

	}
	
	@SuppressWarnings("static-access")
	private static String[] stringCopy (String filename){
		String[] s = new String [0];
		TextIO reader = new TextIO();
		reader.readFile(filename);
		int counter = 1;
		int i = 0;
		while(!reader.eof()){
			String word = reader.getln();
			s = myCopy(s, counter++);
			s[i] = word;
			i++;
		}
		
		return s;
	}
	
	private static String[] myCopy (String[] array, int nl){
		String[] s = new String[nl];
		for (int i = 0; i < array.length; i++) {
			s[i] = array[i];
		}
		return s;
		
		
	}

}
