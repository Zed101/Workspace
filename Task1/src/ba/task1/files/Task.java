package ba.task1.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		try {
			File file = new File("names.txt"); // point to file from which to
												// read
			Scanner scan = new Scanner(file); // open reader to that file
			File n = new File("Names2.txt"); // point to file to write in
			FileWriter nWriter = new FileWriter(n); // open writer to that file
			String s = ""; // string to write line from reading file
			File a = new File("adresses2.txt");
			FileWriter aWriter = new FileWriter(a);
		

			while (scan.hasNextLine()) { // read until you finish reading whole
											// file
				s = scan.nextLine(); // read next line and give string s that
										// value

				// System.out.println(s); // print line that you read

				String st = ""; // string that will hold name
				//
				// int in = s.indexOf(',');
				//
				// String si = s.substring(in + 1, s.length());
				// aWriter.write(si + "\n");
				// aWriter.flush();
				String sa = "";
				// System.out.println(si);
				boolean b = false;
				System.out.println(sa);
				for (int i = 0; i < s.length(); i++) {
				
					if(s.charAt(i) == ','){
						b = true;
					
					}
					if(b == true){
						sa += s.charAt(i);
						
						System.out.println(sa);
						
					}
				
					
					
				}
				
				aWriter.write(sa + "\n");
				aWriter.flush();
				
				for (int i = 0; i < s.length(); i++) { // go thru length of
														// file
					
				

					if (s.charAt(i) == ',') { // if character is comma
						// single line read from
						
					
						
						
						nWriter.write(st + "\n"); // write string to file and
													// new line
						nWriter.flush(); // flush writer

						break; // stop with for loop we finished name
					}
					

					st += s.charAt(i); // add character to string representing
										// name of person
										// this is below if since we don't want
										// comma to be added
				
				} // close for loop
				
			

			

			} // close while loop

			nWriter.close(); // close writer since we're not going to write
								// anything
			aWriter.close();
			scan.close();

		} catch (FileNotFoundException e) {
			System.out.println("File is't found");
			System.err.println(e);
		} catch (IOException e) {
			System.out.println("IO Error");
			System.err.println(e);
		}
	}

}
