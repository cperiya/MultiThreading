public class IMath { 
	
	/** Returns an integer approximation to the square root of x. */ 
	
	public static int isqrt(int x) { 
		int guess = 1; 
		while (guess * guess < x)
		  { guess = guess + 1; } 
		return guess; 
	} 
public static void main(String[] arg) {}	

}