import java.util.Arrays;

public class InsertionSort {

    // Insertion Sort - Time Complexity O(n^2) worst case, O(n) best case
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { 
            int curr = arr[i]; 
            int prev = i - 1;

            // Shift elements to the right to create space for insertion
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            // Insert current value at the correct position
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
