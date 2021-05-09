/**
 * author: Chace Lo
 * this class reads from file messages.txt
 * and then stores each line into a object
 * Not a complete class
 * 
 */
package projectMessenger;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Envelope {
	
	/**
	 * method opens and reads file contents
	 * closes after
	 */
	
	/*Difficulty figuring out how to read file and write into object
	 * so a message could be stored so it could be used in Locations class
	 * for methods sendMessage/receiveMessage
	 * Was only able to open read file.
	 */
	
	public  void readFromFile() {
	try {
		Scanner file = new Scanner(new FileInputStream("message.txt"));
		
		String line = file.nextLine();
		System.out.println(line);
		
		file.close();

		
	}catch(FileNotFoundException e) {
		System.out.println("File not found");
	}
	

}}

	
	
	
	 

