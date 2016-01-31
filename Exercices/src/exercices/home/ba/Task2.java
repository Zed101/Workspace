package exercices.home.ba;



public class Task2 {

	public static void main(String[] args) {
		int a = 2;
		System.out.println(getSurface(a));
	}
/**
 * 
 * @param a is a receives value of side of square
 * @return surface of square
 * @exception throw exception when is value of a negative
 */
	private static int getSurface (int a){
		if(a < 0){
			throw new IllegalArgumentException("Value of a " + a + "  is impossilble");
		}
		int surface;
		surface = a * a;
		surface = surface * surface;
		return  surface;
	}
}
