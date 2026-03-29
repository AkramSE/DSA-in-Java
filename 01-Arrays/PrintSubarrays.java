public class PrintSubarrays { 

    // Method to print all continuous parts (subarrays) of an array
    public static void printSubarrays(int[] numbers) { 
        int totalSubarrays = 0; 
        
        for (int i = 0; i < numbers.length; i++) {
            int start = i; 
            
            for (int j = i; j < numbers.length; j++) {
                int end = j; 
                
                System.out.print("[ ");
                // Print elements from start to end index
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " "); 
                } 
                System.out.print("]  ");
                totalSubarrays++; 
            } 
            System.out.println(); // Move to next line for the next starting point
        } 
        System.out.println("\nTotal Sub-Arrays = " + totalSubarrays); 
    }
    
    public static void main(String[] args) { 
        int[] numbers = {2, 4, 6, 8, 10}; 
        
        System.out.println("Print Sub-Arrays:"); 
        printSubarrays(numbers); 
    }
} 
