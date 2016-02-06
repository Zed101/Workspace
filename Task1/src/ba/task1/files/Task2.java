package ba.task1.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		File f = new File("adresses2.txt");
		File f2 = new File("Names2.txt");
		FileWriter writer = null;
		Scanner scanA = null;
		Scanner scanN = null;
		try {
			scanA = new Scanner(f);
			scanN = new Scanner(f2);
			writer = new FileWriter("reverse.txt");
			String s = "";
			String s2 = "";

			while (scanA.hasNextLine()) {

				s = scanA.nextLine();
				s = s.substring(1, s.length());

				// System.out.println(s);
				writer.write(s + ", ");
				s2 = scanN.nextLine();
				System.out.println(s2);
				writer.write(s2 + "\n");

			}

			writer.flush();

		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
			System.err.println(e);
		} catch (IOException e) {
			System.out.println("IO exception");
			System.err.println(e);
		} finally {
			closeMethod(writer, scanA, scanN);
			// try {
			// if (writer != null) {
			// writer.close();
			// }
			// if (scanA != null) {
			// scanA.close();
			// }
			// if (scanN != null) {
			// scanN.close();
			// }
			// } catch (IOException e) {
			// System.out.println("Failed to close writers");
			// System.err.println(e);
			// }
		}

	}

	public static void closeMethod(FileWriter w, Scanner s, Scanner s2) {
		try {
			if (w == null || s == null || s2 == null) {
				w.close();

				s.close();
				s2.close();
			}
		} catch (IOException e) {
			System.out.println("IO exception");
			System.err.println(e);
		}

	}

}
