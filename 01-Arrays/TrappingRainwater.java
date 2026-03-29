public class TrappingRainwater {

    // function to calculate total trapped rainwater - O(n) Time
    public static int calculate(int[] height) {
        if (height == null || height.length <= 2) {
            return 0;
        }

        int n = height.length;

        // precompute left max boundaries
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // precompute right max boundaries
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            totalWater += (waterLevel - height[i]);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int[] heights = {4, 2, 0, 6, 3, 2, 5};
        
        
        System.out.println("Total units trapped: " + calculate(heights));
    }
}
