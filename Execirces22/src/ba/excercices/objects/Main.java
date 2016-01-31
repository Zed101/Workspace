package ba.excercices.objects;

import ba.excercices.objects.animals.Animal;
import ba.excercices.objects.animals.Bear;
import ba.excercices.objects.animals.Fish;
import ba.excercices.objects.animals.Giraffe;
import ba.excercices.objects.animals.Tiger;
import ba.excercices.objects.animals.Zebra;
import ba.excercices.objects.plants.Cactus;
import ba.excercices.objects.plants.Plants;
import ba.excercices.objects.plants.Trees;
import ba.excercices.objects.plants.Weed;

public class Main {

	public static void main(String[] args) {

		Tiger tigar1 = new Tiger(true, 70, Constants.EAT_ANIMALS, 20, 200, Constants.T_HUNTING);
		Tiger tigar2 = new Tiger(true, 230, Constants.EAT_ANIMALS, 100, 57, Constants.T_EAT);

		Zebra zebra1 = new Zebra(true, 80, Constants.EAT_PLANTS, 50, 10, Constants.Z_SICK);
		Zebra zebra2 = new Zebra(true, 90, Constants.EAT_PLANTS, 100, 12, Constants.Z_HEALTHY);
		Zebra zebra3 = new Zebra(true, 90, Constants.EAT_PLANTS, 10, 12, Constants.Z_DEADLY_ILL);

		Bear bear1 = new Bear(true, 200, Constants.EAT_PLANTS_ANIMALS, 50, false);

		Fish fish1 = new Fish(true, 1, Constants.EAT_ANIMALS, 50, false);
		Fish fish2 = new Fish(true, 1, Constants.EAT_ANIMALS, 100, false);
		Giraffe g = new Giraffe(true, 100, Constants.EAT_PLANTS, 50, 2);
		// bear1.eat(zebra2);

		// System.out.println(bear1.getHealty() + " healthy");
		// System.out.println(bear1.getIsAlive() + " is bear alive");
		// System.out.println(zebra2.getIsAlive() + " is zebra alive");

		Plants p1 = new Plants(true, false, Constants.P_HIGH);
		Plants p2 = new Plants(true, false, Constants.P_MEDIUM);
		Plants p3 = new Plants(true, false, Constants.P_SMALL);

		Weed weed1 = new Weed(true, false, Constants.P_MEDIUM);

		Cactus cactus1 = new Cactus(true, true, Constants.P_SMALL);

		Trees t = new Trees(true, false, Constants.P_MEDIUM, 2);

		//
		// System.out.println(tigar1.toString());
		// System.out.println(zebra1.toString());
		// System.out.println(p1.toString());
		//
		// System.out.println();
		// System.out.println(zebra1.getIsAlive() + " is zebra alive");
		tigar1.eat(zebra1);

		System.out.println(tigar1.getIsAlive() + " da li je tigar ziv");
		System.out.println(zebra1.getIsAlive() + " da li je zebra ziva");
		System.out.println(tigar1.getHealty() + " tigers healty");
		System.out.println(tigar1.getIsAlive() + " da li je tigar ziv");

		System.out.println();

		System.out.println(zebra1.getStateOfZebra() + " zebra state before eating");
		zebra1.eat(p2);
		System.out.println(zebra1.getStateOfZebra() + " after eating");
		System.out.println(p3.getIsAlive() + " plant after eating");
		System.out.println(zebra1.getHealty() + " healthy of zebra after eat");
		System.out.println(zebra1.getStateOfZebra() + " after all ");

		System.out.println();

		System.out.println(zebra3.getHealty() + " healthy of zebra before eating");
		zebra3.eat(weed1);

		System.out.println(zebra3.getHealty() + " healthy of zebra after eating weed");
		System.out.println(zebra3.getStateOfZebra() + " state of zebra after eating weed");
		System.out.println(weed1.getIsAlive());

		System.out.println();

		// System.out.println(bear1.getHealty() + " bear before eating weed");
		// bear1.eat(weed1);

		// System.out.println(bear1.getHealty() + " healthy of bear after
		// eating");
		// System.out.println(weed1.getIsAlive() + " is weed alive");

		System.out.println();
		// tigar1.eat(cactus1); // throw exception
		// tigar1.eat(weed1);
		System.out.println();
		// zebra3.eat(cactus1);

		System.out.println(tigar1.getHealty());

		tigar1.eat(fish1);

		System.out.println(tigar1.getHealty() + " tigers when eat fish");
		System.out.println(fish1.getIsAlive() + " fish alive?");

		//zebra1.eat(fish1);
		System.out.println(bear1.getHealty() + " bear before eating");
		bear1.eat(tigar1);
		System.out.println(bear1.getHealty() + " bear after eating ");
		System.out.println(bear1.getIsAlive() + "  bear is bear alive");

		System.out.println(bear1.getHealty() + " before eating ");
		bear1.eat(fish1);
		System.out.println(bear1.getHealty() + " after eating ");

		System.out.println(g.getHealty() + " before eating trees");
		System.out.println(t.getIsAlive() + " is alive before");
		g.eat(t);

		System.out.println(g.getHealty() + " after eating trees");
		System.out.println(t.getIsAlive() + " is alive after");
		
		System.out.println();
		System.out.println(fish1.getHealty() + " healthy of fosh before eating fish");
		fish1.eat(fish2);
		
		System.out.println(fish1.getHealty() + " healthy after eating fish");

	}

}
