
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
    


public class Driver{
    public static void main(String[]args){

        MyLinkedList<String> m = new MyLinkedList<String>();
        ArrayList<String>    n = new ArrayList<String>();

        for(int i = 0; i < 10; i++){
            n.add(""+i);
            m.add(""+i);
        }

        try{
            m.add(-1,"oops");
            System.out.println("\n\nAdd -1 #####################################");
        }catch(IndexOutOfBoundsException e){

        }
        try{
            m.add(12,"oops");
            System.out.println("\n\n add 12 #####################################");
        }catch(IndexOutOfBoundsException e){

        }
        try{
            m.remove(12);
            System.out.println("\n\n remove 12 #####################################");
        }catch(IndexOutOfBoundsException e){

        }

        try{
            m.set(12,"Fwazzat?!?");
            System.out.println("\n\n set 12 #####################################");
        }catch(IndexOutOfBoundsException e){

        }

//replace toString(true) with a debug to string that shows the head/tail
        System.out.println(m.toString(true));
        System.out.println(n);

        //test removing from head/tail/middle
        m.remove(0);
        n.remove(0);
        System.out.println(m.toString(true));

        m.remove(2);
        n.remove(2);
        System.out.println(m.toString(true));

        m.remove(m.size()-1);
        n.remove(n.size()-1);
        System.out.println(m.toString(true));
        System.out.println(n);

        //test adding to end/start
        m.add(0,"START");
        n.add(0,"START");
        m.add(m.size(),"PENULTIMATE");
        n.add(n.size(),"PENULTIMATE");
        System.out.println(m.toString(true));
        System.out.println(n);

        //test add
        m.add("Z-END!");
        n.add("Z-END!");
        System.out.println(m.toString(true));
        System.out.println(n);

        //test remove random items:
        Random rand = new Random(0);
        for(int i = 0; i < 6000; i++){
            int op = rand.nextInt(4);

            if(op == 0 || n.size()==0){//ensure never empty
                n.add(""+i);
                m.add(""+i);
            }else if(op == 1 ){
                int x = rand.nextInt(n.size());
                n.add(x,""+i);
                m.add(x,""+i);
            }else{
                int x = rand.nextInt(n.size());
                if(!n.remove(x).equals(m.remove(x))){
                    System.out.println("Non matching elements removed\n");
                    System.exit(1);
                }
            }
        }
    }

    }
    
