public class LinkedListCycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    // 1. Detect a Cycle using Floyd's Algorithm (Hare and Tortoise approach)
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps
            
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // 2. Remove the Cycle
    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycleExists = false;

        // Step 1: Detect Cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycleExists = true;
                break;
            }
        }

        // If no cycle, just return
        if (!cycleExists) {
            return;
        }

        // Step 2: Find meeting point to get the start of the cycle
        slow = head;
        Node prev = null; // To keep track of the last node in the cycle
        
        // Special Case: If the cycle starts exactly at the head
        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
            // Break the cycle
            fast.next = null;
            return;
        }

        // General Case: Move both pointers at the same speed
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Remove cycle by setting the next of the last node to null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedListCycle ll = new LinkedListCycle();
        
        // Creating nodes manually
        ll.head = new Node(1);
        Node temp2 = new Node(2);
        Node temp3 = new Node(3);
        Node temp4 = new Node(4);
        
        // Linking nodes: 1 -> 2 -> 3 -> 4
        ll.head.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        
        // Creating the cycle: 4 -> 2 (Cycle exists)
        temp4.next = temp2; 
        
        System.out.println("Cycle Detection & Removal in LinkedList:");
        
        // Test Cycle Detection
        System.out.println("Cycle initially exists? " + ll.isCycle());
        
        // Test Cycle Removal
        if (ll.isCycle()) {
            System.out.println("Removing cycle...");
            ll.removeCycle();
        }
        
        // Verify Cycle is removed
        System.out.println("Cycle exists after removal? " + ll.isCycle());
    }
} 
