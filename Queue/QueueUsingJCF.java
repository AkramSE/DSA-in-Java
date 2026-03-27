import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJCF {
    public static void main(String[] args) {
        System.out.println("Queue Implementation using Java Collection Framework:");
        
        // Queue is an interface in Java, so we use LinkedList to instantiate it
        Queue<Integer> q = new LinkedList<>();
        
        System.out.println("Adding elements: 1, 2, 3");
        q.add(1);
        q.add(2);
        q.add(3);
        
        System.out.println("Emptying Queue:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
} 
