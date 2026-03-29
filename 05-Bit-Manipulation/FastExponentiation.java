public class FastExponentiation {

    // Calculates a^n in O(log n) time using Bit Manipulation
    public static int fastExpo(int a, int n) {
        int ans = 1; 
        
        while(n > 0) { 
            // Check if the LSB is 1
            if((n & 1) != 0) {
                ans = ans * a; 
            } 
            a = a * a;  // Square the base
            n = n >> 1; // Right shift the power to check next bit
        } 
        return ans; 
    }

    public static void main(String[] args) {
        System.out.println("Fast Exponentiation (O(log n) Complexity):");
        
        int base1 = 5, power1 = 3;
        System.out.println(base1 + "^" + power1 + " = " + fastExpo(base1, power1)); 
        
        int base2 = 2, power2 = 10;
        System.out.println(base2 + "^" + power2 + " = " + fastExpo(base2, power2)); 
    }
          }
