import java.util.Arrays;
public class FirstOccurrence {
    // Recursive function to find the first index of a key
    public static int findFirst(int[] arr, int key, int i) {
        // Base case: Reached the end of the array, key not found
        if(i == arr.length) {
            return -1;
        }
        // Found the key, return the current index immediately
        if(arr[i] == key) {
            return i;
        }
        // Not found yet, check the rest of the array
        return findFirst(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        int key = 5;

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Searching for FIRST occurrence of: " + key);

        int index = findFirst(arr, key, 0);

        if(index != -1) {
            System.out.println("Result: Key found at index " + index);
        } else {
            System.out.println("Result: Key not found in the array.");
        }
    }
} 
