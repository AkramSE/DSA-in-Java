import java.util.Arrays;

public class MinAbsoluteDifference {
    public static void main(String[] args) {
        int[] A = {1, 2, 3}; 
        int[] B = {2, 1, 3}; 
        
        // Greedy Strategy: Sort both arrays to pair the closest elements together
        Arrays.sort(A); 
        Arrays.sort(B); 
        
        int minDif = 0; 
        for (int i = 0; i < A.length; i++) {
            minDif += Math.abs(A[i] - B[i]); 
        } 
        
        System.out.println("--- Minimum Absolute Difference Pairs ---");
        System.out.println("Minimum Absolute Difference = " + minDif); 
    }
}
