public class Fibonacci {

    // Calculates the Nth Fibonacci number using Recursion
    public static int fib(int n) { 
        // Base Cases
        if(n == 0 || n == 1) {
            return n; 
        } 
        return fib(n - 1) + fib(n - 2); 
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence Values:");
        
        System.out.println("N = 5  -> " + fib(5)); 
        System.out.println("N = 23 -> " + fib(23)); 
        System.out.println("N = 28 -> " + fib(28)); 
    }
}
