import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] weight = {10, 20, 30};
        int capacity = 50; 
        
        // 2D Array: [index][0] = original index, [index][1] = value/weight ratio
        double[][] ratio = new double[val.length][2]; 
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; 
            ratio[i][1] = val[i] / (double) weight[i]; 
        } 
        
        // Sorting in ascending order based on ratio
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); 
        
        int finalVal = 0; 
        
        // Greedy Approach: Traverse from highest ratio (end of array) to lowest
        for (int i = val.length - 1; i >= 0; i--) {
            int indx = (int) ratio[i][0]; 
            
            if (capacity >= weight[indx]) { 
                // Include full item 
                finalVal += val[indx]; 
                capacity -= weight[indx]; 
            } else {
                // Include fractional item and fill the knapsack
                finalVal += (ratio[i][1] * capacity); 
                capacity = 0; 
                break; 
            }
        } 
        
        System.out.println("Fractional Knapsack:");
        System.out.println("Maximum Value we can get = " + finalVal); 
    }
}
