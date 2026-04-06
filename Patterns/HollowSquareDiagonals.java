/**
 * Hollow Square with Diagonals Pattern in Java
 * This program prints a hollow square box with intersecting diagonals.
 * It uses logical OR (||) conditions to precisely map out the top/bottom 
 * borders, left/right borders, and both diagonals.
 */
public class HollowSquareDiagonals {

    public static void main(String[] args) {
        int n = 7; // Size of the grid (using an odd number gives a perfect center)

        System.out.println("Hollow Square with Diagonals:\n");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                
                // 1. i == 1 or i == n prints the Top and Bottom borders
                // 2. j == 1 or j == n prints the Left and Right borders
                // 3. i == j prints the Left-to-Right diagonal
                // 4. j == (n - i + 1) prints the Right-to-Left diagonal
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Double space to maintain square proportions
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
