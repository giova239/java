import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author giovanni.stevanato
 */
public class Mappa {
	protected ListaConcatenata stopList;
	
	public void load(String fileName) throws FileNotFoundException{
		File input = new File(fileName);
		
		try{
			Scanner s = new Scanner(input);
			s.nextLine();
			while(s.hasNext()){
				String line = s.nextLine();
				String[] sl = line.split(",");
				stopList.addHead(new PuntoMappa(Integer.parseInt(sl[0]), sl[2], Double.parseDouble(sl[4]), Double.parseDouble(sl[5])));
			}
			s.close();
		}
		catch(FileNotFoundException e){
			System.out.println("file not found");
		}
		catch(NullPointerException e){
			System.out.println("invalide line in the file (skipping the line)");
		}
		System.out.println(fileName + " loaded");
	}
	
	public PuntoMappa search(double lat, double lon){
		
		PuntoMappa result = (PuntoMappa)stopList.get(0);
		double resultDistance = Math.sqrt(Math.pow(lat-result.getStop_lat(), 2)+Math.pow(lon-result.getStop_lon(), 2));
		
		for(int i=0; i<stopList.size(); i++){
			PuntoMappa temp = (PuntoMappa)stopList.get(i);
			
			double distance = Math.sqrt(Math.pow(lat-temp.getStop_lat(), 2)+Math.pow(lon-temp.getStop_lon(), 2));
			
			if (distance<resultDistance){
				resultDistance = distance;
				result = temp;
			}
		}
		return result;
	}
}
