/**
 *
 * @author giovanni.stevanato
 * @param <T>
 */
public class NodoConc <T> {
	protected T info;
	protected NodoConc<T> next;
	
	NodoConc(T info, NodoConc<T> next){
		this.info=info;
		this.next=next;
	}
}