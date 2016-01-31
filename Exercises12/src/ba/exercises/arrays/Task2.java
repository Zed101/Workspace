package ba.exercises.arrays;

public class Task2 {

	public static void main(String[] args) {
		String s1 = "ajla";
		String s2 = "azra";
		String s3 = "aida";
		System.out.println(getFirst(s1, s2, s3));
	}
	private static String getFirst (String s1, String s2, String s3){
		
	
		if(s1.compareToIgnoreCase(s2) <= 0 && s1.compareToIgnoreCase(s3) <= 0){
			return s1;
		}
		if(s2.compareToIgnoreCase(s3) <= 0 && s2.compareToIgnoreCase(s1) <= 0){
			return s2;
		}
		if(s3.compareToIgnoreCase(s2) <= 0 && s3.compareToIgnoreCase(s1) <= 0){
			return s3;
		}
		
		return s3;
		
		
		
	}

}
