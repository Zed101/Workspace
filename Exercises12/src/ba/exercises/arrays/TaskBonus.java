package ba.exercises.arrays;

import java.util.Arrays;

public class TaskBonus {
	public static void main(String[] args) {

		String file1 = "dusi1.txt";
		String file2 = "dusi2.txt";

				
		String[] s1 = readFromFile(file1);
	
		String[] s2 = readFromFile(file2);
	
		System.out.println(Arrays.toString(combineTwoArrays(s1, s2)));
		/*
		 * Napisati metodu koja prima jedan String kao ime filea, a vraca niz
		 * String sa procitanim textom. Nepoznata je duzina filea i niza koji ce se 
		 * ispisati. Niz se mora povecavati kao u onom zadatku od juce.
		 * npr. 
		 * private static String[] readFromFile(String fileName)
		 * 
		 * 
		 * Napisati drugu metodu koja ce spojiti dva niza Stringova u jedan 
		 * npr.
		 * private static String[] combineTwoArrays(String[] s1, String[] s2)
		 * 
		 */

	}
	private static String[] readFromFile(String file1){
		 TextIO reader = new TextIO();
		 reader.readFile(file1);
		 String[] array = new String[0];
		 int counter = 1;
		 int i = 0;
		 while(!reader.eof()){
			 String s = reader.getln();
			 array = Arrays.copyOf(array, counter++);
			 array[i] = s;
			 i++;
		  }
		return array;
		
		}
	
	private static String[] combineTwoArrays(String[] s1, String[] s2){
		String[] s3 = new String[s1.length + s2.length];
		int j = 0;
		for (int i = 0; i < s3.length; i++) {
			if(i < s1.length){
				s3[i] = s1[i];
			}else{
				s3[i] = s2[j];
				j++;
			}
		}
	
	
		return s3;
	}

}
