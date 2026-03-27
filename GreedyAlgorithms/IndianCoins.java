import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        // Used Integer class to allow sorting in Reverse Order
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; 
        
        // Greedy approach: Sort coins in Descending Order
        Arrays.sort(coins, Comparator.reverseOrder()); 
        
        int countOfCoins = 0; 
        int amount = 590; 
        ArrayList<Integer> ans = new ArrayList<>(); 
        
        System.out.println("--- Minimum Indian Coins ---");
        System.out.println("Target Amount: " + amount);
        
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                // Keep taking the current highest coin while it fits the remaining amount
                while (coins[i] <= amount) {
                    countOfCoins++; 
                    ans.add(coins[i]); 
                    amount -= coins[i]; 
                }
            }
        } 
        
        System.out.println("Total (minimum) coins used = " + countOfCoins); 
        System.out.print("Coins selected: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " "); 
        } 
        System.out.println();
    }
}
