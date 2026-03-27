import java.util.Deque;
import java.util.LinkedList;

public class DequeBasicsJCF {
    public static void main(String[] args) {
        System.out.println("Deque (Double Ended Queue) Basics:");
        
        // Deque is an interface, implemented using LinkedList
        Deque<Integer> deque = new LinkedList<>(); 
        
        // Add at First and Last
        deque.addFirst(1); // [1]
        deque.addFirst(2); // [2, 1]
        System.out.println("After addFirst(1) and addFirst(2): " + deque); 
        
        deque.addLast(3); // [2, 1, 3]
        deque.addLast(4); // [2, 1, 3, 4]
        System.out.println("After addLast(3) and addLast(4):   " + deque); 
        
        // Remove from First and Last
        deque.removeFirst(); // Removes 2
        deque.removeLast();  // Removes 4
        System.out.println("After removeFirst and removeLast:  " + deque); 
        
        // Get First and Last without removing
        System.out.println("First element (getFirst): " + deque.getFirst()); 
        System.out.println("Last element (getLast):   " + deque.getLast()); 
    }
}
