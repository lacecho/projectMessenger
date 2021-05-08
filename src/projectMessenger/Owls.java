package projectMessenger;

 public class Owls extends Messengers {
	 
	 private String name;
	 

	public Owls( String message, String name, int speed, int time) {
		super(message,speed, time);
		this.name = name;
	}
	
	public void SetName(String name) {
		
		this.name = name;
	}
	
	public  String getName() {
		
		return name;
	}

	
	
	@Override
	public String toString() {
	 
	       return "The Owl's name is: " + name + ". The message is: " + message + ". The speed is: " + speed + " mph." +"\nThe distance traveled is: " + travel + " miles for the given time in minutes.";
	   }

}
