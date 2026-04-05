/**
 * Alphabet Palindrome Pyramid in Java
 * This program prints a pyramid using uppercase English alphabets.
 * It demonstrates how to manipulate ASCII values and use type casting
 * (converting integers to char) within nested loops.
 */
public class AlphabetPalindromePyramid {

    public static void main(String[] args) {
        int n = 5; // Number of rows

        System.out.println("Here is your Alphabet Palindrome Pyramid:\n");

        for (int i = 1; i <= n; i++) {
            
            // 1. Printing leading spaces
            // Using double space for neat alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); 
            }
            
            // 2. Printing ascending alphabets
            // ASCII value of 'A' is 65. So, 64 + 1 = 65 ('A'), 64 + 2 = 66 ('B'), etc.
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            
            // 3. Printing descending alphabets
            // Starting from i - 1 to avoid repeating the middle character
            for (int j = i - 1; j >= 1; j--) {
                System.out.print((char) (64 + j) + " ");
            }
            
            System.out.println(); // Move to the next line
        }
    }
}
