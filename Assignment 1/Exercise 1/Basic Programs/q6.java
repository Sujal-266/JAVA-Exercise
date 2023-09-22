//Write a program to swap two numbers by taking a temp variable.//
public class q6 {
	public static void main(String [] args) {
		int x = 5;
		int y = 10;
		System.out.println("Before swapping: number1 = " + x + ", number2 = " +y);
		
		 int t = x;
		
         x = y;
		
		 y = t;
		
		System.out.println("After swapping: number1 = " + x + ", number2 = " +y);
	}
}
		
