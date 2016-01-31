package ba.exercices20.objects;

public class AntennaRun {

	public static void main(String[] args) {
		Antenna antena = new Antenna("zivkov toranj", 100);
		System.out.println(antena.Interaction(4, "SMS387654957542"));
		System.out.println(antena.toString());
		
		Display ekran = new Display("Samsung", 20);
		System.out.println(ekran.toString());
		ekran.displayON();
		System.out.println(ekran.toString());
		ekran.increeseBrightness();
		System.out.println(ekran.toString());
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		System.out.println(ekran.toString());
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		ekran.decreeseBrightness();
		System.out.println(ekran.toString());
		while(ekran.getBrightness() != 70 ){
			ekran.increeseBrightness();
		}
		System.out.println(ekran.toString() + "tamtara");
		
	}

}
