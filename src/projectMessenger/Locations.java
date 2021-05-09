/**
 * author: Chace Lo
 * Not a complete class
 * Trying to utilize an object array to store a
 * messenger's info into createAviary
 * Supposed to be able to send/receive messages from envelope class.
 * W/o being able to figure the envelope class, I couldnt figure out the rest of
 * the methods.
 */
package projectMessenger;

import java.util.Arrays;

public class Locations {
	//array and instant variables
	private Messengers [] birds;
	private String destination;
	private int count;
	private int n;

	public Locations(int n) {
		
		birds = new Messengers[n];
		//this.destination = destination;
		
		count = 0;
	}
	
	public void receiveMessage() {
		
	}

	public void sendMessage() {
		
	}
	/**
	 * this method the received Messengers a into the array
	 * @param a
	 */
	public void createAviary(Messengers a) {
		
		   
		       birds[count++] = a;
		   
		
	}
	/**
	 * sets destination 
	 * @param destination
	 */
	public void setDestination(String destination) {
		
		this.destination = destination;
	}
	
	/**
	 * returns destination value
	 * @return
	 */
	public String getDestination() {
		
		return destination;
	}
	
	 @Override
		public String toString() {
		 
		       return "Location info: " + Arrays.toString(birds) ;
		   }
}
