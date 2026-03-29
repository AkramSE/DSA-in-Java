public class PowerCalculation {

    // 1. Basic approach: O(n) Time Complexity
    public static int power(int x, int n) {
        if(n == 0) {
            return 1; 
        } 
        return x * power(x, n - 1); 
    }

    // 2. Optimized approach: O(log n) Time Complexity
    public static int optimizedPower(int a, int n) {
        if(n == 0) {
            return 1; 
        } 
        
        // Calculate power for n/2 only once
        int halfPower = optimizedPower(a, n / 2); 
        int halfPowerSqr = halfPower * halfPower; 
        
        // If n is odd, multiply by base 'a' one more time
        if(n % 2 != 0) {
            halfPowerSqr = a * halfPowerSqr; 
        } 
        return halfPowerSqr; 
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 10;
        
        System.out.println("Calculating " + base + "^" + exponent + ":\n");
        
        // Calling basic method
        System.out.println("Result using O(n) Basic Method:        " + power(base, exponent)); 
        
        // Calling optimized method
        System.out.println("Result using O(log n) Optimized Method: " + optimizedPower(base, exponent)); 
    }
}
