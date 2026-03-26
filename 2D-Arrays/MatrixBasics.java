import java.util.Arrays;

public class MatrixBasics {

    public static boolean search(int[][] matrix, int key) {
        // Linear search: checking each cell (i, j)
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key " + key + " found at cell: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key " + key + " not found in matrix.");
        return false;
    }

    public static void main(String[] args) { 
    
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        System.out.println("Matrix structure:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        search(matrix, 50);
        search(matrix, 100);
    }
}
