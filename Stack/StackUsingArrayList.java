import java.util.ArrayList;

public class StackUsingArrayList {
    
    // Internal Stack implementation using ArrayList
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
        
        // 1. Check if empty
        public static boolean isEmpty() {
            return list.size() == 0;
        }
        
        // 2. Push operation - O(1)
        public static void push(int data) {
            list.add(data);
        }
        
        // 3. Pop operation - O(1)
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        
        // 4. Peek operation - O(1)
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Stack Implementation using ArrayList:");
        Stack s = new Stack();
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
