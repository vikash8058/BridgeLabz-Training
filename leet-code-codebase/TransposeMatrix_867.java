/*
Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

*/
class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int totalRows = matrix.length;
        int totalColumns = matrix[0].length;
        
        // Create a new matrix with swapped dimensions
        int[][] transposedMatrix = new int[totalColumns][totalRows];
        
        // Fill the transposed matrix
        for (int row = 0; row < totalRows; row++) {
            for (int column = 0; column < totalColumns; column++) {
                transposedMatrix[column][row] = matrix[row][column];
            }
        }
        
        return transposedMatrix;
    }
}
