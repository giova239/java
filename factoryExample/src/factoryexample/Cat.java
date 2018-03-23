package factoryexample;
/**
 *
 * @author giovanni.stevanato
 */
public class Cat implements Animal{

    //Implementa il metodo getCall() dell'interfaccia Animal e ritorna "Miao"
    
    @Override
    public String getCall() {
        return "Miao";
    }
    
}