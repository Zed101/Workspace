package ba.twoD.arrays;

public class BorisPrimjeri {
public static void main(String[] args) {
		
		// 1. Deklaracija i inicijalizacija praznog niza sa odredjenim duzinama
		int[][] twoDimensionalArray = new int[2][2]; // 2D niz sa 2 reda i 2 kolone, unutra su sve nule 
		// 2. Deklaracija i inicijalizacija niza sa elementima
		int[][] twoDimensionalArrayWithElements = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; // Sadrzi niz u nizu, ove grupe u viticastim su ustvari nizovi u velikom nizu
		// 3. Varijacija ovog iznad
		int[][] twoDimensionalArrayWithElements2 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		
		// Printanje na konzolu, primjer ovog pod 2
		for (int i = 0; i < twoDimensionalArrayWithElements.length; i++) { // ide se do cijele njegove duzine na i 
			for (int j = 0; j < twoDimensionalArrayWithElements[i].length; j++) { // ide se do cijele njegove duzine u nizu na trenutnom i
				System.out.print(twoDimensionalArrayWithElements[i][j]); // printaju se elementi na i, i na j, ne koristi se println koji daje liniju, nego obicni print da sve bude u jednoj liniji
			}
			System.out.println(); // napravi se prazna linija da bi se dobio dojam redova i kolona
		}
		
		System.out.println("---------------------------------------------"); // linija radi preglednosti konzole
				
		// Primjer praznog niza 
		int[][] emptyArray = new int[10][15]; // prvi broj 10 oznacava broj redova, drugi 15 broj kolona, uvijek su prvi redovi, drugi kolone
		for (int i = 0; i < emptyArray.length; i++) { // ide kroz jedan red do kraja i
			for (int j = 0; j < emptyArray[i].length; j++) { // ide kroz taj trenutni red kroz sve njegove kolone
				//System.out.print(emptyArray[i][j] + " "); // printa sve kolone u prvom redu, itd. dodan razmak kod printanja da je preglednije
			}
			//System.out.println(); // daje novu liniju da se novi red printa u novoj liniji
		}
		
		//System.out.println("---------------------------------------------"); // linija radi preglednosti konzole
				
		// Primjer kako popuniti 2d niz
		int[][] fillArray = new int [5][7]; // prazan niz sa 5 redova i 7 kolona
		for (int i = 0; i < fillArray.length; i++) { // prolazak kroz red
			for (int j = 0; j < fillArray[i].length; j++) { // prolazak kroz kolonu
				fillArray[i][j] = (int) (Math.random() * 10) + 1;	// trenutni red i kolonu popuniti random brojem od 1 do 10
			}
		}
		
		 //Printanje popunjenog niza liniju iznad
		for (int i = 0; i < fillArray.length; i++) { // prolazak kroz red
			for (int j = 0; j < fillArray[i].length; j++) { // prolazak kroz kolonu
				//System.out.print(fillArray[i][j] + ", "); // printanje trenutnog indexa, dodan zarez zbog preglednosti
			}
			//System.out.println(); // dodana linija za novi red
		}
		
		
	} // end of main method

} // end of class

