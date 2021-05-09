/**
 * This sub class holds attributes for HorseBack
 * Sub class of Messenger super class
 * Going further/Extra messenger type
 * @author Chace Lo
 *
 */
package projectMessenger;

public class HorseBack extends Messengers {
	
	 //instance variable
	 private String name;
	

	/**
	  * Constructor for HorseBack
	  * passes parameters from Super class Messenger
	  * initializes name
	  * @param message
	  * @param name
	  * @param speed
	  * @param time
	  */
	public HorseBack(String message, String name, int speed, int time) {
		super(message,speed, time);
		this.name = name;
	}

	

	/**
	 * sets HorseBack name
	 * @param name
	 */
	public void SetName(String name) {
		
		this.name = name;
	}
	/**
	 * returns HorseBack name
	 * @return
	 */
	public  String getName() {
		
		return name;
	}


	@Override
	public String toString() {
	 
	       return "The Horse's name is: " + getName() + ". The message is: " + getMessage() + ". The speed is: " + getSpeed() + " mph." +"\nThe distance traveled is: " + travel + " miles for the given time in minutes.";
	   }


}
