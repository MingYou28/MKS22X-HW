public class BSTree<T extends Comparable<T>>{
    
    private class Node{
	T data;
	Node left;
	Node right;

	public Node(T info) {
	    data = info;
	}
	
	// set/get: data/left/right
	public void setL(Node d){
	    left = d;
	}
	public Node getL(){
	    return left;
	}
	public void setR(Node d){
	    right = d;
	}
	public Node getR(){
	    return right;
	}
	public T getData(){
	    return data;
	}
	public void setData(T d){
	    data = d;
	}
	
	//real methods here
	public int height(){ 
	    if(left == null && right == null) {
		return 1;
	    }
	    else if(left == null) {
		return 1 + right.height();
	    }
	    else if(right == null) {
		return 1 + left.height();
	    }
	    else{
		return 1 + Math.max(left.height() , right.height());
	    }
	}
	public void add(T nvalue){
	    if ( data == null){
		data = nvalue;}
	    else {
		if(data.compareTo(nvalue) < 0){
		    if(right != null){
			right.add(nvalue);
		    }
		    else{
			setR(new Node(nvalue));
		    }
		}
		else{
		    if(left != null){
			left.add(nvalue);
		    }
		    else{
			setL(new Node(nvalue));
		    }
		}   
	    }
	}
	public String toString(){
	    String ans = "";
	    if (data == null){
		ans += "_";
	    }
	    else if (right == null|| left == null){
		ans += "_";
	    }
	    else {
		ans += "" + data + " "+ left.toString()+ " " + " " + right.toString();
	    }

	    return ans;
	    
	    
	}
		
    
	public boolean contains(T nvalue){
	    if (data == null){
		return false;
	    }
	    else if(data.compareTo(nvalue) == 0){
		return true;
	    }
	    if(data.compareTo(nvalue) < 0 && right !=null){
		return right.contains(nvalue);
	    }
	    if(data.compareTo(nvalue) > 0 && left !=null){
		return left.contains(nvalue);
	}
	    
	    return false;
	}
	
    }
    
    private Node root;
    
    //OUTER methods here are wrapper methods for the root
    public int getHeight(){
	//call the root's methods
	//check for empty first!
	if (root == null){
	    return 0;
	}
	else {
	    return root.height();
	}
    }
    
    public void add(T nvalue){
	if (root == null){
	    root = new Node(nvalue);}
	else {
	    root.add(nvalue);
	    //check for empty before you do things with root.
	}
    }
    public String toString(){
	//check for empty before you do things with root.
	if (root == null){
	    return "";
	}
	else {
	    return root.toString();
	}
    }
    public boolean contains(T nvalue){
        if (root == null){
	    return false;
	}
	else {
	    return root.contains(nvalue);
	}
    
	    
	//check for empty before you do things with root.
        
    }
}

