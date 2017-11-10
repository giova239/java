/**
 *
 * @author giovanni.stevanato
 * @param <T>
 */
public class ListaConcatenata<T> {
	protected NodoConc<T> head;
	protected NodoConc<T> tail;
	private int length;
	
	public ListaConcatenata(){
		this.length=0;
	}
	
	public ListaConcatenata(T[]array){
		for(int i=0; i<array.length; i++){
			this.addTail(array[i]);
		}
	}
	
	@Override
	public String toString(){
		String s= "{";
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		while(pointer.next != null){
			s+=pointer.info + ",";
			pointer.next= pointer.next.next;
		}
		return s+"}";
	}
	
	public int size(){
		return this.length;
	}
	
	public void addHead(T element){
		if(this.length != 0){
			NodoConc<T> n = new NodoConc(element, this.head.next);
			this.head.next= n;
		}
		else{
			NodoConc<T> n = new NodoConc(element, null);
			this.head.next= n;
			this.tail.next= n;
		}
		this.length++;
	}
	
	public void addTail(T element){
		if(this.length != 0){
			NodoConc<T> n = new NodoConc(element, null);
			this.tail.next.next= n;
			this.tail.next=n;
			this.length++;
		}
		else{
			NodoConc<T> n = new NodoConc(element, null);
			this.head.next= n;
			this.tail.next= n;
		}
		this.length++;
	}
	
	public void removeHead(){
		this.head.next= this.head.next.next;
		this.length--;
	}
	
	public void removeTail(){
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		while(pointer.next != null){
			pointer.next= pointer.next.next;
		}
		pointer.next.next= null;
		this.tail.next= pointer.next;
		this.length--;
	}
	
	public T get(int n){
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		for(int i=0; i<n; i++){
			pointer.next= pointer.next.next;
		}
		return pointer.info;
	}
	
	public void set(int n, T x){
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		for(int i=0; i<n; i++){
			pointer.next= pointer.next.next;
		}
		pointer.info = x;
	}
	
	public void add(int n, T x){
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		for(int i=0; i<n-1; i++){
			pointer.next= pointer.next.next;
		}
		NodoConc<T> nc = new NodoConc(x, pointer.next.next);
		pointer.next.next= nc;
	}
			
	public void remove(int n){
		NodoConc<T> pointer = new NodoConc(null, this.head.next);
		for(int i=0; i<n-1; i++){
			pointer.next= pointer.next.next;
		}
		pointer.next.next= pointer.next.next.next;
	}
}
