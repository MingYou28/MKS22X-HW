

import java.util.*;
@SuppressWarnings("unchecked")
public class MyHeap <T extends Comparable<T>>{
    private int size;
    private T[] data;
    public MyHeap(){
	data = (T[]) new Comparable[1];
	size = 0;

    }
    public MyHeap(T[] array){
	data = array;

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
/**
    private void pushUp(int k){

    }
    private void heapify(){

    }
    public T delete(){
	return data.remove(0);
    }
    public void add(T x){


    }
    private void doubleSize(){

    }
    public String toString(){
	return "";
    }

    //do this last
    public MyHeap(boolean isMax){

    }
    public MyHeap(T[] array, boolean isMax){

    }

}











