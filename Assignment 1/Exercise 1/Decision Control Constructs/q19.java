//19. Write a program to find the maximum of three numbers.//

public class q19 {
    public static void main(String[] args) {
        int num1 = 15, num2 = 25, num3 = 10; // You can change these numbers to test
        
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        System.out.println("The maximum of the three numbers is: " + max);
    }
}
