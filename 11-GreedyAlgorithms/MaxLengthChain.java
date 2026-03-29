import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChain {
    public static void main(String[] args) {
        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        
        //  Sort pairs based on their second element (End time) - O(N log N)
        // Note: Used comparingInt instead of comparingDouble for integer array
        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1])); 
        
        int chainLen = 1; 
        int chainEnd = pairs[0][1]; // Last selected pair's end time
        
        for (int i = 1; i < pairs.length; i++) {
            // If the start time of current pair is strictly greater than the chain's end time
            if (pairs[i][0] > chainEnd) {
                chainLen++; 
                chainEnd = pairs[i][1]; // Update the chain end
            }
        } 
        
        System.out.println("--- Max Length Chain of Pairs ---");
        System.out.println("Maximum length of chain = " + chainLen); 
    }
}
