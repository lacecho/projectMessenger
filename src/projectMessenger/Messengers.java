/**
 * This class holds the attributes for 
 * messenger and calculates the distanced traveled
 * in x amount of time.
 * @author Chace Lo
 *
 */
package projectMessenger;


public class Messengers {
	
	//instance variables
	private int speed;
	private String message;
	protected int travel;
	protected int time;
	
	
	/**
	 * constructor for messenger class
	 * intializes message,speed,time, and travel
	 * @param message
	 * @param speed
	 * @param time
	 */
	public Messengers(String message, int speed, int time) {
		
		this.message = message;
		this.speed = speed;
		this.time = time;
		
		this.travel = (int) ((speed * time)/ 60.0);
	}
	
	/**
	 * sets messenger's message
	 * @param message
	 */
	public void setMessage(String message) {
		
		this.message = message;
		
	}
	/**
	 * sets messenger speed
	 * @param speed
	 */
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	/**
	 * sets messenger time
	 * @param time
	 */
	public void setTime(int time) {
		
		this.time = time;
	}
	/**
	 * returns the messenger's message
	 * @return
	 */
	public String getMessage() {
		
		return message;
	}
	/**
	 * returns messenger's speed
	 * @return
	 */
	public int getSpeed() {
		
		return speed;
	}
	
	/**
	 * returns travel calculation
	 * @return
	 */
	public int travel() {
		
		//travel = (speed * time )/ 60;
		
		return (this.speed * this.time);
	}
	
	 @Override
		public String toString() {
		 
		       return "The message is: " + message + ". The speed is: " + speed + " mph. The distance traveled is: " + travel + " miles for the given time in minutes.";
		   }

}
