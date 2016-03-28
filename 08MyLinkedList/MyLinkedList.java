import java.util*
public class MyLinkedList<T> implements Itereable<T>{
    Lnode head;
    int size;
    
    
    private class Lnode{
	private T value;
	private Lnode next;
	public Lnode(T value){
	    this.value = value;
	    next = null;
	}
	public Lnode(T value, Lnode next){
	    this.value = value;
	    this.next = next;
	}            
	public int getValue(){
	    return value;
	}
	public LNode getNext(){
	    return next;
	}
	public void setValue(T value){
	    this.value = value;
	}
	public void setNext(LNode n){
	    next = n;
	}
	 
    }
    public class MyLinkedListIterator implements Iterator<T>{
	private Lnode next;
	public MyLinkedListIterator(){
	next = start;
	}
	public boolean hasNext(){
	    if (next != null){
		return true;} else {
		return false;}
	}
	public T next(){
	    if (!hasNext()){
		throw new NpSuchELementException();
	    }
	    T data = next.getValue();
	    next = next.getNext();
	    return value;
	}
    }

    private Lnode start;
    private Lnode end;
    private int size;
    private T value;
    public Iterator<T> iterator(){
	return new MyLinkedListIterator(start);
    }
    public T get(int index){
	if (index > 0 && index <= size){
	    throw new IndextOutOfBoundsException("Pick Valid Index");
	}
	Lnode spot = start;
	for (int i = 0; i < index; i ++){
	    spot = spot.getNext();}
	return spot.getValue();
    }   
}
    //- get the value of the element at the specified index (0 based)
    
    public void set(int index,int newValue){
	if (index > 0 && index <= size){
	    throw new IndexOutOfBoundsException("pick valid Index");}
	    Lnode spot = start;
	    for (int i = 0; i < index; i ++){
		spot = spot.getNext();}
	    T sol = spot.getValue();
	    spot.setValue(newValue);
	    
    }
    
    //- change the value of the element at the specified index to the newValue, return the old value
    
    public int size(){
	return size;
    } 

    //- return the number of elements in the list

    public int remove(int index){
    } 
    //- remove the element at the specified index, returns the value removed

    public boolean add(int index, int value){    
    }
    //- insert a new elmeent at the specified index, 0 at the front, size() at the end.

    public boolean add(int value){
	if(head == null){
	    head = new LNode(value);
	}else{
	    LNode p = head;			
	    while(p.getNext()!=null){
		p = p.getNext();
	    }
	    p.setNext(new LNode(value));
	}
	size+=1;
	return true;
    }
    
    
    //- adds to end
    
    public int indexOf(int value){
        
    } 
    
    //- returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
    
    public String toString(){
	String ans = "[";
	LNode p = head;
	while(p != null){
	    ans += p.getValue();
	    if(p.getNext()!= null){
		ans+=", ";
	    }
	    p = p.getNext();
	}
	return ans+"]";
    }
    }
    
    
    //- returns a list formatted like: [ v1, v2, v3, ... vn-1, vn ] , empty list is just []
    

