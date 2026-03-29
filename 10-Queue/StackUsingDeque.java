import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    
    // Implementing Stack (LIFO) behavior using Deque
    static class Stack {
        static Deque<Integer> deque = new LinkedList<>(); 
        
        // Push - Add to the top (which is the last of Deque)
        public static void push(int data) {
            deque.addLast(data); 
        } 
        
        // Pop - Remove from the top
        public static int pop() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.removeLast(); 
        } 
        
        // Peek - View the top element
        public static int peek() {
            if (deque.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return deque.getLast(); 
        }
        
        public static boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println("Stack Implementation using Deque:");
        Stack s = new Stack(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        
        System.out.println("Top element (peek): " + s.peek()); 
        
        System.out.println("Popping elements:");
        while (!s.isEmpty()) {
            System.out.println(s.pop()); 
        }
    }
} 
