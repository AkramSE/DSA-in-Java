public class BitwiseOperators {

    public static void main(String[] args) {
        System.out.println("Bitwise Operators Demonstration:");
        
        // Binary AND (&)
        System.out.println("Binary AND (5 & 6):  " + (5 & 6)); 
        
        // Binary OR (|)
        System.out.println("Binary OR (5 | 6):   " + (5 | 6)); 
        
        // Binary XOR (^)
        System.out.println("Binary XOR (5 ^ 6):  " + (5 ^ 6)); 
        
        // Binary One's complement (~)
        System.out.println("Binary NOT (~5):     " + (~5)); 
        
        // Binary Left Shift (<<) -> Formula: a * 2^b
        System.out.println("Left Shift (5 << 6): " + (5 << 6)); 
        
        // Binary Right Shift (>>) -> Formula: a / 2^b
        System.out.println("Right Shift (6 >> 1): " + (6 >> 1)); 
    }
}
