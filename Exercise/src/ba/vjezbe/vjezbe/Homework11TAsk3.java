package ba.vjezbe.vjezbe;

public class Homework11TAsk3 {

	public static void main(String[] args) {

		String s = "bora86";
		
		System.out.println(hasNumbers(s));
	}
	private static boolean hasNumbers (String s){
		char chara = ' ';
		for (int i = 0; i < s.length(); i++) {
			chara = s.charAt(i);
			if(chara == '0' || chara == '1' || chara == '2' || chara == '3' || chara == '4' || chara == '5' ||chara == '6' || chara == '7' || chara == '8' || chara == '9' ){
				return true;
			}
		}
				
		return false;
		
	}

}
