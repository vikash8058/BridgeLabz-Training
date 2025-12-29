/*
Given an m x n matrix, return all elements of the matrix in spiral order.	
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> spiralList = new ArrayList<>();
        
        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftColumn = 0;
        int rightColumn = matrix[0].length - 1;
        
        // Continue until all elements are visited
        while (topRow <= bottomRow && leftColumn <= rightColumn) {
            
            // Traverse from left to right
            for (int column = leftColumn; column <= rightColumn; column++) {
                spiralList.add(matrix[topRow][column]);
            }
            topRow++;
            
            // Traverse from top to bottom
            for (int row = topRow; row <= bottomRow; row++) {
                spiralList.add(matrix[row][rightColumn]);
            }
            rightColumn--;
            
            // Traverse from right to left
            if (topRow <= bottomRow) {
                for (int column = rightColumn; column >= leftColumn; column--) {
                    spiralList.add(matrix[bottomRow][column]);
                }
                bottomRow--;
            }
            
            // Traverse from bottom to top
            if (leftColumn <= rightColumn) {
                for (int row = bottomRow; row >= topRow; row--) {
                    spiralList.add(matrix[row][leftColumn]);
                }
                leftColumn++;
            }
        }
        
        return spiralList;
    }
}
