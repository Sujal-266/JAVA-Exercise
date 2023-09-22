//4. Write a program which returns the length of a string (without length method).//

public class q4 {
    public static int getStringLength(String str) {
        // Initialize a counter variable.
        int count = 0;

        // Iterate over the string and count the number of characters.
        for (char c : str.toCharArray()) {
            count++;
        }

        // Return the length of the string.
        return count;
    }

    public static void main(String[] args) {
        // Get the length of the string without using the length method.
        int length = getStringLength("SUJAL");

        // Print the length of the string.
        System.out.println("The length of the string is: " + length);
    }
}
