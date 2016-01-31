package ba.thezadatak.loops;

public class Task {

	public static void main(java.lang.String[] args) {
		
		String s = "Samir Z.";
		s = s.replaceAll("\\s", "");
		System.out.println(s);
		s = s.toLowerCase();
		System.out.println(s);
		s += "grd";
		System.out.println(s);
	}

}
