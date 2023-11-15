package Lab01;
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        System.out.println("Enter elements for the first matrix:");
        inputMatrixElements(scanner, matrix1);
        System.out.println("Enter elements for the second matrix:");
        inputMatrixElements(scanner, matrix2);
        int[][] sumMatrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);
        System.out.println("Matrix Sum:");
        displayMatrix(sumMatrix);
        scanner.close();
    }
    private static void inputMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

