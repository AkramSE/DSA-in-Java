import java.util.Stack;

public class PushAtBottom {
    
    // Recursive function to push an element at the bottom of a stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // Base case: If stack is empty, push the data
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        
        // Step 1: Remove the top element
        int top = s.pop();
        
        // Step 2: Recursive call for the rest of the stack
        pushAtBottom(s, data);
        
        // Step 3: Push the removed element back
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        int newData = 4;
        System.out.println("Push Element at Bottom:");
        System.out.println("Pushing " + newData + " at the bottom...");
        
        pushAtBottom(s, newData);
        
        System.out.println("Stack from Top to Bottom:");
        while (!s.isEmpty()) {
            System.out.println(s.pop()); 
        }
        // Output should be: 3, 2, 1, 4 (4 is at the bottom)
    }
}
