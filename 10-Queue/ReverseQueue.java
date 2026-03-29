import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    
    // Reversing a Queue using a Stack (LIFO property naturally reverses the FIFO order)
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>(); 
        
        // Step 1: Empty the queue into the stack
        while (!q.isEmpty()) {
            s.push(q.remove()); 
        } 
        
        // Step 2: Empty the stack back into the queue
        while (!s.isEmpty()) {
            q.add(s.pop()); 
        }
    } 

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5); 
        
        System.out.println("Reverse a Queue:");
        System.out.println("Original Queue: [1, 2, 3, 4, 5] (Front to Rear)");
        
        reverse(q); 
        
        System.out.print("Reversed Queue: ");
        while (!q.isEmpty()) { 
            System.out.print(q.remove() + " "); 
        } 
        System.out.println(); 
    }
}
