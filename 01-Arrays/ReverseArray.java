import java.util.Arrays;

public class ReverseArray { 

    // Method to reverse an array in-place (Two Pointer Approach)
    public static void reverse(int[] arr) {
        int start = 0; 
        int end = arr.length - 1; 
        
        while (start < end) { 
            // Swap elements
            int temp = arr[end]; 
            arr[end] = arr[start]; 
            arr[start] = temp; 
            
            start++; 
            end--; 
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12}; 
        
        System.out.println("Original Array: " + Arrays.toString(numbers)); 
        
        reverse(numbers); // Function call
        
        System.out.println("Reversed Array: " + Arrays.toString(numbers)); 
    }
}
