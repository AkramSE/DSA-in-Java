public class RemoveNthNode {
    
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //  Find and remove the Nth node from the end - O(n) Time Complexity
    public void deleteNthfromEnd(int n) {
        // Step 1: Calculate size
        int sz = 0; 
        Node temp = head; 
        while (temp != null) { 
            temp = temp.next; 
            sz++; 
        } 
        
        // Edge Case: If the node to be removed is the head itself
        if (n == sz) { 
            head = head.next; // Remove first 
            return; 
        } 
        
        // Step 2: Reach the (sz - n)th node
        int i = 1; 
        int iToFind = sz - n; 
        Node prev = head; 
        while (i < iToFind) { 
            prev = prev.next; 
            i++; 
        } 
        
        // Step 3: Skip the Nth node
        prev.next = prev.next.next; 
    }

    public static void main(String[] args) {
        RemoveNthNode ll = new RemoveNthNode();
        ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4); ll.addLast(5);
        
        System.out.println("Remove Nth Node from End:");
        System.out.print("Original List: ");
        ll.print(); // 1 -> 2 -> 3 -> 4 -> 5 -> null
        
        int n = 3;
        System.out.println("Removing node " + n + " from the end...");
        ll.deleteNthfromEnd(n); 
        
        System.out.print("Updated List:  ");
        ll.print(); // 1 -> 2 -> 4 -> 5 -> null
    }
}
