public class RunningMedian{
    //2 heaps 1 small 1 large
    private MyHeap<Integer>mins;
    private MyHeap<Integer>maxes;
    
    public RunningMedian(){
	/**
	   Create an empty running median set
	**/
	mins = new Heap<>();
	max = new MyHeap<>(false);
    }
    public double getMedian(){
	/**
	   When empty: throws new NoSuchElementException()
	   Returns the median value
	**/

    }
    public void add(Integer x){

	/**
	   add to the "SmallValue" heap if  x < median, 
	   add to the "BigValue" heap otherwise. 
	   balance the two heaps so that their size differ by no more than 1. 
	**/
    }
}
