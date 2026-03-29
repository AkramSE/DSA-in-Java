import java.util.Arrays;

public class SelectionSort {

    // Selection Sort - Time Complexity O(n^2)
    public static void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) { 
            int minPos = i; 
            
            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j; 
                }
            } 
            
            // Swap only if the minimum element is not already at its correct position
            if (minPos != i) {
                int temp = arr[minPos]; 
                arr[minPos] = arr[i]; 
                arr[i] = temp; 
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
