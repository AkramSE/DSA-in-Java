/**
 * Heart Star Pattern in Java
 * This program prints a heart shape using asterisks.
 * It demonstrates how to combine different geometric logic: 
 * two separate curves for the top section and a unified 
 * inverted triangle for the bottom section.
 */
public class HeartPattern {

    public static void main(String[] args) {
        int n = 6; // Size of the heart (adjusting this changes the width/height)

        System.out.println(" Heart Pattern:\n");

        // 1. Top part of the heart (Two curves)
        for (int i = n / 2; i <= n; i += 2) {
            
            // Printing leading spaces for the left curve
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }
            
            // Printing stars for the left curve
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Printing spaces between the two curves
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Printing stars for the right curve
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }

        // 2. Bottom part of the heart (Inverted Triangle)
        for (int i = n; i >= 1; i--) {
            
            // Printing leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            
            // Printing stars to form the downward point
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
