//1. Write a program to create a Matrix and display the elements of the matrix.//

public class q1 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        // Initialize the matrix with values.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i + j;
            }
        }

        // Display the elements of the matrix.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
