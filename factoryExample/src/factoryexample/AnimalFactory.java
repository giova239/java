package factoryexample;
/**
 *
 * @author giovanni.stevanato
 */
public class AnimalFactory {
    
    //Data la Stringa identificativa crea e ritorna l'oggetto Animal rischiesto
    
    public Animal getAnimal (String type){
        
        Animal animal = null;
        
        switch (type){
            case "Cat":
                animal = new Cat();
                break;
            case "Dog":
                animal = new Dog();
                break;
        }

        return animal;
        
    }
}
