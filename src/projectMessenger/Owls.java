/**
 * This sub class holds attributes for Owl
 * Sub class of Messenger super class
 *
 * @author Chace Lo
 *
 */
package projectMessenger;

 public class Owls extends Messengers {
	 //instance variable
	 private String name;
	 
	 /**
	  * Constructor for Owls
	  * passes parameters from Super class Messenger
	  * initializes name
	  * @param message
	  * @param name
	  * @param speed
	  * @param time
	  */
	public Owls( String message, String name, int speed, int time) {
		super(message,speed, time);
		this.name = name;
	}
	/**
	 * sets Owl's name
	 * @param name
	 */
	public void SetName(String name) {
		
		this.name = name;
	}
	/**
	 * returns Owl's name
	 * @return
	 */
	public  String getName() {
		
		return name;
	}
	
	public void goHome() {
		System.out.println("Owl is going home");
	}

	
	
	@Override
	public String toString() {
	 
	       return "The Owl's name is: " + getName() + ". The message is: " + getMessage() + ". The speed is: " + getSpeed() + " mph." +"\nThe distance traveled is: " + travel + " miles for the given time in minutes.";
	   }

}
