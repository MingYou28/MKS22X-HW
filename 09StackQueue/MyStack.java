import java.util.*;
public class MyStack<T> extends MyLinkedList<T>{
    private MyLinkedList<T> data;
     /**
     * Adds the given item to the top of the stack.
     */

    public MyStack(){
	data = new MyLinkedList<T>();
    }
    
    public void push(T item){
	data.add(0,item);
    }

    /**
     * Removes the top item from the stack and returns it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public T pop(){
	if (data.size() == 0) {
	    throw new NoSuchElementException();
	}
	return data.remove(0);
    }

    /**
     * Returns the top item from the stack without popping it.
     * @exception java.util.NoSuchElementException if the queue is empty.
     */
    public  T peek(){
	if (data.size() == 0){
	    throw new NoSuchElementException();
	}
	return data.get(0);
    }

    /**
     * Returns the number of items currently in the stack.
     */
    public int size(){
	return data.size();
    }

    /**
     * Returns whether the stack is empty or not.
     */
    public boolean isEmpty(){
	return (data.size() == 0);
    }

    public static void main(String[]args){
	MyStack<String> Stringtester = new MyStack<String>();
	System.out.println("add noidea");
	Stringtester.push("nodiea");
	System.out.println(Stringtester.peek());
	System.out.println("add pookie");
	Stringtester.push("pookie");
	System.out.println(Stringtester.peek());
    }
}
