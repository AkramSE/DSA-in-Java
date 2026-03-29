import java.util.ArrayList;

public class PairSum1 {
    
    // Approach 1: Brute Force - O(n^2) Time Complexity
    public static boolean pairSumBruteForce(ArrayList<Integer> list, int target) {
        for(int i = 0; i < list.size(); i++) { 
            for(int j = i + 1; j < list.size(); j++) {
                if(list.get(i) + list.get(j) == target) { 
                    return true; 
                }
            }
        } 
        return false; 
    }
    
    // Approach 2: Two-Pointer - O(n) Time Complexity (For Sorted ArrayList)
    public static boolean pairSumOptimized(ArrayList<Integer> list, int target) {
        int lp = 0; 
        int rp = list.size() - 1; 
        
        while(lp != rp) { 
            // Case 1: Target found
            if(list.get(lp) + list.get(rp) == target) {
                return true; 
            } 
            // Case 2: Sum is less than target, move left pointer to increase sum
            if(list.get(lp) + list.get(rp) < target) {
                lp++; 
            } 
            // Case 3: Sum is greater than target, move right pointer to decrease sum
            else { 
                rp--; 
            }
        } 
        return false; 
    }

    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>(); 
        // Sorted List: 1, 2, 3, 4, 5, 6
        for(int i = 1; i <= 6; i++) {
            list.add(i);
        }
        
        int target = 5; 
        System.out.println("Pair Sum 1 (Sorted ArrayList):");
        System.out.println("List: " + list);
        System.out.println("Target: " + target + "\n");
        
        System.out.println("Target exists (Brute Force O(n^2)): " + pairSumBruteForce(list, target)); 
        System.out.println("Target exists (Optimized O(n)):     " + pairSumOptimized(list, target)); 
    }
}
