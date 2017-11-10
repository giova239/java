/**
 *
 * @author giovanni.stevanato
 * @param <T>
 */
public class ListaConcatenata<T> {
	
	NodoConc<T> testa;
	
	ListaConcatenata(){
		testa = new NodoConc(null, null);
	}
	ListaConcatenata(T[] a){
		this();
		NodoConc temp = testa;
		for(int i=0; i<a.length; i++){
			temp.info = a[i];
			temp.next = new NodoConc(null, null);
			temp = temp.next;
		}
	}

	public void addHead(T elem){
		NodoConc temp = testa;
		testa = new NodoConc(elem, temp);
	} 
	
	public void addTail(T elem){
		NodoConc temp = testa;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.info = elem;
		temp.next = new NodoConc(null, null);
	} 
	
	public void removeHead(){
		testa = testa.next;
	}
	
	public void removeTail(){
		NodoConc temp = testa;
		int l = size();
		for(int i=0; i<l-1; i++){
			temp = temp.next;
		}
		temp.next = null;
	}
	
	public T get(int n){
		NodoConc temp = testa;
		for(int i=0; i<n; i++){
			temp = temp.next;
		}
		return (T)temp.info;
	}
	
	public void set(int n, T x){
		NodoConc temp = testa;
		for(int i=0; i<n; i++){
			temp = temp.next;
		}
		temp.info = x;
	}
	
	public void add(int n, T x){
		NodoConc temp1 = testa, temp2;
		for(int i=0; i<n-1; i++){
			temp1 = temp1.next;
		}
		temp2 = temp1.next;
		temp1.next = new NodoConc(x, temp2);
	}
	
	public void remove(int n){
		NodoConc temp1 = testa, temp2;
		for(int i=0; i<n-1; i++){
			temp1 = temp1.next;
		}
		temp2 = temp1.next.next;
		temp1.next = temp2;
	}
	
	@Override
	public String toString(){
		String r = "";
		NodoConc temp = testa;
		while(temp.next != null){
			r += "["+temp.info.toString()+"] ";
			temp = temp.next;
		}
		return r;
	}
	
	public int size(){
		int r = 0;
		NodoConc temp = testa;
		while(temp.next != null){
			temp = temp.next;
			r++;
		}
		return r;
	}

}
