import java.util.Stack;
public class ReverseStack { 
    // Helper Method: Pushes an element at the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    
    // Main Recursive Method: Reverses the entire stack (O(n^2) Time Complexity)
    public static void reverseStack(Stack<Integer> s) {
        // Base case
        if (s.isEmpty()) {
            return;
        }
        
        // Step 1: Remove the top element
        int top = s.pop();
        
        // Step 2: Reverse the remaining stack
        reverseStack(s);
        
        // Step 3: Push the removed element at the bottom
        pushAtBottom(s, top);
    }
    
    // Method to print and empty the stack
    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // Current Stack (Top to Bottom): 3, 2, 1
        
        System.out.println("Reverse a Stack:");
        System.out.println("Reversing the stack recursively...");
        
        reverseStack(s);
        
        System.out.println("Reversed Stack from Top to Bottom:");
        printStack(s);
        // Reversed Output (Top to Bottom): 1, 2, 3
    }
} 
