/**
 * Palindromic Number Pyramid in Java
 * This program prints a pyramid where numbers first decrease down to 1, 
 * and then increase again, forming a palindrome sequence.
 */
public class PalindromicNumberPyramid {

    public static void main(String[] args) {
        int n = 5; // Height of the pyramid

        System.out.println("Here is Palindromic Number Pyramid:\n");

        for (int i = 1; i <= n; i++) {
            
            // 1. To print leading spaces
            // Using double spaces to maintain perfect alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            
            // 2. Descending numbers (from i down to 1)
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // 3. Ascending numbers (from 2 up to i)
            // 1 is already printed in the previous loop, so starting from 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println(); // New line for the next row
        }
    }
}
