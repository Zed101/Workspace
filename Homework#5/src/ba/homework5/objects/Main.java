package ba.homework5.objects;

public class Main {

	public static void main(String[] args) {
		Character c = new Character("Ziva", "F", true, false);
		/*
		 * This violent dog make trouble every day, not just for hers owners but
		 * also all neighborhood and whole city. This speech is about very
		 * skillful dog, very smart but all in vain crazy.
		 * One day hers owners decide to correct hers behavior and
		 * revenge for all pain they suffered, using help of local
		 * neighborhood dog Medjad.
		 */
	
		Character c2 = new Character("Boris", "M", true, true);/*
		 * Boris plan was that knot Ziva to cottage of Medjad
		 * for 7 days
		 */
		Goal g1 = new Goal("Revange", Goal.EASY, Event.REVENGE,	c2);
		Protagonist p = new Protagonist("Zeljka", "f", true, true, g1, c2);/*
					 * Boris have skills to make bulletproof plans so Zeljka
					 * decide to use that skill immediately.
					 */
p.addAcomplices(c2, 0);

		
		 
		
	

		Character c1 = new Character("Medo", "M", true, false);/*
						 * That dog is shy and fearful, his sills wasn't very
						 * good before this. But he must survive his lifetime
						 * with Ziva.
						 */
		p.addAcomplices(c1, 1);
		
		Character c3 = new Character("Zeljko", "M", true,	true);/*
						 * This man is sentimental and all days was complained
						 * about our regime for little dog, but day by day
						 * passed.
						 */
		;
		p.addAcomplices(c3, 2);// Helpers one by one agree to contribute noble
								// goal.

		p.addAcomplices(c3, 2);// Chain of helpers is successfully set.

		p.setEnemy(c); // So enemy obviously was Ziva.....

		System.out.println(p.attainGoal());// And battle begins....

		System.out.println(c1.getSkills() + " Medo's skills after attain"); /*
								 * Because this plan was set's bulletproof,
								 * there is no place for defeat. One of helpers
								 * have opportunity to make their skills better.
								 * but that is left to fate. Maybe Medjad skills
								 * stay weak, maybe he become powerful.
								 */
		System.out.println(c2.getSkills() + " Boris's skills after attain");
		System.out.println(c3.getSkills() + " Zeljko's skills after attain");

		System.out.println();
		
		System.out.println(c1.getIsAlive() + " dead or alive");/*
									 * For case of defeat one of helpers will
									 * loose his life, that was one more reason
									 * for be determinant and anyway defeat this dog.
									 */
		System.out.println(c2.getIsAlive() + " dead or alive");
		System.out.println(c3.getIsAlive() + " dead or alive");
	}

}
