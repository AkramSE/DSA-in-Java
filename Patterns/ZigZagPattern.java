/**
 * Zig-Zag (Wave) Star Pattern in Java
 * This program prints a continuous zig-zag wave using asterisks.
 * It relies on a specific mathematical pattern using the modulo operator.
 * Stars are printed when the sum of row and column indices is divisible 
 * by 4, OR when it is the second row and the column index is divisible by 4.
 */
public class ZigZagPattern {

    public static void main(String[] args) {
        int n = 17; // Length of the wave (number of columns)

        System.out.println("Here is your Zig-Zag Pattern:\n");

        // The zig-zag wave is typically built using exactly 3 rows
        for (int i = 1; i <= 3; i++) {
            
            for (int j = 1; j <= n; j++) {
                
                // The mathematical condition for the wave points
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Double space for proper wave stretching
                }
            }
            
            System.out.println(); // Move to the next line after completing a row
        }
    }
}
