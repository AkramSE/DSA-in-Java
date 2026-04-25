public class HollowAlphabetDiamond {
    public static void main(String[] args) {
        int n = 5; // Size of the diamond
        int alphabet = 65; // ASCII value for 'A'

        // Upper Half (Top to middle)
        for (int i = 0; i < n; i++) {
            // Print outer spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print the first character
            System.out.print((char) (alphabet + i));
            
            // Print inner spaces and the second character (only for rows > 0)
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) (alphabet + i));
            }
            System.out.println();
        }

        // Lower Half (Middle to bottom)
        for (int i = n - 2; i >= 0; i--) {
            // Print outer spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print the first character
            System.out.print((char) (alphabet + i));
            
            // Print inner spaces and the second character (only for rows > 0)
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print((char) (alphabet + i));
            }
            System.out.println();
        }
    }
}
