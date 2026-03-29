import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2); list.add(5); list.add(9); list.add(3); list.add(6);
        
        System.out.println("Original ArrayList:        " + list);
        
        //  Using Collections.sort() for ascending order (Time Complexity: O(n log n))
        Collections.sort(list);
        System.out.println("Sorted (Ascending Order):  " + list);
        
        // Using Collections.reverseOrder() comparator for descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted (Descending Order): " + list);
    }
} 
