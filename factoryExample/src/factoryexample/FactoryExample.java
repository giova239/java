package factoryexample;
/**
 *
 * @author giovanni.stevanato
 */
public class FactoryExample {
    
    public static void main(String[] args) {
        
        //creo la factory
        
        AnimalFactory factory = new AnimalFactory();
        
        /*chiamo e stampo il return del metodo getCall()
        implementato dalle sottoclassi Cat e Dog*/
        
        System.out.println(factory.getAnimal("Cat").getCall());
        System.out.println(factory.getAnimal("Dog").getCall());
    }
    
}
