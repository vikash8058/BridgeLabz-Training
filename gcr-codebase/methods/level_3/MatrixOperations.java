// Program to perform matrix operations: addition, subtraction, multiplication
// Uses random matrices and modular methods

import java.util.Scanner;

public class MatrixOperations {
	
	  // Method to create a random matrix
    private static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // values 0–9
            }
        }
        return matrix;
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    private static int[][] subtractMatrices(int[][] A, int[][] B) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] A, int[][] B) {

        int[][] result = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take matrix dimensions
        System.out.print("Enter rows for Matrix A: ");
        int rowsA = input.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int colsA = input.nextInt();

        System.out.print("Enter rows for Matrix B: ");
        int rowsB = input.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int colsB = input.nextInt();

        // Create random matrices
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);

        // Display matrices
        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        // Addition & Subtraction (only if dimensions match)
        if (rowsA == rowsB && colsA == colsB) {

            System.out.println("\nMatrix A + Matrix B:");
            printMatrix(addMatrices(matrixA, matrixB));

            System.out.println("\nMatrix A - Matrix B:");
            printMatrix(subtractMatrices(matrixA, matrixB));

        } else {
            System.out.println("\nAddition and Subtraction not possible (Dimension mismatch).");
        }

        // Multiplication (only if colsA == rowsB)
        if (colsA == rowsB) {

            System.out.println("\nMatrix A × Matrix B:");
            printMatrix(multiplyMatrices(matrixA, matrixB));

        } else {
            System.out.println("\nMultiplication not possible (Columns of A must equal rows of B).");
        }

        input.close(); //closing the input stream
    }

}
