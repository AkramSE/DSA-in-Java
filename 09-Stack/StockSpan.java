import java.util.Stack;

public class StockSpan {
    
    // O(n) approach to find maximum number of consecutive days before current day where price <= current price
    public static void calculateSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0); // Pushing the index of the first day
        
        for (int i = 1; i < stocks.length; i++) {
            int currPrice = stocks[i];
            
            // Pop elements from stack while stack is not empty and current price > price at top of stack
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                s.pop();
            }
            
            // If stack becomes empty, then price is greater than all previous prices
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Else price is greater than prices after previous highest
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        
        calculateSpan(stocks, span);
        
        System.out.println("Stock Span Problem:");
        System.out.print("Span array: ");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
        System.out.println();
    }
} 
