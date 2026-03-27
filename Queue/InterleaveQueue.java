import java.util.LinkedList;
import java.util.Queue;

public class InterleaveQueue {
    
    // Logic to interleave the first half of the queue with the second half
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> firstHalf = new LinkedList<>(); 
        int size = q.size(); 
        
        // Step 1: Move the first half of elements to a new queue
        for (int i = 0; i < size / 2; i++) {
            firstHalf.add(q.remove()); 
        } 
        
        // Step 2: Interleave elements from firstHalf and original queue
        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove()); // Add from first half
            q.add(q.remove());         // Add from second half
        }
    } 

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        // Adding 1 to 10
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }
        
        System.out.println("Interleave Two Halves of a Queue:");
        System.out.println("Original Queue: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]");
        
        interLeave(q); 
        
        System.out.print("Interleaved Queue: ");
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " "); 
        } 
        System.out.println(); 
        // Expected Output: 1 6 2 7 3 8 4 9 5 10
    }
}
