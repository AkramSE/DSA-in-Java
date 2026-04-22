import java.util.PriorityQueue; 
import java.util.Comparator; 

public class MinMaxPriorityQueue {
     
     public static void main(String args[]) {
          
          System.out.println("=== Min Priority Queue (Default) ===");
          // Default behavior is Min Heap (ascending order)
          PriorityQueue<Integer> minPQ = new PriorityQueue<>(); 
          
          minPQ.add(3); // Time Complexity: O(log n) 
          minPQ.add(4); 
          minPQ.add(1); 
          minPQ.add(7); 
          
          System.out.print("Elements in Min Priority Queue order: ");
          while(!minPQ.isEmpty()) {
              System.out.print(minPQ.peek() + " "); // Time Complexity: O(1) 
              minPQ.remove(); // Time Complexity: O(log n) 
          }
          System.out.println("\n");
          
          
          System.out.println("=== Max Priority Queue ===");
          // Using Comparator.reverseOrder() for Max Heap (descending order)
          PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder()); 
          
          maxPQ.add(3); 
          maxPQ.add(4); 
          maxPQ.add(1); 
          maxPQ.add(7); 
          
          System.out.print("Elements in Max Priority Queue order: ");
          while(!maxPQ.isEmpty()) {
              System.out.print(maxPQ.peek() + " "); 
              maxPQ.remove(); 
          }
          System.out.println();
     }
} 
            
