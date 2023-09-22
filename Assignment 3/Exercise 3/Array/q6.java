//6. Write a program to print the elements of an integer/float array after doubling.//

public class q6{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Double the elements of the array.
        doubleArray(array);

        // Print the elements of the array to the console.
        System.out.println("The elements of the array after doubling are: ");
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static void doubleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }
}
