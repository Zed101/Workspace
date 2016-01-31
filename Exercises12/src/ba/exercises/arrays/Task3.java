package ba.exercises.arrays;

public class Task3 {

	public static void main(String args[]) {
		String s1 = "String";
		String s2 = "Int";
		System.out.println(getTheRest(s1, s2));

	}
private static String getTheRest (String s1, String s2){
	int rest = s1.indexOf(s2);
	if(rest == -1){
		return null;
	}
	return s1.substring(rest);

	
}
}
