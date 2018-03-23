package factoryexample;
/**
 *
 * @author giovanni.stevanato
 */
public class Dog implements Animal{

    //Implementa il metodo getCall() dell'interfaccia Animal e ritorna "Bau"
    
    @Override
    public String getCall() {
        return "Bau";
    }
    
}
