public class BinarySearch { 

    // search method for integers
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1; 
        
        while (start <= end) { 
            int mid = start + (end - start) / 2; // avoids integer overflow
            
            if (arr[mid] == target) { 
                return mid; 
            } else if (arr[mid] < target) {
                start = mid + 1; 
            } else {
                end = mid - 1;   
            }
        } 
        return -1; 
    }

    // overloaded search method for strings
    public static int search(String[] arr, String target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = target.compareTo(arr[mid]);

            if (result == 0) {
                return mid; 
            } else if (result > 0) {
                start = mid + 1; 
            } else {
                end = mid - 1;   
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        // testing int array
        int[] nums = {10, 20, 30, 40, 50, 60, 70, 80, 90}; 
        int targetInt = 70; 
        System.out.println("Integer target found at index: " + search(nums, targetInt));

        // testing string array 
        String[] words = {"Apple", "Banana", "Cherry", "Mango", "Orange"};
        String targetStr = "Mango";
        System.out.println("String target found at index: " + search(words, targetStr));
    }
}
