/**Author: Chace Lo
 * Main class
 * runs or tests program
 * Simulation was not completed
 */
package projectMessenger;


public class Driver {

	public static void main(String[] args) {
		
		
		
		//objects
		Owls o1 = new Owls("new owl", "Hagrid", 20, 10);
		Ravens r1 = new Ravens("New Raven", "Hedwig", 20, 10);
		HorseBack h1 = new HorseBack("New Horse", "Shadow Fax", 10, 10);
		Envelope e1 = new Envelope();
		Locations d1 = new Locations(1);
		
		//testing the methods/program
		System.out.println(o1);
		System.out.println(r1);
		System.out.println(h1);
		o1.goHome();
		r1.goHome();
		e1.readFromFile();
		d1.createAviary(o1);
		
		System.out.println(d1.toString());
		
		
	}

}
