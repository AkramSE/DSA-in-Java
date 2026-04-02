public class HollowDiamondPattern {
    
    public static void main(String[] args) {
        int n = 5; // Diamond ki size (upper half ki rows)

        System.out.println(" Hollow Diamond Pattern:\n");

        // Upper half of the diamond
        for (int i = 1; i <= n; i++) {
            
            // Leading spaces print karne ke liye
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Stars aur middle ki hollow spaces print karne ke liye
            for (int j = 1; j <= (2 * i - 1); j++) {
                // Sirf first aur last position pe star print hoga
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Next row ke liye new line
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            
            // Leading spaces print karne ke liye
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Stars aur middle ki hollow spaces print karne ke liye
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Next row ke liye new line
        }
    }
}
