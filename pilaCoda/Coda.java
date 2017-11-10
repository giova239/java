/**
 *
 * @author giovanni.stevanato
 */
public class Coda<T> {
    
    
    private int lunghezza;
    private NodoConc testa;
    
    Coda(){
        lunghezza = 0;
    }
    
    public void enqueue(T d){
        if(isEmpty())
            testa = new NodoConc(d);
        else{
            NodoConc n = testa;
            while(n.getNext() != null)
                n = n.getNext();
            n.setNext(new NodoConc(d));
        }
        lunghezza++;
    }
    
    public T dequeue(){
        T r = (T)testa.info;
        testa = testa.getNext();
        lunghezza--;
        return r;
    }
    
    public T front(){
        return (T)testa.info;
    }
    
    private boolean isEmpty(){
        return lunghezza == 0;
    }
}
