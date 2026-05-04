/**
 * Problem: Search for a target value in a 2D matrix where:
 * 1. Each row is sorted in ascending order.
 * 2. Each column is sorted in ascending order.
 * Approach: Staircase Search (Optimized)
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */
public class SearchSortedMatrix {

    public static boolean search(int[][] matrix, int target) {
        // Edge case: Empty matrix
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Start from the top-right corner (row 0, col m-1)
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                System.out.println(" Found target at index: (" + row + ", " + col + ")");
                return true;
            } 
            // If the current element is greater than the target, move left (decrease column)
            else if (matrix[row][col] > target) {
                col--;
            } 
            // If the current element is smaller than the target, move down (increase row)
            else {
                row++;
            }
        }

        System.out.println(" Target not found in the matrix.");
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 37;

        search(matrix, target);
    }
}
