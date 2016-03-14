import java.util.*;
    public class Quick{
	private static void swap(int[] ary, int a, int b){
	    int temp = ary[b];
	    ary[b] = ary[a];
	    ary[a] = temp;
	}
	private static int partitionOld(int[]data, int left, int right){
//choose a random partition element at a location from left to right inclusive.
	    int pivotInd = (int)(left + Math.random()*(right - left + 1));
	    int pivotNum = data[pivotInd];
	    int leftTracker = left;
	    swap(data,pivotInd,right);
//partition the array such that the randomly chosen element divides all values smaller and larger than it. 
//smaller elements on the left side of the partition, larger on the right side
	for (int i = left; i < right; i ++){
	    	if (data[i] < pivotNum){
		swap(data,leftTracker, i);
		leftTracker+= 1;
		}}
	    swap(data,right,leftTracker);
	    return leftTracker;
	}
//return the index of the partition element. 
// this allows your quickselect method to decide where to go next.

//Quick Select will now give the kth smallest value, so the k corresponds to the index of the array! Save you one subtraction!

//2.
	public static int quickselectOld(int[]data, int k){
	    return quickselect(data,k,0,data.length -1);
	}
//return the kth smallest value.
// when k = 0 return the smallest.
// 0 <= k < data.length


//3. If you make quickselect recursive, you need a helper method:
    private static int quickselectOld(int[]data, int k, int left, int right){
	if (left == right){
	    return data[left];
	}
	int pivot = partition(data,left,right);
	if (k == pivot){
	    return data[k];}
	else if (k < pivot){
	    return quickselect(data,k,left, pivot - 1);
	} else {
	    return quickselect(data,k, pivot +1, right);
	}
	
    }

	
//return the kth smallest value in the given left/right range 
// left <= k <= right
//start by calling the helper as follows:
// quickselect(data,k,0,data.length-1)
	
	private static void quickSortOld(int[]data){
	    quickSort(data, 0, data.length - 1);
	}
	private static void quickSortOld(int[]data, int left, int right){
	    if (right > left){
		int pivot = partition(data, left, right);
		quickSort(data, left, pivot);
		quickSort(data, pivot + 1, right);
	    }
	}
	
	public static String name(){
	    return "7,You,Ming";
	}
	/*
	public static void main(String[] args){
	    int[] ary = {4,2,6,1};
	    System.out.println(quickselectOld(ary,0));
	    quickSortOld(ary);
	    System.out.println(Arrays.toString(ary));
	}
	*/
	
	private static int partition(int[]data, int left, int right){
	    int pivotInd = (int)(left + Math.random()*(right - left + 1));
	    int pivotNum = data[pivotInd];
	    int leftTracker = left;
	    swap(data,pivotInd,right);
	    for (int i = left; i < right; i ++){
	    	if (data[i] < pivotNum){
		    swap(data,leftTracker, i);
		    leftTracker+= 1;
		}
		else if (data[i] > pivotNum){
		    swap(data,}
	  
	    swap(data,right,leftTracker);
	    return leftTracker;
	}

	public static int quickselect(int[]data, int k){
	    return quickselect(data,k,0,data.length -1);
	}


    private static int quickselect(int[]data, int k, int left, int right){
	if (left == right){
	    return data[left];
	}
	int pivot = partition(data,left,right);
	if (k == pivot){
	    return data[k];}
	else if (k < pivot){
	    return quickselect(data,k,left,pivot-1);}
	else {
	    return quickselect(data,k, pivot +1, right);
	}
    }
    
	private static void quickSort(int[]data){
	    quickSort(data, 0, data.length - 1);
	}
	private static void quickSort(int[]data, int left, int right){
	    if (right > left){
		int pivot = partition(data, left, right);
		quickSort(data, left, pivot);
		quickSort(data, pivot + 1, right);
	    }
	}
//LIKE THIS:
public static void main(String[]args){
    int[] d = new int [4000000];
    int[] c = new int [d.length];
   
    for(int i = 0; i < d.length; i++){
	d[i]= (int)(Math.random()*Integer.MAX_VALUE);
	c[i]= d[i];
    }
    quickSort(d); //or even your old quicksort!!!
    Arrays.sort(c);
    System.out.println("Done: Sorted="+Arrays.equals(d,c));
}
}




