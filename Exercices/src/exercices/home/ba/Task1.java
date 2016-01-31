package exercices.home.ba;

import java.util.Arrays;

public class Task1 {
	/*
	 * Procitati brojeve iz filea i spasiti ih u niz int tipa. Nepoznata je
	 * velicina niza tj. ne zna se koliko brojeva ima u fileu. Kada se procita i
	 * spasi u niz provjeriti da li u nizu ima brojeva koji su palindromi. Sve
	 * palindrome iz tog prvog niza spasiti u drugi niz koji ce sadrzavtati samo
	 * palindrome. Njegova pocetna velicina je takodjer nula.
	 * 
	 * primjer.
	 * 
	 * 
	 * String fileName = "numbers.in"; int[] array =
	 * getNumbersFromFile(fileName); // napisati metodu int[] palindromeArray =
	 * getPalindromeNums(array); // napisati metodu, prima array, vraca array
	 * 
	 * 
	 * brojevi za ubaciti u file 2346 98375 1221 6336 9575 292292 67 2840 8474
	 * 35653 9378 8734 942
	 */
	public static void main(String[] args) {
		String fileName = "text.in";
		int[] array = getNumbers(fileName);
		System.out.println(Arrays.toString(getPalindroms(array)));

	}

	private static int[] getNumbers(String fileName) {
		TextIO reader = new TextIO();
		reader.readFile(fileName);// telling reader to read from my file
		int[] array = new int[0];
		int counter = 1;
		int i = 0;
		while (!reader.eof()) { // read file to the end of file
			int n = reader.getlnInt();
			array = Arrays.copyOf(array, counter++); // use method to copy array and give to that array new length
			array[i] = n; // little self-make loop for writhing in array
			i++;
		}
		return array;

	}

	private static int[] getPalindroms(int[] array) {
		String palindrom = "";
		int c = 1;
		int k = 0;
		int[] arrayp = new int[0];
		for (int i = 0; i < array.length; i++) {
			int number = array[i];
	
		
			palindrom= "";
			while (number != 0) {

				palindrom += number % 10;
				number = number / 10;


				}
			int p = Integer.parseInt(palindrom);
			
			if (p == array[i]) {
				arrayp = Arrays.copyOf(arrayp, c++);
				arrayp[k] = p;
				k++;
			
			}
		
	
			
			

		}
		return arrayp;
	}
}
