import java.util.Arrays;
public class CountingSort {
    // Counting Sort - Time Complexity O(n + range)
    // Best suited for arrays with a limited range of positive integers
    public static void sort(int[] arr) {
        // Edge case: if array is empty or has only one element, it's already sorted
        if (arr == null || arr.length <= 1) {
            return; 
        }
        int largest = Integer.MIN_VALUE;
        // Find the largest element to determine the size of the count array
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        // Create and populate the frequency/count array
        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Reconstruct the sorted array from the count array
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2, 4, 1}; 
        System.out.println("Original Array: " +Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array:   " +Arrays.toString(arr));
    }
}
