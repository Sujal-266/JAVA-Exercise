//1. Write a program to prove that the String is immutable by creating a string consisting of given name and try to correct it with your given name and surname.//

public class q1 {
    public static void main(String[] args) {
        // Create a string consisting of the given name.
        String name = "Sujal";

        // Print the string.
        System.out.println("Original string: " + name);

        // Try to correct the string with the given name and surname.
        name = name + " Patel";

        // Print the string again.
        System.out.println("Corrected string: " + name);

        // As you can see, the original string remains unchanged. This proves that strings are immutable in Java.
    }
}
