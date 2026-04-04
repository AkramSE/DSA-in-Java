/**
 * Sandglass (Hourglass) Star Pattern in Java
 * This program prints a sandglass shape using nested loops.
 * It consists of an inverted pyramid on top and a regular pyramid at the bottom.
 */
public class SandglassPattern {

    public static void main(String[] args) {
        int n = 5; // Size of the sandglass

        System.out.println(" Sandglass Pattern:\n");

        // 1. Top half (Inverted Pyramid)
        for (int i = 0; i <= n - 1; i++) {
            
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Printing stars with a space after each star
            for (int j = i; j <= n - 1; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }

        // 2. Bottom half (Regular Pyramid)
        // Starting from n-2 to avoid duplicating the middle single star
        for (int i = n - 2; i >= 0; i--) {
            
            // Printing leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Printing stars with a space after each star
            for (int j = i; j <= n - 1; j++) {
                System.out.print("* ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
