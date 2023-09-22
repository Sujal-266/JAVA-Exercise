//5. Write a Java Program to finds the average of numbers in an array.//


public class q5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Find the average of the numbers in the array.
        double average = calculateAverage(array);

        // Print the average to the console.
        System.out.println("The average of the numbers in the array is: " + average);
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }

        return sum / array.length;
    }
}
