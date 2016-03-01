public class Recursion implements hw01 {
    double guess;
    public String name(){
	return "You, Ming";
    }
    public double sqrt(double n){
	guess = ( n / guess + guess) / 2;
	if (n < 0){
	    throw new IllegalArgumentException("Only Positive Numbers");
	} else if (n == 0){
	    return 0;
	} else {
	    return Guess(n, n/2);}
	}
    public double Guess(double n, double guess){
	if (Math.abs(((guess * guess) - n) / n)<= .00000000001){
	    return guess;
	} else {
	    return Guess(n, (n/guess + guess) / 2);}
    }
    public static void main(String[]args){
	Recursion t = new Recursion();
	System.out.println(t.sqrt(4));
	System.out.println(t.sqrt(0));
	System.out.println(t.sqrt(.04));
	//System.out.println(t.sqrt(-1));
	System.out.println(t.sqrt(2));
    }	
}
