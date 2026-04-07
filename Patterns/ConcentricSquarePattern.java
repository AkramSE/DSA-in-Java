/**
 * Concentric Square Number Pattern in Java
 * This program prints a concentric square matrix of numbers.
 * It is a famous competitive programming and interview question.
 * The logic relies on finding the minimum distance of current 
 * coordinates (i, j) from the four edges of the grid.
 */
public class ConcentricSquarePattern {

    public static void main(String[] args) {
        int n = 4; // The maximum number in the outermost layer
        int size = 2 * n - 1; // Total rows and columns in the grid

        System.out.println("Concentric Square Pattern:\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                
                // 1. Calculate distance from the four edges of the square
                int top = i;
                int left = j;
                int bottom = size - 1 - i;
                int right = size - 1 - j;
                
                // 2. Find the minimum distance to the nearest edge
                int minDist = Math.min(Math.min(top, left), Math.min(bottom, right));
                
                // 3. Print the number based on the distance from the edge
                System.out.print((n - minDist) + " ");
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }
}
