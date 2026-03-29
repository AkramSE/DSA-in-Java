import java.util.ArrayList;

public class PairSum2 {
    
    // Two-Pointer Approach for Sorted & Rotated ArrayList: O(n) Time Complexity
    public static boolean pairSumRotated(ArrayList<Integer> list, int target) {
        int bp = -1; // Breaking point
        int n = list.size(); 
        
        // Find the breaking point where the array is rotated
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > list.get(i + 1)) { 
                bp = i; 
                break; 
            } 
        } 
        
        int lp = bp + 1; // Smallest element
        int rp = bp;     // Largest element
        
        while(lp != rp) {
            // Case 1: Target found
            if(list.get(lp) + list.get(rp) == target) {
                return true; 
            } 
            
            // Case 2: Sum is less than target, move lp forward circularly
            if(list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n; 
            } 
            // Case 3: Sum is greater than target, move rp backward circularly
            else { 
                rp = (n + rp - 1) % n; 
            }
        } 
        return false; 
    }

    public static void main(String[] args) { 
        ArrayList<Integer> list = new ArrayList<>(); 
        // Sorted & Rotated List
        list.add(11); list.add(15); list.add(6); 
        list.add(8); list.add(9); list.add(10); 
        
        int target = 16; 
        System.out.println("--- Pair Sum 2 (Sorted & Rotated ArrayList) ---");
        System.out.println("List: " + list);
        System.out.println("Target: " + target + "\n");
        
        System.out.println("Target exists (Optimized O(n)): " + pairSumRotated(list, target)); 
    }
}
