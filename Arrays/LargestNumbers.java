public class LargestNumbers {

    // method to find the top 3 maximum distinct numbers
    public static void findTopThree(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array should have at least 3 elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                thMax = secMax;
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            } else if (num > thMax && num != secMax && num != max) {
                thMax = num;
            }
        }

        System.out.println("First Max: " + max);
        System.out.println("Second Max: " + (secMax == Integer.MIN_VALUE ? "None" : secMax));
        System.out.println("Third Max: " + (thMax == Integer.MIN_VALUE ? "None" : thMax));
    }

    public static void main(String[] args) {
        
        // testing with an array
        int[] numbers = {10, 20, 30, 9, 40};
        System.out.println("Top 3 Largest Numbers:");
        findTopThree(numbers);
    }
} 
