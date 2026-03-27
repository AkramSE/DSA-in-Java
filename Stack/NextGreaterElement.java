import java.util.Stack;

public class NextGreaterElement {
    
    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int[] nxtGreater = new int[arr.length];
        
        // Loop runs backward for Next Greater on the RIGHT
        for (int i = arr.length - 1; i >= 0; i--) {
            // Step 1: Remove smaller elements
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            
            // Step 2: Assign next greater element (if stack is empty, it's -1)
            if (s.isEmpty()) {
                nxtGreater[i] = -1;
            } else {
                nxtGreater[i] = arr[s.peek()]; // Storing the actual element, not just the index
            }
            
            // Step 3: Push current index
            s.push(i);
        }
        
        System.out.println("Next Greater Element:");
        System.out.print("Result: ");
        for (int i = 0; i < nxtGreater.length; i++) {
            System.out.print(nxtGreater[i] + " ");
        }
        System.out.println();
        
        /* * Related Questions 
         * 1. Next Greater Right => loop backwards, condition <=
         * 2. Next Greater Left  => loop forwards, condition <=
         * 3. Next Smaller Right => loop backwards, condition >=
         * 4. Next Smaller Left  => loop forwards, condition >=
         */
    }
}
