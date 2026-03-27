import java.util.Arrays;
public class LastOccurrence {
    public static int findLast(int[] arr, int key, int i) {
        // Base case: Reached the end of the array
        if(i == arr.length) { 
            return -1; 
        } 
        
        // Look forward in the array first (Going deep into the Call Stack)
        int isFound = findLast(arr, key, i + 1); 
        
        // While returning: If it wasn't found ahead, but matches current element
        if(isFound == -1 && arr[i] == key) {
            return i; 
        } 
        
        return isFound; 
    }

    public static void main(String[] args) { 
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3}; 
        int key = 5;
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Searching for LAST occurrence of: " + key);
        
        int index = findLast(arr, key, 0);
        
        if(index != -1) {
            System.out.println("Result: Key last found at index " + index);
        } else {
            System.out.println("Result: Key not found in the array.");
        }
    }
}
