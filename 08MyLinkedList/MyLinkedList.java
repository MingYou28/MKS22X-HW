/*
public class MyLinkedList{
    Lnode head;
    int size;
    public MyLinkedList(){
	head = null;
	size = 0;
    private class Lnode{
    Lnode next;
    int value;
	public Lnode(int v){
	    value = v;}
	public int getValue(){
	    return value;
	}
	public LNode getNext(){
	    return next;
	}
	public void setValue(int v){
	    value = v;
	}
	public void setNext(LNode n){
	    next = n;
	}
	 
    }
    
    public int get(int index){
	if (index > 0 && index <= size){
	    Lnode spot = null;
	    for (int i = 0; i < index; i ++){
		spot = spot.getNext();}
	    return spot.getValue();
	}   
    }
    //- get the value of the element at the specified index (0 based)
    
    public int set(int index,int newValue){
	if (index > 0 && index <= size){
	    Lnode spot = null;
	    for (int i = 0; i < index; i ++){
		spot = spot.getNext();}
	    int hold = spot.getValue();
	    spot.setValue(newValue);
	    return hold;
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
<<<<<<< HEAD

=======
}
*/

public class Box<t>
>>>>>>> 1281c53255308220b20792ea0ad345976183da86
