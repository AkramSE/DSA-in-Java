public class NumberCrownPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        // Calculate initial spaces (maximum spaces for the first row)
        int spaces = 2 * (n - 1); 

        for (int i = 1; i <= n; i++) {
            
            // 1. Print left side numbers (Increasing order)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // 2. Print middle spaces
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 3. Print right side numbers (Decreasing/Reverse order)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Move to the next line after completing a row
            System.out.println();
            
            // Decrease spaces by 2 for the next row
            spaces -= 2;
        }
    }
}
