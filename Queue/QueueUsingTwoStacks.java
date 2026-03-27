import java.util.Stack;

public class QueueUsingTwoStacks {
    
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        // Check if empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }
        
        // Add operation - O(n) Time Complexity
        public static void add(int data) {
            // Step 1: Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            
            // Step 2: Push the new data into s1
            s1.push(data);
            
            // Step 3: Move everything back from s2 to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        // Remove operation - O(1) Time Complexity
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.pop();
        }
        
        // Peek operation - O(1) Time Complexity
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        System.out.println("Queue Implementation using Two Stacks:");
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Removing elements from Queue:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
