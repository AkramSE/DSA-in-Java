import java.util.ArrayList;

public class FindMaximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println("ArrayList Elements: " + list);

        // Smart Strategy: Initializing with the smallest possible integer value O(n)
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < list.size(); i++) {
            // Using Math.max for cleaner and more professional code
            max = Math.max(max, list.get(i));
        }

        System.out.println("Maximum Element = " + max);
    }
}
