import java.util.Arrays;
public class IsArraySorted {
    public static boolean isSorted(int[] arr, int i) {
        // Base case: If we reach the last element, the array is sorted
        if(i == arr.length - 1) { 
            return true; 
        } 
        // If current element is strictly greater than the next, it's not sorted
        if(arr[i] > arr[i + 1]) {
            return false; 
        } 
        
        // Check for the rest of the array
        return isSorted(arr, i + 1); 
    }

    public static void main(String[] args) {
        int[] sortedArr = {1, 2, 3, 4, 5}; 
        int[] unsortedArr = {1, 2, 6, 4, 5};
        
        System.out.println("Array 1: " + Arrays.toString(sortedArr));
        System.out.println("Is Array 1 sorted? " + isSorted(sortedArr, 0)); 
        
        System.out.println("\nArray 2: " + Arrays.toString(unsortedArr));
        System.out.println("Is Array 2 sorted? " + isSorted(unsortedArr, 0)); 
    }
}
