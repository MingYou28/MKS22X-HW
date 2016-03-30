
public class ParenDemo<T> extends MyStack<T>{
    private MyStack<T> data;
    
    public static boolean isMatching(String s){
	MyStack<Character> opens = new MyStack<Character>();
	for (int i=0; i<s.length(); i++) {
	    if (Opens(s.substring(i, i + 1))){
		opens.push(s.charAt(i));}
	    else if (Closes(s.substring (i,i + 1))){
		if (opens.isEmpty()){
		    return false;
		} else if
			(s.charAt(i) != opens2(opens.peek())){
			return false;
		    }
		    opens.pop();
		}
	    }    
	return opens.isEmpty(); //ans
    }
	    
	/**
make stack
return openings
match closes
eliminate both till left unmatched
	 */



    public static boolean Opens(String s){
	if (
	    s.equals("{")||
	    s.equals("[")||
	    s.equals("<")||
	    s.equals("("))
	    {
		return true;		
	    }else {
	    return false;
	}
    }
    public static boolean Closes(String s){
	if (
	    s.equals("}")||
	    s.equals("]")||
	    s.equals(">")||
	    s.equals(")")){
	    return true;		
	    }else {
	    return false;
	}
    }
    public static char opens2(char c){
	if (c == '<'){
	    return '>';
	} else if (c == '{') {
	    return '}';
	} else if (c == '[') {
	    return ']';
	} else {
	    return ')';
	}
    }
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



































