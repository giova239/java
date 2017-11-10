/**
 *
 * @author giovanni.stevanato
 */
public class NodoConc<T> {
    
    T info;
    private NodoConc<T> next;
    
    NodoConc(T info){
        this.info = info;
    }

    public void setNext(NodoConc<T> next) {
        this.next = next;
    }

    public NodoConc getNext() {
        return next;
    }
    
    
}
