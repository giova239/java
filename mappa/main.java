import java.io.FileNotFoundException;
/**
 *
 * @author giovanni.stevanato
 */
public class Stevanato {

	/**
	 * @param args the command line arguments
	 * @throws java.io.FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Mappa m = new Mappa();
		m.load("stops.csv");
		//PuntoMappa cerca = m.search(45, 12);
		//System.out.println(cerca.toString());
	}
	
}
