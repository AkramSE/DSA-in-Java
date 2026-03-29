public class PairsInArray { 

    // Method to print all possible pairs in an array
    public static void printPairs(int[] arr) { 
        int totalPairs = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i]; 
            
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + current + ", " + arr[j] + ") "); 
                totalPairs++; 
            } 
            System.out.println(); // move to next line after one set of pairs
        } 
        System.out.println("Total Pairs = " + totalPairs); 
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10}; 
        
        System.out.println("--->Pairs in an Array <---"); 
        printPairs(numbers); 
    }
}
