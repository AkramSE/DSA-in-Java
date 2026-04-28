import java.util.ArrayList;

public class MonotonicArrayList {

    /**
     * Function to check if the given ArrayList is monotonic.
     * An ArrayList is monotonic if it is either monotone increasing or monotone decreasing.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static boolean isMonotonic(ArrayList<Integer> list) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 0; i < list.size() - 1; i++) {
            // If the next element is smaller, the list is not monotonically increasing
            if (list.get(i) > list.get(i + 1)) {
                isIncreasing = false;
            }
            // If the next element is larger, the list is not monotonically decreasing
            if (list.get(i) < list.get(i + 1)) {
                isDecreasing = false;
            }
        }

        // If either of them remains true, the list is monotonic
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1); list1.add(2); list1.add(2); list1.add(3); // Increasing

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(6); list2.add(5); list2.add(4); list2.add(4); // Decreasing

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1); list3.add(3); list3.add(2); // Neither

        System.out.println("List 1: " + list1);
        System.out.println("Is list1 monotonic? " + isMonotonic(list1)); // Output: true

        System.out.println("\nList 2: " + list2);
        System.out.println("Is list2 monotonic? " + isMonotonic(list2)); // Output: true

        System.out.println("\nList 3: " + list3);
        System.out.println("Is list3 monotonic? " + isMonotonic(list3)); // Output: false
    }
}
