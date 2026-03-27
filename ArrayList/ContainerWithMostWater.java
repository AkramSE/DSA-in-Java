import java.util.ArrayList;

public class ContainerWithMostWater {
    
    // Approach 1: Brute Force - O(n^2) Time Complexity
    public static int storeWaterBruteForce(ArrayList<Integer> height) {
        int maxWater = 0; 
        
        for(int i = 0; i < height.size(); i++) { 
            for(int j = i + 1; j < height.size(); j++) { 
                int ht = Math.min(height.get(i), height.get(j)); 
                int width = j - i; 
                int currWater = ht * width; 
                maxWater = Math.max(maxWater, currWater); 
            }
        } 
        return maxWater; 
    }
    
    // Approach 2: Two Pointer - O(n) Time Complexity (Smart Strategy)
    public static int storeWaterOptimized(ArrayList<Integer> height) {
        int maxWater = 0; 
        int lp = 0; // Left Pointer
        int rp = height.size() - 1; // Right Pointer
        
        while(lp < rp) {
            // Calculate water area 
            int ht = Math.min(height.get(lp), height.get(rp)); 
            int width = rp - lp; 
            int currWater = ht * width; 
            maxWater = Math.max(maxWater, currWater); 
            
            // Update pointers: Always move the pointer with the smaller height
            if(height.get(lp) < height.get(rp)) {
                lp++; 
            } else {
                rp--; 
            } 
        } 
        return maxWater; 
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>(); 
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        for(int h : arr) {
            height.add(h);
        }
        
        System.out.println("Container with Most Water:");
        System.out.println("Heights given: " + height + "\n");
        
        System.out.println("Maximum Water (Brute Force O(n^2)): " + storeWaterBruteForce(height)); 
        System.out.println("Maximum Water (Optimized O(n)):     " + storeWaterOptimized(height)); 
    }
}
