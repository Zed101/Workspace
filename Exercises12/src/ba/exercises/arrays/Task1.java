package ba.exercises.arrays;

public class Task1 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "srce";
		System.out.println(merge(s1, s2));
		
	}
	private static String merge (String s1, String s2){
		String s3 = "";
		int l = s1.length()/2;
		String sb = s1.substring(l, s1.length());
		String se = s1.substring(0, l);
//		System.out.println(sb);
//		System.out.println(se);
		
		
	 s3 = se.concat(s2) + sb;
		
	

		
	
		
		return s3;
	}

}
