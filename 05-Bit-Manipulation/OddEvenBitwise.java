public class OddEvenBitwise {

    public static void checkOddEven(int n) {
        int bitMask = 1; 
        
        //Checking the Least Significant Bit (LSB)
        // If (n & 1) == 0, it's Even. If (n & 1) == 1, it's Odd.
        if((n & bitMask) == 0) {
            System.out.println(n + " is an EVEN number.");
        } else {
            System.out.println(n + " is an ODD number.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Checking Odd/Even using Bitwise AND:");
        checkOddEven(3);
        checkOddEven(4);
        checkOddEven(15);
        checkOddEven(100);
    }
}
