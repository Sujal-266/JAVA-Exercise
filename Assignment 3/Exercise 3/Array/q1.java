//1. Create an array of integer type in different ways.//

public class q1{
    public static void main(String[] args) {
        // Method 1: Using Array Initialization
        int[] array1 = {1, 2, 3, 4, 5};
        
        // Method 2: Using the 'new' keyword with array size
        int size = 5; // specify the size of the array
        int[] array2 = new int[size];
        for (int i = 0; i < size; i++) {
            array2[i] = i + 1;
        }
        
        // Method 3: Using a loop to populate the array
        int[] array3 = new int[5];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (i + 1) * 10;
        }
        
        // Printing the arrays
        System.out.println("Method 1: Array Initialization");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Method 2: Using 'new' with array size");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("Method 3: Using a loop to populate the array");
        for (int num : array3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
