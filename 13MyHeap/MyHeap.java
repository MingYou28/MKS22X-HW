import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap <T extends Comparable<T>>{
    
    private int size;
    private T[] data;
    private boolean isMax;
    
    public MyHeap(){
	data = (T[]) new Comparable[1];
	size = 0;
	isMax = true;

    }
    public MyHeap(T[] array){
	data = array;
	size = array.length-1;
	isMax = true;
	heapify();

    }
     //do this last
    public MyHeap(boolean isMax){

    }
    public MyHeap(T[] array, boolean isMax){

    }

  /**pushDown
      precondition: data is a heap with at most one item
      out of place (element at k)
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data is a valid heap
   **/
    private void pushDown(int k){

    }

 /**pushUp
      precondition: data is a heap with at most one item
      out of place (element at k)
      postconditions:-the element at index k has been 
                     shifted to the correct spot.
                     -data is a valid heap
   **/

    private void pushUp(int k){

    }
    private void heapify(){
	for (int i = size / 2; i > 0; i --){
	    pushDown(i);
	}
    }
    public T delete(){
	if (size == 0){
	    throw new NoSuchElementException();}
	T new = data[1];
	data[1] = data[size];
	pushDown(1);
	return temp;

    }
    public void add(T x){
	if (size == data.length - 1){
	    doubleSize();
	}
	size += 1;
	data[size] = x;
	pushUp(size);
    }
    private void doubleSize(){
	T[] temp = (T[]) new Comparable[data.length * 2];
	for (int i = 1; i <= size ; i ++){
	    temp[i] = data[i];
	}
	data = temp;
    }
    public String toString(){
	String tree = "";
	for (int i = 1; i <= size; i ++){
	    temp += heap[i] + " ";
	}
	return temp;
    }
    
   

}











