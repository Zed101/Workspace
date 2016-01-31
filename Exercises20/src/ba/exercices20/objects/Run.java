package ba.exercices20.objects;

public class Run {

	public static void main(String[] args) {
		Loudspeaker speaker = new Loudspeaker("Sony", 10, 2);
		System.out.println(speaker.toString());
		speaker.enable();
		System.out.println(speaker.toString());
		speaker.volumeUP();
		speaker.volumeUP();
		System.out.println(speaker.toString());
	}

}
