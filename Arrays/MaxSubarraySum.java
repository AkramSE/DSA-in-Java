public class MaxSubarraySum { 

    // Approach 1: Brute Force - Time Complexity O(n^3)
    public static void bruteForce(int[] numbers) { 
        int maxSum = Integer.MIN_VALUE; 
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currentSum = 0; 
                for (int k = i; k <= j; k++) {
                    currentSum += numbers[k]; 
                } 
                if (maxSum < currentSum) {
                    maxSum = currentSum; 
                }
            } 
        } 
        System.out.println("Max Sum (Brute Force) = " + maxSum); 
    }

    // Approach 2: Prefix Array - Time Complexity O(n^2)
    public static void prefixSum(int[] numbers) {
        int maxSum = Integer.MIN_VALUE; 
        int[] prefix = new int[numbers.length]; 
        
        // Calculate prefix array
        prefix[0] = numbers[0]; 
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i]; 
        } 
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1]; 
                
                if (maxSum < currentSum) { 
                    maxSum = currentSum; 
                }
            }
        } 
        System.out.println("Max Sum (Prefix Array) = " + maxSum); 
    }

    // Approach 3: Kadane's Algorithm - Time Complexity O(n)
    // (Optimized to handle all-negative arrays as well)
    public static void kadanesAlgorithm(int[] numbers) {
        int currentSum = numbers[0]; 
        int maxSum = numbers[0]; 
        
        for (int i = 1; i < numbers.length; i++) {
            // Either extend the previous subarray or start a new one
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            maxSum = Math.max(maxSum, currentSum);
        } 
        System.out.println("Max Sum (Kadane's Algorithm) = " + maxSum); 
    }

    public static void main(String[] args) { 
        int[] normalArray = {1, -2, 6, -1, 3}; 
        int[] allNegativeArray = {-2, -3, -4, -1, -2, -1, -5, -3};
        
        System.out.println("Testing Normal Array:");
        bruteForce(normalArray);
        prefixSum(normalArray);
        kadanesAlgorithm(normalArray);
        
        System.out.println("\n Testing All-Negative Array (Kadane's):");
        kadanesAlgorithm(allNegativeArray);
    }
}
