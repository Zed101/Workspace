package ba.objects.homework;

import java.util.Arrays;

public class RunTeam {

	public static void main(String[] args) {
		FootballPlayer messi = new FootballPlayer("Lionel Andrés -Leo- Messi ", 1987, "Forward");
		FootballPlayer neymar = new FootballPlayer("Neymar da Silva Santos Júnior", 1992, "Forward");
		FootballPlayer iniesta = new FootballPlayer("Andrés Iniesta", 1984, "Midfielder");
		FootballPlayer daniAlves = new FootballPlayer("Daniel Alves da Silva ", 1983, "Right back");
		FootballPlayer busquets = new FootballPlayer("Sergio Busquets", 1988, "Defensive");
		FootballPlayer pique = new FootballPlayer("Gerard Piqué Bernabeu", 1987, "Defender");
		FootballPlayer rakitic = new FootballPlayer("Ivan Rakitic", 1988, "Midfielder");
		FootballPlayer terStegan = new FootballPlayer("Marc-André Ter Stegen", 1992, "Goalkeeper");
		FootballPlayer suarez = new FootballPlayer("Luis Alberto Suárez Díaz", 1987, "Forward");
		FootballPlayer rafinha = new FootballPlayer("Rafael Alcántara do Nascimento", 1993, "Midfielder");
		FootballPlayer arda = new FootballPlayer("Arda Turan", 1987, "Midfielder");
		FootballPlayer ramirez = new FootballPlayer("Sandro Ramírez", 1995, "Forward");
		FootballPlayer claro = new FootballPlayer("Adriano Correia Claro", 1984, "Defender");

		FootballPlayer[] arrayOfPlayers = new FootballPlayer[] { messi, neymar, iniesta, daniAlves, busquets, pique,
				rakitic, terStegan, suarez, rafinha, arda, ramirez, claro };

		FootballTeam barcelona = new FootballTeam("FC Barcelona", arrayOfPlayers);
		System.out.println(mostComonYearOfBirth(barcelona, 1987) + " players born in the same year");
		System.out
				.println(countPlayers(barcelona, "Forward") + " this much players play same position in FC Barcelona");
		System.out.println(getYungestPlayer(barcelona) + " is youngest player in team");
	}

	public static int mostComonYearOfBirth(FootballTeam team, int year) {
		int counter = 0;
		for (int i = 0; i < team.getarrayOfFP().length; i++) {
			if (year == team.getarrayOfFP()[i].getYearOfBirth()) {
				counter++;
			}
		}
		return counter;
	}
	/*
	 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametre,
	 * jedan tim i jednu poziciju. Metoda vraća koliko ima igrača u datom timu
	 * da igra tu poziciju. Metoda: int countPlayers(Team t, String position)
	 */

	public static int countPlayers(FootballTeam team, String postion) {
		int counter = 0;
		for (int i = 0; i < team.getarrayOfFP().length; i++) {
			if (team.getarrayOfFP()[i].getposition().equals(postion)) {
				counter++;
			}
		}
		return counter;
	}

	/*
	 * Napisati metodu (u klasi gdje je main metoda) koja prima, kao parametar,
	 * jedan tim. Metoda vraća igrača koji je najmlađi u timu. Metoda: Player
	 * getYoungestPlayer(Team t)
	 */

	public static String getYungestPlayer(FootballTeam team) {
		String player = "";
		int year = 0;
		for (int i = 0; i < team.getarrayOfFP().length; i++) {

			if (team.getarrayOfFP()[i].getYearOfBirth() > year) {
				year = team.getarrayOfFP()[i].getYearOfBirth();
				player = team.getarrayOfFP()[i].getName();
				System.out.println(year);
			}

		}

		return player;
	}
}
