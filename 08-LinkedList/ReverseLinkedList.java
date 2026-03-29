public class ReverseLinkedList {

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

    // Iterative Reverse - O(n) Time Complexity, O(1) Space Complexity
    public void reverse() {
        Node prev = null;
        Node curr = tail = head; // Right to left assignment
        Node next;

        while (curr != null) {
            next = curr.next;    // Save next node
            curr.next = prev;    // Reverse link
            prev = curr;         // Move prev forward
            curr = next;         // Move curr forward
        }
        head = prev;             // Update head to the last non-null node
    }

    public static void main(String[] args) {
        ReverseLinkedList ll = new ReverseLinkedList();
        ll.addLast(1); ll.addLast(2); ll.addLast(3); ll.addLast(4); ll.addLast(5);

        System.out.println("Reverse a LinkedList:");
        System.out.print("Original List:\n");
        ll.print();

        ll.reverse();

        System.out.print("Reversed List:\n");
        ll.print();
    }
} 
