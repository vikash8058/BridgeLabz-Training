// Program to perform matrix operations: transpose, determinant, and inverse
// Supports 2x2 and 3x3 matrices
// Uses random matrices and modular methods

public class MatrixAdvancedOperations {

    public static void main(String[] args) {

        // Create random matrices
        int[][] matrix2x2 = createRandomMatrix(2, 2);
        int[][] matrix3x3 = createRandomMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        printMatrix(matrix2x2);

        System.out.println("\nTranspose of 2x2 Matrix:");
        printMatrix(transposeMatrix(matrix2x2));

        int det2 = determinant2x2(matrix2x2);
        System.out.println("\nDeterminant (2x2): " + det2);

        if (det2 != 0) {
            System.out.println("\nInverse of 2x2 Matrix:");
            printDoubleMatrix(inverse2x2(matrix2x2));
        } else {
            System.out.println("\nInverse not possible (Determinant is 0)");
        }

        System.out.println("\n---------------------------------------");

        System.out.println("3x3 Matrix:");
        printMatrix(matrix3x3);

        System.out.println("\nTranspose of 3x3 Matrix:");
        printMatrix(transposeMatrix(matrix3x3));

        int det3 = determinant3x3(matrix3x3);
        System.out.println("\nDeterminant (3x3): " + det3);

        if (det3 != 0) {
            System.out.println("\nInverse of 3x3 Matrix:");
            printDoubleMatrix(inverse3x3(matrix3x3));
        } else {
            System.out.println("\nInverse not possible (Determinant is 0)");
        }
    }

    // Method to create a random matrix
    private static int[][] createRandomMatrix(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 9) + 1; // 1–9
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    private static int[][] transposeMatrix(int[][] matrix) {

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Determinant of 2x2 matrix
    private static int determinant2x2(int[][] m) {

        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant of 3x3 matrix
    private static int determinant3x3(int[][] m) {

        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Inverse of 2x2 matrix
    private static double[][] inverse2x2(int[][] m) {

        int det = determinant2x2(m);
        double[][] inverse = new double[2][2];

        inverse[0][0] =  m[1][1] / (double) det;
        inverse[0][1] = -m[0][1] / (double) det;
        inverse[1][0] = -m[1][0] / (double) det;
        inverse[1][1] =  m[0][0] / (double) det;

        return inverse;
    }

    // Inverse of 3x3 matrix
    private static double[][] inverse3x3(int[][] m) {

        int det = determinant3x3(m);
        double[][] inverse = new double[3][3];

        inverse[0][0] =  (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / (double) det;
        inverse[0][1] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]) / (double) det;
        inverse[0][2] =  (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / (double) det;

        inverse[1][0] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]) / (double) det;
        inverse[1][1] =  (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / (double) det;
        inverse[1][2] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]) / (double) det;

        inverse[2][0] =  (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / (double) det;
        inverse[2][1] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]) / (double) det;
        inverse[2][2] =  (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / (double) det;

        return inverse;
    }

    // Method to print integer matrix
    private static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    // Method to print double matrix
    private static void printDoubleMatrix(double[][] matrix) {

        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }
}
