/**
 *
 * @author giovanni.stevanato
 */
public class Pila<T> {
    
    private int lunghezza;
    private NodoConc testa;
    
    Pila(){
        lunghezza = 0;
    }
    
    public void push(T d){
        NodoConc nuovaTesta = new NodoConc(d);
        if(isEmpty())
            testa = nuovaTesta;
        else{
            nuovaTesta.setNext(testa);
            testa = nuovaTesta;
        }
        lunghezza++;
    }
    
    public T pop(){
        T r = (T)testa.info;
        testa = testa.getNext();
        lunghezza--;
        return r;
    }
    
    public T top(){
        return (T)testa.info;
    }
    
    private boolean isEmpty(){
        return lunghezza == 0;
    }
}