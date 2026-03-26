import java.util.Arrays;

public class BubbleSort {

    // Optimized Bubble Sort - Time Complexity O(n^2) worst case, O(n) best case
    public static void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no elements were swapped, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        sort(arr);
        System.out.println("Sorted Array:   " + Arrays.toString(arr));
    }
}
