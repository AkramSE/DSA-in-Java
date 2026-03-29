import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        
        // 1. Storing data in a 2D array: [index][0]=original index, [1]=start, [2]=end
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // 2. Sorting based on END time (Column index 2) - O(N log N)
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        
        // 3. Greedy Selection
        int maxAct = 1; // Select the first activity
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < activities.length; i++) {
            // If start time of current is >= end time of last selected activity
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2]; // Update lastEnd
            }
        }

        System.out.println("Activity Selection Problem:");
        System.out.println("Maximum Activities Performed = " + maxAct);
        System.out.print("Selected Activities: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
} 
