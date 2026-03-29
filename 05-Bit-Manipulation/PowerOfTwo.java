public class PowerOfTwo {

    public static boolean isPower(int n) {
        // n & (n-1) clears the rightmost set bit. 
        // If the number is a power of 2, it only has one set bit, so it becomes 0.
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println("Checking if numbers are Power of 2:");
        
        System.out.println("Is 16 a power of 2?  " + isPower(16));
        System.out.println("Is 15 a power of 2?  " + isPower(15));
        System.out.println("Is 128 a power of 2? " + isPower(128));
    }
}
