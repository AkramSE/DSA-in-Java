public class CountSetBits {

    public static int countBits(int n) {
        int count=0; 
        while(n > 0) {
            // Check if the Least Significant Bit (LSB) is 1
            if((n & 1) != 0) { 
                count++; 
            } 
            // Shift the bits to the right by 1 to check the next bit
            n = n >> 1; 
        } 
        return count; 
    }

    public static void main(String[] args) {
        System.out.println("Counting Set Bits (Number of 1s in Binary):");
        
        // 10 in binary is 1010 (Two 1s)
        System.out.println("Set bits in 10: " + countBits(10)); 
        
        // 15 in binary is 1111 (Four 1s)
        System.out.println("Set bits in 15: " + countBits(15)); 
        
        // 128 in binary is 10000000 (One 1)
        System.out.println("Set bits in 128: " + countBits(128));
    }
}
