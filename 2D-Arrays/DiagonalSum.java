public class DiagonalSum {

    public static int calculateSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal: (0,0), (1,1), (2,2)...
            sum += matrix[i][i];

            // Secondary Diagonal: (0,n-1), (1,n-2)...
            // condition to avoid adding the middle element twice in odd matrices
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Diagonal Sum: " + calculateSum(matrix));
    }
}
