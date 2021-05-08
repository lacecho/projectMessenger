/**Author: Chace Lo
 * Main class
 * runs or tests program
 */
package projectMessenger;

public class Driver {

	public static void main(String[] args) {
		
		
		
		//Messengers m1 = new Messengers("Need to figure out how to add an envelope", 40, 50);
		Owls o1 = new Owls("new owl", "Hagrid", 20, 10);
		Ravens r1 = new Ravens("New Raven", "Hedwig", 20, 10);
		Envelope e1 = new Envelope();
		//System.out.println(m1);
		System.out.println(o1);
		System.out.println(r1);
		o1.goHome();
		e1.readFromFile();
		
	}

}
