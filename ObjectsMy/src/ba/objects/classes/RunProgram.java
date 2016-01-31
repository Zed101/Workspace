package ba.objects.classes;

import java.util.Arrays;

public class RunProgram {

	public static void main(String[] args) {
		Performer marchelo = new Performer();
		marchelo.name = "marchelo";
		marchelo.isBand = false;
		marchelo.genre = "rap";
		marchelo.year = 1999;

		Performer remi = new Performer();
		remi.name = "remi";
		remi.isBand = true;
		remi.genre = "hip-hop";
		remi.year = 1996;

		Performer[] arrayOfperformer = { remi, marchelo };

		Song svetiBes = new Song();
		svetiBes.genre = "rap";
		svetiBes.perfomer = marchelo;
		svetiBes.yearOfSong = 1999;
		svetiBes.nameOfSong = "Sveti Bes";

		Song elemental = new Song();
		elemental.genre = "rap";
		elemental.perfomer = remi;
		elemental.nameOfSong = "male stvari";
		elemental.yearOfSong = 2000;

		Song song2 = new Song();
		song2.genre = "hip-hop";
		song2.perfomer = marchelo;
		song2.nameOfSong = "sarada";
		song2.yearOfSong = 2000;

		Song song = new Song();
		song.genre = "rap";
		song.yearOfSong = 2002;
		song.nameOfSong = "krasnokalipsa";
		song.perfomer = marchelo;

		Song song3 = new Song();
		song3.genre = "rap";
		song3.nameOfSong = "pismo bratu";
		song3.yearOfSong = 2000;
		song3.perfomer = marchelo;

		Song song4 = new Song();
		song4.genre = "rap";
		song4.nameOfSong = "vertigo";
		song4.perfomer = remi;
		song4.yearOfSong = 2010;

		Song[] array = new Song[3];
		array[0] = svetiBes;
		array[1] = song;
		array[2] = song2;

		Song[] arrayOfSongs = { svetiBes, elemental, song3, song4, song };

		Album deFacto = new Album();
		deFacto.name = "de Facto";
		deFacto.performer = marchelo;
		deFacto.genre = "rap";
		deFacto.songs = array;

		Album album2 = new Album();
		album2.genre = "rap";
		album2.name = "sarada";
		album2.performer = marchelo;
		album2.songs = arrayOfSongs;

		Album[] arrayOfAlbums = { deFacto, album2 };

		Concert concert = new Concert();
		concert.performers = arrayOfperformer;
		concert.songs = arrayOfSongs;

		// System.out.println(isSameAutor(song, svetiBes));

		// System.out.print("Is " + song.nameOfSong + " from solo author? " );
		// System.out.println(isFromSoloAuthor(song));
		// System.out.print("Is " + elemental.nameOfSong + " from solo author?
		// ");
		// System.out.println(isFromSoloAuthor(elemental));
		// System.out.println(getOlderSing(svetiBes, elemental));
		// printAlbumInformation(arrayOfAlbums, song4);

		// System.out.println("Number of same ganre i album " +
		// countGenreNumber("hip-hop", deFacto));

		System.out.println(Arrays.toString(getNumberOfSongsPerAlbum(arrayOfAlbums, concert)));
		System.out.println(getMaxNumberOfSongs(concert));
	}

	public static int getMaxNumberOfSongs(Concert c) {
		int counter = 0;
		int max = 0;
		Performer maxp = null;
		for (int i = 0; i < c.performers.length; i++) {

			for (int j = 0; j < c.songs.length; j++) {
				if (c.songs[j].perfomer.equals(c.performers[i])) {
					counter++;
					max = counter;
				}

			}
			if (counter >= max) {
				maxp = c.performers[i];
			}
			counter = 0;
		
		}
		System.out.println(maxp.name);
		return max;
	}

	public static int[] getNumberOfSongsPerAlbum(Album[] arrayAlbum, Concert c) {
		int[] album = new int[arrayAlbum.length];
		int counter = 0;
		for (int i = 0; i < arrayAlbum.length; i++) {
			for (int k = 0; k < arrayAlbum[i].songs.length; k++) {
				for (int j = 0; j < c.songs.length; j++) {
					if (arrayAlbum[i].songs[k].equals(c.songs[j])) {
						album[i] = counter++;
					}
				}

			}
		}
		return album;
	}

	public static void printAlbumInformation(Album[] albums, Song s) {
		for (int i = 0; i < albums.length; i++) {
			for (int j = 0; j < albums[i].songs.length; j++) {
				if (albums[i].songs[j].equals(s)) {
					System.out.println(s.toString());
				} else {
					System.out.println("null");
				}
			}
		}

	}

	public static int countGenreNumber(String g, Album album) {
		int counter = 0;
		for (int i = 0; i < album.songs.length; i++) {
			if (album.songs[i].genre.equals(g)) {
				counter++;
			}
		}
		return counter;

	}

	public static boolean isSameAutor(Song s1, Song s2) {

		if (s1.perfomer.name.equals(s2.perfomer.name)) {
			return true;
		}
		return false;

	}

	public static boolean isFromSoloAuthor(Song s1) {

		if (s1.perfomer.isBand) {
			return false;
		}
		return true;
	}

	public static int getOlderSing(Song s1, Song s2) {
		if (s1.yearOfSong == s2.yearOfSong) {
			System.out.println("Same year");
		}
		if (s1.yearOfSong > s2.yearOfSong) {

			System.out.println(s1.nameOfSong);
			return s1.yearOfSong;

		}
		System.out.println(s2.nameOfSong);
		return s2.yearOfSong;

	}

}
