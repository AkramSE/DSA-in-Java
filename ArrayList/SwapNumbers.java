import java.util.ArrayList;

public class SwapNumbers {
    
    // Helper method to swap elements at two indices in an ArrayList
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Step 1: Store element at idx1 in temp
        int temp = list.get(idx1);
        
        // Step 2: Put element of idx2 into idx1
        list.set(idx1, list.get(idx2));
        
        // Step 3: Put temp into idx2
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(5); list.add(9); list.add(3); list.add(6);
        
        System.out.println("Original ArrayList: " + list);
        
        int idx1 = 1, idx2 = 3;
        System.out.println("Swapping elements at index " + idx1 + " and " + idx2 + "...");
        
        swap(list, idx1, idx2);
        
        System.out.println("ArrayList after swap: " + list);
    }
}
