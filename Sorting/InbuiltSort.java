import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void main(String[] args) {
        
        // 1. Basic Inbuilt Sort (Ascending)
        int[] arr1 = {5, 4, 1, 3, 2};
        System.out.println("Ascending Sort:");
        System.out.println("Original Array: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("Sorted Array:   " + Arrays.toString(arr1));
        
        System.out.println(); // Empty line for clean spacing in output

        // 2. Partial Inbuilt Sort (Sorting range: index 0 to 3)
        int[] arr2 = {5, 4, 1, 3, 2};
        System.out.println("Partial Sort (Index 0 to 3):");
        System.out.println("Original Array: " + Arrays.toString(arr2));
        Arrays.sort(arr2, 0, 3); 
        System.out.println("Sorted Array:   " + Arrays.toString(arr2));

        System.out.println(); 

        // 3. Inbuilt Sort (Descending)
        // Note: Collections.reverseOrder() requires Object class (Integer), not primitive (int)
        Integer[] arr3 = {5, 4, 1, 3, 2};
        System.out.println("Descending Sort:");
        System.out.println("Original Array: " + Arrays.toString(arr3));
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("Sorted Array:   " + Arrays.toString(arr3));
    }
}
