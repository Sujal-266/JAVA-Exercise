//20. Write a program to find greatest and least of 3 numbers.//

public class q20 {
    public static void main(String[] args) {
        int num1 = 8, num2 = 5, num3 = 12; // You can change these numbers to test
        
        int greatest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        int least = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The least number is: " + least);
    }
}
