//2. Write a program to add two matrices.//

public class q2{
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9,8,7}, {6,5,4}, {3,2,1}};

        // Add the two matrices.
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display the elements of the sum matrix.
        for (int i = 0; i < sumMatrix.length; i++) {
            for (int j = 0; j < sumMatrix[i].length; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] sumMatrix = new int[matrix1.length][matrix1[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }
}
