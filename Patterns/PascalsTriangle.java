public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows to print

        for (int i = 0; i < rows; i++) {
            
            // Print leading spaces for triangular formatting
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            int number = 1;
            // Print numbers for the current row
            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                
                // Calculate the next number in the row using binomial coefficient formula
                number = number * (i - k) / (k + 1);
            }
            
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
