/**
 * This is sub class holds attributes for Raven
 * Sub class of Messenger
 * 
 * @author Chace Lo
 *
 */
package projectMessenger;

public class Ravens extends Messengers{
	//instance variable
	private String name;
	
	/**
	 * Constructor for Ravens
	 * initializes name
	 * passes parameters from Super class Messenger
	 * @param message
	 * @param name
	 * @param speed
	 * @param time
	 */
	public Ravens(String message, String name, int speed, int time) {
		super(message, speed, time);
		this.name = name;
	}
	
	/**
	 * sets name for Raven
	 * @param name
	 */
	public void SetName(String name) {
		
		this.name = name;
	}
	
	/**
	 * returns Raven's name
	 * @return
	 */
	public  String getName() {
		
		return name;
	}
	
	@Override
	public String toString() {
	 
	       return "The Raven's name is: " + getName() + ". The message is: " + getMessage() + ". The speed is: " + getSpeed() + " mph." +"\nThe distance traveled is: " + travel + " miles for the given time in minutes.";
	   }

}
