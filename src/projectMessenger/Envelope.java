package projectMessenger;

public class Envelope {
	
	private String secretNote;
	
	public Envelope(String secretNote) {
		
		this.secretNote = secretNote;
	}
	
	
	public void setNote(String secretNote) {
		
		this.secretNote = secretNote;
	}
	
	public String getNote() {
		
		return secretNote;
	}
	
	
	 //@Override
		//public String toString() {
		  //     return "GroceryStoreItem name: " + name + ", perishable:" + expired;
		 //  }

}
