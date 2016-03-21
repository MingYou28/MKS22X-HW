/*
public class MyLinkedList{
    Lnode head;
    int size;
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
    
    int get(int index){
    }    
    //- get the value of the element at the specified index (0 based)
    
    int set(int index,int newValue){
    }
    
    //- change the value of the element at the specified index to the newValue, return the old value
    
    int size(){
    } 

    //- return the number of elements in the list

    int remove(int index){
    } 
    //- remove the element at the specified index, returns the value removed

    boolean add(int index, int value){    
    }
    //- insert a new elmeent at the specified index, 0 at the front, size() at the end.

    boolean add(int value){
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
    
    int indexOf(int value){
    } 
    
    //- returns the index of the 1st occurrence of the value in the linked list, -1 if not found.
    
    toString(){
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
}
*/

public class Box<t>
