package projectMessenger;

public class Messengers {
	
	protected int speed;
	protected String message;
	protected int travel;
	private int time;
	
	
	
	public Messengers(String message, int speed, int time) {
		
		this.message = message;
		this.speed = speed;
		this.time = time;
		
		this.travel = (int) ((speed * time)/ 60.0);
	}
	
	public void setMessage(String message) {
		
		this.message = message;
		
	}
	
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}
	
	public void setTime(int time) {
		
		this.time = time;
	}
	
	public String getMessage() {
		
		return message;
	}
	
	
	public int travel() {
		
		//travel = (speed * time )/ 60;
		
		return (this.speed * this.time);
	}
	
	 @Override
		public String toString() {
		 
		       return "The message is: " + message + ". The speed is: " + speed + " mph. The distance traveled is: " + travel + " miles for the given time in minutes.";
		   }

}
