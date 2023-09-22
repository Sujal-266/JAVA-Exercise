//26. Write a program to calculate the factorial of a number.//

public class q26 {
    public static void main(String[] args) {
        int n = 5; // You can change the value of 'n'
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " is: " + factorial);
    }
}
