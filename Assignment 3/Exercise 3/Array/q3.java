//3. Write a program to iterate over the array and print its elements. (Use while loop).//

public class q3{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 0;

        System.out.println("Iterate over the array and printing its elements using while loop");
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
}
