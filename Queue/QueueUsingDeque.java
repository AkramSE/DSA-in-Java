import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {
    
    // Implementing Queue (FIFO) behavior using Deque
    static class Queue {
        Deque<Integer> deque = new LinkedList<>(); 
        
        // Add - Add to the rear (last of Deque)
        public void add(int data) {
            deque.addLast(data); 
        } 
        
        // Remove - Remove from the front (first of Deque)
        public int remove() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.removeFirst(); 
        } 
        
        // Peek - View the front element
        public int peek() {
            if (deque.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return deque.getFirst(); 
        }
        
        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println("Queue Implementation using Deque:");
        Queue q = new Queue(); 
        q.add(1); 
        q.add(2); 
        q.add(3); 
        
        System.out.println("Front element (peek): " + q.peek()); 
        
        System.out.println("Removing elements:");
        while (!q.isEmpty()) {
            System.out.println(q.remove()); 
        }
    }
}
