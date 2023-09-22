//8. Write a program to copy all elements of one array into another array.//

public class q8{
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];

        // Copy the elements of array1 into array2.
        copyArray(array1, array2);

        // Print the elements of array2 to the console.
        System.out.println("The elements of array2 are: ");
        for (int element : array2) {
            System.out.println(element);
        }
    }

    public static void copyArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
    }
}
