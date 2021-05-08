package projectMessenger;

public class Ravens extends Messengers{
	
	private String name;
	
	public Ravens(String message, String name, int speed, int time) {
		super(message, speed, time);
		this.name = name;
	}
	
	public void SetName(String name) {
		
		this.name = name;
	}
	
	public  String getName() {
		
		return name;
	}

}
