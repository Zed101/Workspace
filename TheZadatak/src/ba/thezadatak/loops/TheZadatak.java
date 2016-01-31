package ba.thezadatak.loops;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TheZadatak {

	public static void main(String[] args) {
		
		File names = new File("names.in");
		File courses = new File("courses.in");
		File grades = new File("grades.in");
		//System.out.println(names.getAbsolutePath());

		try {

			Scanner scan = new Scanner(names);
			String line = "";
			String nameF = "";
			String course = "";
			Scanner scanc = new Scanner(courses);
			String grade = "";
			Scanner scang = new Scanner(grades);

			String[] g = new String[11];

			for (int i = 0; i < g.length; i++) {
				course = scanc.nextLine();
				// System.out.println(course);
				g[i] = course;

			}
			//System.out.println(Arrays.toString(g));

			while (scan.hasNextLine()) {
				String da = "DA";

				line = scan.nextLine();

				nameF = line.replaceAll("\\s", ""); // Getting name without
													// spaces
				nameF = nameF.toLowerCase(); // Getting name in lower case
				nameF += "grd"; // Making name of file

				File file = new File(nameF); // Making file with name in string nameF
				FileWriter writer = new FileWriter(file);
				writer.write("Ucenik: " + line + "\n");

				grade = scang.nextLine();
				double zbir = 0;
				String ocjene = "";

				int k = 0;
				for (int i = 0; i < grade.length(); i++) {
					String s = String.valueOf(grade.charAt(i));

					if (!s.equals(" ")) {
						int broj = Integer.parseInt(s);
						ocjene += "(" + broj;

						ocjene += ") " + g[k] + "\n";
						k++;

						if (broj == 1) {
							da = "NE";
						}
						zbir += broj;

					}
				}
				zbir = zbir / 11;

				writer.write("Prosao: " + da + "\n\n");

				writer.write(ocjene);

				writer.write("\n" + "Prosjek " + zbir);

				int z = 5;
				if(da.equals("NE")){
					z = 1;
				}else if(zbir < 2.5){
					z = 2;
				}else if(zbir < 3.5){
					z = 3;
				}else if(zbir < 4.5){
					z = 4;
				}
				writer.write("\n" + "Zakljucno " + z);

				writer.flush();
				writer.close();

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File names.in not found");
			System.err.println(e.getMessage());
			System.err.println(e.getStackTrace());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
