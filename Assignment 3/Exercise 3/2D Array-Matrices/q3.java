//3. Write a program to multiply a matrix with a scaler.//

public class q3{
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int scaler = 2;

        // Multiply the matrix with the scaler.
        int[][] multipliedMatrix = multiplyMatrixByScaler(matrix, scaler);

        // Display the elements of the multiplied matrix.
        for (int i = 0; i < multipliedMatrix.length; i++) {
            for (int j = 0; j < multipliedMatrix[i].length; j++) {
                System.out.print(multipliedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrixByScaler(int[][] matrix, int scaler) {
        int[][] multipliedMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                multipliedMatrix[i][j] = matrix[i][j] * scaler;
            }
        }

        return multipliedMatrix;
    }
}
