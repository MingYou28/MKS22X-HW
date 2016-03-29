
public class ParenDemo<T> extends MyStack<T>{
    private MyStack<T> data;

    public static boolean isMatching(String s){
	

	/**
make stack
return openings
match closes
eliminate both till left unmatched
	 */




    public static void main(String[]args){
    String input = "()()(([[]]))";
    if(args.length > 0){
	input = args[0];
	System.out.println( isMatching(input)); 
    }else{
	System.out.println("Usage:"); 
	System.out.println("java ParenDemo \"text\""); 
    }
    
}
}
