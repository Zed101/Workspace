package ba.vjezbe.vjezbe;

public class Homework11Task4 {

	public static void main(String[] args) {
		int score = 66 ;
		int maxScore = 100;
		System.out.println(getPercentage(score, maxScore));
	}
private static double getPercentage (int score, int maxScore){
double subtraction = (double)maxScore / (double)score;
System.out.println(subtraction);
double divide = 100 / subtraction; 
return divide;

}
}
