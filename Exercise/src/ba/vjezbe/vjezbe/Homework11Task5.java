package ba.vjezbe.vjezbe;

public class Homework11Task5 {

	public static void main(String[] args) {
 String s = "234kh!.86:87.kh;87";
 System.out.println(getNumbersOnly(s));
 
	}
private static String getNumbersOnly (String s){
	String s1 = "";
	char chara = ' ';
	for (int i = 0; i < s.length(); i++) {
		chara = s.charAt(i);
		if(chara == '0' || chara == '1' || chara == '2' || chara == '3' || chara == '4' || chara == '5' || chara == '6' || chara == '7' || chara == '8' || chara == '9'){
			s1 += chara;
		}
	}
	return s1;
	
}
}
