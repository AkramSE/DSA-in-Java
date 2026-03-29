import java.util.Stack;

public class StackUsingJCF {
    public static void main(String[] args) {
        System.out.println("Stack Implementation using Java Collection Framework:");
        
        // Using built-in Stack class
        Stack<Integer> s = new Stack<>();
        
        System.out.println("Pushing elements: 1, 2, 3");
        s.push(1);
        s.push(2);
        s.push(3);
        
        System.out.println("Emptying the stack...");
        while (!s.isEmpty()) {
            System.out.println("Popped: " + s.peek());
            s.pop();
        }
    }
} 
