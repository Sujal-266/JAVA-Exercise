//8.Write a program to calculate the BMI of a person. Hint: BMI = weight (KG)/ height^2 (meter).//

public class q8 {
	public static void main(String [] args) {
		float w=70, h=180;
		
		float BMI = w/(h*h);
		
		System.out.print("BMI value is = ");
		System.out.println(""+BMI);
	}
}