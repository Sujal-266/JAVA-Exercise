//10. Write a program to print the value of 2 to the power 10.//
public class q10 {
	public static void main(String[]args){
		int w = 2;
		int r = 10;
		for(int i=0;i < 10; i++){
			r *= w;
		}
		System.out.println(w + " to the power of 10 is: "+ r);
	}
}
