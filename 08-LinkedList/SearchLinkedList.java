public class SearchLinkedList {
    
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

    // Helper method to build the list quickly
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // 1. Iterative Search - O(n) Time Complexity
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) { // Key Found
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // Key not found
    }

    // 2. Recursive Search Helper Method
    private int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int indx = helper(head.next, key);
        if (indx == -1) {
            return -1;
        }
        return indx + 1;
    }

    // Recursive Search - O(n) Time Complexity, O(n) Space for Call Stack
    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        SearchLinkedList ll = new SearchLinkedList();
        ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4); ll.addLast(5);

        System.out.println("LinkedList Searching:");
        int key1 = 3, key2 = 10;
        
        System.out.println("Searching Iteratively for " + key1 + ": Found at index " + ll.itrSearch(key1));
        System.out.println("Searching Recursively for " + key2 + ": Found at index " + ll.recSearch(key2));
    }
}
