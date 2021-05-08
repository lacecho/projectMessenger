package projectMessenger;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class Envelope {
	
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

	
	
	
	 

