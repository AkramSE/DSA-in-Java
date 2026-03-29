import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        // Initialization
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("1. ADD & SIZE OPERATIONS:");
        // O(1) Time Complexity
        list1.add(10); 
        list1.add(20); 
        list1.add(30); 
        list1.add(40);
        // O(n) Time Complexity (Shifting elements)
        list1.add(1, 15); 
        
        System.out.println("List 1: " + list1);
        System.out.println("Size of List 1: " + list1.size());

        System.out.println("\n2. GET & SET OPERATIONS:");
        // O(1) Time Complexity
        System.out.println("Element at index 2: " + list1.get(2)); 
        
        // O(1) Time Complexity
        list1.set(2, 25); 
        System.out.println("List 1 after setting index 2 to 25: " + list1);

        System.out.println("\n3. REMOVE OPERATION:");
        // O(n) Time Complexity (Shifting elements back)
        list1.remove(1); 
        System.out.println("List 1 after removing index 1: " + list1);

        System.out.println("\n4. SEARCHING (CONTAINS & INDEXOF):");
        // O(n) Time Complexity
        System.out.println("Does List 1 contain 30? " + list1.contains(30));
        System.out.println("First occurrence of 40 is at index: " + list1.indexOf(40));

        System.out.println("\n5. MERGING LISTS (ADDALL):");
        list2.add(100);
        list2.add(200);
        System.out.println("List 2: " + list2);
        
        // Appending List 2 to the end of List 1
        list1.addAll(list2); 
        System.out.println("List 1 after merging List 2: " + list1);
    }
}
