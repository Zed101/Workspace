package ba.cars.and.manufacturer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		File cars = new File("cars.txt");
		File manufacturers = new File("manufacturers.txt");
		String[] arrayOfMAnufactirers = getArray(manufacturers);
		FileWriter writer = null;
		Scanner scannerForCars = null;
		try {

			scannerForCars = new Scanner(cars);
			String audi = getManufacturer("Audi", arrayOfMAnufactirers);
			String bmw = getManufacturer("BMW", arrayOfMAnufactirers);
			String mercedes = getManufacturer("Mercedes", arrayOfMAnufactirers);
			String cadelac = getManufacturer("Cadillac", arrayOfMAnufactirers);
			writer = new FileWriter("catalog.txt");

			while (scannerForCars.hasNextLine()) {
				String line = scannerForCars.nextLine();
				if (line.charAt(0) == 'A') {
					audi += "\n" + line;
				} else if (line.charAt(0) == 'M') {
					bmw += "\n" + line;
				} else if (line.charAt(0) == 'S') {
					mercedes += "\n" + line;
				} else if (line.charAt(0) == 'C') {
					cadelac += "\n" + line;
				}
			}
			writer.write(audi + "\n \n" + bmw + "\n \n" + mercedes + "\n\n" + cadelac);
			writer.flush();

		} catch (FileNotFoundException e) {
			System.out.println("File is not found");
			System.err.println(e);
		} catch (IOException e) {
			System.out.println("IO exception");
			System.err.println(e);
		} finally {
			try {
				if (writer != null) {
					writer.close();
					
				}else if(scannerForCars != null){
					scannerForCars.close();
				}
			} catch (Exception e) {
				System.out.println("Exception");
				System.err.println(e);
			}
		}
	

	}

	public static String[] getArray(File f) {
		String[] s = new String[4];
		try {
			Scanner scan = new Scanner(f);
			while (scan.hasNextLine()) {
				for (int i = 0; i < s.length; i++) {
					s[i] = scan.nextLine();
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.err.println(e);
		}
		return s;
	}

	public static String getManufacturer(String s, String[] array) {

		for (int i = 0; i < array.length; i++) {
			if (s.equals(array[i])) {
				return array[i];
			}
		}

		return null;
	}

}
