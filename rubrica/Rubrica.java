/**
 *
 * @author giovanni.stevanato
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Rubrica {
	
	public static void main(String[] args) {
		
		try{
			
			//apertura del file
			File inFile = new File("rubrica.csv");
			Scanner input= new Scanner(inFile);
			//creazione lista dei contatti
			ArrayList<Contatto> rubrica = new ArrayList();
			//parse delle stringe in oggetti Contatto e salvataggio nella lista
			while(input.hasNext()){
				String s= input.nextLine();
				String[] data = s.split(";");
				rubrica.add(new Contatto(data[0],data[1],data[2],data[3]));
			}
			//chiusura del file
			input.close();
			//Stampo la lista
			System.out.println(rubrica.toString());
			
		}catch(FileNotFoundException e){
			
			//stampo errore di lettura del file
			System.out.println("file not found");
			System.out.println(e.toString());
			
		}
		
	}
		
}
	
