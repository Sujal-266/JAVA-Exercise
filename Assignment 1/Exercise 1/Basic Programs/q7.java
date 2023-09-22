//7. Write a program to swap two numbers without a temp varibale.//
public class q7 {
	public static void main(String [] args) {
		int x = 10;
		int y = 20;
		
		System.out.println("--Before swapping Number 1 =" + x + ",Number 2 = " + y);

		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println("--After swapping Number 1 =" + x + ",Number 2 = " + y);
		
		
	}
}