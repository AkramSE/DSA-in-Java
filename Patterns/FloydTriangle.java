/**
 * Floyd's Triangle Pattern in Java
 * This program prints a right-angled triangle using consecutive natural numbers.
 * It uses an external counter variable that increments with each iteration
 * instead of relying solely on the loop indices.
 */
public class FloydsTriangle {

    public static void main(String[] args) {
        int n = 5; // Number of rows for the triangle
        int counter = 1; // Starting number

        System.out.println("Here is Floyd's Triangle:\n");

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop for printing numbers in each row
            // The number of elements in a row equals the row number (i)
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++; // Increment the number for the next print
            }
            
            System.out.println(); // Move to the next line after each row
        }
    }
}
