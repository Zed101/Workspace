package ba.weekend.bora;

public class Task3 {

	public static void main(String[] args) {
		String s1 = "bbyteo";
		String s2 = "tbybeo";
		// getMixed(s1, s2);
		// System.out.println(getLetterCheck(s1, s2));
		// getABC(s1, s2);
		getAnagrams(s1, s2);
	}

	private static void getAnagrams(String s1, String s2) {
		int counter = 0;
		int counter1 = 0;
		boolean boo = false;
		if (s1.length() == s2.length()) {
			boo = false;
			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						counter++;
						boo = true;
						
					}
					
				}
				if(!boo){
				break;	
				}
			}
			
			System.out.println(counter);
			for (int i = 0; i < s2.length(); i++) {
				boo = false;
				for (int j = 0; j < s1.length(); j++) {
					if(s2.charAt(i) == s1.charAt(j)){
						counter1 ++;
						boo = true;
					}
				
				}
				if(!boo){
					break;
				}

			}
			System.out.println(counter1);
			if(!boo){
				System.out.println("not anagrams");
			}
			if(counter1 == counter && boo){
				System.out.println("anagrams" +boo);
			}

		}
		

	}

	private static void getABC(String s1, String s2) {

		int string = s1.compareTo(s2);
		if (string == 0) {
			System.out.println("Strings are identical");
		} else if (string >= -1) {
			System.out.println(s1);
		} else if (string <= 1) {
			System.out.println(s2);
		}
	}

	private static boolean getLetterCheck(String s1, String s2) {
		boolean boo = false;
		if (s1.length() > s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				boo = false;

				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						boo = true;
						break;
					}
				}
				if (!boo) {
					return boo;
				}
			}
		}
		if (s2.length() > s1.length()) {
			for (int i = 0; i < s2.length(); i++) {
				boo = false;
				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j) == s2.charAt(i)) {
						boo = true;
						break;
					}
				}
			}
		}
		return boo;

	}

	private static void getMixed(String s1, String s2) {
		if (s1.length() > s2.length()) {
			for (int i = 0; i < s1.length(); i++) {
				System.out.println(s1.charAt(i));
				if (i < s2.length()) {
					System.out.println(s2.charAt(i));
				}
			}

		} else if (s2.length() > s1.length()) {

			for (int i = 0; i < s2.length(); i++) {
				System.out.println(s2.charAt(i));
				if (i < s1.length()) {
					System.out.println(s1.charAt(i));
				}
			}
		}

		else {
			for (int j = 0; j < s1.length(); j++) {
				System.out.println(s1.charAt(j));
				System.out.println(s2.charAt(j));
			}
		}

	}

}
