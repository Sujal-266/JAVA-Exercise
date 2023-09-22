//7. Write a method which takes an array as a parameter and returns the sum of all of its elements.//

public class q7 {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
