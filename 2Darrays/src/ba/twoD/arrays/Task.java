package ba.twoD.arrays;

import java.util.HashMap;
import java.util.Map;

public class Task {
	
	public static void main(String[] args) {
		
		/*
		 * 1.
		 * Napisati za prvih sto brojeva da ispisuje fizz ako je
		 * broj, djeljiv sa  3, buzz, ako je sa 5, fizzbuzz ako je i
		 * sa 3 i sa 5. Najefikasnije napisati.
		 * Dole je metoda.
		 */
		for (int i = 1; i <= 100; i++) {
			fizzBuzz(i);
		}
		
		/*
		 * 2. Sta se dobije kod ovih poredjenja, true ili false i zasto?
		 */
		long a = 5;
		long b = 5;
		Long c = 5L;
		Long d = new Long(5);
		
		System.out.println(a == b); // true, porede se primitivni long brojevi
		System.out.println(b == c); // true, poredi se primitivni long sa vrijednoscu objekta Long
		System.out.println(c == d); // false, porede se reference objekata Long u memoriji, a razlicite su
		System.out.println(c.equals(d)); // true, porede se vrijednosti u objektu Long
		
		/*
		 * 3. Kako najefikasnije prebrojati koliko se koja vrijednost ponavlja u ovom nizu.
		 */
		int[] array = { 2, 3, 5, 6, 8, 3, 5, 8, 0, 23, 5, 8, 4, 7, 2, 2, 9, 5 };
		
		Map<Integer, Integer> map = new HashMap<>(); // napravi se mapa, u kljuc ce se stavljati broj, a u vrijednost broj ponavljanja, kljuc je unikatan
		for (int i = 0; i < array.length; i++) { // samo jednom se prolazi kroz petju sto je efikasno
			if (map.get(array[i]) == null) { // ako na ovom indexu odnosno kljucu nema vrijednosti, onda se tek prvi put javio taj broj tako da se stavi 1
				map.put(array[i], 1);
			} else { // u suprotnom vec se javio ovaj kljuc i ima vec neku vrijednost, tako da je povecaj za jedan
				map.put(array[i], map.get(array[i]) + 1);
			}
		}
		System.out.println(map);
	}

	private static void fizzBuzz(int i) {
		if (i % 3 == 0 && i % 5 == 0) { // prvo se provjeri da li je i sa 3 i sa 5 jer je efikasnije nego da se dole pita je li djeljiv sa 3 a da ujedno nije sa 5 i obratno
			System.out.println("FizzBuzz");
		} else if (i % 3 == 0) { // onda se provjeri da li je djeljiv sa 3 jer je vise brojeva djeljivo sa 3 nego sa 5
			System.out.println("Fizz");
		} else if (i % 5 == 0) 
			System.out.println("Buzz");	
	}
	
	

}
